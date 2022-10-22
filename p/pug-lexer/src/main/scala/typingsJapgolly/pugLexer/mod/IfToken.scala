package typingsJapgolly.pugLexer.mod

import typingsJapgolly.pugLexer.pugLexerStrings.`if`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfToken
  extends StObject
     with LexToken[`if`]
     with _Token {
  
  var `val`: String
}
object IfToken {
  
  inline def apply(loc: Loc, `val`: String): IfToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("if")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfToken]
  }
  
  extension [Self <: IfToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
