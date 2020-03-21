package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToolbox.libOverlayMod.default
import typingsJapgolly.reactToolbox.libOverlayOverlayMod.OverlayProps
import typingsJapgolly.reactToolbox.libOverlayOverlayMod.OverlayTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    invisible: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    onEscKeyDown: js.Function = null,
    theme: OverlayTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OverlayProps, default, Unit, OverlayProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToolbox.libOverlayOverlayMod.OverlayProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToolbox.libOverlayMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToolbox.libOverlayOverlayMod.OverlayProps])(children: _*)
  }
  @JSImport("react-toolbox/lib/overlay", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

