package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalOperationsResource extends StObject {
  
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(): Request[OperationAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[OperationAggregatedList] = js.native
  
  /** Deletes the specified Operations resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.Operation): Request[Unit] = js.native
  
  /** Retrieves the specified Operations resource. Gets a list of operations by making a `list()` request. */
  def get(): Request[Operation] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.Operation): Request[Operation] = js.native
  
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(): Request[OperationList] = js.native
  def list(request: MaxResults): Request[OperationList] = js.native
  
  def wait(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.Operation): Request[Operation] = js.native
}
