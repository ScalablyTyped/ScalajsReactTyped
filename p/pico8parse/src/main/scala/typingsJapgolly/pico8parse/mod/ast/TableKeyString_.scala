package typingsJapgolly.pico8parse.mod.ast

import typingsJapgolly.pico8parse.pico8parseStrings.TableKeyString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableKeyString_
  extends StObject
     with Base[TableKeyString]
     with _Node {
  
  var key: Identifier_
  
  var value: Expression
}
object TableKeyString_ {
  
  inline def apply(key: Identifier_, value: Expression): TableKeyString_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableKeyString")
    __obj.asInstanceOf[TableKeyString_]
  }
  
  extension [Self <: TableKeyString_](x: Self) {
    
    inline def setKey(value: Identifier_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
