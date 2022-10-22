package typingsJapgolly.tokeyCssSelectorParser

import typingsJapgolly.tokeyCore.distTypesMod.Descriptors
import typingsJapgolly.tokeyCore.distTypesMod.Token
import typingsJapgolly.tokeyCssSelectorParser.anon.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokenizerMod {
  
  @JSImport("@tokey/css-selector-parser/dist/tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenizeSelector(source: String): js.Array[CSSSelectorToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenizeSelector")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSSelectorToken]]
  inline def tokenizeSelector(source: String, options: Offset): js.Array[CSSSelectorToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizeSelector")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[CSSSelectorToken]]
  
  type CSSSelectorToken = Token[Descriptors | Delimiters]
  
  object Delimiters {
    
    inline def Ampersand: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Ampersand = "&".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Ampersand]
    
    inline def Asterisk: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Asterisk = "*".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Asterisk]
    
    inline def Colon: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Colon = ":".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Colon]
    
    inline def Comma: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Comma = ",".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Comma]
    
    inline def Dot: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Dot = ".".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Dot]
    
    inline def Greaterthansign: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign]
    
    inline def Leftcurlybracket: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Leftcurlybracket = "{".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Leftcurlybracket]
    
    inline def Leftparenthesis: /* ( */ String = "(".asInstanceOf[/* ( */ String]
    
    inline def Numbersign: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Numbersign = "#".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Numbersign]
    
    inline def Plussign: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign = "+".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign]
    
    inline def Rightcurlybracket: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Rightcurlybracket = "}".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Rightcurlybracket]
    
    inline def Rightparenthesis: /* ) */ String = ")".asInstanceOf[/* ) */ String]
    
    inline def Tilde: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde = "~".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde]
    
    inline def Verticalline: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Verticalline = "|".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Verticalline]
    
    inline def `[`: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`[` = "[".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`[`]
    
    inline def `]`: typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`]` = "]".asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`]`]
  }
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`[`
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`]`
    - / * ( * / java.lang.String
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Comma
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Asterisk
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Verticalline
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Colon
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Dot
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Numbersign
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Leftcurlybracket
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Rightcurlybracket
    - typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Ampersand
  */
  type Delimiters = _Delimiters | (/* ( */ String)
  
  trait _Delimiters extends StObject
}
