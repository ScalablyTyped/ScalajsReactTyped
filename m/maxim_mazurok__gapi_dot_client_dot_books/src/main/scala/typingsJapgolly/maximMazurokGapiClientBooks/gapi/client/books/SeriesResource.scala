package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Seriesid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesResource extends StObject {
  
  /** Returns Series metadata for the given series ids. */
  def get(): Request[Series] = js.native
  def get(request: Seriesid): Request[Series] = js.native
  
  var membership: MembershipResource = js.native
}
