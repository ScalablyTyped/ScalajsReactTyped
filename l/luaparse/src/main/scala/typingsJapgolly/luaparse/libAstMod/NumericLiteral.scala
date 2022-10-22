package typingsJapgolly.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericLiteral
  extends StObject
     with Base[typingsJapgolly.luaparse.luaparseStrings.NumericLiteral]
     with Expression {
  
  var raw: String
  
  var value: Double
}
object NumericLiteral {
  
  inline def apply(raw: String, value: Double): NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[NumericLiteral]
  }
  
  extension [Self <: NumericLiteral](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
