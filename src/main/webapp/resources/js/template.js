(function ($) {
     jQuery(document).ready(function () {
          var header = $('.block_header');
          var left = $('.content .left');
          var right = $('.content .right');
          var icon_show = $('.header .icon.left-show');
          var icon_hide = $('.header .icon.left-hide');
          var body = $('body');

          var effect = 'slide';
          var options = {direction: 'left'};
          var duration = 1;

//layout
          left.css({
               'height': $(window).height() - header.height() + 'px'
          });
          right.css({
               'width': $(window).width() - left.width() + 'px',
               'height': $(window).height() - header.height() + 'px'
          });
          $(window).resize(function () {
               left.css({
                    'height': $(window).height() - header.height() + 'px'
               });
               right.css({
                    'width': $(window).width() - left.width() + 'px',
                    'height': $(window).height() - header.height() + 'px'
               });
          });

//toggle

          icon_show.click(function () {
               left.toggle(effect, options, duration);
               icon_show.css({
                    display: 'none'
               });
               icon_hide.css({
                    display: 'block'
               });
               right.css({
                    'width': body.width() + 'px',
                    'height': left.height() + 'px'
               });
               $(window).resize(function () {
                    icon_show.css({
                         display: 'none'
                    });
                    icon_hide.css({
                         display: 'block'
                    });
                    right.css({
                         'width': body.width() + 'px',
                         'height': left.height() + 'px'
                    });
               });
          });
          icon_hide.click(function () {
               left.toggle(effect, options, duration);
               icon_show.css({
                    display: 'block'
               });
               icon_hide.css({
                    display: 'none'
               });
               right.css({
                    'width': body.width() - left.width() + 'px',
                    'height': left.height() + 'px'
               });
               $(window).resize(function () {
                    icon_show.css({
                         display: 'block'
                    });
                    icon_hide.css({
                         display: 'none'
                    });
                    right.css({
                         'width': body.width() - left.width() + 'px',
                         'height': left.height() + 'px'
                    });
               });
          });



     });
})(jQuery);
