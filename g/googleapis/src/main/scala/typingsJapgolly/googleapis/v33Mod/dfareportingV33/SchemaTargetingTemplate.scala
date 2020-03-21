package typingsJapgolly.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a targeting template. A targeting template
  * encapsulates targeting information which can be reused across multiple ads.
  */
@js.native
trait SchemaTargetingTemplate extends js.Object {
  /**
    * Account ID of this targeting template. This field, if left unset, will be
    * auto-generated on insert and is read-only after insert.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this targeting template. This is a required field on
    * insert and is read-only after insert.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Time and day targeting criteria.
    */
  var dayPartTargeting: js.UndefOr[SchemaDayPartTargeting] = js.native
  /**
    * Geographical targeting criteria.
    */
  var geoTargeting: js.UndefOr[SchemaGeoTargeting] = js.native
  /**
    * ID of this targeting template. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Key-value targeting criteria.
    */
  var keyValueTargetingExpression: js.UndefOr[SchemaKeyValueTargetingExpression] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetingTemplate&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Language targeting criteria.
    */
  var languageTargeting: js.UndefOr[SchemaLanguageTargeting] = js.native
  /**
    * Remarketing list targeting criteria.
    */
  var listTargetingExpression: js.UndefOr[SchemaListTargetingExpression] = js.native
  /**
    * Name of this targeting template. This field is required. It must be less
    * than 256 characters long and unique within an advertiser.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this targeting template. This field, if left unset, will
    * be auto-generated on insert and is read-only after insert.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Technology platform targeting criteria.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.native
}

object SchemaTargetingTemplate {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: SchemaDimensionValue = null,
    dayPartTargeting: SchemaDayPartTargeting = null,
    geoTargeting: SchemaGeoTargeting = null,
    id: String = null,
    keyValueTargetingExpression: SchemaKeyValueTargetingExpression = null,
    kind: String = null,
    languageTargeting: SchemaLanguageTargeting = null,
    listTargetingExpression: SchemaListTargetingExpression = null,
    name: String = null,
    subaccountId: String = null,
    technologyTargeting: SchemaTechnologyTargeting = null
  ): SchemaTargetingTemplate = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (dayPartTargeting != null) __obj.updateDynamic("dayPartTargeting")(dayPartTargeting.asInstanceOf[js.Any])
    if (geoTargeting != null) __obj.updateDynamic("geoTargeting")(geoTargeting.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyValueTargetingExpression != null) __obj.updateDynamic("keyValueTargetingExpression")(keyValueTargetingExpression.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languageTargeting != null) __obj.updateDynamic("languageTargeting")(languageTargeting.asInstanceOf[js.Any])
    if (listTargetingExpression != null) __obj.updateDynamic("listTargetingExpression")(listTargetingExpression.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (technologyTargeting != null) __obj.updateDynamic("technologyTargeting")(technologyTargeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingTemplate]
  }
}

