package typingsJapgolly.jqueryNotifybar.JQueryNotifyBar

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBarOptionsForAnimationSpeedNumber extends NotifyBarOptions {
  /**
    * How long this bar will be slided up and down.
    */
  @JSName("animationSpeed")
  var animationSpeed_NotifyBarOptionsForAnimationSpeedNumber: js.UndefOr[Double] = js.undefined
}

object NotifyBarOptionsForAnimationSpeedNumber {
  @scala.inline
  def apply(
    animationSpeed: Int | Double = null,
    close: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closeOnOver: js.UndefOr[Boolean] = js.undefined,
    closeText: String = null,
    cssClass: String = null,
    delay: Int | Double = null,
    html: String = null,
    jqObject: JQuery_[HTMLElement] = null,
    onBeforeHide: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onBeforeShow: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onHide: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onShow: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    position: String = null
  ): NotifyBarOptionsForAnimationSpeedNumber = {
    val __obj = js.Dynamic.literal()
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnOver)) __obj.updateDynamic("closeOnOver")(closeOnOver.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (jqObject != null) __obj.updateDynamic("jqObject")(jqObject.asInstanceOf[js.Any])
    onBeforeHide.foreach(p => __obj.updateDynamic("onBeforeHide")(p.toJsFn))
    onBeforeShow.foreach(p => __obj.updateDynamic("onBeforeShow")(p.toJsFn))
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedNumber]
  }
}

