package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToolbox.layoutNavDrawerMod.NavDrawerProps
import typingsJapgolly.reactToolbox.layoutNavDrawerMod.NavDrawerTheme
import typingsJapgolly.reactToolbox.reactToolboxStrings.left
import typingsJapgolly.reactToolbox.reactToolboxStrings.lg
import typingsJapgolly.reactToolbox.reactToolboxStrings.lgTablet
import typingsJapgolly.reactToolbox.reactToolboxStrings.md
import typingsJapgolly.reactToolbox.reactToolboxStrings.right
import typingsJapgolly.reactToolbox.reactToolboxStrings.sm
import typingsJapgolly.reactToolbox.reactToolboxStrings.smTablet
import typingsJapgolly.reactToolbox.reactToolboxStrings.xl
import typingsJapgolly.reactToolbox.reactToolboxStrings.xxl
import typingsJapgolly.reactToolbox.reactToolboxStrings.xxxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavDrawer {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    clipped: js.UndefOr[Boolean] = js.undefined,
    insideTree: js.UndefOr[Boolean] = js.undefined,
    onOverlayClick: js.Function = null,
    permanentAt: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    theme: NavDrawerTheme = null,
    `type`: left | right = null,
    withOverlay: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NavDrawerProps, typingsJapgolly.reactToolbox.mod.NavDrawer, Unit, NavDrawerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (!js.isUndefined(insideTree)) __obj.updateDynamic("insideTree")(insideTree.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick.asInstanceOf[js.Any])
    if (permanentAt != null) __obj.updateDynamic("permanentAt")(permanentAt.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToolbox.layoutNavDrawerMod.NavDrawerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToolbox.mod.NavDrawer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToolbox.layoutNavDrawerMod.NavDrawerProps])(children: _*)
  }
  @JSImport("react-toolbox", "NavDrawer")
  @js.native
  object componentImport extends js.Object
  
}

