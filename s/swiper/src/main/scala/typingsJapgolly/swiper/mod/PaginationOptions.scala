package typingsJapgolly.swiper.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.swiperStrings.bullets
import typingsJapgolly.swiper.swiperStrings.custom
import typingsJapgolly.swiper.swiperStrings.fraction
import typingsJapgolly.swiper.swiperStrings.progressbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends js.Object {
  /**
    * CSS class name of currently active pagination bullet
    */
  var bulletActiveClass: js.UndefOr[String] = js.undefined
  /**
    * CSS class name of single pagination bullet
    */
  var bulletClass: js.UndefOr[String] = js.undefined
  /**
    * Defines which HTML tag will be use to represent single pagination bullet. Only for bullets pagination type.
    */
  var bulletElement: js.UndefOr[String] = js.undefined
  /**
    * If true then clicking on pagination button will cause transition to appropriate slide. Only for bullets pagination type
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /**
    * CSS class name set to pagination when it is clickable
    */
  var clickableClass: js.UndefOr[String] = js.undefined
  /**
    * CSS class name of the element with currently active index in "fraction" pagination
    */
  var currentClass: js.UndefOr[String] = js.undefined
  /**
    * Good to enable if you use bullets pagination with a lot of slides. So it will keep only few bullets visible at the same time.
    */
  var dynamicBullets: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of main bullets visible when dynamicBullets enabled.
    */
  var dynamicMainBullets: js.UndefOr[Double] = js.undefined
  /**
    * String with CSS selector or HTML element of the container with pagination
    */
  var el: SelectableElement
  /**
    * format fraction pagination current number. Function receives current number,
    * and you need to return formatted value
    */
  var formatFractionCurrent: js.UndefOr[js.Function1[/* number */ Double, Double]] = js.undefined
  /**
    * format fraction pagination total number. Function receives total number, and you
    * need to return formatted value
    */
  var formatFractionTotal: js.UndefOr[js.Function1[/* number */ Double, Double]] = js.undefined
  /**
    * CSS class name of pagination when it becomes inactive
    */
  var hiddenClass: js.UndefOr[String] = js.undefined
  /**
    * Toggle (hide/true) pagination container visibility after click on Slider's container
    */
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * The beginning of the modifier CSS class name that will be added to pagination depending on parameters
    */
  var modifierClass: js.UndefOr[String] = js.undefined
  /**
    * CSS class name of pagination progressbar fill element
    */
  var progressbarFillClass: js.UndefOr[String] = js.undefined
  /**
    * Makes pagination progressbar opposite to Swiper's `direction` parameter, means vertical progressbar for horizontal swiper
    * direction and horizontal progressbar for vertical swiper direction
    */
  var progressbarOpposite: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter allows totally customize pagination bullets, you need to pass here a function that accepts index number of
    * pagination bullet and required element class name (className). Only for bullets pagination type
    */
  var renderBullet: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.undefined
  /**
    * This parameter is required for custom pagination type where you have to specify
    * how it should be rendered.
    *
    * @example
    * var swiper = new Swiper('.swiper-container', {
    *   //...
    *   renderCustom: function (swiper, current, total) {
    *     return current + ' of ' + total;
    *   }
    * });
    */
  var renderCustom: js.UndefOr[
    js.Function3[/* swiper */ Swiper, /* current */ Double, /* total */ Double, Unit]
  ] = js.undefined
  /**
    * This parameter allows to customize "fraction" pagination html. Only for fraction pagination type
    */
  var renderFraction: js.UndefOr[js.Function2[/* currentClass */ String, /* totalClass */ String, Unit]] = js.undefined
  /**
    * This parameter allows to customize "progress" pagination. Only for progress pagination type
    */
  var renderProgressbar: js.UndefOr[js.Function1[/* progressbarFillClass */ String, Unit]] = js.undefined
  /**
    * CSS class name of the element with total number of "snaps" in "fraction" pagination
    */
  var totalClass: js.UndefOr[String] = js.undefined
  /**
    * String with type of pagination. Can be "bullets", "fraction", "progressbar" or "custom"
    */
  var `type`: js.UndefOr[bullets | fraction | progressbar | custom] = js.undefined
}

