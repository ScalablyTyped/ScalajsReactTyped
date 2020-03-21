package typingsJapgolly.fastCsv.rowParserMod

import typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions
import typingsJapgolly.fastCsv.parserTypesMod.RowArray
import typingsJapgolly.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/RowParser", JSImport.Default)
@js.native
class default protected () extends RowParser {
  def this(parserOptions: ParserOptions) = this()
  /* CompleteClass */
  override val columnParser: js.Any = js.native
  /* CompleteClass */
  override var getStartToken: js.Any = js.native
  /* CompleteClass */
  override val parserOptions: js.Any = js.native
  /* CompleteClass */
  override var shouldSkipColumnParse: js.Any = js.native
  /* CompleteClass */
  override def parse(scanner: Scanner): RowArray | Null = js.native
}

