package typingsJapgolly.fastCsv.parserParserParserMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  var parseRow: js.Any
  var parseWithComments: js.Any
  var parseWithoutComments: js.Any
  val parserOptions: js.Any
  val rowParser: js.Any
  def parse(line: String, hasMoreData: Boolean): ParseResult
}

object Parser {
  @scala.inline
  def apply(
    parse: (String, Boolean) => CallbackTo[ParseResult],
    parseRow: js.Any,
    parseWithComments: js.Any,
    parseWithoutComments: js.Any,
    parserOptions: js.Any,
    rowParser: js.Any
  ): Parser = {
    val __obj = js.Dynamic.literal(parseRow = parseRow.asInstanceOf[js.Any], parseWithComments = parseWithComments.asInstanceOf[js.Any], parseWithoutComments = parseWithoutComments.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], rowParser = rowParser.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => parse(t0, t1).runNow()))
    __obj.asInstanceOf[Parser]
  }
}

