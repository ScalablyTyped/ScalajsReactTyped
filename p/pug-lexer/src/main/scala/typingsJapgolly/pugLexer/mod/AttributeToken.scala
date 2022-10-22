package typingsJapgolly.pugLexer.mod

import typingsJapgolly.pugLexer.pugLexerStrings.attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeToken
  extends StObject
     with LexToken[attribute]
     with _Token {
  
  var mustEscape: Boolean
  
  var name: String
  
  var `val`: String | Boolean
}
object AttributeToken {
  
  inline def apply(loc: Loc, mustEscape: Boolean, name: String, `val`: String | Boolean): AttributeToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], mustEscape = mustEscape.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeToken]
  }
  
  extension [Self <: AttributeToken](x: Self) {
    
    inline def setMustEscape(value: Boolean): Self = StObject.set(x, "mustEscape", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVal(value: String | Boolean): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
