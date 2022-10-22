package typingsJapgolly.marked.mod.marked.Tokens

import typingsJapgolly.marked.markedStrings.heading
import typingsJapgolly.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heading
  extends StObject
     with Token {
  
  var depth: Double
  
  var raw: String
  
  var text: String
  
  var tokens: js.Array[Token]
  
  var `type`: heading
}
object Heading {
  
  inline def apply(depth: Double, raw: String, text: String, tokens: js.Array[Token]): Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading")
    __obj.asInstanceOf[Heading]
  }
  
  extension [Self <: Heading](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: heading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
