package typingsJapgolly.azureArmResource.managementGroupsClientMod

import typingsJapgolly.azureArmResource.managementOperationsMod.ManagementGroups
import typingsJapgolly.azureArmResource.managementOperationsMod.Operations
import typingsJapgolly.msRest.mod.ServiceClientCredentials
import typingsJapgolly.msRestAzure.mod.AzureServiceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagementGroupsClient extends AzureServiceClient {
  var acceptLanguage: String = js.native
  var apiVersion: String = js.native
  var credentials: ServiceClientCredentials = js.native
  var generateClientRequestId: Boolean = js.native
  var groupId: String = js.native
  var longRunningOperationRetryTimeout: Double = js.native
  // Operation groups
  var managementGroups: ManagementGroups = js.native
  var operations: Operations = js.native
}

