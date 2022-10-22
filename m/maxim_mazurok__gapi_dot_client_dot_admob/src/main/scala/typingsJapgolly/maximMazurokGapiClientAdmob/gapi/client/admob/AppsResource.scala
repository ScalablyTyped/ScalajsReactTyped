package typingsJapgolly.maximMazurokGapiClientAdmob.gapi.client.admob

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdmob.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsResource extends StObject {
  
  /** List the apps under the specified AdMob account. */
  def list(): Request[ListAppsResponse] = js.native
  def list(request: Accesstoken): Request[ListAppsResponse] = js.native
}
