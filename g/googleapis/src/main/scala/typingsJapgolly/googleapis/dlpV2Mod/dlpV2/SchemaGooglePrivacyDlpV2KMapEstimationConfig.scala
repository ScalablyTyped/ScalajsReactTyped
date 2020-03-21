package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reidentifiability metric. This corresponds to a risk model similar to what
  * is called &quot;journalist risk&quot; in the literature, except the attack
  * dataset is statistically modeled instead of being perfectly known. This can
  * be done using publicly available data (like the US Census), or using a
  * custom statistical model (indicated as one or several BigQuery tables), or
  * by extrapolating from the distribution of values in the input dataset. A
  * column with a semantic tag attached.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationConfig extends js.Object {
  /**
    * Several auxiliary tables can be used in the analysis. Each custom_tag
    * used to tag a quasi-identifiers column must appear in exactly one column
    * of one auxiliary table.
    */
  var auxiliaryTables: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2AuxiliaryTable]] = js.native
  /**
    * Fields considered to be quasi-identifiers. No two columns can have the
    * same tag. [required]
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2TaggedField]] = js.native
  /**
    * ISO 3166-1 alpha-2 region code to use in the statistical modeling.
    * Required if no column is tagged with a region-specific InfoType (like
    * US_ZIP_5) or a region code.
    */
  var regionCode: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2KMapEstimationConfig {
  @scala.inline
  def apply(
    auxiliaryTables: js.Array[SchemaGooglePrivacyDlpV2AuxiliaryTable] = null,
    quasiIds: js.Array[SchemaGooglePrivacyDlpV2TaggedField] = null,
    regionCode: String = null
  ): SchemaGooglePrivacyDlpV2KMapEstimationConfig = {
    val __obj = js.Dynamic.literal()
    if (auxiliaryTables != null) __obj.updateDynamic("auxiliaryTables")(auxiliaryTables.asInstanceOf[js.Any])
    if (quasiIds != null) __obj.updateDynamic("quasiIds")(quasiIds.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationConfig]
  }
}

