package typingsJapgolly.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsreporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAnalyticsreporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserActivityResource extends StObject {
  
  def search(request: Alt, body: SearchUserActivityRequest): Request[SearchUserActivityResponse] = js.native
  /** Returns User Activity data. */
  def search(request: Callback): Request[SearchUserActivityResponse] = js.native
}
