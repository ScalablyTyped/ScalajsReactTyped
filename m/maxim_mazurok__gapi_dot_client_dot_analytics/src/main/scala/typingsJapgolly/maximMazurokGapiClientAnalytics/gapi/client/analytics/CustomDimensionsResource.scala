package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AccountIdAlt
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AltCustomDimensionId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.CustomDimensionId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.IgnoreCustomDataSourceLinks
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Startindex
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.WebPropertyId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDimensionsResource extends StObject {
  
  /** Get a custom dimension to which the user has access. */
  def get(): Request[CustomDimension] = js.native
  def get(request: CustomDimensionId): Request[CustomDimension] = js.native
  
  def insert(request: AccountIdAlt, body: CustomDimension): Request[CustomDimension] = js.native
  /** Create a new custom dimension. */
  def insert(request: WebPropertyId): Request[CustomDimension] = js.native
  
  /** Lists custom dimensions to which the user has access. */
  def list(): Request[CustomDimensions] = js.native
  def list(request: Startindex): Request[CustomDimensions] = js.native
  
  def patch(request: AltCustomDimensionId, body: CustomDimension): Request[CustomDimension] = js.native
  /** Updates an existing custom dimension. This method supports patch semantics. */
  def patch(request: IgnoreCustomDataSourceLinks): Request[CustomDimension] = js.native
  
  def update(request: AltCustomDimensionId, body: CustomDimension): Request[CustomDimension] = js.native
  /** Updates an existing custom dimension. */
  def update(request: IgnoreCustomDataSourceLinks): Request[CustomDimension] = js.native
}
