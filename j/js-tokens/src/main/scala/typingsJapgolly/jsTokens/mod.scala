package typingsJapgolly.jsTokens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): js.Iterable[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[Token]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsTokens.anon.Closed
    - typingsJapgolly.jsTokens.anon.Type
    - typingsJapgolly.jsTokens.anon.Value
    - typingsJapgolly.jsTokens.anon.TypeValue
    - typingsJapgolly.jsTokens.anon.ValueString
  */
  trait JSXToken extends StObject
  object JSXToken {
    
    inline def Closed(closed: Boolean, value: String): typingsJapgolly.jsTokens.anon.Closed = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXString")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.Closed]
    }
    
    inline def Type(value: String): typingsJapgolly.jsTokens.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXText")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.Type]
    }
    
    inline def TypeValue(value: String): typingsJapgolly.jsTokens.anon.TypeValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXPunctuator")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.TypeValue]
    }
    
    inline def Value(value: String): typingsJapgolly.jsTokens.anon.Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXIdentifier")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.Value]
    }
    
    inline def ValueString(value: String): typingsJapgolly.jsTokens.anon.ValueString = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXInvalid")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.ValueString]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsTokens.anon.ClosedType
    - typingsJapgolly.jsTokens.anon.ClosedTypeValue
    - typingsJapgolly.jsTokens.anon.TypeValueString
    - typingsJapgolly.jsTokens.anon.`0`
    - typingsJapgolly.jsTokens.anon.ClosedBoolean
    - typingsJapgolly.jsTokens.anon.ClosedBooleanType
    - typingsJapgolly.jsTokens.anon.ClosedBooleanTypeValueString
    - typingsJapgolly.jsTokens.anon.`1`
    - typingsJapgolly.jsTokens.anon.`2`
    - typingsJapgolly.jsTokens.anon.`3`
    - typingsJapgolly.jsTokens.anon.`4`
    - typingsJapgolly.jsTokens.anon.`5`
    - typingsJapgolly.jsTokens.anon.`6`
    - typingsJapgolly.jsTokens.anon.`7`
    - typingsJapgolly.jsTokens.anon.`8`
  */
  trait Token extends StObject
  object Token {
    
    inline def `0`(value: String): typingsJapgolly.jsTokens.anon.`0` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("TemplateMiddle")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.`0`]
    }
    
    inline def `1`(value: String): typingsJapgolly.jsTokens.anon.`1` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SingleLineComment")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.`1`]
    }
    
    inline def `2`(value: String): typingsJapgolly.jsTokens.anon.`2` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("IdentifierName")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.`2`]
    }
    
    inline def `3`(value: String): typingsJapgolly.jsTokens.anon.`3` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PrivateIdentifier")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.`3`]
    }
    
    inline def `4`(value: String): typingsJapgolly.jsTokens.anon.`4` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NumericLiteral")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.`4`]
    }
    
    inline def `5`(value: String): typingsJapgolly.jsTokens.anon.`5` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Punctuator")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.`5`]
    }
    
    inline def `6`(value: String): typingsJapgolly.jsTokens.anon.`6` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("WhiteSpace")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.`6`]
    }
    
    inline def `7`(value: String): typingsJapgolly.jsTokens.anon.`7` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineTerminatorSequence")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.`7`]
    }
    
    inline def `8`(value: String): typingsJapgolly.jsTokens.anon.`8` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Invalid")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.`8`]
    }
    
    inline def ClosedBoolean(closed: Boolean, value: String): typingsJapgolly.jsTokens.anon.ClosedBoolean = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("TemplateTail")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.ClosedBoolean]
    }
    
    inline def ClosedBooleanType(closed: Boolean, value: String): typingsJapgolly.jsTokens.anon.ClosedBooleanType = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("RegularExpressionLiteral")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.ClosedBooleanType]
    }
    
    inline def ClosedBooleanTypeValueString(closed: Boolean, value: String): typingsJapgolly.jsTokens.anon.ClosedBooleanTypeValueString = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineComment")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.ClosedBooleanTypeValueString]
    }
    
    inline def ClosedType(closed: Boolean, value: String): typingsJapgolly.jsTokens.anon.ClosedType = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("StringLiteral")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.ClosedType]
    }
    
    inline def ClosedTypeValue(closed: Boolean, value: String): typingsJapgolly.jsTokens.anon.ClosedTypeValue = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NoSubstitutionTemplate")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.ClosedTypeValue]
    }
    
    inline def TypeValueString(value: String): typingsJapgolly.jsTokens.anon.TypeValueString = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("TemplateHead")
      __obj.asInstanceOf[typingsJapgolly.jsTokens.anon.TypeValueString]
    }
  }
}
