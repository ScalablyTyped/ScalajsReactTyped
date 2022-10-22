package typingsJapgolly.maximMazurokGapiClientComposer.gapi.client.composer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientComposer.anon.IncludePastReleases
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageVersionsResource extends StObject {
  
  /** List ImageVersions for provided location. */
  def list(): Request[ListImageVersionsResponse] = js.native
  def list(request: IncludePastReleases): Request[ListImageVersionsResponse] = js.native
}
