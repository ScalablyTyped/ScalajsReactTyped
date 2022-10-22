package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Resource
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientIdResource extends StObject {
  
  /** Hashes the given Client ID. */
  def hashClientId(request: Resource): Request[HashClientIdResponse] = js.native
  def hashClientId(request: UserIp, body: HashClientIdRequest): Request[HashClientIdResponse] = js.native
}
