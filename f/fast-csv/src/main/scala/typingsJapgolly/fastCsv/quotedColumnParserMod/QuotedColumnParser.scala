package typingsJapgolly.fastCsv.quotedColumnParserMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotedColumnParser extends js.Object {
  var checkForMalformedColumn: js.Any
  val columnFormatter: js.Any
  var gatherDataBetweenQuotes: js.Any
  val parserOptions: js.Any
  def parse(scanner: Scanner): String | Null
}

object QuotedColumnParser {
  @scala.inline
  def apply(
    checkForMalformedColumn: js.Any,
    columnFormatter: js.Any,
    gatherDataBetweenQuotes: js.Any,
    parse: Scanner => CallbackTo[String | Null],
    parserOptions: js.Any
  ): QuotedColumnParser = {
    val __obj = js.Dynamic.literal(checkForMalformedColumn = checkForMalformedColumn.asInstanceOf[js.Any], columnFormatter = columnFormatter.asInstanceOf[js.Any], gatherDataBetweenQuotes = gatherDataBetweenQuotes.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: typingsJapgolly.fastCsv.scannerMod.Scanner) => parse(t0).runNow()))
    __obj.asInstanceOf[QuotedColumnParser]
  }
}

