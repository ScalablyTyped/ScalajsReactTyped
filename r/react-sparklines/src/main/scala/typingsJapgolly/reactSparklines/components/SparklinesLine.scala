package typingsJapgolly.reactSparklines.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSparklines.mod.Point
import typingsJapgolly.reactSparklines.mod.SparklinesLineProps
import typingsJapgolly.reactSparklines.reactSparklinesStrings.click
import typingsJapgolly.reactSparklines.reactSparklinesStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesLine {
  def apply(
    color: String = null,
    onMouseMove: (/* event */ enter | click, /* value */ Double, /* point */ Point) => Callback = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SparklinesLineProps, 
    typingsJapgolly.reactSparklines.mod.SparklinesLine, 
    Unit, 
    SparklinesLineProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.reactSparklines.reactSparklinesStrings.enter | typingsJapgolly.reactSparklines.reactSparklinesStrings.click, t1: /* value */ scala.Double, t2: /* point */ typingsJapgolly.reactSparklines.mod.Point) => onMouseMove(t0, t1, t2).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSparklines.mod.SparklinesLineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSparklines.mod.SparklinesLine](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSparklines.mod.SparklinesLineProps])(children: _*)
  }
  @JSImport("react-sparklines", "SparklinesLine")
  @js.native
  object componentImport extends js.Object
  
}

