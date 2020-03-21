package typingsJapgolly.rrc.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rrc.mod.StatusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Status {
  def apply(
    code: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StatusProps, typingsJapgolly.rrc.mod.Status, Unit, StatusProps] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rrc.mod.StatusProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rrc.mod.Status](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rrc.mod.StatusProps])(children: _*)
  }
  @JSImport("rrc", "Status")
  @js.native
  object componentImport extends js.Object
  
}

