package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'DEFAULT' | 'linear' | 'in' | 'out' | 'in-out', string> */
trait RecordDEFAULTlinearinouti extends StObject {
  
  var DEFAULT: String
  
  var in: String
  
  var `in-out`: String
  
  var linear: String
  
  var out: String
}
object RecordDEFAULTlinearinouti {
  
  inline def apply(DEFAULT: String, in: String, `in-out`: String, linear: String, out: String): RecordDEFAULTlinearinouti = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.updateDynamic("in-out")(`in-out`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDEFAULTlinearinouti]
  }
  
  extension [Self <: RecordDEFAULTlinearinouti](x: Self) {
    
    inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def `setIn-out`(value: String): Self = StObject.set(x, "in-out", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: String): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
  }
}
