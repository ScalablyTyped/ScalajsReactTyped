package typingsJapgolly.antDesignProLayout.libSettingDrawerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignProLayout.MergerSettingsTypeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingDrawerProps extends js.Object {
  var collapse: js.UndefOr[Boolean] = js.undefined
  var getContainer: js.UndefOr[js.Any] = js.undefined
  var hideColors: js.UndefOr[Boolean] = js.undefined
  var hideCopyButton: js.UndefOr[Boolean] = js.undefined
  var hideHintAlert: js.UndefOr[Boolean] = js.undefined
  var hideLoading: js.UndefOr[Boolean] = js.undefined
  var onCollapseChange: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.undefined
  var onSettingChange: js.UndefOr[js.Function1[/* settings */ MergerSettingsTypeSetting, Unit]] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
  var settings: js.UndefOr[MergerSettingsTypeSetting] = js.undefined
}

object SettingDrawerProps {
  @scala.inline
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
    settings: MergerSettingsTypeSetting = null
  ): SettingDrawerProps = {
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
    __obj.asInstanceOf[SettingDrawerProps]
  }
}

