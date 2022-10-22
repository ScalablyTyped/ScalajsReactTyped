package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'sm' | 'md' | 'lg' | 'xl' | '2xl', string> */
trait Recordsmmdlgxl2xlstring extends StObject {
  
  var `2xl`: String
  
  var lg: String
  
  var md: String
  
  var sm: String
  
  var xl: String
}
object Recordsmmdlgxl2xlstring {
  
  inline def apply(`2xl`: String, lg: String, md: String, sm: String, xl: String): Recordsmmdlgxl2xlstring = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any])
    __obj.updateDynamic("2xl")(`2xl`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordsmmdlgxl2xlstring]
  }
  
  extension [Self <: Recordsmmdlgxl2xlstring](x: Self) {
    
    inline def set2xl(value: String): Self = StObject.set(x, "2xl", value.asInstanceOf[js.Any])
    
    inline def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
  }
}
