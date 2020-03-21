package typingsJapgolly.ldapFilters.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute_ extends js.Object {
  var escapeChars: js.Array[String]
  var name: String
  def approx(value: String): Filter
  def contains(value: String): Filter
  def endsWith(value: String): Filter
  def equalTo(value: String): Filter
  def escape(value: String): String
  def gte(value: String): Filter
  def lte(value: String): Filter
  def present(): Filter
  def raw(value: String): Filter
  def startsWith(value: String): Filter
}

object Attribute_ {
  @scala.inline
  def apply(
    approx: String => CallbackTo[Filter],
    contains: String => CallbackTo[Filter],
    endsWith: String => CallbackTo[Filter],
    equalTo: String => CallbackTo[Filter],
    escape: String => CallbackTo[String],
    escapeChars: js.Array[String],
    gte: String => CallbackTo[Filter],
    lte: String => CallbackTo[Filter],
    name: String,
    present: CallbackTo[Filter],
    raw: String => CallbackTo[Filter],
    startsWith: String => CallbackTo[Filter]
  ): Attribute_ = {
    val __obj = js.Dynamic.literal(escapeChars = escapeChars.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("approx")(js.Any.fromFunction1((t0: java.lang.String) => approx(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: java.lang.String) => contains(t0).runNow()))
    __obj.updateDynamic("endsWith")(js.Any.fromFunction1((t0: java.lang.String) => endsWith(t0).runNow()))
    __obj.updateDynamic("equalTo")(js.Any.fromFunction1((t0: java.lang.String) => equalTo(t0).runNow()))
    __obj.updateDynamic("escape")(js.Any.fromFunction1((t0: java.lang.String) => escape(t0).runNow()))
    __obj.updateDynamic("gte")(js.Any.fromFunction1((t0: java.lang.String) => gte(t0).runNow()))
    __obj.updateDynamic("lte")(js.Any.fromFunction1((t0: java.lang.String) => lte(t0).runNow()))
    __obj.updateDynamic("present")(present.toJsFn)
    __obj.updateDynamic("raw")(js.Any.fromFunction1((t0: java.lang.String) => raw(t0).runNow()))
    __obj.updateDynamic("startsWith")(js.Any.fromFunction1((t0: java.lang.String) => startsWith(t0).runNow()))
    __obj.asInstanceOf[Attribute_]
  }
}

