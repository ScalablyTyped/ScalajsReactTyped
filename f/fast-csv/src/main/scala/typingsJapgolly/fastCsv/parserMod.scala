package typingsJapgolly.fastCsv

import typingsJapgolly.fastCsv.csvParserStreamMod.default
import typingsJapgolly.fastCsv.parserOptionsMod.ParserOptionsArgs
import typingsJapgolly.fastCsv.parserTypesMod.RowTransformFunction
import typingsJapgolly.fastCsv.parserTypesMod.RowValidate
import typingsJapgolly.fastCsv.scannerMod.ScannerArgs
import typingsJapgolly.fastCsv.tokenMod.TokenArgs
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  @js.native
  class CsvParserStream protected () extends default {
    def this(parserOptions: typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class HeaderTransformer protected ()
    extends typingsJapgolly.fastCsv.transformsMod.HeaderTransformer {
    def this(parserOptions: typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class Parser protected ()
    extends typingsJapgolly.fastCsv.parserParserMod.Parser {
    def this(parserOptions: typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class ParserOptions ()
    extends typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  @js.native
  class RowParser protected ()
    extends typingsJapgolly.fastCsv.parserParserMod.RowParser {
    def this(parserOptions: typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class RowTransformerValidator ()
    extends typingsJapgolly.fastCsv.transformsMod.RowTransformerValidator
  
  @js.native
  class Scanner protected ()
    extends typingsJapgolly.fastCsv.parserParserMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @js.native
  class Token protected ()
    extends typingsJapgolly.fastCsv.parserParserMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  
  def isSyncTransform(transform: RowTransformFunction): /* is fast-csv.fast-csv/build/src/parser/types.SyncRowTransform */ Boolean = js.native
  def isSyncValidate(validate: RowValidate): /* is fast-csv.fast-csv/build/src/parser/types.SyncRowValidate */ Boolean = js.native
  def parse(): default = js.native
  def parse(args: ParserOptionsArgs): default = js.native
  def parseFile(location: String): default = js.native
  def parseFile(location: String, options: ParserOptionsArgs): default = js.native
  def parseStream(stream: ReadableStream): default = js.native
  def parseStream(stream: ReadableStream, options: ParserOptionsArgs): default = js.native
  def parseString(string: String): default = js.native
  def parseString(string: String, options: ParserOptionsArgs): default = js.native
  /* static members */
  @js.native
  object Parser extends js.Object {
    var removeBOM: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object RowTransformerValidator extends js.Object {
    var createTransform: js.Any = js.native
    var createValidator: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Token extends js.Object {
    def isTokenCarriageReturn(
      token: typingsJapgolly.fastCsv.tokenMod.Token,
      parserOptions: typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenComment(
      token: typingsJapgolly.fastCsv.tokenMod.Token,
      parserOptions: typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenDelimiter(
      token: typingsJapgolly.fastCsv.tokenMod.Token,
      parserOptions: typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenEscapeCharacter(
      token: typingsJapgolly.fastCsv.tokenMod.Token,
      parserOptions: typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenQuote(
      token: typingsJapgolly.fastCsv.tokenMod.Token,
      parserOptions: typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenRowDelimiter(token: typingsJapgolly.fastCsv.tokenMod.Token): Boolean = js.native
  }
  
}

