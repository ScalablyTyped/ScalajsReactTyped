package typingsJapgolly.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawMarkerPointersEventArgs extends js.Object {
  /** returns the gauge model
    */
  var Model: js.UndefOr[js.Any] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the current marker pointer element.
    */
  var markerElement: js.UndefOr[js.Any] = js.undefined
  /** returns the index of the marker pointer.
    */
  var markerPointerIndex: js.UndefOr[Double] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the angle of the marker pointer.
    */
  var pointerAngle: js.UndefOr[Double] = js.undefined
  /** returns the value of the marker pointer.
    */
  var pointerValue: js.UndefOr[Double] = js.undefined
  /** returns the startX and startY of the pointer
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the scaleIndex to which the pointer belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.undefined
  /** returns the ticks style
    */
  var style: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object DrawMarkerPointersEventArgs {
  @scala.inline
  def apply(
    Model: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    markerElement: js.Any = null,
    markerPointerIndex: Int | Double = null,
    `object`: js.Any = null,
    pointerAngle: Int | Double = null,
    pointerValue: Int | Double = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: Int | Double = null,
    style: String = null,
    `type`: js.Any = null
  ): DrawMarkerPointersEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (markerElement != null) __obj.updateDynamic("markerElement")(markerElement.asInstanceOf[js.Any])
    if (markerPointerIndex != null) __obj.updateDynamic("markerPointerIndex")(markerPointerIndex.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (pointerAngle != null) __obj.updateDynamic("pointerAngle")(pointerAngle.asInstanceOf[js.Any])
    if (pointerValue != null) __obj.updateDynamic("pointerValue")(pointerValue.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement.asInstanceOf[js.Any])
    if (scaleIndex != null) __obj.updateDynamic("scaleIndex")(scaleIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawMarkerPointersEventArgs]
  }
}

