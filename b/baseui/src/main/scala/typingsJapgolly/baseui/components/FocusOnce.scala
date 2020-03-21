package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonChildrenReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FocusOnce {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AnonChildrenReactNode, 
    typingsJapgolly.baseui.modalMod.FocusOnce, 
    Unit, 
    AnonChildrenReactNode
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.AnonChildrenReactNode, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.modalMod.FocusOnce](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.AnonChildrenReactNode])(children: _*)
  }
  @JSImport("baseui/modal", "FocusOnce")
  @js.native
  object componentImport extends js.Object
  
}

