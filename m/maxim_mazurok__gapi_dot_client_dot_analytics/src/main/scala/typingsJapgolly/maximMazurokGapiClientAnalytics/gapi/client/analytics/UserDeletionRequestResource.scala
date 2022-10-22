package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AltFieldsKeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDeletionRequestResource extends StObject {
  
  /** Insert or update a user deletion requests. */
  def upsert(request: AltFieldsKeyOauthtoken): Request[UserDeletionRequest] = js.native
  def upsert(request: UserIp, body: UserDeletionRequest): Request[UserDeletionRequest] = js.native
}
