package typingsJapgolly.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidmanagement.anon.CallbackUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignupUrlsResource extends StObject {
  
  /** Creates an enterprise signup URL. */
  def create(): Request[SignupUrl] = js.native
  def create(request: CallbackUrl): Request[SignupUrl] = js.native
}
