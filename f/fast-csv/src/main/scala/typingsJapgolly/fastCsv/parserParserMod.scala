package typingsJapgolly.fastCsv

import typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions
import typingsJapgolly.fastCsv.parserParserParserMod.default
import typingsJapgolly.fastCsv.scannerMod.ScannerArgs
import typingsJapgolly.fastCsv.tokenMod.TokenArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser", JSImport.Namespace)
@js.native
object parserParserMod extends js.Object {
  @js.native
  class Parser protected () extends default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class RowParser protected ()
    extends typingsJapgolly.fastCsv.rowParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class Scanner protected ()
    extends typingsJapgolly.fastCsv.scannerMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @js.native
  class Token protected ()
    extends typingsJapgolly.fastCsv.tokenMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  
  /* static members */
  @js.native
  object Parser extends js.Object {
    var removeBOM: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Token extends js.Object {
    def isTokenCarriageReturn(token: typingsJapgolly.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenComment(token: typingsJapgolly.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenDelimiter(token: typingsJapgolly.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenEscapeCharacter(token: typingsJapgolly.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenQuote(token: typingsJapgolly.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenRowDelimiter(token: typingsJapgolly.fastCsv.tokenMod.Token): Boolean = js.native
  }
  
}

