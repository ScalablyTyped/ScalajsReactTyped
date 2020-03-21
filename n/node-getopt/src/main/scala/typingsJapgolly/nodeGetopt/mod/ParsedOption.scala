package typingsJapgolly.nodeGetopt.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parsed options.
  */
trait ParsedOption extends js.Object {
  var argv: js.Array[String]
  var options: OptionMap
  def empty(): Boolean
}

object ParsedOption {
  @scala.inline
  def apply(argv: js.Array[String], empty: CallbackTo[Boolean], options: OptionMap): ParsedOption = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.asInstanceOf[ParsedOption]
  }
}

