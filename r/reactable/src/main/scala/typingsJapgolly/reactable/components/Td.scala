package typingsJapgolly.reactable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactable.mod.TdProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Td {
  def apply(
    column: String,
    data: js.Any = null,
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TdProperties, typingsJapgolly.reactable.mod.Td, Unit, TdProperties] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
  
      if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactable.mod.TdProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactable.mod.Td](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactable.mod.TdProperties])(children: _*)
  }
  @JSImport("reactable", "Td")
  @js.native
  object componentImport extends js.Object
  
}

