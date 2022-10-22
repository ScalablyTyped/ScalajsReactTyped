package typingsJapgolly.webidl2

import typingsJapgolly.webidl2.mod.EnumType
import typingsJapgolly.webidl2.mod.Token
import typingsJapgolly.webidl2.webidl2Strings.`enum-value`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BareMessage extends StObject {
    
    var bareMessage: String
    
    var context: String
    
    var input: String
    
    var line: Double
    
    var message: String
    
    var sourceName: js.UndefOr[String] = js.undefined
    
    var tokens: js.Array[Token]
  }
  object BareMessage {
    
    inline def apply(
      bareMessage: String,
      context: String,
      input: String,
      line: Double,
      message: String,
      tokens: js.Array[Token]
    ): BareMessage = {
      val __obj = js.Dynamic.literal(bareMessage = bareMessage.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[BareMessage]
    }
    
    extension [Self <: BareMessage](x: Self) {
      
      inline def setBareMessage(value: String): Self = StObject.set(x, "bareMessage", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
      
      inline def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait Parent extends StObject {
    
    var parent: EnumType
    
    var `type`: `enum-value`
    
    var value: String
  }
  object Parent {
    
    inline def apply(parent: EnumType, value: String): Parent = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("enum-value")
      __obj.asInstanceOf[Parent]
    }
    
    extension [Self <: Parent](x: Self) {
      
      inline def setParent(value: EnumType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setType(value: `enum-value`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
