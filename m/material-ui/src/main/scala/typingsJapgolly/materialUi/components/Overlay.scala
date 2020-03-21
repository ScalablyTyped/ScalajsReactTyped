package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.overlayMod.OverlayProps
import typingsJapgolly.materialUi.overlayMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay {
  def apply(
    show: Boolean,
    autoLockScrolling: js.UndefOr[Boolean] = js.undefined,
    onClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    style: CSSProperties = null,
    transitionEnabled: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OverlayProps, default, Unit, OverlayProps] = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
  
      if (!js.isUndefined(autoLockScrolling)) __obj.updateDynamic("autoLockScrolling")(autoLockScrolling.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnabled)) __obj.updateDynamic("transitionEnabled")(transitionEnabled.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.overlayMod.OverlayProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.overlayMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.overlayMod.OverlayProps])(children: _*)
  }
  @JSImport("material-ui/internal/Overlay", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

