//function calendar(){
//PrimeFaces.locales['de'] = {
//    closeText: 'Schließen',
//    prevText: 'Zurück',
//    nextText: 'Weiter',
//    monthNames: ['Januar', 'Februar', 'M�rz', 'April', 'Mai', 'Juni', 'Juli', 'August', 'September', 'Oktober', 'November', 'Dezember'],
//    monthNamesShort: ['Jan', 'Feb', 'Mrz', 'Apr', 'Mai', 'Jun', 'Jul', 'Aug', 'Sep', 'Okt', 'Nov', 'Dez'],
//    dayNames: ['Sonntag', 'Montag', 'Dienstag', 'Mittwoch', 'Donnerstag', 'Freitag', 'Samstag'],
//    dayNamesShort: ['So', 'Mo', 'Di', 'Mi', 'Do', 'Fr', 'Sa'],
//    dayNamesMin: ['S', 'M', 'D', 'M ', 'D', 'F ', 'S'],
//    weekHeader: 'Woche',
//    FirstDay: 1,
//    isRTL: false,
//    showMonthAfterYear: false,
//    yearSuffix: '',
//    timeOnlyTitle: 'Nur Zeit',
//    timeText: 'Zeit',
//    hourText: 'Stunde',
//    minuteText: 'Minute',
//    secondText: 'Sekunde',
//    currentText: 'Aktuelles Datum',
//    ampm: false,
//    month: 'Monat',
//    week: 'Woche',
//    day: 'Tag',
//    allDayText: 'Ganzer Tag'
//}};

$(document).ready(function () {
    
    /**
     * 1. When clearing all content of input 1 => re-enable the other input and set white background
     * 2. When inserting anything into one of 2 inputs => disable the other input, set grey background
     * and clear the text in it
     * Requires following final html structure:
     * <XXX class="focus-switch"> 
     * ...
     * <tr>
     * ...
     * <input ... />
     * <input ... />
     * ...
     * </tr>
     * ...
     * </xxx>
     */
    let $someInput = $('.focus-switch input');
    $someInput.on('input', function() {
    	let $otherInput = $(this).closest('tr').find('input').not(this);
    	// length = 0 => false; length > 0 => true
        $otherInput.prop('disabled', this.value.length);
        $otherInput.val('');
        let bgColor = this.value.length ? '#D3D3D3' : '#FFFFFF';
        $otherInput.css({'background-color' : bgColor});
    });
    
});


