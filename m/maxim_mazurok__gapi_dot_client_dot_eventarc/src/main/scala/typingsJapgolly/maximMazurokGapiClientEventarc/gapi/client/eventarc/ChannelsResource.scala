package typingsJapgolly.maximMazurokGapiClientEventarc.gapi.client.eventarc

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientEventarc.anon.Callback
import typingsJapgolly.maximMazurokGapiClientEventarc.anon.ChannelId
import typingsJapgolly.maximMazurokGapiClientEventarc.anon.Fields
import typingsJapgolly.maximMazurokGapiClientEventarc.anon.Name
import typingsJapgolly.maximMazurokGapiClientEventarc.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientEventarc.anon.OrderBy
import typingsJapgolly.maximMazurokGapiClientEventarc.anon.Parent
import typingsJapgolly.maximMazurokGapiClientEventarc.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientEventarc.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends StObject {
  
  /** Create a new channel in a particular project and location. */
  def create(request: ChannelId): Request[GoogleLongrunningOperation] = js.native
  def create(request: Parent, body: Channel): Request[GoogleLongrunningOperation] = js.native
  
  /** Delete a single channel. */
  def delete(): Request[GoogleLongrunningOperation] = js.native
  def delete(request: Name): Request[GoogleLongrunningOperation] = js.native
  
  /** Get a single Channel. */
  def get(): Request[Channel] = js.native
  def get(request: Callback): Request[Channel] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** List channels. */
  def list(): Request[ListChannelsResponse] = js.native
  def list(request: OrderBy): Request[ListChannelsResponse] = js.native
  
  /** Update a single channel. */
  def patch(request: PrettyPrint): Request[GoogleLongrunningOperation] = js.native
  def patch(request: QuotaUser, body: Channel): Request[GoogleLongrunningOperation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
