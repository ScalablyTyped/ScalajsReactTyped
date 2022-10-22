package typingsJapgolly.tokeyCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tokeyCore.tokeyCoreStrings.string
    - typingsJapgolly.tokeyCore.tokeyCoreStrings.text
    - typingsJapgolly.tokeyCore.tokeyCoreStrings.`line-comment`
    - typingsJapgolly.tokeyCore.tokeyCoreStrings.`multi-comment`
    - typingsJapgolly.tokeyCore.tokeyCoreStrings.`unclosed-string`
    - typingsJapgolly.tokeyCore.tokeyCoreStrings.`unclosed-comment`
    - typingsJapgolly.tokeyCore.tokeyCoreStrings.space
  */
  trait Descriptors extends StObject
  object Descriptors {
    
    inline def `line-comment`: typingsJapgolly.tokeyCore.tokeyCoreStrings.`line-comment` = "line-comment".asInstanceOf[typingsJapgolly.tokeyCore.tokeyCoreStrings.`line-comment`]
    
    inline def `multi-comment`: typingsJapgolly.tokeyCore.tokeyCoreStrings.`multi-comment` = "multi-comment".asInstanceOf[typingsJapgolly.tokeyCore.tokeyCoreStrings.`multi-comment`]
    
    inline def space: typingsJapgolly.tokeyCore.tokeyCoreStrings.space = "space".asInstanceOf[typingsJapgolly.tokeyCore.tokeyCoreStrings.space]
    
    inline def string: typingsJapgolly.tokeyCore.tokeyCoreStrings.string = "string".asInstanceOf[typingsJapgolly.tokeyCore.tokeyCoreStrings.string]
    
    inline def text: typingsJapgolly.tokeyCore.tokeyCoreStrings.text = "text".asInstanceOf[typingsJapgolly.tokeyCore.tokeyCoreStrings.text]
    
    inline def `unclosed-comment`: typingsJapgolly.tokeyCore.tokeyCoreStrings.`unclosed-comment` = "unclosed-comment".asInstanceOf[typingsJapgolly.tokeyCore.tokeyCoreStrings.`unclosed-comment`]
    
    inline def `unclosed-string`: typingsJapgolly.tokeyCore.tokeyCoreStrings.`unclosed-string` = "unclosed-string".asInstanceOf[typingsJapgolly.tokeyCore.tokeyCoreStrings.`unclosed-string`]
  }
  
  trait Token[Type] extends StObject {
    
    var end: Double
    
    var start: Double
    
    var `type`: Type
    
    var value: String
  }
  object Token {
    
    inline def apply[Type](end: Double, start: Double, `type`: Type, value: String): Token[Type] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token[Type]]
    }
    
    extension [Self <: Token[?], Type](x: Self & Token[Type]) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenGroup[GroupType, Type] extends StObject {
    
    var end: Double
    
    var start: Double
    
    var tokens: js.Array[Token[Type]]
    
    var `type`: GroupType
    
    var value: String
  }
  object TokenGroup {
    
    inline def apply[GroupType, Type](end: Double, start: Double, tokens: js.Array[Token[Type]], `type`: GroupType, value: String): TokenGroup[GroupType, Type] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenGroup[GroupType, Type]]
    }
    
    extension [Self <: TokenGroup[?, ?], GroupType, Type](x: Self & (TokenGroup[GroupType, Type])) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Token[Type]]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: Token[Type]*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(value: GroupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
