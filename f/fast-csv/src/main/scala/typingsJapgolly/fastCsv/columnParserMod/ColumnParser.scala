package typingsJapgolly.fastCsv.columnParserMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnParser extends js.Object {
  val nonQuotedColumnParser: typingsJapgolly.fastCsv.nonQuotedColumnParserMod.default
  val parserOptions: js.Any
  val quotedColumnParser: typingsJapgolly.fastCsv.quotedColumnParserMod.default
  def parse(scanner: Scanner): String | Null
}

object ColumnParser {
  @scala.inline
  def apply(
    nonQuotedColumnParser: typingsJapgolly.fastCsv.nonQuotedColumnParserMod.default,
    parse: Scanner => CallbackTo[String | Null],
    parserOptions: js.Any,
    quotedColumnParser: typingsJapgolly.fastCsv.quotedColumnParserMod.default
  ): ColumnParser = {
    val __obj = js.Dynamic.literal(nonQuotedColumnParser = nonQuotedColumnParser.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], quotedColumnParser = quotedColumnParser.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: typingsJapgolly.fastCsv.scannerMod.Scanner) => parse(t0).runNow()))
    __obj.asInstanceOf[ColumnParser]
  }
}

