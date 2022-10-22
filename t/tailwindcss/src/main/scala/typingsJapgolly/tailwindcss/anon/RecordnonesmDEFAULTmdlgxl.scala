package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'none' | 'sm' | 'DEFAULT' | 'md' | 'lg' | 'xl' | '2xl' | '3xl' | 'full', string> */
trait RecordnonesmDEFAULTmdlgxl extends StObject {
  
  var `2xl`: String
  
  var `3xl`: String
  
  var DEFAULT: String
  
  var full: String
  
  var lg: String
  
  var md: String
  
  var none: String
  
  var sm: String
  
  var xl: String
}
object RecordnonesmDEFAULTmdlgxl {
  
  inline def apply(
    `2xl`: String,
    `3xl`: String,
    DEFAULT: String,
    full: String,
    lg: String,
    md: String,
    none: String,
    sm: String,
    xl: String
  ): RecordnonesmDEFAULTmdlgxl = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any])
    __obj.updateDynamic("2xl")(`2xl`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xl")(`3xl`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordnonesmDEFAULTmdlgxl]
  }
  
  extension [Self <: RecordnonesmDEFAULTmdlgxl](x: Self) {
    
    inline def set2xl(value: String): Self = StObject.set(x, "2xl", value.asInstanceOf[js.Any])
    
    inline def set3xl(value: String): Self = StObject.set(x, "3xl", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
  }
}
