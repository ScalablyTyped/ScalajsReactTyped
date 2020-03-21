package typingsJapgolly.jqueryPrettyphoto.scaronPrettyPhoto

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pretty photo settings
  */
trait PrettyPhotoSettings extends js.Object {
  var ajaxcallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Allow the user to expand a resized image. true/false
    * @default true
    */
  var allow_expand: js.UndefOr[Boolean] = js.undefined
  /**
    * Resize the photos bigger than viewport. true/false
    * @default true
    */
  var allow_resize: js.UndefOr[Boolean] = js.undefined
  /**
    * fast/slow/normal
    * @default 'fast'
    */
  var animation_speed: js.UndefOr[String] = js.undefined
  /**
    * Automatically start videos: True/False
    * @default true
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * true/false
    * @default false
    */
  var autoplay_slideshow: js.UndefOr[Boolean] = js.undefined
  /**
    * Called when prettyPhoto is closed
    * @default function () { }
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called everytime an item is shown/changed
    * @default function () { }
    */
  var changepicturecallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The separator for the gallery counter 1 "of" 2
    * @default '/'
    */
  var counter_separator_label: js.UndefOr[String] = js.undefined
  /**
    * @default ''
    */
  var custom_markup: js.UndefOr[String] = js.undefined
  /**
    * Allow prettyPhoto to update the url to enable deeplinking.
    * @default true
    */
  var deeplinking: js.UndefOr[Boolean] = js.undefined
  /**
    * Pixels
    * @default 344
    */
  var default_height: js.UndefOr[Double] = js.undefined
  /**
    * Pixels
    * @default 500
    */
  var default_width: js.UndefOr[Double] = js.undefined
  /**
    * Markup for flash
    * @default '<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="{width}" height="{height}"><param name="wmode" value="{wmode}" /><param name="allowfullscreen" value="true" /><param name="allowscriptaccess" value="always" /><param name="movie" value="{path}" /><embed src="{path}" type="application/x-shockwave-flash" allowfullscreen="true" allowscriptaccess="always" width="{width}" height="{height}" wmode="{wmode}"></embed></object>'
    */
  var flash_markup: js.UndefOr[String] = js.undefined
  /**
    * Markup for pretty photo gallery
    * @default omitted for brevity
    */
  var gallery_markup: js.UndefOr[String] = js.undefined
  /**
    * Hides all the flash object on a page, set to TRUE if flash appears over prettyPhoto
    * @default false
    */
  var hideflash: js.UndefOr[Boolean] = js.undefined
  /**
    * the attribute tag to use for prettyPhoto hooks.  For HTML5, use "data-rel" or similar.
    * @default 'rel'
    */
  var hook: js.UndefOr[String] = js.undefined
  /**
    * The padding on each side of the picture
    * @default 20
    */
  var horizontal_padding: js.UndefOr[Double] = js.undefined
  /**
    * @default true
    */
  var ie6_fallback: js.UndefOr[Boolean] = js.undefined
  /**
    * Markup for iframe
    * @default '<iframe src ="{path}" width="{width}" height="{height}" frameborder="no"></iframe>'
    */
  var iframe_markup: js.UndefOr[String] = js.undefined
  /**
    * Markup for image
    * @default '<img id="fullResImage" src="{path}" />'
    */
  var image_markup: js.UndefOr[String] = js.undefined
  /**
    * @default '<div class="pp_inline">{content}</div>'
    */
  var inline_markup: js.UndefOr[String] = js.undefined
  /**
    * Set to false if you open forms inside prettyPhoto
    * @default true
    */
  var keyboard_shortcuts: js.UndefOr[Boolean] = js.undefined
  /**
    * Markup for pretty photo
    * @default omitted for brevity
    */
  var markup: js.UndefOr[String] = js.undefined
  /**
    * If set to true, only the close button will close the window
    * @default false
    */
  var modal: js.UndefOr[Boolean] = js.undefined
  /**
    * Value between 0 and 1
    * @default 0.80
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * If set to true, a gallery will overlay the fullscreen image on mouse over
    * @default true
    */
  var overlay_gallery: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of pictures in the overlay gallery
    * @default 30
    */
  var overlay_gallery_max: js.UndefOr[Double] = js.undefined
  /**
    * Markup for quicktime
    * @default '<object classid="clsid:02BF25D5-8C17-4B23-BC80-D3488ABDDC6B" codebase="http://www.apple.com/qtactivex/qtplugin.cab" height="{height}" width="{width}"><param name="src" value="{path}"><param name="autoplay" value="{autoplay}"><param name="type" value="video/quicktime"><embed src="{path}" height="{height}" width="{width}" autoplay="{autoplay}" type="video/quicktime" pluginspage="http://www.apple.com/quicktime/download/"></embed></object>'
    */
  var quicktime_markup: js.UndefOr[String] = js.undefined
  /**
    * true/false
    * @default true
    */
  var show_title: js.UndefOr[Boolean] = js.undefined
  /**
    * false OR interval time in ms
    * @default 5000
    */
  var slideshow: js.UndefOr[js.Any] = js.undefined
  /**
    * Markup for social tools, set to html or false to disable
    * @default '<div class="twitter"><a href="http://twitter.com/share" class="twitter-share-button" data-count="none">Tweet</a><script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script></div><div class="facebook"><iframe src="//www.facebook.com/plugins/like.php?locale=en_US&href={location_href}&amp;layout=button_count&amp;show_faces=true&amp;width=500&amp;action=like&amp;font&amp;colorscheme=light&amp;height=23" scrolling="no" frameborder="0" style="border:none; overflow:hidden; width:500px; height:23px;" allowTransparency="true"></iframe></div>'
    */
  var social_tools: js.UndefOr[js.Any] = js.undefined
  /**
    * light_rounded / dark_rounded / light_square / dark_square / facebook
    * @default 'pp_default'
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * Set the flash wmode attribute
    * @default 'opaque'
    */
  var wmode: js.UndefOr[String] = js.undefined
}

