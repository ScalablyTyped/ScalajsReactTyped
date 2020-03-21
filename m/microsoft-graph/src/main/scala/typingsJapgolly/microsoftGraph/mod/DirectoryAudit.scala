package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryAudit extends Entity {
  /**
    * Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight
    * UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var activityDateTime: js.UndefOr[String] = js.undefined
  /**
    * Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list,
    * see Azure AD activity list.
    */
  var activityDisplayName: js.UndefOr[String] = js.undefined
  // Indicates additional details on the activity.
  var additionalDetails: js.UndefOr[js.Array[KeyValue]] = js.undefined
  /**
    * Indicates which resource category that's targeted by the activity. (For example: User Management, Group Management
    * etc..)
    */
  var category: js.UndefOr[String] = js.undefined
  /**
    * Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs
    * across services.
    */
  var correlationId: js.UndefOr[String] = js.undefined
  // Indicates information about the user or app initiated the activity.
  var initiatedBy: js.UndefOr[AuditActivityInitiator] = js.undefined
  /**
    * Indicates information on which service initiated the activity (For example: Self-service Password Management, Core
    * Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
    */
  var loggedByService: js.UndefOr[String] = js.undefined
  var operationType: js.UndefOr[String] = js.undefined
  // Indicates the result of the activity.Possible values are: success, failure, timeout, unknownFutureValue.
  var result: js.UndefOr[OperationResult] = js.undefined
  // Describes cause of 'failure' or 'timeout' results.
  var resultReason: js.UndefOr[String] = js.undefined
  /**
    * Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device,
    * Directory, App, Role, Group, Policy or Other.
    */
  var targetResources: js.UndefOr[js.Array[TargetResource]] = js.undefined
}

object DirectoryAudit {
  @scala.inline
  def apply(
    activityDateTime: String = null,
    activityDisplayName: String = null,
    additionalDetails: js.Array[KeyValue] = null,
    category: String = null,
    correlationId: String = null,
    id: String = null,
    initiatedBy: AuditActivityInitiator = null,
    loggedByService: String = null,
    operationType: String = null,
    result: OperationResult = null,
    resultReason: String = null,
    targetResources: js.Array[TargetResource] = null
  ): DirectoryAudit = {
    val __obj = js.Dynamic.literal()
    if (activityDateTime != null) __obj.updateDynamic("activityDateTime")(activityDateTime.asInstanceOf[js.Any])
    if (activityDisplayName != null) __obj.updateDynamic("activityDisplayName")(activityDisplayName.asInstanceOf[js.Any])
    if (additionalDetails != null) __obj.updateDynamic("additionalDetails")(additionalDetails.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initiatedBy != null) __obj.updateDynamic("initiatedBy")(initiatedBy.asInstanceOf[js.Any])
    if (loggedByService != null) __obj.updateDynamic("loggedByService")(loggedByService.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (resultReason != null) __obj.updateDynamic("resultReason")(resultReason.asInstanceOf[js.Any])
    if (targetResources != null) __obj.updateDynamic("targetResources")(targetResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryAudit]
  }
}

