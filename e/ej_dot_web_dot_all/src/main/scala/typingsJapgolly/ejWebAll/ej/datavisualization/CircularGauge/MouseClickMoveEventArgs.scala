package typingsJapgolly.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseClickMoveEventArgs extends js.Object {
  /** returns the angle of the pointer.
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the pointer element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the pointer Index
    */
  var index: js.UndefOr[Double] = js.undefined
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
  /** returns the value of the pointer.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object MouseClickMoveEventArgs {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    element: js.Any = null,
    index: Int | Double = null,
    model: js.Any = null,
    `object`: js.Any = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: Int | Double = null,
    style: String = null,
    `type`: js.Any = null,
    value: Int | Double = null
  ): MouseClickMoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement.asInstanceOf[js.Any])
    if (scaleIndex != null) __obj.updateDynamic("scaleIndex")(scaleIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseClickMoveEventArgs]
  }
}

