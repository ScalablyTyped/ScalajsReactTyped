package typingsJapgolly.fastCsv.rowParserMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastCsv.parserTypesMod.RowArray
import typingsJapgolly.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowParser extends js.Object {
  val columnParser: js.Any
  var getStartToken: js.Any
  val parserOptions: js.Any
  var shouldSkipColumnParse: js.Any
  def parse(scanner: Scanner): RowArray | Null
}

object RowParser {
  @scala.inline
  def apply(
    columnParser: js.Any,
    getStartToken: js.Any,
    parse: Scanner => CallbackTo[RowArray | Null],
    parserOptions: js.Any,
    shouldSkipColumnParse: js.Any
  ): RowParser = {
    val __obj = js.Dynamic.literal(columnParser = columnParser.asInstanceOf[js.Any], getStartToken = getStartToken.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], shouldSkipColumnParse = shouldSkipColumnParse.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: typingsJapgolly.fastCsv.scannerMod.Scanner) => parse(t0).runNow()))
    __obj.asInstanceOf[RowParser]
  }
}

