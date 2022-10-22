package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientContent.anon.PrettyPrintQuotaUserResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  def search(request: AccesstokenAlt, body: SearchRequest): Request[SearchResponse] = js.native
  /** Retrieves merchant performance mertrics matching the search query and optionally segmented by selected dimensions. */
  def search(request: PrettyPrintQuotaUserResourceUploadType): Request[SearchResponse] = js.native
}
