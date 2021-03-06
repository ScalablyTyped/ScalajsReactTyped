package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.origin
import typingsJapgolly.materialUi.popoverMod.default
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  def apply(
    anchorEl: ReactInstance = null,
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ComponentClassP[PopoverAnimationProps with js.Object] = null,
    autoCloseWhenOffScreen: js.UndefOr[Boolean] = js.undefined,
    canAutoPosition: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    onRequestClose: /* reason */ String => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined,
    zDepth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopoverProps, default, Unit, PopoverProps] = {
    val __obj = js.Dynamic.literal()
  
      if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCloseWhenOffScreen)) __obj.updateDynamic("autoCloseWhenOffScreen")(autoCloseWhenOffScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(canAutoPosition)) __obj.updateDynamic("canAutoPosition")(canAutoPosition.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1((t0: /* reason */ java.lang.String) => onRequestClose(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Popover.PopoverProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.popoverMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Popover.PopoverProps])(children: _*)
  }
  @JSImport("material-ui/Popover", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

