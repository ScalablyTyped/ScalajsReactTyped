package typingsJapgolly.reactSparklines.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSparklines.mod.SparklinesReferenceLineProps
import typingsJapgolly.reactSparklines.reactSparklinesStrings.avg
import typingsJapgolly.reactSparklines.reactSparklinesStrings.custom
import typingsJapgolly.reactSparklines.reactSparklinesStrings.max
import typingsJapgolly.reactSparklines.reactSparklinesStrings.mean
import typingsJapgolly.reactSparklines.reactSparklinesStrings.median
import typingsJapgolly.reactSparklines.reactSparklinesStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesReferenceLine {
  def apply(
    style: CSSProperties = null,
    `type`: max | min | mean | avg | median | custom = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SparklinesReferenceLineProps, 
    typingsJapgolly.reactSparklines.mod.SparklinesReferenceLine, 
    Unit, 
    SparklinesReferenceLineProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSparklines.mod.SparklinesReferenceLineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSparklines.mod.SparklinesReferenceLine](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSparklines.mod.SparklinesReferenceLineProps])(children: _*)
  }
  @JSImport("react-sparklines", "SparklinesReferenceLine")
  @js.native
  object componentImport extends js.Object
  
}

