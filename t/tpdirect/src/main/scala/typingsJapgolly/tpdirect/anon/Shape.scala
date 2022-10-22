package typingsJapgolly.tpdirect.anon

import typingsJapgolly.tpdirect.tpdirectStrings.black
import typingsJapgolly.tpdirect.tpdirectStrings.buy
import typingsJapgolly.tpdirect.tpdirectStrings.pay
import typingsJapgolly.tpdirect.tpdirectStrings.rectangular
import typingsJapgolly.tpdirect.tpdirectStrings.shape
import typingsJapgolly.tpdirect.tpdirectStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shape extends StObject {
  
  var color: black | white
  
  var shape: typingsJapgolly.tpdirect.tpdirectStrings.shape | rectangular
  
  var `type`: pay | buy
}
object Shape {
  
  inline def apply(color: black | white, shape: shape | rectangular, `type`: pay | buy): Shape = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  
  extension [Self <: Shape](x: Self) {
    
    inline def setColor(value: black | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setShape(value: shape | rectangular): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setType(value: pay | buy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
