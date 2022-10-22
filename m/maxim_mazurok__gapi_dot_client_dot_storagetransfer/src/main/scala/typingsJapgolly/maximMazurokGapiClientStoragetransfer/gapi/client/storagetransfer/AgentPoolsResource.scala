package typingsJapgolly.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientStoragetransfer.anon.AgentPoolId
import typingsJapgolly.maximMazurokGapiClientStoragetransfer.anon.Alt
import typingsJapgolly.maximMazurokGapiClientStoragetransfer.anon.Callback
import typingsJapgolly.maximMazurokGapiClientStoragetransfer.anon.Fields
import typingsJapgolly.maximMazurokGapiClientStoragetransfer.anon.Key
import typingsJapgolly.maximMazurokGapiClientStoragetransfer.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentPoolsResource extends StObject {
  
  /** Creates an agent pool resource. */
  def create(request: AgentPoolId): Request[AgentPool] = js.native
  def create(request: Alt, body: AgentPool): Request[AgentPool] = js.native
  
  /** Deletes an agent pool. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an agent pool. */
  def get(): Request[AgentPool] = js.native
  def get(request: Callback): Request[AgentPool] = js.native
  
  /** Lists agent pools. */
  def list(): Request[ListAgentPoolsResponse] = js.native
  def list(request: Fields): Request[ListAgentPoolsResponse] = js.native
  
  /** Updates an existing agent pool resource. */
  def patch(request: Key): Request[AgentPool] = js.native
  def patch(request: Name, body: AgentPool): Request[AgentPool] = js.native
}
