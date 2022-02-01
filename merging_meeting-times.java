/*
Write a method mergeRanges() that takes a list of multiple meeting time ranges and returns a list of condensed ranges.

*/

public static List<Meeting> mergeRanges(List<Meeting> meetings) {

        // merge meetings ranges
        
        List<Meeting> sorted=new ArrayList<>(meetings);
        Collections.sort(sorted,new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                return m1.getStartTime() - m2.getStartTime();
            }
        });
        List<Meeting> mergedMeetings=new ArrayList<>();
        mergedMeetings.add(sorted.get(0));
        for(Meeting curr:sorted){
               Meeting merged = mergedMeetings.get(mergedMeetings.size()-1);
            if (curr.getStartTime() <= merged.getEndTime()) {
                merged.setEndTime(Math.max(merged.getEndTime(), curr.getEndTime()));
            } else {
                mergedMeetings.add(curr);
            }
        }
        return mergedMeetings;
    }
