package typingsJapgolly.subsume.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subsume extends js.Object {
  /**
  	Used identifier.
  	*/
  var id: String
  /**
  	Postfix used in `.compose()`.
  	*/
  var postfix: String
  /**
  	Prefix used in `.compose()`.
  	*/
  var prefix: String
  /**
  	Regex used in `.parse()`.
  	*/
  var regex: js.RegExp
  /**
  	@returns A wrapped version of `text` that you can embed in other content.
  	*/
  def compose(string: String): String
  /**
  	Extract your embedded data from `text`.
  	@returns An object with properties `.data` for your embedded data and `.rest` for everything else.
  	*/
  def parse(string: String): ParseResult
}

object Subsume {
  @scala.inline
  def apply(
    compose: String => CallbackTo[String],
    id: String,
    parse: String => CallbackTo[ParseResult],
    postfix: String,
    prefix: String,
    regex: js.RegExp
  ): Subsume = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], postfix = postfix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("compose")(js.Any.fromFunction1((t0: java.lang.String) => compose(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[Subsume]
  }
}

