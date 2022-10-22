package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.arraydraw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Padding extends StObject {
  
  /**
    * The amount of padding (in px) along the bottom of the component.
    */
  var b: Double
  
  var editType: arraydraw
  
  /**
    * The amount of padding (in px) on the left side of the component.
    */
  var l: Double
  
  /**
    * The amount of padding (in px) on the right side of the component.
    */
  var r: Double
  
  /**
    * The amount of padding (in px) along the top of the component.
    */
  var t: Double
}
object Padding {
  
  inline def apply(b: Double, l: Double, r: Double, t: Double): Padding = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], editType = "arraydraw", l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  
  extension [Self <: Padding](x: Self) {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setEditType(value: arraydraw): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
