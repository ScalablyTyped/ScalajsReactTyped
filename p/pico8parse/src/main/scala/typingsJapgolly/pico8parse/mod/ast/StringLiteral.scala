package typingsJapgolly.pico8parse.mod.ast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringLiteral
  extends StObject
     with Base[typingsJapgolly.pico8parse.pico8parseStrings.StringLiteral]
     with Literal_ {
  
  var raw: String
  
  var rawInterrupted: js.UndefOr[String] = js.undefined
  
  var value: String
}
object StringLiteral {
  
  inline def apply(raw: String, value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[StringLiteral]
  }
  
  extension [Self <: StringLiteral](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawInterrupted(value: String): Self = StObject.set(x, "rawInterrupted", value.asInstanceOf[js.Any])
    
    inline def setRawInterruptedUndefined: Self = StObject.set(x, "rawInterrupted", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
