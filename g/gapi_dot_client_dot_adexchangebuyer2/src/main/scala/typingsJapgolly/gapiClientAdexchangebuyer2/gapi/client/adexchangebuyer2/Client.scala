package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  /**
    * The globally-unique numerical ID of the client.
    * The value of this field is ignored in create and update operations.
    */
  var clientAccountId: js.UndefOr[String] = js.undefined
  /**
    * Name used to represent this client to publishers.
    * You may have multiple clients that map to the same entity,
    * but for each client the combination of `clientName` and entity
    * must be unique.
    * You can specify this field as empty.
    */
  var clientName: js.UndefOr[String] = js.undefined
  /**
    * Numerical identifier of the client entity.
    * The entity can be an advertiser, a brand, or an agency.
    * This identifier is unique among all the entities with the same type.
    *
    * A list of all known advertisers with their identifiers is available in the
    * [advertisers.txt](https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt)
    * file.
    *
    * A list of all known brands with their identifiers is available in the
    * [brands.txt](https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt)
    * file.
    *
    * A list of all known agencies with their identifiers is available in the
    * [agencies.txt](https://storage.googleapis.com/adx-rtb-dictionaries/agencies.txt)
    * file.
    */
  var entityId: js.UndefOr[String] = js.undefined
  /**
    * The name of the entity. This field is automatically fetched based on
    * the type and ID.
    * The value of this field is ignored in create and update operations.
    */
  var entityName: js.UndefOr[String] = js.undefined
  /** The type of the client entity: `ADVERTISER`, `BRAND`, or `AGENCY`. */
  var entityType: js.UndefOr[String] = js.undefined
  /**
    * The role which is assigned to the client buyer. Each role implies a set of
    * permissions granted to the client. Must be one of `CLIENT_DEAL_VIEWER`,
    * `CLIENT_DEAL_NEGOTIATOR` or `CLIENT_DEAL_APPROVER`.
    */
  var role: js.UndefOr[String] = js.undefined
  /** The status of the client buyer. */
  var status: js.UndefOr[String] = js.undefined
  /** Whether the client buyer will be visible to sellers. */
  var visibleToSeller: js.UndefOr[Boolean] = js.undefined
}

object Client {
  @scala.inline
  def apply(
    clientAccountId: String = null,
    clientName: String = null,
    entityId: String = null,
    entityName: String = null,
    entityType: String = null,
    role: String = null,
    status: String = null,
    visibleToSeller: js.UndefOr[Boolean] = js.undefined
  ): Client = {
    val __obj = js.Dynamic.literal()
    if (clientAccountId != null) __obj.updateDynamic("clientAccountId")(clientAccountId.asInstanceOf[js.Any])
    if (clientName != null) __obj.updateDynamic("clientName")(clientName.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (entityName != null) __obj.updateDynamic("entityName")(entityName.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleToSeller)) __obj.updateDynamic("visibleToSeller")(visibleToSeller.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

