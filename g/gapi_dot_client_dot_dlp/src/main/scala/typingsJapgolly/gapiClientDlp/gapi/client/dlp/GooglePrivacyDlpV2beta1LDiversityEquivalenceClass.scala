package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1LDiversityEquivalenceClass extends js.Object {
  /** Size of the k-anonymity equivalence class. */
  var equivalenceClassSize: js.UndefOr[String] = js.undefined
  /** Number of distinct sensitive values in this equivalence class. */
  var numDistinctSensitiveValues: js.UndefOr[String] = js.undefined
  /**
    * Quasi-identifier values defining the k-anonymity equivalence
    * class. The order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.undefined
  /** Estimated frequencies of top sensitive values. */
  var topSensitiveValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ValueFrequency]] = js.undefined
}

object GooglePrivacyDlpV2beta1LDiversityEquivalenceClass {
  @scala.inline
  def apply(
    equivalenceClassSize: String = null,
    numDistinctSensitiveValues: String = null,
    quasiIdsValues: js.Array[GooglePrivacyDlpV2beta1Value] = null,
    topSensitiveValues: js.Array[GooglePrivacyDlpV2beta1ValueFrequency] = null
  ): GooglePrivacyDlpV2beta1LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    if (equivalenceClassSize != null) __obj.updateDynamic("equivalenceClassSize")(equivalenceClassSize.asInstanceOf[js.Any])
    if (numDistinctSensitiveValues != null) __obj.updateDynamic("numDistinctSensitiveValues")(numDistinctSensitiveValues.asInstanceOf[js.Any])
    if (quasiIdsValues != null) __obj.updateDynamic("quasiIdsValues")(quasiIdsValues.asInstanceOf[js.Any])
    if (topSensitiveValues != null) __obj.updateDynamic("topSensitiveValues")(topSensitiveValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1LDiversityEquivalenceClass]
  }
}

