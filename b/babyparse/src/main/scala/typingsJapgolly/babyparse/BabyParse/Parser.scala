package typingsJapgolly.babyparse.BabyParse

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  // Sets the abort flag
  def abort(): Unit
  // Gets the cursor position
  def getCharIndex(): Double
  // Parses the input
  def parse(input: String): js.Any
}

object Parser {
  @scala.inline
  def apply(abort: Callback, getCharIndex: CallbackTo[Double], parse: String => CallbackTo[js.Any]): Parser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("getCharIndex")(getCharIndex.toJsFn)
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[Parser]
  }
}

