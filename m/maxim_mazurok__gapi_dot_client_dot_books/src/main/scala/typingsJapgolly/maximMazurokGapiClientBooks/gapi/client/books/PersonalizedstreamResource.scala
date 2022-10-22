package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.MaxAllowedMaturityRating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonalizedstreamResource extends StObject {
  
  /** Returns a stream of personalized book clusters */
  def get(): Request[Discoveryclusters] = js.native
  def get(request: MaxAllowedMaturityRating): Request[Discoveryclusters] = js.native
}
