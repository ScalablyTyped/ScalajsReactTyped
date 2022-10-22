package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'center' | 'top' | 'top-right' | 'right' | 'bottom-right' | 'bottom' | 'bottom-left' | 'left' | 'top-left', string> */
trait Recordcentertoptoprightri extends StObject {
  
  var bottom: String
  
  var `bottom-left`: String
  
  var `bottom-right`: String
  
  var center: String
  
  var left: String
  
  var right: String
  
  var top: String
  
  var `top-left`: String
  
  var `top-right`: String
}
object Recordcentertoptoprightri {
  
  inline def apply(
    bottom: String,
    `bottom-left`: String,
    `bottom-right`: String,
    center: String,
    left: String,
    right: String,
    top: String,
    `top-left`: String,
    `top-right`: String
  ): Recordcentertoptoprightri = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-left")(`bottom-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-right")(`bottom-right`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-left")(`top-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-right")(`top-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordcentertoptoprightri]
  }
  
  extension [Self <: Recordcentertoptoprightri](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def `setBottom-left`(value: String): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
    
    inline def `setBottom-right`(value: String): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: String): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def `setTop-left`(value: String): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
    
    inline def `setTop-right`(value: String): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
  }
}
