package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'sm' | 'DEFAULT' | 'md' | 'lg' | 'xl' | '2xl' | 'inner' | 'none', string> */
trait RecordsmDEFAULTmdlgxl2xli extends StObject {
  
  var `2xl`: String
  
  var DEFAULT: String
  
  var inner: String
  
  var lg: String
  
  var md: String
  
  var none: String
  
  var sm: String
  
  var xl: String
}
object RecordsmDEFAULTmdlgxl2xli {
  
  inline def apply(
    `2xl`: String,
    DEFAULT: String,
    inner: String,
    lg: String,
    md: String,
    none: String,
    sm: String,
    xl: String
  ): RecordsmDEFAULTmdlgxl2xli = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any])
    __obj.updateDynamic("2xl")(`2xl`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordsmDEFAULTmdlgxl2xli]
  }
  
  extension [Self <: RecordsmDEFAULTmdlgxl2xli](x: Self) {
    
    inline def set2xl(value: String): Self = StObject.set(x, "2xl", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setInner(value: String): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
  }
}
