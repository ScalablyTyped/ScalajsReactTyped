package typingsJapgolly.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAliasRequest extends js.Object {
  /**
    * The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into single entries (the list is transformed into a set).
    */
  var Alias: EmailAddress = js.native
  /**
    * The identifier for the member (user or group) from which to have the aliases removed.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The identifier for the organization under which the user exists.
    */
  var OrganizationId: typingsJapgolly.awsSdk.workmailMod.OrganizationId = js.native
}

object DeleteAliasRequest {
  @scala.inline
  def apply(Alias: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAliasRequest]
  }
}

