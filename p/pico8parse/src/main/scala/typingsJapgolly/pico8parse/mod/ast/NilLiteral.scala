package typingsJapgolly.pico8parse.mod.ast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NilLiteral
  extends StObject
     with Base[typingsJapgolly.pico8parse.pico8parseStrings.NilLiteral]
     with Literal_ {
  
  var raw: String
  
  var value: Null
}
object NilLiteral {
  
  inline def apply(raw: String, value: Null): NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NilLiteral")
    __obj.asInstanceOf[NilLiteral]
  }
  
  extension [Self <: NilLiteral](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
