package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protonNative.AnonButtons
import typingsJapgolly.protonNative.AnonH
import typingsJapgolly.protonNative.AnonX
import typingsJapgolly.protonNative.protonNativeStrings.bevel
import typingsJapgolly.protonNative.protonNativeStrings.flat
import typingsJapgolly.protonNative.protonNativeStrings.miter
import typingsJapgolly.protonNative.protonNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaProps extends AreaBaseProps {
  /**
    * Called when releasing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.undefined
  /**
    * Called when pressing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.undefined
  /**
    * Whether the area can be seen.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * Called when the mouse enters the area.
    */
  var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when the mouse leaves the area.
    */
  var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when the mouse is moved over the area
    */
  var onMouseMove: js.UndefOr[js.Function1[/* event */ AnonButtons, Unit]] = js.undefined
  /**
    * **Not working at the moment.**
    *
    * Called when releasing a mouse button over the area.
    */
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * Whether the area can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AreaProps {
  @scala.inline
  def apply(
    align: AnonH = null,
    column: Int | Double = null,
    expand: AnonH = null,
    fill: String = null,
    fillOpacity: Int | Double = null,
    label: String = null,
    onKeyDown: /* event */ KeyboardEvent => CallbackTo[Boolean] = null,
    onKeyUp: /* event */ KeyboardEvent => CallbackTo[Boolean] = null,
    onMouseDown: /* event */ MouseEvent => Callback = null,
    onMouseEnter: js.UndefOr[Callback] = js.undefined,
    onMouseLeave: js.UndefOr[Callback] = js.undefined,
    onMouseMove: /* event */ AnonButtons => Callback = null,
    onMouseUp: /* event */ MouseEvent => Callback = null,
    row: Int | Double = null,
    span: AnonX = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    stroke: String = null,
    strokeLinecap: flat | round | bevel = null,
    strokeLinejoin: miter | round | bevel = null,
    strokeMiterlimit: Int | Double = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    transform: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AreaProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.protonNative.mod.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.protonNative.mod.KeyboardEvent) => onKeyUp(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.protonNative.mod.MouseEvent) => onMouseDown(t0).runNow()))
    onMouseEnter.foreach(p => __obj.updateDynamic("onMouseEnter")(p.toJsFn))
    onMouseLeave.foreach(p => __obj.updateDynamic("onMouseLeave")(p.toJsFn))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.protonNative.AnonButtons) => onMouseMove(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.protonNative.mod.MouseEvent) => onMouseUp(t0).runNow()))
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaProps]
  }
}

