package typingsJapgolly.natural.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NounInflector extends js.Object {
  def pluralize(token: String): String
  def singularize(token: String): String
}

object NounInflector {
  @scala.inline
  def apply(pluralize: String => CallbackTo[String], singularize: String => CallbackTo[String]): NounInflector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pluralize")(js.Any.fromFunction1((t0: java.lang.String) => pluralize(t0).runNow()))
    __obj.updateDynamic("singularize")(js.Any.fromFunction1((t0: java.lang.String) => singularize(t0).runNow()))
    __obj.asInstanceOf[NounInflector]
  }
}

