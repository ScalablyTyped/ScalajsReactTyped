package typingsJapgolly.hafasClient.mod

import typingsJapgolly.hafasClient.hafasClientStrings.aircraft
import typingsJapgolly.hafasClient.hafasClientStrings.bicycle
import typingsJapgolly.hafasClient.hafasClientStrings.bus
import typingsJapgolly.hafasClient.hafasClientStrings.car
import typingsJapgolly.hafasClient.hafasClientStrings.gondola
import typingsJapgolly.hafasClient.hafasClientStrings.taxi
import typingsJapgolly.hafasClient.hafasClientStrings.train
import typingsJapgolly.hafasClient.hafasClientStrings.walking
import typingsJapgolly.hafasClient.hafasClientStrings.watercraft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ProductType relates to how a means of transport "works" in local context.
  * Example: Even though S-Bahn and U-Bahn in Berlin are both trains, they have different operators, service patterns,
  * stations and look different. Therefore, they are two distinct products subway and suburban.
  */
trait ProductType extends StObject {
  
  var default: Boolean
  
  var bitmasks: js.Array[Double]
  
  var id: String
  
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking
  
  var name: String
  
  var short: String
}
object ProductType {
  
  inline def apply(
    bitmasks: js.Array[Double],
    default: Boolean,
    id: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    name: String,
    short: String
  ): ProductType = {
    val __obj = js.Dynamic.literal(bitmasks = bitmasks.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductType]
  }
  
  extension [Self <: ProductType](x: Self) {
    
    inline def setBitmasks(value: js.Array[Double]): Self = StObject.set(x, "bitmasks", value.asInstanceOf[js.Any])
    
    inline def setBitmasksVarargs(value: Double*): Self = StObject.set(x, "bitmasks", js.Array(value*))
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
