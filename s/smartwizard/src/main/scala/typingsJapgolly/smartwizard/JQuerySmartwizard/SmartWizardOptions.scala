package typingsJapgolly.smartwizard.JQuerySmartwizard

import typingsJapgolly.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartWizardOptions extends js.Object {
  var ajaxSettings: js.UndefOr[JQueryAjaxSettings] = js.undefined
  var anchorSettings: js.UndefOr[AnchorSettings] = js.undefined
  var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
  var backButtonSupport: js.UndefOr[Boolean] = js.undefined
  var contentCache: js.UndefOr[Boolean] = js.undefined
  var contentURL: js.UndefOr[Null | String] = js.undefined
  var cycleSteps: js.UndefOr[Boolean] = js.undefined
  var disabledSteps: js.UndefOr[js.Array[Double]] = js.undefined
  var errorSteps: js.UndefOr[js.Array[Double]] = js.undefined
  var hiddenSteps: js.UndefOr[js.Array[Double]] = js.undefined
  var keyNavigation: js.UndefOr[Boolean] = js.undefined
  var lang: js.UndefOr[Lang] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
  var showStepURLhash: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  var transitionEffect: js.UndefOr[TransitionEffect] = js.undefined
  var transitionSpeed: js.UndefOr[String | Double] = js.undefined
  var useURLhash: js.UndefOr[Boolean] = js.undefined
}

object SmartWizardOptions {
  @scala.inline
  def apply(
    ajaxSettings: JQueryAjaxSettings = null,
    anchorSettings: AnchorSettings = null,
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    backButtonSupport: js.UndefOr[Boolean] = js.undefined,
    contentCache: js.UndefOr[Boolean] = js.undefined,
    contentURL: String = null,
    cycleSteps: js.UndefOr[Boolean] = js.undefined,
    disabledSteps: js.Array[Double] = null,
    errorSteps: js.Array[Double] = null,
    hiddenSteps: js.Array[Double] = null,
    keyNavigation: js.UndefOr[Boolean] = js.undefined,
    lang: Lang = null,
    selected: Int | Double = null,
    showStepURLhash: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    toolbarSettings: ToolbarSettings = null,
    transitionEffect: TransitionEffect = null,
    transitionSpeed: String | Double = null,
    useURLhash: js.UndefOr[Boolean] = js.undefined
  ): SmartWizardOptions = {
    val __obj = js.Dynamic.literal()
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings.asInstanceOf[js.Any])
    if (anchorSettings != null) __obj.updateDynamic("anchorSettings")(anchorSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(backButtonSupport)) __obj.updateDynamic("backButtonSupport")(backButtonSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(contentCache)) __obj.updateDynamic("contentCache")(contentCache.asInstanceOf[js.Any])
    if (contentURL != null) __obj.updateDynamic("contentURL")(contentURL.asInstanceOf[js.Any])
    if (!js.isUndefined(cycleSteps)) __obj.updateDynamic("cycleSteps")(cycleSteps.asInstanceOf[js.Any])
    if (disabledSteps != null) __obj.updateDynamic("disabledSteps")(disabledSteps.asInstanceOf[js.Any])
    if (errorSteps != null) __obj.updateDynamic("errorSteps")(errorSteps.asInstanceOf[js.Any])
    if (hiddenSteps != null) __obj.updateDynamic("hiddenSteps")(hiddenSteps.asInstanceOf[js.Any])
    if (!js.isUndefined(keyNavigation)) __obj.updateDynamic("keyNavigation")(keyNavigation.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showStepURLhash)) __obj.updateDynamic("showStepURLhash")(showStepURLhash.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings.asInstanceOf[js.Any])
    if (transitionEffect != null) __obj.updateDynamic("transitionEffect")(transitionEffect.asInstanceOf[js.Any])
    if (transitionSpeed != null) __obj.updateDynamic("transitionSpeed")(transitionSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(useURLhash)) __obj.updateDynamic("useURLhash")(useURLhash.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartWizardOptions]
  }
}

