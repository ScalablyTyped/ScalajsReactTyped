package typingsJapgolly.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientProdTtSasportal.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientProdTtSasportal.anon.Alt
import typingsJapgolly.maximMazurokGapiClientProdTtSasportal.anon.Fields
import typingsJapgolly.maximMazurokGapiClientProdTtSasportal.anon.Key
import typingsJapgolly.maximMazurokGapiClientProdTtSasportal.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientProdTtSasportal.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientProdTtSasportal.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesResource extends StObject {
  
  def create(request: Alt, body: SasPortalNode): Request[SasPortalNode] = js.native
  /** Creates a new node. */
  def create(request: Uploadprotocol): Request[SasPortalNode] = js.native
  
  /** Deletes a node. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  var deployments: DeploymentsResource = js.native
  
  var devices: DevicesResource = js.native
  
  /** Returns a requested node. */
  def get(): Request[SasPortalNode] = js.native
  def get(request: Key): Request[SasPortalNode] = js.native
  
  /** Lists nodes. */
  def list(): Request[SasPortalListNodesResponse] = js.native
  def list(request: Fields): Request[SasPortalListNodesResponse] = js.native
  
  def move(request: Key, body: SasPortalMoveNodeRequest): Request[SasPortalOperation] = js.native
  /** Moves a node under another node or customer. */
  def move(request: Xgafv): Request[SasPortalOperation] = js.native
  
  var nodes: NodesResource = js.native
  
  /** Updates an existing node. */
  def patch(request: AccesstokenAlt): Request[SasPortalNode] = js.native
  def patch(request: PrettyPrint, body: SasPortalNode): Request[SasPortalNode] = js.native
}
