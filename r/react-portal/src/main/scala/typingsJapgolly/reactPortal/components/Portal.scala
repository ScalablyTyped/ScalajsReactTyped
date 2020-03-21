package typingsJapgolly.reactPortal.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactPortal.mod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal {
  def apply(
    node: Element = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PortalProps, typingsJapgolly.reactPortal.mod.Portal, Unit, PortalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPortal.mod.PortalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPortal.mod.Portal](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPortal.mod.PortalProps])(children: _*)
  }
  @JSImport("react-portal", "Portal")
  @js.native
  object componentImport extends js.Object
  
}

