package typingsJapgolly.maximMazurokGapiClientLogging.gapi.client.logging

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Callback
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Fields
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Name
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Parent
import typingsJapgolly.maximMazurokGapiClientLogging.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientLogging.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewsResource extends StObject {
  
  /** Creates a view over log entries in a log bucket. A bucket may contain a maximum of 30 views. */
  def create(request: Parent): Request[LogView] = js.native
  def create(request: PrettyPrint, body: LogView): Request[LogView] = js.native
  
  /**
    * Deletes a view on a log bucket. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can delete the view. If this occurs, please try again in a
    * few minutes.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a view on a log bucket.. */
  def get(): Request[LogView] = js.native
  def get(request: Callback): Request[LogView] = js.native
  
  /** Lists views on a log bucket. */
  def list(): Request[ListViewsResponse] = js.native
  def list(request: Fields): Request[ListViewsResponse] = js.native
  
  var logs: LogsResource = js.native
  
  def patch(request: Name, body: LogView): Request[LogView] = js.native
  /**
    * Updates a view on a log bucket. This method replaces the following fields in the existing view with values from the new view: filter. If an UNAVAILABLE error is returned, this
    * indicates that system is not in a state where it can update the view. If this occurs, please try again in a few minutes.
    */
  def patch(request: QuotaUser): Request[LogView] = js.native
}
