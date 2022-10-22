package typingsJapgolly.maximMazurokGapiClientTpu.gapi.client.tpu

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTpu.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientTpu.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTpu.anon.Fields
import typingsJapgolly.maximMazurokGapiClientTpu.anon.Key
import typingsJapgolly.maximMazurokGapiClientTpu.anon.Name
import typingsJapgolly.maximMazurokGapiClientTpu.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientTpu.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesResource extends StObject {
  
  /** Creates a node. */
  def create(request: Callback): Request[Operation] = js.native
  def create(request: Fields, body: Node): Request[Operation] = js.native
  
  /** Deletes a node. */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  /** Gets the details of a node. */
  def get(): Request[Node] = js.native
  def get(request: Accesstoken): Request[Node] = js.native
  
  /** Lists nodes. */
  def list(): Request[ListNodesResponse] = js.native
  def list(request: Key): Request[ListNodesResponse] = js.native
  
  def reimage(request: Accesstoken, body: ReimageNodeRequest): Request[Operation] = js.native
  /** Reimages a node's OS. */
  def reimage(request: Name): Request[Operation] = js.native
  
  def start(request: Accesstoken, body: StartNodeRequest): Request[Operation] = js.native
  /** Starts a node. */
  def start(request: Oauthtoken): Request[Operation] = js.native
  
  def stop(request: Accesstoken, body: StopNodeRequest): Request[Operation] = js.native
  /** Stops a node, this operation is only available with single TPU nodes. */
  def stop(request: PrettyPrint): Request[Operation] = js.native
}
