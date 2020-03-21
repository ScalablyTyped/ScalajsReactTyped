package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RiskAnalysisOperationResult extends js.Object {
  var categoricalStatsResult: js.UndefOr[GooglePrivacyDlpV2beta1CategoricalStatsResult] = js.undefined
  var kAnonymityResult: js.UndefOr[GooglePrivacyDlpV2beta1KAnonymityResult] = js.undefined
  var lDiversityResult: js.UndefOr[GooglePrivacyDlpV2beta1LDiversityResult] = js.undefined
  var numericalStatsResult: js.UndefOr[GooglePrivacyDlpV2beta1NumericalStatsResult] = js.undefined
}

object GooglePrivacyDlpV2beta1RiskAnalysisOperationResult {
  @scala.inline
  def apply(
    categoricalStatsResult: GooglePrivacyDlpV2beta1CategoricalStatsResult = null,
    kAnonymityResult: GooglePrivacyDlpV2beta1KAnonymityResult = null,
    lDiversityResult: GooglePrivacyDlpV2beta1LDiversityResult = null,
    numericalStatsResult: GooglePrivacyDlpV2beta1NumericalStatsResult = null
  ): GooglePrivacyDlpV2beta1RiskAnalysisOperationResult = {
    val __obj = js.Dynamic.literal()
    if (categoricalStatsResult != null) __obj.updateDynamic("categoricalStatsResult")(categoricalStatsResult.asInstanceOf[js.Any])
    if (kAnonymityResult != null) __obj.updateDynamic("kAnonymityResult")(kAnonymityResult.asInstanceOf[js.Any])
    if (lDiversityResult != null) __obj.updateDynamic("lDiversityResult")(lDiversityResult.asInstanceOf[js.Any])
    if (numericalStatsResult != null) __obj.updateDynamic("numericalStatsResult")(numericalStatsResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RiskAnalysisOperationResult]
  }
}

