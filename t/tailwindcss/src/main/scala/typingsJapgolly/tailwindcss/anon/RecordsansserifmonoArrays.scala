package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'sans' | 'serif' | 'mono', std.Array<string>> */
trait RecordsansserifmonoArrays extends StObject {
  
  var mono: js.Array[String]
  
  var sans: js.Array[String]
  
  var serif: js.Array[String]
}
object RecordsansserifmonoArrays {
  
  inline def apply(mono: js.Array[String], sans: js.Array[String], serif: js.Array[String]): RecordsansserifmonoArrays = {
    val __obj = js.Dynamic.literal(mono = mono.asInstanceOf[js.Any], sans = sans.asInstanceOf[js.Any], serif = serif.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordsansserifmonoArrays]
  }
  
  extension [Self <: RecordsansserifmonoArrays](x: Self) {
    
    inline def setMono(value: js.Array[String]): Self = StObject.set(x, "mono", value.asInstanceOf[js.Any])
    
    inline def setMonoVarargs(value: String*): Self = StObject.set(x, "mono", js.Array(value*))
    
    inline def setSans(value: js.Array[String]): Self = StObject.set(x, "sans", value.asInstanceOf[js.Any])
    
    inline def setSansVarargs(value: String*): Self = StObject.set(x, "sans", js.Array(value*))
    
    inline def setSerif(value: js.Array[String]): Self = StObject.set(x, "serif", value.asInstanceOf[js.Any])
    
    inline def setSerifVarargs(value: String*): Self = StObject.set(x, "serif", js.Array(value*))
  }
}
