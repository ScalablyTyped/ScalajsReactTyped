package typingsJapgolly.maximMazurokGapiClientVectortile.gapi.client.vectortile

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientVectortile.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeaturetilesResource extends StObject {
  
  /** Gets a feature tile by its tile resource name. */
  def get(): Request[FeatureTile] = js.native
  def get(request: Accesstoken): Request[FeatureTile] = js.native
}
