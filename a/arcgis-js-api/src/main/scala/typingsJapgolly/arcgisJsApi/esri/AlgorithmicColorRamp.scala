package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`cie-lab`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`lab-lch`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.algorithmic
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmicColorRamp
  extends StObject
     with ColorRamp {
  
  /**
    * The algorithm used to generate the colors between the `fromColor` and `toColor`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html#algorithm)
    */
  var algorithm: `cie-lab` | `lab-lch` | hsv = js.native
  
  /**
    * The first color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html#fromColor)
    */
  var fromColor: Color_ = js.native
  
  /**
    * The last color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html#toColor)
    */
  var toColor: Color_ = js.native
  
  /**
    * A string value representing the color ramp type.
    *
    * @default algorithmic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html#type)
    */
  @JSName("type")
  val type_AlgorithmicColorRamp: algorithmic = js.native
}
