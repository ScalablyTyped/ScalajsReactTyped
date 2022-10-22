package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Name
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Parent
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.UpdateMask
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantsResource extends StObject {
  
  /** Grant access for a user to the given package. */
  def create(request: Parent): Request[Grant] = js.native
  def create(request: Xgafv, body: Grant): Request[Grant] = js.native
  
  /** Removes all access for the user to the given package or developer account. */
  def delete(): Request[Unit] = js.native
  def delete(request: Name): Request[Unit] = js.native
  
  def patch(request: AccesstokenAlt, body: Grant): Request[Grant] = js.native
  /** Updates access for the user to the given package. */
  def patch(request: UpdateMask): Request[Grant] = js.native
}
