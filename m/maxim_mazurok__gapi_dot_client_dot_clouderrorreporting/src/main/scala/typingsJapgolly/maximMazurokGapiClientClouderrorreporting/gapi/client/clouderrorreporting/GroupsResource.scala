package typingsJapgolly.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientClouderrorreporting.anon.Fields
import typingsJapgolly.maximMazurokGapiClientClouderrorreporting.anon.Key
import typingsJapgolly.maximMazurokGapiClientClouderrorreporting.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends StObject {
  
  /** Get the specified group. */
  def get(): Request[ErrorGroup] = js.native
  def get(request: Fields): Request[ErrorGroup] = js.native
  
  /** Replace the data for the specified group. Fails if the group does not exist. */
  def update(request: Key): Request[ErrorGroup] = js.native
  def update(request: Name, body: ErrorGroup): Request[ErrorGroup] = js.native
}
