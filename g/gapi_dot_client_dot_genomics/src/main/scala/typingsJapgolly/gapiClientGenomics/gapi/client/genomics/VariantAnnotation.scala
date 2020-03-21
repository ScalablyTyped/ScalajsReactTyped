package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantAnnotation extends js.Object {
  /**
    * The alternate allele for this variant. If multiple alternate alleles
    * exist at this location, create a separate variant for each one, as they
    * may represent distinct conditions.
    */
  var alternateBases: js.UndefOr[String] = js.undefined
  /**
    * Describes the clinical significance of a variant.
    * It is adapted from the ClinVar controlled vocabulary for clinical
    * significance described at:
    * http://www.ncbi.nlm.nih.gov/clinvar/docs/clinsig/
    */
  var clinicalSignificance: js.UndefOr[String] = js.undefined
  /**
    * The set of conditions associated with this variant.
    * A condition describes the way a variant influences human health.
    */
  var conditions: js.UndefOr[js.Array[ClinicalCondition]] = js.undefined
  /** Effect of the variant on the coding sequence. */
  var effect: js.UndefOr[String] = js.undefined
  /**
    * Google annotation ID of the gene affected by this variant. This should
    * be provided when the variant is created.
    */
  var geneId: js.UndefOr[String] = js.undefined
  /**
    * Google annotation IDs of the transcripts affected by this variant. These
    * should be provided when the variant is created.
    */
  var transcriptIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Type has been adapted from ClinVar's list of variant types. */
  var `type`: js.UndefOr[String] = js.undefined
}

object VariantAnnotation {
  @scala.inline
  def apply(
    alternateBases: String = null,
    clinicalSignificance: String = null,
    conditions: js.Array[ClinicalCondition] = null,
    effect: String = null,
    geneId: String = null,
    transcriptIds: js.Array[String] = null,
    `type`: String = null
  ): VariantAnnotation = {
    val __obj = js.Dynamic.literal()
    if (alternateBases != null) __obj.updateDynamic("alternateBases")(alternateBases.asInstanceOf[js.Any])
    if (clinicalSignificance != null) __obj.updateDynamic("clinicalSignificance")(clinicalSignificance.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (geneId != null) __obj.updateDynamic("geneId")(geneId.asInstanceOf[js.Any])
    if (transcriptIds != null) __obj.updateDynamic("transcriptIds")(transcriptIds.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantAnnotation]
  }
}

