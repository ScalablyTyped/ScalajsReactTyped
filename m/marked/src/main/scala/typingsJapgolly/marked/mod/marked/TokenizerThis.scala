package typingsJapgolly.marked.mod.marked

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizerThis extends StObject {
  
  var lexer: Lexer_
}
object TokenizerThis {
  
  inline def apply(lexer: Lexer_): TokenizerThis = {
    val __obj = js.Dynamic.literal(lexer = lexer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizerThis]
  }
  
  extension [Self <: TokenizerThis](x: Self) {
    
    inline def setLexer(value: Lexer_): Self = StObject.set(x, "lexer", value.asInstanceOf[js.Any])
  }
}
