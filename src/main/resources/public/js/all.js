/**
 * 自动计算内容区高度
 */
function auto_layout() {
    $(window).resize(function() {
        $('#_content').height($(window).height() - 117);
    }).resize();
}