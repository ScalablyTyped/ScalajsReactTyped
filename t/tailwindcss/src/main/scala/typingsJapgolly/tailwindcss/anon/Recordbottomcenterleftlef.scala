package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'bottom' | 'center' | 'left' | 'left-bottom' | 'left-top' | 'right' | 'right-bottom' | 'right-top' | 'top', string> */
trait Recordbottomcenterleftlef extends StObject {
  
  var bottom: String
  
  var center: String
  
  var left: String
  
  var `left-bottom`: String
  
  var `left-top`: String
  
  var right: String
  
  var `right-bottom`: String
  
  var `right-top`: String
  
  var top: String
}
object Recordbottomcenterleftlef {
  
  inline def apply(
    bottom: String,
    center: String,
    left: String,
    `left-bottom`: String,
    `left-top`: String,
    right: String,
    `right-bottom`: String,
    `right-top`: String,
    top: String
  ): Recordbottomcenterleftlef = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("left-bottom")(`left-bottom`.asInstanceOf[js.Any])
    __obj.updateDynamic("left-top")(`left-top`.asInstanceOf[js.Any])
    __obj.updateDynamic("right-bottom")(`right-bottom`.asInstanceOf[js.Any])
    __obj.updateDynamic("right-top")(`right-top`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordbottomcenterleftlef]
  }
  
  extension [Self <: Recordbottomcenterleftlef](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: String): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def `setLeft-bottom`(value: String): Self = StObject.set(x, "left-bottom", value.asInstanceOf[js.Any])
    
    inline def `setLeft-top`(value: String): Self = StObject.set(x, "left-top", value.asInstanceOf[js.Any])
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def `setRight-bottom`(value: String): Self = StObject.set(x, "right-bottom", value.asInstanceOf[js.Any])
    
    inline def `setRight-top`(value: String): Self = StObject.set(x, "right-top", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
