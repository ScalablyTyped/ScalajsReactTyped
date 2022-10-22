package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoTypesResource extends StObject {
  
  /** Returns a list of the sensitive information types that DLP API supports. See https://cloud.google.com/dlp/docs/infotypes-reference to learn more. */
  def list(): Request[GooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(request: Accesstoken): Request[GooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(request: Alt): Request[GooglePrivacyDlpV2ListInfoTypesResponse] = js.native
}
