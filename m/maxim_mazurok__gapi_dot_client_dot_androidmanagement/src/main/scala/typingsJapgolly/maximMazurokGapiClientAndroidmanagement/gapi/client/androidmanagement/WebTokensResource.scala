package typingsJapgolly.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidmanagement.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientAndroidmanagement.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTokensResource extends StObject {
  
  def create(request: QuotaUser, body: WebToken): Request[WebToken] = js.native
  /** Creates a web token to access an embeddable managed Google Play web UI for a given enterprise. */
  def create(request: Uploadprotocol): Request[WebToken] = js.native
}
