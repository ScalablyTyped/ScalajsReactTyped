package typingsJapgolly.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseClickEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the context element* @param {Object} args.markerpointer returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the pointer element.
    */
  var markerPointerElement: js.UndefOr[js.Any] = js.undefined
  /** returns the pointer Index
    */
  var markerPointerIndex: js.UndefOr[Double] = js.undefined
  /** returns the value of the pointer.
    */
  var markerPointerValue: js.UndefOr[Double] = js.undefined
  /** returns the gauge model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the startX and startY of the pointer.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** returns the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the scaleIndex to which the pointer belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.undefined
  /** returns the pointer style
    */
  var style: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object MouseClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    markerPointerElement: js.Any = null,
    markerPointerIndex: Int | Double = null,
    markerPointerValue: Int | Double = null,
    model: js.Any = null,
    `object`: js.Any = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: Int | Double = null,
    style: String = null,
    `type`: js.Any = null
  ): MouseClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (markerPointerElement != null) __obj.updateDynamic("markerPointerElement")(markerPointerElement.asInstanceOf[js.Any])
    if (markerPointerIndex != null) __obj.updateDynamic("markerPointerIndex")(markerPointerIndex.asInstanceOf[js.Any])
    if (markerPointerValue != null) __obj.updateDynamic("markerPointerValue")(markerPointerValue.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement.asInstanceOf[js.Any])
    if (scaleIndex != null) __obj.updateDynamic("scaleIndex")(scaleIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseClickEventArgs]
  }
}

