package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsMountNodeMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsMountNodeMountNodeMod.MountNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MountNode {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    node: HTMLElement | japgolly.scalajs.react.raw.React.Ref = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MountNodeProps, default, Unit, MountNodeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsMountNodeMountNodeMod.MountNodeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsMountNodeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsMountNodeMountNodeMod.MountNodeProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/MountNode", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

