package typingsJapgolly.fastCsvParse

import typingsJapgolly.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import typingsJapgolly.fastCsvParse.buildSrcParserScannerMod.ScannerArgs
import typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.TokenArgs
import typingsJapgolly.fastCsvParse.buildSrcTypesMod.RowArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser", "ColumnParser")
  @js.native
  open class ColumnParser protected ()
    extends typingsJapgolly.fastCsvParse.buildSrcParserColumnMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "NonQuotedColumnParser")
  @js.native
  open class NonQuotedColumnParser protected ()
    extends typingsJapgolly.fastCsvParse.buildSrcParserColumnMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Parser")
  @js.native
  open class Parser protected ()
    extends typingsJapgolly.fastCsvParse.buildSrcParserParserMod.Parser {
    def this(parserOptions: ParserOptions) = this()
  }
  /* static members */
  object Parser {
    
    @JSImport("@fast-csv/parse/build/src/parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Parser.removeBOM")
    @js.native
    def removeBOM: Any = js.native
    inline def removeBOM_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeBOM")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "QuotedColumnParser")
  @js.native
  open class QuotedColumnParser protected ()
    extends typingsJapgolly.fastCsvParse.buildSrcParserColumnMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "RowParser")
  @js.native
  open class RowParser protected ()
    extends typingsJapgolly.fastCsvParse.buildSrcParserRowParserMod.RowParser {
    def this(parserOptions: ParserOptions) = this()
  }
  /* static members */
  object RowParser {
    
    @JSImport("@fast-csv/parse/build/src/parser", "RowParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEmptyRow(row: RowArray[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyRow")(row.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Scanner")
  @js.native
  open class Scanner protected ()
    extends typingsJapgolly.fastCsvParse.buildSrcParserScannerMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Token")
  @js.native
  open class Token protected ()
    extends typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  /* static members */
  object Token {
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTokenCarriageReturn(token: typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenCarriageReturn")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenComment(token: typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenComment")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenDelimiter(token: typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenDelimiter")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenEscapeCharacter(token: typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenEscapeCharacter")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenQuote(token: typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.Token, parserOptions: ParserOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenQuote")(token.asInstanceOf[js.Any], parserOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTokenRowDelimiter(token: typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenRowDelimiter")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
