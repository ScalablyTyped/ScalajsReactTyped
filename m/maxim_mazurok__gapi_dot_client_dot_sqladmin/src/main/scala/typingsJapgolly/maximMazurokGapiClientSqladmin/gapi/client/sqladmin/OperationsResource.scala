package typingsJapgolly.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /** Retrieves an instance operation that has been performed on an instance. */
  def get(): Request[Operation] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientSqladmin.anon.Operation): Request[Operation] = js.native
  
  /** Lists all instance operations that have been performed on the given Cloud SQL instance in the reverse chronological order of the start time. */
  def list(): Request[OperationsListResponse] = js.native
  def list(request: MaxResults): Request[OperationsListResponse] = js.native
}
