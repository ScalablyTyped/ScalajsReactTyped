package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Envelope
  extends StObject
     with Object {
  
  /**
    * The maximum X value in the area of the envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#Envelope)
    */
  var xmax: Double
  
  /**
    * The minimum X value in the area of the envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#Envelope)
    */
  var xmin: Double
  
  /**
    * The maximum Y value in the area of the envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#Envelope)
    */
  var ymax: Double
  
  /**
    * The minimum Y value in the area of the envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#Envelope)
    */
  var ymin: Double
}
object Envelope {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    xmax: Double,
    xmin: Double,
    ymax: Double,
    ymin: Double
  ): Envelope = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
  
  extension [Self <: Envelope](x: Self) {
    
    inline def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
    
    inline def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
    
    inline def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
    
    inline def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
  }
}
