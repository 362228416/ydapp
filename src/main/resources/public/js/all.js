function auto_layout() {
    var _auto_layout = function() {
        $('#_content').height($(window).height() - 115);
    }
    _auto_layout();
    $(window).resize(_auto_layout());
}