package typingsJapgolly.reactSpinner.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSpinner.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSpinner {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[js.Object, default, Unit, js.Object] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSpinner.mod.default](this.componentImport)
    f(__obj.asInstanceOf[js.Object])(children: _*)
  }
  @JSImport("react-spinner", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

