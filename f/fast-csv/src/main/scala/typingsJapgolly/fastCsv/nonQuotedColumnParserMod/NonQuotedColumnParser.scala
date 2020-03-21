package typingsJapgolly.fastCsv.nonQuotedColumnParserMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonQuotedColumnParser extends js.Object {
  val columnFormatter: js.Any
  val parserOptions: js.Any
  def parse(scanner: Scanner): String | Null
}

object NonQuotedColumnParser {
  @scala.inline
  def apply(columnFormatter: js.Any, parse: Scanner => CallbackTo[String | Null], parserOptions: js.Any): NonQuotedColumnParser = {
    val __obj = js.Dynamic.literal(columnFormatter = columnFormatter.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: typingsJapgolly.fastCsv.scannerMod.Scanner) => parse(t0).runNow()))
    __obj.asInstanceOf[NonQuotedColumnParser]
  }
}

