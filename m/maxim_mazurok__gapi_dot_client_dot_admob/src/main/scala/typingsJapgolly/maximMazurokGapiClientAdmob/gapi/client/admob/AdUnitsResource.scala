package typingsJapgolly.maximMazurokGapiClientAdmob.gapi.client.admob

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdmob.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdUnitsResource extends StObject {
  
  /** List the ad units under the specified AdMob account. */
  def list(): Request[ListAdUnitsResponse] = js.native
  def list(request: Accesstoken): Request[ListAdUnitsResponse] = js.native
}
