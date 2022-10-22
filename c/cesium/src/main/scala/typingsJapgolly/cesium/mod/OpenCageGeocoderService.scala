package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.anon.Abbrv
import typingsJapgolly.cesium.mod.GeocoderService.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "OpenCageGeocoderService")
@js.native
open class OpenCageGeocoderService protected () extends StObject {
  def this(url: String, apiKey: String) = this()
  def this(url: Resource, apiKey: String) = this()
  def this(url: String, apiKey: String, params: Abbrv) = this()
  def this(url: Resource, apiKey: String, params: Abbrv) = this()
  
  /**
    * @param query - The query to be sent to the geocoder service
    */
  def geocode(query: String): js.Promise[js.Array[Result]] = js.native
  
  /**
    * Optional params passed to OpenCage in order to customize geocoding
    */
  val params: Any = js.native
  
  /**
    * The Resource used to access the OpenCage endpoint.
    */
  val url: Resource = js.native
}
