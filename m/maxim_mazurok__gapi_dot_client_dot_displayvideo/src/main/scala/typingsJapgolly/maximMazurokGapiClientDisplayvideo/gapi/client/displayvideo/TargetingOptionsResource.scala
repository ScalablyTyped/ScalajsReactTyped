package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.QuotaUserTargetingType
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.ResourceTargetingType
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.TargetingOptionId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.TargetingTypeUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingOptionsResource extends StObject {
  
  /** Gets a single targeting option. */
  def get(): Request[TargetingOption] = js.native
  def get(request: TargetingOptionId): Request[TargetingOption] = js.native
  
  /** Lists targeting options of a given type. */
  def list(): Request[ListTargetingOptionsResponse] = js.native
  def list(request: QuotaUserTargetingType): Request[ListTargetingOptionsResponse] = js.native
  
  /** Searches for targeting options of a given type based on the given search terms. */
  def search(request: ResourceTargetingType): Request[SearchTargetingOptionsResponse] = js.native
  def search(request: TargetingTypeUploadType, body: SearchTargetingOptionsRequest): Request[SearchTargetingOptionsResponse] = js.native
}
