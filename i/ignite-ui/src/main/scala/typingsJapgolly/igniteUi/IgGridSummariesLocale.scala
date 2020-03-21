package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSummariesLocale
  extends /**
	 * Option for IgGridSummariesLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Text of the button Cancel in the summaries dropdown
  	 *
  	 */
  var dialogButtonCancelText: js.UndefOr[String] = js.undefined
  /**
  	 * Text of the button OK in the summaries dropdown
  	 *
  	 */
  var dialogButtonOKText: js.UndefOr[String] = js.undefined
  /**
  	 * Empty text template to be shown for empty cells
  	 *
  	 */
  var emptyCellText: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set text that is shown in the feature chooser dropdown when summaries are hidden
  	 *
  	 */
  var featureChooserText: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set text that is shown in the feauture chooser dropdown when summaries are shown
  	 *
  	 */
  var featureChooserTextHide: js.UndefOr[String] = js.undefined
  /**
  	 * Tooltip text for header cell button
  	 *
  	 */
  var summariesHeaderButtonTooltip: js.UndefOr[String] = js.undefined
}

object IgGridSummariesLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridSummariesLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    dialogButtonCancelText: String = null,
    dialogButtonOKText: String = null,
    emptyCellText: String = null,
    featureChooserText: String = null,
    featureChooserTextHide: String = null,
    summariesHeaderButtonTooltip: String = null
  ): IgGridSummariesLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dialogButtonCancelText != null) __obj.updateDynamic("dialogButtonCancelText")(dialogButtonCancelText.asInstanceOf[js.Any])
    if (dialogButtonOKText != null) __obj.updateDynamic("dialogButtonOKText")(dialogButtonOKText.asInstanceOf[js.Any])
    if (emptyCellText != null) __obj.updateDynamic("emptyCellText")(emptyCellText.asInstanceOf[js.Any])
    if (featureChooserText != null) __obj.updateDynamic("featureChooserText")(featureChooserText.asInstanceOf[js.Any])
    if (featureChooserTextHide != null) __obj.updateDynamic("featureChooserTextHide")(featureChooserTextHide.asInstanceOf[js.Any])
    if (summariesHeaderButtonTooltip != null) __obj.updateDynamic("summariesHeaderButtonTooltip")(summariesHeaderButtonTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridSummariesLocale]
  }
}

