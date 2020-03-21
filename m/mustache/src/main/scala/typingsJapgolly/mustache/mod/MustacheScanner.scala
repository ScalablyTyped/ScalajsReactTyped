package typingsJapgolly.mustache.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple string scanner that is used by the template parser to find tokens in template strings.
  */
trait MustacheScanner extends js.Object {
  var pos: Double
  var string: String
  var tail: String
  /**
    * Returns `true` if the tail is empty (end of string).
    */
  def eos(): Boolean
  /**
    * Tries to match the given regular expression at the current position.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * The matched text if it can match, the empty string otherwise.
    */
  def scan(re: js.RegExp): String
  /**
    * Skips all text until the given regular expression can be matched.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * Returns the skipped string, which is the entire tail if no match can be made.
    */
  def scanUntil(re: js.RegExp): String
}

object MustacheScanner {
  @scala.inline
  def apply(
    eos: CallbackTo[Boolean],
    pos: Double,
    scan: js.RegExp => CallbackTo[String],
    scanUntil: js.RegExp => CallbackTo[String],
    string: String,
    tail: String
  ): MustacheScanner = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any])
    __obj.updateDynamic("eos")(eos.toJsFn)
    __obj.updateDynamic("scan")(js.Any.fromFunction1((t0: js.RegExp) => scan(t0).runNow()))
    __obj.updateDynamic("scanUntil")(js.Any.fromFunction1((t0: js.RegExp) => scanUntil(t0).runNow()))
    __obj.asInstanceOf[MustacheScanner]
  }
}

