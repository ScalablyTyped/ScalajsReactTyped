package typingsJapgolly.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.Callback
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  /** Get the OS policy asssignment report for the specified Compute Engine VM instance. */
  def get(): Request[OSPolicyAssignmentReport] = js.native
  def get(request: Callback): Request[OSPolicyAssignmentReport] = js.native
  
  /** List OS policy asssignment reports for all Compute Engine VM instances in the specified zone. */
  def list(): Request[ListOSPolicyAssignmentReportsResponse] = js.native
  def list(request: Fields): Request[ListOSPolicyAssignmentReportsResponse] = js.native
}
