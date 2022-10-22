package typingsJapgolly.pugLexer.mod

import typingsJapgolly.pugLexer.pugLexerStrings.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagToken
  extends StObject
     with LexToken[tag]
     with _Token {
  
  var `val`: String
}
object TagToken {
  
  inline def apply(loc: Loc, `val`: String): TagToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tag")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagToken]
  }
  
  extension [Self <: TagToken](x: Self) {
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
