package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.anon.AccessToken
import typingsJapgolly.cesium.mod.GeocoderService.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "IonGeocoderService")
@js.native
open class IonGeocoderService protected () extends StObject {
  def this(options: AccessToken) = this()
  
  /**
    * @param query - The query to be sent to the geocoder service
    * @param [type = GeocodeType.SEARCH] - The type of geocode to perform.
    */
  def geocode(query: String): js.Promise[js.Array[Result]] = js.native
  def geocode(query: String, `type`: GeocodeType): js.Promise[js.Array[Result]] = js.native
}
