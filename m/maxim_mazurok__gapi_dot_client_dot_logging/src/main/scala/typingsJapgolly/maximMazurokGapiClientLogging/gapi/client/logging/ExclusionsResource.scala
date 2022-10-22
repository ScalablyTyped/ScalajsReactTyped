package typingsJapgolly.maximMazurokGapiClientLogging.gapi.client.logging

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Alt
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Callback
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Fields
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Key
import typingsJapgolly.maximMazurokGapiClientLogging.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExclusionsResource extends StObject {
  
  /**
    * Creates a new exclusion in the _Default sink in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions in a
    * resource.
    */
  def create(request: Accesstoken): Request[LogExclusion] = js.native
  def create(request: Alt, body: LogExclusion): Request[LogExclusion] = js.native
  
  /** Deletes an exclusion in the _Default sink. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets the description of an exclusion in the _Default sink. */
  def get(): Request[LogExclusion] = js.native
  def get(request: Callback): Request[LogExclusion] = js.native
  
  /** Lists all the exclusions on the _Default sink in a parent resource. */
  def list(): Request[ListExclusionsResponse] = js.native
  def list(request: Fields): Request[ListExclusionsResponse] = js.native
  
  /** Changes one or more properties of an existing exclusion in the _Default sink. */
  def patch(request: Key): Request[LogExclusion] = js.native
  def patch(request: Name, body: LogExclusion): Request[LogExclusion] = js.native
}
