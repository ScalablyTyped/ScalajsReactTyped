package typingsJapgolly.pugLexer.mod

import typingsJapgolly.pugLexer.pugLexerStrings.call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallToken
  extends StObject
     with LexToken[call]
     with _Token {
  
  var args: String
  
  var `val`: String
}
object CallToken {
  
  inline def apply(args: String, loc: Loc, `val`: String): CallToken = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("call")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallToken]
  }
  
  extension [Self <: CallToken](x: Self) {
    
    inline def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
