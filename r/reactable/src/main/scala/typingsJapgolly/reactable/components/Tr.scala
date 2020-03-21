package typingsJapgolly.reactable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactable.mod.TrProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tr {
  def apply[T](
    className: String = null,
    data: T = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TrProperties[T], typingsJapgolly.reactable.mod.Tr[T], Unit, TrProperties[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactable.mod.TrProperties[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactable.mod.Tr[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactable.mod.TrProperties[T]])(children: _*)
  }
  @JSImport("reactable", "Tr")
  @js.native
  object componentImport extends js.Object
  
}

