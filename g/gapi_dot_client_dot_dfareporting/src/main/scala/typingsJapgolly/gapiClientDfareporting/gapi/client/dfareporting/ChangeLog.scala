package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLog extends js.Object {
  /** Account ID of the modified object. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Action which caused the change. */
  var action: js.UndefOr[String] = js.undefined
  /** Time when the object was modified. */
  var changeTime: js.UndefOr[String] = js.undefined
  /** Field name of the object which changed. */
  var fieldName: js.UndefOr[String] = js.undefined
  /** ID of this change log. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#changeLog". */
  var kind: js.UndefOr[String] = js.undefined
  /** New value of the object field. */
  var newValue: js.UndefOr[String] = js.undefined
  /** ID of the object of this change log. The object could be a campaign, placement, ad, or other type. */
  var objectId: js.UndefOr[String] = js.undefined
  /** Object type of the change log. */
  var objectType: js.UndefOr[String] = js.undefined
  /** Old value of the object field. */
  var oldValue: js.UndefOr[String] = js.undefined
  /** Subaccount ID of the modified object. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /**
    * Transaction ID of this change log. When a single API call results in many changes, each change will have a separate ID in the change log but will share
    * the same transactionId.
    */
  var transactionId: js.UndefOr[String] = js.undefined
  /** ID of the user who modified the object. */
  var userProfileId: js.UndefOr[String] = js.undefined
  /** User profile name of the user who modified the object. */
  var userProfileName: js.UndefOr[String] = js.undefined
}

object ChangeLog {
  @scala.inline
  def apply(
    accountId: String = null,
    action: String = null,
    changeTime: String = null,
    fieldName: String = null,
    id: String = null,
    kind: String = null,
    newValue: String = null,
    objectId: String = null,
    objectType: String = null,
    oldValue: String = null,
    subaccountId: String = null,
    transactionId: String = null,
    userProfileId: String = null,
    userProfileName: String = null
  ): ChangeLog = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (changeTime != null) __obj.updateDynamic("changeTime")(changeTime.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    if (userProfileId != null) __obj.updateDynamic("userProfileId")(userProfileId.asInstanceOf[js.Any])
    if (userProfileName != null) __obj.updateDynamic("userProfileName")(userProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeLog]
  }
}

