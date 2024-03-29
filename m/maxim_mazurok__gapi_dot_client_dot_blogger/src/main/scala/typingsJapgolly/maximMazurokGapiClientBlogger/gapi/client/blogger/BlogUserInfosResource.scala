package typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.BlogId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlogUserInfosResource extends StObject {
  
  /** Gets one blog and user info pair by blog id and user id. */
  def get(): Request[BlogUserInfo] = js.native
  def get(request: BlogId): Request[BlogUserInfo] = js.native
}
