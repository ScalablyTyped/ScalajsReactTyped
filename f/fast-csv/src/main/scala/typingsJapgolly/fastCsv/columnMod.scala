package typingsJapgolly.fastCsv

import typingsJapgolly.fastCsv.columnFormatterMod.default
import typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/column", JSImport.Namespace)
@js.native
object columnMod extends js.Object {
  @js.native
  class ColumnFormatter protected () extends default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class ColumnParser protected ()
    extends typingsJapgolly.fastCsv.columnParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class NonQuotedColumnParser protected ()
    extends typingsJapgolly.fastCsv.nonQuotedColumnParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class QuotedColumnParser protected ()
    extends typingsJapgolly.fastCsv.quotedColumnParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
}

