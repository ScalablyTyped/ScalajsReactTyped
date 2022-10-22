package typingsJapgolly.html2canvas

import typingsJapgolly.html2canvas.distTypesCssPropertyDescriptorsBackgroundSizeMod.BackgroundSizeInfo
import typingsJapgolly.html2canvas.distTypesCssSyntaxParserMod.CSSValue
import typingsJapgolly.html2canvas.distTypesCssTypesLengthMod.Length
import typingsJapgolly.html2canvas.distTypesCssTypesLengthPercentageMod.LengthPercentage
import typingsJapgolly.html2canvas.html2canvasInts.`0`
import typingsJapgolly.html2canvas.html2canvasInts.`10`
import typingsJapgolly.html2canvas.html2canvasInts.`11`
import typingsJapgolly.html2canvas.html2canvasInts.`12`
import typingsJapgolly.html2canvas.html2canvasInts.`13`
import typingsJapgolly.html2canvas.html2canvasInts.`14`
import typingsJapgolly.html2canvas.html2canvasInts.`15`
import typingsJapgolly.html2canvas.html2canvasInts.`16`
import typingsJapgolly.html2canvas.html2canvasInts.`17`
import typingsJapgolly.html2canvas.html2canvasInts.`18`
import typingsJapgolly.html2canvas.html2canvasInts.`19`
import typingsJapgolly.html2canvas.html2canvasInts.`1`
import typingsJapgolly.html2canvas.html2canvasInts.`20`
import typingsJapgolly.html2canvas.html2canvasInts.`21`
import typingsJapgolly.html2canvas.html2canvasInts.`22`
import typingsJapgolly.html2canvas.html2canvasInts.`23`
import typingsJapgolly.html2canvas.html2canvasInts.`24`
import typingsJapgolly.html2canvas.html2canvasInts.`25`
import typingsJapgolly.html2canvas.html2canvasInts.`26`
import typingsJapgolly.html2canvas.html2canvasInts.`27`
import typingsJapgolly.html2canvas.html2canvasInts.`28`
import typingsJapgolly.html2canvas.html2canvasInts.`29`
import typingsJapgolly.html2canvas.html2canvasInts.`2`
import typingsJapgolly.html2canvas.html2canvasInts.`30`
import typingsJapgolly.html2canvas.html2canvasInts.`31`
import typingsJapgolly.html2canvas.html2canvasInts.`32`
import typingsJapgolly.html2canvas.html2canvasInts.`3`
import typingsJapgolly.html2canvas.html2canvasInts.`4`
import typingsJapgolly.html2canvas.html2canvasInts.`5`
import typingsJapgolly.html2canvas.html2canvasInts.`6`
import typingsJapgolly.html2canvas.html2canvasInts.`7`
import typingsJapgolly.html2canvas.html2canvasInts.`8`
import typingsJapgolly.html2canvas.html2canvasInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssSyntaxTokenizerMod {
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "EOF_TOKEN")
  @js.native
  val EOF_TOKEN: Token = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "FLAG_ID")
  @js.native
  val FLAG_ID: Double = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "FLAG_INTEGER")
  @js.native
  val FLAG_INTEGER: Double = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "FLAG_NUMBER")
  @js.native
  val FLAG_NUMBER: Double = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "FLAG_UNRESTRICTED")
  @js.native
  val FLAG_UNRESTRICTED: Double = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "Tokenizer")
  @js.native
  open class Tokenizer () extends StObject {
    
    /* private */ var _value: Any = js.native
    
    /* private */ var consumeBadUrlRemnants: Any = js.native
    
    /* private */ var consumeCodePoint: Any = js.native
    
    /* private */ var consumeEscapedCodePoint: Any = js.native
    
    /* private */ var consumeIdentLikeToken: Any = js.native
    
    /* private */ var consumeName: Any = js.native
    
    /* private */ var consumeNumber: Any = js.native
    
    /* private */ var consumeNumericToken: Any = js.native
    
    /* private */ var consumeStringSlice: Any = js.native
    
    /* private */ var consumeStringToken: Any = js.native
    
    /* private */ var consumeToken: Any = js.native
    
    /* private */ var consumeUnicodeRangeToken: Any = js.native
    
    /* private */ var consumeUrlToken: Any = js.native
    
    /* private */ var consumeWhiteSpace: Any = js.native
    
    /* private */ var peekCodePoint: Any = js.native
    
    def read(): js.Array[CSSToken] = js.native
    
    /* private */ var reconsumeCodePoint: Any = js.native
    
    def write(chunk: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.Token
    - typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.StringValueToken
    - typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.NumberValueToken
    - typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.DimensionToken
    - typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.UnicodeRangeToken
    - typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.HashToken
  */
  trait CSSToken
    extends StObject
       with CSSValue
  object CSSToken {
    
    inline def DimensionToken(flags: Double, number: Double, unit: String): typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.DimensionToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(15)
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.DimensionToken]
    }
    
    inline def HashToken(flags: Double, value: String): typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.HashToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(5)
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.HashToken]
    }
    
    inline def NumberValueToken(flags: Double, number: Double, `type`: `16` | `17`): typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.NumberValueToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.NumberValueToken]
    }
    
    inline def StringValueToken(`type`: `0` | `6` | `19` | `20` | `22` | `7`, value: String): typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.StringValueToken = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.StringValueToken]
    }
    
    inline def Token(
      `type`: `23` | `1` | `2` | `3` | `4` | `14` | `8` | `13` | `26` | `27` | `28` | `29` | `11` | `12` | `9` | `10` | `21` | `31` | `24` | `25` | `32`
    ): typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.Token = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.Token]
    }
    
    inline def UnicodeRangeToken(end: Double, start: Double): typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.UnicodeRangeToken = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(30)
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.UnicodeRangeToken]
    }
  }
  
  trait DimensionToken
    extends StObject
       with IToken
       with CSSToken
       with Length
       with LengthPercentage {
    
    var flags: Double
    
    var number: Double
    
    @JSName("type")
    var type_DimensionToken: `15`
    
    var unit: String
  }
  object DimensionToken {
    
    inline def apply(flags: Double, number: Double, unit: String): DimensionToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(15)
      __obj.asInstanceOf[DimensionToken]
    }
    
    extension [Self <: DimensionToken](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setType(value: `15`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait HashToken
    extends StObject
       with IToken
       with CSSToken {
    
    var flags: Double
    
    @JSName("type")
    var type_HashToken: `5`
    
    var value: String
  }
  object HashToken {
    
    inline def apply(flags: Double, value: String): HashToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(5)
      __obj.asInstanceOf[HashToken]
    }
    
    extension [Self <: HashToken](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setType(value: `5`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IToken extends StObject {
    
    var `type`: TokenType
  }
  object IToken {
    
    inline def apply(`type`: TokenType): IToken = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToken]
    }
    
    extension [Self <: IToken](x: Self) {
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberValueToken
    extends StObject
       with IToken
       with CSSToken
       with Length
       with LengthPercentage {
    
    var flags: Double
    
    var number: Double
    
    @JSName("type")
    var type_NumberValueToken: `16` | `17`
  }
  object NumberValueToken {
    
    inline def apply(flags: Double, number: Double, `type`: `16` | `17`): NumberValueToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberValueToken]
    }
    
    extension [Self <: NumberValueToken](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setType(value: `16` | `17`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringValueToken
    extends StObject
       with IToken
       with BackgroundSizeInfo
       with CSSToken {
    
    @JSName("type")
    var type_StringValueToken: `0` | `6` | `19` | `20` | `22` | `7`
    
    var value: String
  }
  object StringValueToken {
    
    inline def apply(`type`: `0` | `6` | `19` | `20` | `22` | `7`, value: String): StringValueToken = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringValueToken]
    }
    
    extension [Self <: StringValueToken](x: Self) {
      
      inline def setType(value: `0` | `6` | `19` | `20` | `22` | `7`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token
    extends StObject
       with IToken
       with CSSToken {
    
    @JSName("type")
    var type_Token: `23` | `1` | `2` | `3` | `4` | `14` | `8` | `13` | `26` | `27` | `28` | `29` | `11` | `12` | `9` | `10` | `21` | `31` | `24` | `25` | `32`
  }
  object Token {
    
    inline def apply(
      `type`: `23` | `1` | `2` | `3` | `4` | `14` | `8` | `13` | `26` | `27` | `28` | `29` | `11` | `12` | `9` | `10` | `21` | `31` | `24` | `25` | `32`
    ): Token = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setType(
        value: `23` | `1` | `2` | `3` | `4` | `14` | `8` | `13` | `26` | `27` | `28` | `29` | `11` | `12` | `9` | `10` | `21` | `31` | `24` | `25` | `32`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.html2canvasInts.`0`
    - typingsJapgolly.html2canvas.html2canvasInts.`1`
    - typingsJapgolly.html2canvas.html2canvasInts.`2`
    - typingsJapgolly.html2canvas.html2canvasInts.`3`
    - typingsJapgolly.html2canvas.html2canvasInts.`4`
    - typingsJapgolly.html2canvas.html2canvasInts.`5`
    - typingsJapgolly.html2canvas.html2canvasInts.`6`
    - typingsJapgolly.html2canvas.html2canvasInts.`7`
    - typingsJapgolly.html2canvas.html2canvasInts.`8`
    - typingsJapgolly.html2canvas.html2canvasInts.`9`
    - typingsJapgolly.html2canvas.html2canvasInts.`10`
    - typingsJapgolly.html2canvas.html2canvasInts.`11`
    - typingsJapgolly.html2canvas.html2canvasInts.`12`
    - typingsJapgolly.html2canvas.html2canvasInts.`13`
    - typingsJapgolly.html2canvas.html2canvasInts.`14`
    - typingsJapgolly.html2canvas.html2canvasInts.`15`
    - typingsJapgolly.html2canvas.html2canvasInts.`16`
    - typingsJapgolly.html2canvas.html2canvasInts.`17`
    - typingsJapgolly.html2canvas.html2canvasInts.`18`
    - typingsJapgolly.html2canvas.html2canvasInts.`19`
    - typingsJapgolly.html2canvas.html2canvasInts.`20`
    - typingsJapgolly.html2canvas.html2canvasInts.`21`
    - typingsJapgolly.html2canvas.html2canvasInts.`22`
    - typingsJapgolly.html2canvas.html2canvasInts.`23`
    - typingsJapgolly.html2canvas.html2canvasInts.`24`
    - typingsJapgolly.html2canvas.html2canvasInts.`25`
    - typingsJapgolly.html2canvas.html2canvasInts.`26`
    - typingsJapgolly.html2canvas.html2canvasInts.`27`
    - typingsJapgolly.html2canvas.html2canvasInts.`28`
    - typingsJapgolly.html2canvas.html2canvasInts.`29`
    - typingsJapgolly.html2canvas.html2canvasInts.`30`
    - typingsJapgolly.html2canvas.html2canvasInts.`31`
    - typingsJapgolly.html2canvas.html2canvasInts.`32`
  */
  trait TokenType extends StObject
  object TokenType {
    
    inline def AT_KEYWORD_TOKEN: `7` = 7.asInstanceOf[`7`]
    
    inline def BAD_STRING_TOKEN: `1` = 1.asInstanceOf[`1`]
    
    inline def BAD_URL_TOKEN: `23` = 23.asInstanceOf[`23`]
    
    inline def CDC_TOKEN: `24` = 24.asInstanceOf[`24`]
    
    inline def CDO_TOKEN: `25` = 25.asInstanceOf[`25`]
    
    inline def COLON_TOKEN: `26` = 26.asInstanceOf[`26`]
    
    inline def COLUMN_TOKEN: `21` = 21.asInstanceOf[`21`]
    
    inline def COMMA_TOKEN: `4` = 4.asInstanceOf[`4`]
    
    inline def DASH_MATCH_TOKEN: `9` = 9.asInstanceOf[`9`]
    
    inline def DELIM_TOKEN: `6` = 6.asInstanceOf[`6`]
    
    inline def DIMENSION_TOKEN: `15` = 15.asInstanceOf[`15`]
    
    inline def EOF_TOKEN: `32` = 32.asInstanceOf[`32`]
    
    inline def FUNCTION: `18` = 18.asInstanceOf[`18`]
    
    inline def FUNCTION_TOKEN: `19` = 19.asInstanceOf[`19`]
    
    inline def HASH_TOKEN: `5` = 5.asInstanceOf[`5`]
    
    inline def IDENT_TOKEN: `20` = 20.asInstanceOf[`20`]
    
    inline def INCLUDE_MATCH_TOKEN: `10` = 10.asInstanceOf[`10`]
    
    inline def LEFT_CURLY_BRACKET_TOKEN: `11` = 11.asInstanceOf[`11`]
    
    inline def LEFT_PARENTHESIS_TOKEN: `2` = 2.asInstanceOf[`2`]
    
    inline def LEFT_SQUARE_BRACKET_TOKEN: `28` = 28.asInstanceOf[`28`]
    
    inline def NUMBER_TOKEN: `17` = 17.asInstanceOf[`17`]
    
    inline def PERCENTAGE_TOKEN: `16` = 16.asInstanceOf[`16`]
    
    inline def PREFIX_MATCH_TOKEN: `8` = 8.asInstanceOf[`8`]
    
    inline def RIGHT_CURLY_BRACKET_TOKEN: `12` = 12.asInstanceOf[`12`]
    
    inline def RIGHT_PARENTHESIS_TOKEN: `3` = 3.asInstanceOf[`3`]
    
    inline def RIGHT_SQUARE_BRACKET_TOKEN: `29` = 29.asInstanceOf[`29`]
    
    inline def SEMICOLON_TOKEN: `27` = 27.asInstanceOf[`27`]
    
    inline def STRING_TOKEN: `0` = 0.asInstanceOf[`0`]
    
    inline def SUBSTRING_MATCH_TOKEN: `14` = 14.asInstanceOf[`14`]
    
    inline def SUFFIX_MATCH_TOKEN: `13` = 13.asInstanceOf[`13`]
    
    inline def UNICODE_RANGE_TOKEN: `30` = 30.asInstanceOf[`30`]
    
    inline def URL_TOKEN: `22` = 22.asInstanceOf[`22`]
    
    inline def WHITESPACE_TOKEN: `31` = 31.asInstanceOf[`31`]
  }
  
  trait UnicodeRangeToken
    extends StObject
       with IToken
       with CSSToken {
    
    var end: Double
    
    var start: Double
    
    @JSName("type")
    var type_UnicodeRangeToken: `30`
  }
  object UnicodeRangeToken {
    
    inline def apply(end: Double, start: Double): UnicodeRangeToken = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(30)
      __obj.asInstanceOf[UnicodeRangeToken]
    }
    
    extension [Self <: UnicodeRangeToken](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: `30`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
