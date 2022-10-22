package typingsJapgolly.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRAIDPosition extends StObject {
  
  var x: Double
  
  var y: Double
}
object MRAIDPosition {
  
  inline def apply(x: Double, y: Double): MRAIDPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRAIDPosition]
  }
  
  extension [Self <: MRAIDPosition](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
