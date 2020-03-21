package typingsJapgolly.hapi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapi.mod.Util.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParser extends js.Object {
  /**
    * the method must return an object where each key is a parameter and matching value is the parameter value.
    * If the method throws, the error is used as the response or returned when `request.setUrl` is called.
    */
  def parser(raw: Dictionary[String]): Dictionary[_]
}

object AnonParser {
  @scala.inline
  def apply(parser: Dictionary[String] => CallbackTo[Dictionary[js.Any]]): AnonParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parser")(js.Any.fromFunction1((t0: typingsJapgolly.hapi.mod.Util.Dictionary[java.lang.String]) => parser(t0).runNow()))
    __obj.asInstanceOf[AnonParser]
  }
}

