package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.cloudy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudyWeather
  extends StObject
     with Accessor {
  
  /**
    * Specifies the amount of cloud cover in the sky for a certain weather type.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-CloudyWeather.html#cloudCover)
    */
  var cloudCover: Double = js.native
  
  /**
    * The type of weather
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-CloudyWeather.html#type)
    */
  val `type`: cloudy = js.native
}
