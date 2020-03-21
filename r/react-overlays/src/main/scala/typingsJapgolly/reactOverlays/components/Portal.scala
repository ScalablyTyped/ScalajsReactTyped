package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactOverlays.portalMod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal {
  def apply(
    container: Node | js.Function = null,
    onRendered: js.Function = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PortalProps, typingsJapgolly.reactOverlays.mod.Portal, Unit, PortalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOverlays.portalMod.PortalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOverlays.mod.Portal](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOverlays.portalMod.PortalProps])(children: _*)
  }
  @JSImport("react-overlays", "Portal")
  @js.native
  object componentImport extends js.Object
  
}

