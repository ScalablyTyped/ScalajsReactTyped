package typingsJapgolly.reactable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactable.mod.ThProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Th {
  def apply(
    column: String,
    className: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ThProperties, typingsJapgolly.reactable.mod.Th, Unit, ThProperties] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactable.mod.ThProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactable.mod.Th](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactable.mod.ThProperties])(children: _*)
  }
  @JSImport("reactable", "Th")
  @js.native
  object componentImport extends js.Object
  
}

