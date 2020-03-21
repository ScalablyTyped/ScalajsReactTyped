package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.AnonGlyph
import typingsJapgolly.fundamentalReact.AnonImage
import typingsJapgolly.fundamentalReact.AnonLabel
import typingsJapgolly.fundamentalReact.AnonLink
import typingsJapgolly.fundamentalReact.AnonNotificationsButton
import typingsJapgolly.fundamentalReact.shellbarMod.ShellbarProps
import typingsJapgolly.fundamentalReact.shellbarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Shellbar {
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    actions: js.Array[AnonGlyph] = null,
    className: String = null,
    copilot: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    localizedText: AnonNotificationsButton = null,
    logo: VdomNode = null,
    logoSAP: js.UndefOr[Boolean] = js.undefined,
    notifications: AnonLabel = null,
    productMenu: js.Array[AnonLink] = null,
    productSwitcher: js.Object = null,
    productSwitcherList: js.Array[AnonImage] = null,
    productTitle: String = null,
    profile: StringDictionary[js.Any] = null,
    profileMenu: js.Array[StringDictionary[_]] = null,
    searchInput: StringDictionary[js.Any] = null,
    subtitle: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ShellbarProps, default, Unit, ShellbarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(copilot)) __obj.updateDynamic("copilot")(copilot.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(logoSAP)) __obj.updateDynamic("logoSAP")(logoSAP.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (productMenu != null) __obj.updateDynamic("productMenu")(productMenu.asInstanceOf[js.Any])
    if (productSwitcher != null) __obj.updateDynamic("productSwitcher")(productSwitcher.asInstanceOf[js.Any])
    if (productSwitcherList != null) __obj.updateDynamic("productSwitcherList")(productSwitcherList.asInstanceOf[js.Any])
    if (productTitle != null) __obj.updateDynamic("productTitle")(productTitle.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (profileMenu != null) __obj.updateDynamic("profileMenu")(profileMenu.asInstanceOf[js.Any])
    if (searchInput != null) __obj.updateDynamic("searchInput")(searchInput.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fundamentalReact.shellbarMod.ShellbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fundamentalReact.shellbarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.shellbarMod.ShellbarProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/Shellbar/Shellbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

