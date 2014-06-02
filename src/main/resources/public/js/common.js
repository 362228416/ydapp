function page(number) {
    $('#search-form #page').val(number);
    $('#search-form').submit();
}

$(function(){
    $('.pagination a').click(function(){
        page($(this).attr('data'));
    });
})