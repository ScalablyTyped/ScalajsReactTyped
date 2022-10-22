package typingsJapgolly.maximMazurokGapiClientIam.gapi.client.iam

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientIam.anon.AccesstokenAltCallback
import typingsJapgolly.maximMazurokGapiClientIam.anon.AltCallbackFields
import typingsJapgolly.maximMazurokGapiClientIam.anon.CallbackFieldsKey
import typingsJapgolly.maximMazurokGapiClientIam.anon.Fields
import typingsJapgolly.maximMazurokGapiClientIam.anon.OauthtokenPageSize
import typingsJapgolly.maximMazurokGapiClientIam.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientIam.anon.OptionsrequestedPolicyVersion
import typingsJapgolly.maximMazurokGapiClientIam.anon.PrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientIam.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientIam.anon.ResourceUploadType
import typingsJapgolly.maximMazurokGapiClientIam.anon.UploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientIam.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAccountsResource extends StObject {
  
  def create(request: Fields, body: CreateServiceAccountRequest): Request[ServiceAccount] = js.native
  /** Creates a ServiceAccount. */
  def create(request: OauthtokenPrettyPrint): Request[ServiceAccount] = js.native
  
  /**
    * Deletes a ServiceAccount. **Warning:** After you delete a service account, you might not be able to undelete it. If you know that you need to re-enable the service account in the
    * future, use DisableServiceAccount instead. If you delete a service account, IAM permanently removes the service account 30 days later. Google Cloud cannot recover the service
    * account after it is permanently removed, even if you file a support request. To help avoid unplanned outages, we recommend that you disable the service account before you delete it.
    * Use DisableServiceAccount to disable the service account, then wait at least 24 hours and watch for unintended consequences. If there are no unintended consequences, you can delete
    * the service account.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  def disable(request: Fields, body: DisableServiceAccountRequest): Request[js.Object] = js.native
  /**
    * Disables a ServiceAccount immediately. If an application uses the service account to authenticate, that application can no longer call Google APIs or access Google Cloud resources.
    * Existing access tokens for the service account are rejected, and requests for new access tokens will fail. To re-enable the service account, use EnableServiceAccount. After you
    * re-enable the service account, its existing access tokens will be accepted, and you can request new access tokens. To help avoid unplanned outages, we recommend that you disable the
    * service account before you delete it. Use this method to disable the service account, then wait at least 24 hours and watch for unintended consequences. If there are no unintended
    * consequences, you can delete the service account with DeleteServiceAccount.
    */
  def disable(request: PrettyPrintQuotaUser): Request[js.Object] = js.native
  
  def enable(request: Fields, body: EnableServiceAccountRequest): Request[js.Object] = js.native
  /**
    * Enables a ServiceAccount that was disabled by DisableServiceAccount. If the service account is already enabled, then this method has no effect. If the service account was disabled
    * by other means—for example, if Google disabled the service account because it was compromised—you cannot use this method to enable the service account.
    */
  def enable(request: QuotaUserResource): Request[js.Object] = js.native
  
  /** Gets a ServiceAccount. */
  def get(): Request[ServiceAccount] = js.native
  def get(request: Fields): Request[ServiceAccount] = js.native
  
  /**
    * Gets the IAM policy that is attached to a ServiceAccount. This IAM policy specifies which principals have access to the service account. This method does not tell you whether the
    * service account has been granted any roles on other resources. To check whether a service account has role grants on a resource, use the `getIamPolicy` method for that resource. For
    * example, to view the role grants for a project, call the Resource Manager API's
    * [`projects.getIamPolicy`](https://cloud.google.com/resource-manager/reference/rest/v1/projects/getIamPolicy) method.
    */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  var keys: KeysResource = js.native
  
  /** Lists every ServiceAccount that belongs to a specific project. */
  def list(): Request[ListServiceAccountsResponse] = js.native
  def list(request: OauthtokenPageSize): Request[ListServiceAccountsResponse] = js.native
  
  def patch(request: Fields, body: PatchServiceAccountRequest): Request[ServiceAccount] = js.native
  /** Patches a ServiceAccount. */
  def patch(request: ResourceUploadType): Request[ServiceAccount] = js.native
  
  /**
    * Sets the IAM policy that is attached to a ServiceAccount. Use this method to grant or revoke access to the service account. For example, you could grant a principal the ability to
    * impersonate the service account. This method does not enable the service account to access other resources. To grant roles to a service account on a resource, follow these steps: 1.
    * Call the resource's `getIamPolicy` method to get its current IAM policy. 2. Edit the policy so that it binds the service account to an IAM role for the resource. 3. Call the
    * resource's `setIamPolicy` method to update its IAM policy. For detailed instructions, see [Manage access to project, folders, and
    * organizations](https://cloud.google.com/iam/help/service-accounts/granting-access-to-service-accounts) or [Manage access to other
    * resources](https://cloud.google.com/iam/help/access/manage-other-resources).
    */
  def setIamPolicy(request: UploadTypeUploadprotocol, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  def signBlob(request: Fields, body: SignBlobRequest): Request[SignBlobResponse] = js.native
  /**
    * **Note:** This method is deprecated. Use the [`signBlob`](https://cloud.google.com/iam/help/rest-credentials/v1/projects.serviceAccounts/signBlob) method in the IAM Service Account
    * Credentials API instead. If you currently use this method, see the [migration guide](https://cloud.google.com/iam/help/credentials/migrate-api) for instructions. Signs a blob using
    * the system-managed private key for a ServiceAccount.
    */
  def signBlob(request: UploadprotocolXgafv): Request[SignBlobResponse] = js.native
  
  /**
    * **Note:** This method is deprecated. Use the [`signJwt`](https://cloud.google.com/iam/help/rest-credentials/v1/projects.serviceAccounts/signJwt) method in the IAM Service Account
    * Credentials API instead. If you currently use this method, see the [migration guide](https://cloud.google.com/iam/help/credentials/migrate-api) for instructions. Signs a JSON Web
    * Token (JWT) using the system-managed private key for a ServiceAccount.
    */
  def signJwt(request: AccesstokenAltCallback): Request[SignJwtResponse] = js.native
  def signJwt(request: Fields, body: SignJwtRequest): Request[SignJwtResponse] = js.native
  
  /** Tests whether the caller has the specified permissions on a ServiceAccount. */
  def testIamPermissions(request: UploadTypeUploadprotocol, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  /**
    * Restores a deleted ServiceAccount. **Important:** It is not always possible to restore a deleted service account. Use this method only as a last resort. After you delete a service
    * account, IAM permanently removes the service account 30 days later. There is no way to restore a deleted service account that has been permanently removed.
    */
  def undelete(request: AltCallbackFields): Request[UndeleteServiceAccountResponse] = js.native
  def undelete(request: Fields, body: UndeleteServiceAccountRequest): Request[UndeleteServiceAccountResponse] = js.native
  
  /** **Note:** We are in the process of deprecating this method. Use PatchServiceAccount instead. Updates a ServiceAccount. You can update only the `display_name` field. */
  def update(request: CallbackFieldsKey): Request[ServiceAccount] = js.native
  def update(request: Fields, body: ServiceAccount): Request[ServiceAccount] = js.native
}