object PrettyPhotoSettings {
  @scala.inline
  def apply(
    ajaxcallback: js.UndefOr[Callback] = js.undefined,
    allow_expand: js.UndefOr[Boolean] = js.undefined,
    allow_resize: js.UndefOr[Boolean] = js.undefined,
    animation_speed: String = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplay_slideshow: js.UndefOr[Boolean] = js.undefined,
    callback: js.UndefOr[Callback] = js.undefined,
    changepicturecallback: js.UndefOr[Callback] = js.undefined,
    counter_separator_label: String = null,
    custom_markup: String = null,
    deeplinking: js.UndefOr[Boolean] = js.undefined,
    default_height: Int | Double = null,
    default_width: Int | Double = null,
    flash_markup: String = null,
    gallery_markup: String = null,
    hideflash: js.UndefOr[Boolean] = js.undefined,
    hook: String = null,
    horizontal_padding: Int | Double = null,
    ie6_fallback: js.UndefOr[Boolean] = js.undefined,
    iframe_markup: String = null,
    image_markup: String = null,
    inline_markup: String = null,
    keyboard_shortcuts: js.UndefOr[Boolean] = js.undefined,
    markup: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    overlay_gallery: js.UndefOr[Boolean] = js.undefined,
    overlay_gallery_max: Int | Double = null,
    quicktime_markup: String = null,
    show_title: js.UndefOr[Boolean] = js.undefined,
    slideshow: js.Any = null,
    social_tools: js.Any = null,
    theme: String = null,
    wmode: String = null
  ): PrettyPhotoSettings = {
    val __obj = js.Dynamic.literal()
    ajaxcallback.foreach(p => __obj.updateDynamic("ajaxcallback")(p.toJsFn))
    if (!js.isUndefined(allow_expand)) __obj.updateDynamic("allow_expand")(allow_expand.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_resize)) __obj.updateDynamic("allow_resize")(allow_resize.asInstanceOf[js.Any])
    if (animation_speed != null) __obj.updateDynamic("animation_speed")(animation_speed.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay_slideshow)) __obj.updateDynamic("autoplay_slideshow")(autoplay_slideshow.asInstanceOf[js.Any])
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    changepicturecallback.foreach(p => __obj.updateDynamic("changepicturecallback")(p.toJsFn))
    if (counter_separator_label != null) __obj.updateDynamic("counter_separator_label")(counter_separator_label.asInstanceOf[js.Any])
    if (custom_markup != null) __obj.updateDynamic("custom_markup")(custom_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(deeplinking)) __obj.updateDynamic("deeplinking")(deeplinking.asInstanceOf[js.Any])
    if (default_height != null) __obj.updateDynamic("default_height")(default_height.asInstanceOf[js.Any])
    if (default_width != null) __obj.updateDynamic("default_width")(default_width.asInstanceOf[js.Any])
    if (flash_markup != null) __obj.updateDynamic("flash_markup")(flash_markup.asInstanceOf[js.Any])
    if (gallery_markup != null) __obj.updateDynamic("gallery_markup")(gallery_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(hideflash)) __obj.updateDynamic("hideflash")(hideflash.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(hook.asInstanceOf[js.Any])
    if (horizontal_padding != null) __obj.updateDynamic("horizontal_padding")(horizontal_padding.asInstanceOf[js.Any])
    if (!js.isUndefined(ie6_fallback)) __obj.updateDynamic("ie6_fallback")(ie6_fallback.asInstanceOf[js.Any])
    if (iframe_markup != null) __obj.updateDynamic("iframe_markup")(iframe_markup.asInstanceOf[js.Any])
    if (image_markup != null) __obj.updateDynamic("image_markup")(image_markup.asInstanceOf[js.Any])
    if (inline_markup != null) __obj.updateDynamic("inline_markup")(inline_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard_shortcuts)) __obj.updateDynamic("keyboard_shortcuts")(keyboard_shortcuts.asInstanceOf[js.Any])
    if (markup != null) __obj.updateDynamic("markup")(markup.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay_gallery)) __obj.updateDynamic("overlay_gallery")(overlay_gallery.asInstanceOf[js.Any])
    if (overlay_gallery_max != null) __obj.updateDynamic("overlay_gallery_max")(overlay_gallery_max.asInstanceOf[js.Any])
    if (quicktime_markup != null) __obj.updateDynamic("quicktime_markup")(quicktime_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(show_title)) __obj.updateDynamic("show_title")(show_title.asInstanceOf[js.Any])
    if (slideshow != null) __obj.updateDynamic("slideshow")(slideshow.asInstanceOf[js.Any])
    if (social_tools != null) __obj.updateDynamic("social_tools")(social_tools.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyPhotoSettings]
  }
}

