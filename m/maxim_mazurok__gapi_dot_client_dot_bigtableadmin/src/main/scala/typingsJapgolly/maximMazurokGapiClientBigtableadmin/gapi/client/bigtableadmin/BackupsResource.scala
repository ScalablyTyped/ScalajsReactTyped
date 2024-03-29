package typingsJapgolly.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.BackupId
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.Filter
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupsResource extends StObject {
  
  /**
    * Starts creating a new Cloud Bigtable Backup. The returned backup long-running operation can be used to track creation of the backup. The metadata field type is CreateBackupMetadata.
    * The response field type is Backup, if successful. Cancelling the returned operation will stop the creation and delete the backup.
    */
  def create(request: BackupId): Request[Operation] = js.native
  def create(request: Oauthtoken, body: Backup): Request[Operation] = js.native
  
  /** Deletes a pending or completed Cloud Bigtable backup. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets metadata on a pending or completed Cloud Bigtable Backup. */
  def get(): Request[Backup] = js.native
  def get(request: Alt): Request[Backup] = js.native
  
  /** Gets the access control policy for a Table resource. Returns an empty policy if the resource exists but does not have a policy set. */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists Cloud Bigtable backups. Returns both completed and pending backups. */
  def list(): Request[ListBackupsResponse] = js.native
  def list(request: Filter): Request[ListBackupsResponse] = js.native
  
  /** Updates a pending or completed Cloud Bigtable Backup. */
  def patch(request: QuotaUser): Request[Backup] = js.native
  def patch(request: UpdateMask, body: Backup): Request[Backup] = js.native
  
  /** Sets the access control policy on a Table resource. Replaces any existing policy. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that the caller has on the specified table resource. */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
