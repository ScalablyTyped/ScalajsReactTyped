package typingsJapgolly.reactMdl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMdl.AnonRecursive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MDLComponent {
  def apply(
    recursive: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonRecursive, typingsJapgolly.reactMdl.mod.MDLComponent, Unit, AnonRecursive] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMdl.AnonRecursive, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMdl.mod.MDLComponent](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMdl.AnonRecursive])(children: _*)
  }
  @JSImport("react-mdl", "MDLComponent")
  @js.native
  object componentImport extends js.Object
  
}

