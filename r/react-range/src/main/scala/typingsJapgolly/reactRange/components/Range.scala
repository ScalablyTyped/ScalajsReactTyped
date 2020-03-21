package typingsJapgolly.reactRange.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRange.AnonChildren
import typingsJapgolly.reactRange.AnonIndex
import typingsJapgolly.reactRange.rangeMod.default
import typingsJapgolly.reactRange.typesMod.Direction
import typingsJapgolly.reactRange.typesMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Range {
  def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    max: Double,
    min: Double,
    rtl: Boolean,
    step: Double,
    values: js.Array[Double],
    onChange: js.Array[Double] => Callback,
    renderThumb: AnonIndex => CallbackTo[Node],
    renderTrack: AnonChildren => CallbackTo[Node],
    onFinalChange: /* values */ js.Array[Double] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IProps, default, Unit, IProps] = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => onChange(t0).runNow()))
    __obj.updateDynamic("renderThumb")(js.Any.fromFunction1((t0: typingsJapgolly.reactRange.AnonIndex) => renderThumb(t0).runNow()))
    __obj.updateDynamic("renderTrack")(js.Any.fromFunction1((t0: typingsJapgolly.reactRange.AnonChildren) => renderTrack(t0).runNow()))
    if (onFinalChange != null) __obj.updateDynamic("onFinalChange")(js.Any.fromFunction1((t0: /* values */ js.Array[scala.Double]) => onFinalChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRange.typesMod.IProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRange.rangeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRange.typesMod.IProps])(children: _*)
  }
  @JSImport("react-range/lib/Range", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

