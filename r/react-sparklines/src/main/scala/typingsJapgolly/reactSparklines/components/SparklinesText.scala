package typingsJapgolly.reactSparklines.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSparklines.mod.Point
import typingsJapgolly.reactSparklines.mod.SparklinesTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesText {
  def apply(
    fontFamily: String = null,
    fontSize: Int | Double = null,
    point: Point = null,
    text: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SparklinesTextProps, 
    typingsJapgolly.reactSparklines.mod.SparklinesText, 
    Unit, 
    SparklinesTextProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSparklines.mod.SparklinesTextProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSparklines.mod.SparklinesText](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSparklines.mod.SparklinesTextProps])(children: _*)
  }
  @JSImport("react-sparklines", "SparklinesText")
  @js.native
  object componentImport extends js.Object
  
}

