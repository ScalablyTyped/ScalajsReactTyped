package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.portalMod.default
import typingsJapgolly.materialUiCore.portalPortalMod.PortalProps
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal {
  def apply(
    container: ReactInstance | js.Function0[ReactInstance] = null,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    onRendered: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PortalProps, default, Unit, PortalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal.asInstanceOf[js.Any])
    onRendered.foreach(p => __obj.updateDynamic("onRendered")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.portalPortalMod.PortalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.portalMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.portalPortalMod.PortalProps])(children: _*)
  }
  @JSImport("@material-ui/core/Portal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

