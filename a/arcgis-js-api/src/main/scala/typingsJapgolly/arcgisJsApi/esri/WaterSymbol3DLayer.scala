package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.calm
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.large
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.medium
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.moderate
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rippled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.slight
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.small
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.water
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterSymbol3DLayer
  extends StObject
     with Symbol3DLayer
     with typingsJapgolly.arcgisJsApi.esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  
  /**
    * The dominant color used to shade the water.
    *
    * @default #0077BE
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#color)
    */
  var color: Color_ = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_WaterSymbol3DLayer: water = js.native
  
  /**
    * Indicates the size of the waterbody which is represented by the symbol layer.
    *
    * @default medium
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waterbodySize)
    */
  var waterbodySize: small | medium | large = js.native
  
  /**
    * Indicates the direction in which the waves travel.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveDirection)
    */
  var waveDirection: Double = js.native
  
  /**
    * Indicates the shape and intensity of the waves.
    *
    * @default moderate
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveStrength)
    */
  var waveStrength: calm | rippled | slight | moderate = js.native
}
