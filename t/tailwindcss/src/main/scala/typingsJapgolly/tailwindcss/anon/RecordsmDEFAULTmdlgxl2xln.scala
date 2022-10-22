package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'sm' | 'DEFAULT' | 'md' | 'lg' | 'xl' | '2xl' | 'none', string | std.Array<string>> */
trait RecordsmDEFAULTmdlgxl2xln extends StObject {
  
  var `2xl`: String | js.Array[String]
  
  var DEFAULT: String | js.Array[String]
  
  var lg: String | js.Array[String]
  
  var md: String | js.Array[String]
  
  var none: String | js.Array[String]
  
  var sm: String | js.Array[String]
  
  var xl: String | js.Array[String]
}
object RecordsmDEFAULTmdlgxl2xln {
  
  inline def apply(
    `2xl`: String | js.Array[String],
    DEFAULT: String | js.Array[String],
    lg: String | js.Array[String],
    md: String | js.Array[String],
    none: String | js.Array[String],
    sm: String | js.Array[String],
    xl: String | js.Array[String]
  ): RecordsmDEFAULTmdlgxl2xln = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any])
    __obj.updateDynamic("2xl")(`2xl`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordsmDEFAULTmdlgxl2xln]
  }
  
  extension [Self <: RecordsmDEFAULTmdlgxl2xln](x: Self) {
    
    inline def set2xl(value: String | js.Array[String]): Self = StObject.set(x, "2xl", value.asInstanceOf[js.Any])
    
    inline def set2xlVarargs(value: String*): Self = StObject.set(x, "2xl", js.Array(value*))
    
    inline def setDEFAULT(value: String | js.Array[String]): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setDEFAULTVarargs(value: String*): Self = StObject.set(x, "DEFAULT", js.Array(value*))
    
    inline def setLg(value: String | js.Array[String]): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setLgVarargs(value: String*): Self = StObject.set(x, "lg", js.Array(value*))
    
    inline def setMd(value: String | js.Array[String]): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setMdVarargs(value: String*): Self = StObject.set(x, "md", js.Array(value*))
    
    inline def setNone(value: String | js.Array[String]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneVarargs(value: String*): Self = StObject.set(x, "none", js.Array(value*))
    
    inline def setSm(value: String | js.Array[String]): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setSmVarargs(value: String*): Self = StObject.set(x, "sm", js.Array(value*))
    
    inline def setXl(value: String | js.Array[String]): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
    
    inline def setXlVarargs(value: String*): Self = StObject.set(x, "xl", js.Array(value*))
  }
}
