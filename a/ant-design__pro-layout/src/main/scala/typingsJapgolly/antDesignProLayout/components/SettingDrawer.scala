package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.MergerSettingsTypeSetting
import typingsJapgolly.antDesignProLayout.libSettingDrawerMod.SettingDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SettingDrawer {
  def apply(
    collapse: js.UndefOr[Boolean] = js.undefined,
    getContainer: js.Any = null,
    hideColors: js.UndefOr[Boolean] = js.undefined,
    hideCopyButton: js.UndefOr[Boolean] = js.undefined,
    hideHintAlert: js.UndefOr[Boolean] = js.undefined,
    hideLoading: js.UndefOr[Boolean] = js.undefined,
    onCollapseChange: /* collapse */ Boolean => Callback = null,
    onSettingChange: /* settings */ MergerSettingsTypeSetting => Callback = null,
    publicPath: String = null,
    settings: MergerSettingsTypeSetting = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SettingDrawerProps, 
    MountedWithRawType[SettingDrawerProps, js.Object, RawMounted[SettingDrawerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(hideColors)) __obj.updateDynamic("hideColors")(hideColors.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCopyButton)) __obj.updateDynamic("hideCopyButton")(hideCopyButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHintAlert)) __obj.updateDynamic("hideHintAlert")(hideHintAlert.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLoading)) __obj.updateDynamic("hideLoading")(hideLoading.asInstanceOf[js.Any])
    if (onCollapseChange != null) __obj.updateDynamic("onCollapseChange")(js.Any.fromFunction1((t0: /* collapse */ scala.Boolean) => onCollapseChange(t0).runNow()))
    if (onSettingChange != null) __obj.updateDynamic("onSettingChange")(js.Any.fromFunction1((t0: /* settings */ typingsJapgolly.antDesignProLayout.MergerSettingsTypeSetting) => onSettingChange(t0).runNow()))
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignProLayout.libSettingDrawerMod.SettingDrawerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.libSettingDrawerMod.SettingDrawerProps])(children: _*)
  }
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

