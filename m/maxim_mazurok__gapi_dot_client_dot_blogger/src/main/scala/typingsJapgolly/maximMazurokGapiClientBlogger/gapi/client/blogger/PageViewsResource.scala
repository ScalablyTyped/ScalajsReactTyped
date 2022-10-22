package typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageViewsResource extends StObject {
  
  /** Gets page views by blog id. */
  def get(): Request[Pageviews] = js.native
  def get(request: QuotaUser): Request[Pageviews] = js.native
}
