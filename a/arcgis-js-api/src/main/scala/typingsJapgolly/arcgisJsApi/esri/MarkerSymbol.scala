package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerSymbol
  extends StObject
     with Symbol {
  
  /**
    * The angle of the marker relative to the screen in degrees.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#angle)
    */
  var angle: Double = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#type)
    */
  @JSName("type")
  var type_MarkerSymbol: `simple-marker` | `picture-marker` = js.native
  
  /**
    * The offset on the x-axis in points.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#xoffset)
    */
  var xoffset: Double = js.native
  
  /**
    * The offset on the y-axis in points.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#yoffset)
    */
  var yoffset: Double = js.native
}
