package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.RegionCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoCategoriesResource extends StObject {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[VideoCategoryListResponse] = js.native
  def list(request: RegionCode): Request[VideoCategoryListResponse] = js.native
}
