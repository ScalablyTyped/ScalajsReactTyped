package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.errorBoundaryMod.ErrorBoundaryProps
import typingsJapgolly.antd.errorBoundaryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ErrorBoundary {
  def apply(
    description: VdomNode = null,
    message: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ErrorBoundaryProps, default, Unit, ErrorBoundaryProps] = {
    val __obj = js.Dynamic.literal()
  
      if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.errorBoundaryMod.ErrorBoundaryProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.errorBoundaryMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.errorBoundaryMod.ErrorBoundaryProps])(children: _*)
  }
  @JSImport("antd/lib/alert/ErrorBoundary", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

