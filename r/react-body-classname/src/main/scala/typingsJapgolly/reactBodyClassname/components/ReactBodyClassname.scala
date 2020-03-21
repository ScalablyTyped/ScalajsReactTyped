package typingsJapgolly.reactBodyClassname.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBodyClassname.AnonClassName
import typingsJapgolly.reactBodyClassname.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactBodyClassname {
  def apply(
    className: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonClassName, ^, Unit, AnonClassName] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBodyClassname.AnonClassName, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBodyClassname.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBodyClassname.AnonClassName])(children: _*)
  }
  @JSImport("react-body-classname", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