object PaginationOptions {
  @scala.inline
  def apply(
    el: SelectableElement,
    bulletActiveClass: String = null,
    bulletClass: String = null,
    bulletElement: String = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    clickableClass: String = null,
    currentClass: String = null,
    dynamicBullets: js.UndefOr[Boolean] = js.undefined,
    dynamicMainBullets: Int | Double = null,
    formatFractionCurrent: /* number */ Double => CallbackTo[Double] = null,
    formatFractionTotal: /* number */ Double => CallbackTo[Double] = null,
    hiddenClass: String = null,
    hideOnClick: js.UndefOr[Boolean] = js.undefined,
    modifierClass: String = null,
    progressbarFillClass: String = null,
    progressbarOpposite: js.UndefOr[Boolean] = js.undefined,
    renderBullet: (/* index */ Double, /* className */ String) => Callback = null,
    renderCustom: (/* swiper */ Swiper, /* current */ Double, /* total */ Double) => Callback = null,
    renderFraction: (/* currentClass */ String, /* totalClass */ String) => Callback = null,
    renderProgressbar: /* progressbarFillClass */ String => Callback = null,
    totalClass: String = null,
    `type`: bullets | fraction | progressbar | custom = null
  ): PaginationOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (bulletActiveClass != null) __obj.updateDynamic("bulletActiveClass")(bulletActiveClass.asInstanceOf[js.Any])
    if (bulletClass != null) __obj.updateDynamic("bulletClass")(bulletClass.asInstanceOf[js.Any])
    if (bulletElement != null) __obj.updateDynamic("bulletElement")(bulletElement.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (clickableClass != null) __obj.updateDynamic("clickableClass")(clickableClass.asInstanceOf[js.Any])
    if (currentClass != null) __obj.updateDynamic("currentClass")(currentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicBullets)) __obj.updateDynamic("dynamicBullets")(dynamicBullets.asInstanceOf[js.Any])
    if (dynamicMainBullets != null) __obj.updateDynamic("dynamicMainBullets")(dynamicMainBullets.asInstanceOf[js.Any])
    if (formatFractionCurrent != null) __obj.updateDynamic("formatFractionCurrent")(js.Any.fromFunction1((t0: /* number */ scala.Double) => formatFractionCurrent(t0).runNow()))
    if (formatFractionTotal != null) __obj.updateDynamic("formatFractionTotal")(js.Any.fromFunction1((t0: /* number */ scala.Double) => formatFractionTotal(t0).runNow()))
    if (hiddenClass != null) __obj.updateDynamic("hiddenClass")(hiddenClass.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick.asInstanceOf[js.Any])
    if (modifierClass != null) __obj.updateDynamic("modifierClass")(modifierClass.asInstanceOf[js.Any])
    if (progressbarFillClass != null) __obj.updateDynamic("progressbarFillClass")(progressbarFillClass.asInstanceOf[js.Any])
    if (!js.isUndefined(progressbarOpposite)) __obj.updateDynamic("progressbarOpposite")(progressbarOpposite.asInstanceOf[js.Any])
    if (renderBullet != null) __obj.updateDynamic("renderBullet")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* className */ java.lang.String) => renderBullet(t0, t1).runNow()))
    if (renderCustom != null) __obj.updateDynamic("renderCustom")(js.Any.fromFunction3((t0: /* swiper */ typingsJapgolly.swiper.mod.Swiper, t1: /* current */ scala.Double, t2: /* total */ scala.Double) => renderCustom(t0, t1, t2).runNow()))
    if (renderFraction != null) __obj.updateDynamic("renderFraction")(js.Any.fromFunction2((t0: /* currentClass */ java.lang.String, t1: /* totalClass */ java.lang.String) => renderFraction(t0, t1).runNow()))
    if (renderProgressbar != null) __obj.updateDynamic("renderProgressbar")(js.Any.fromFunction1((t0: /* progressbarFillClass */ java.lang.String) => renderProgressbar(t0).runNow()))
    if (totalClass != null) __obj.updateDynamic("totalClass")(totalClass.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

