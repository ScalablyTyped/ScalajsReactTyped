package typingsJapgolly.xssFilters

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSSFilters_ extends js.Object {
  def inDoubleQuotedAttr(s: String): String
  def inHTMLComment(s: String): String
  def inHTMLData(s: String): String
  def inSingleQuotedAttr(s: String): String
  def inUnQuotedAttr(s: String): String
  def uriComponentInDoubleQuotedAttr(s: String): String
  def uriComponentInHTMLComment(s: String): String
  def uriComponentInHTMLData(s: String): String
  def uriComponentInSingleQuotedAttr(s: String): String
  def uriComponentInUnQuotedAttr(s: String): String
  def uriFragmentInDoubleQuotedAttr(s: String): String
  def uriFragmentInHTMLComment(s: String): String
  def uriFragmentInHTMLData(s: String): String
  def uriFragmentInSingleQuotedAttr(s: String): String
  def uriFragmentInUnQuotedAttr(s: String): String
  def uriInDoubleQuotedAttr(s: String): String
  def uriInHTMLComment(s: String): String
  def uriInHTMLData(s: String): String
  def uriInSingleQuotedAttr(s: String): String
  def uriInUnQuotedAttr(s: String): String
  def uriPathInDoubleQuotedAttr(s: String): String
  def uriPathInHTMLComment(s: String): String
  def uriPathInHTMLData(s: String): String
  def uriPathInSingleQuotedAttr(s: String): String
  def uriPathInUnQuotedAttr(s: String): String
  def uriQueryInDoubleQuotedAttr(s: String): String
  def uriQueryInHTMLComment(s: String): String
  def uriQueryInHTMLData(s: String): String
  def uriQueryInSingleQuotedAttr(s: String): String
  def uriQueryInUnQuotedAttr(s: String): String
}

object XSSFilters_ {
  @scala.inline
  def apply(
    inDoubleQuotedAttr: String => CallbackTo[String],
    inHTMLComment: String => CallbackTo[String],
    inHTMLData: String => CallbackTo[String],
    inSingleQuotedAttr: String => CallbackTo[String],
    inUnQuotedAttr: String => CallbackTo[String],
    uriComponentInDoubleQuotedAttr: String => CallbackTo[String],
    uriComponentInHTMLComment: String => CallbackTo[String],
    uriComponentInHTMLData: String => CallbackTo[String],
    uriComponentInSingleQuotedAttr: String => CallbackTo[String],
    uriComponentInUnQuotedAttr: String => CallbackTo[String],
    uriFragmentInDoubleQuotedAttr: String => CallbackTo[String],
    uriFragmentInHTMLComment: String => CallbackTo[String],
    uriFragmentInHTMLData: String => CallbackTo[String],
    uriFragmentInSingleQuotedAttr: String => CallbackTo[String],
    uriFragmentInUnQuotedAttr: String => CallbackTo[String],
    uriInDoubleQuotedAttr: String => CallbackTo[String],
    uriInHTMLComment: String => CallbackTo[String],
    uriInHTMLData: String => CallbackTo[String],
    uriInSingleQuotedAttr: String => CallbackTo[String],
    uriInUnQuotedAttr: String => CallbackTo[String],
    uriPathInDoubleQuotedAttr: String => CallbackTo[String],
    uriPathInHTMLComment: String => CallbackTo[String],
    uriPathInHTMLData: String => CallbackTo[String],
    uriPathInSingleQuotedAttr: String => CallbackTo[String],
    uriPathInUnQuotedAttr: String => CallbackTo[String],
    uriQueryInDoubleQuotedAttr: String => CallbackTo[String],
    uriQueryInHTMLComment: String => CallbackTo[String],
    uriQueryInHTMLData: String => CallbackTo[String],
    uriQueryInSingleQuotedAttr: String => CallbackTo[String],
    uriQueryInUnQuotedAttr: String => CallbackTo[String]
  ): XSSFilters_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inDoubleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => inDoubleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("inHTMLComment")(js.Any.fromFunction1((t0: java.lang.String) => inHTMLComment(t0).runNow()))
    __obj.updateDynamic("inHTMLData")(js.Any.fromFunction1((t0: java.lang.String) => inHTMLData(t0).runNow()))
    __obj.updateDynamic("inSingleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => inSingleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("inUnQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => inUnQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriComponentInDoubleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriComponentInDoubleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriComponentInHTMLComment")(js.Any.fromFunction1((t0: java.lang.String) => uriComponentInHTMLComment(t0).runNow()))
    __obj.updateDynamic("uriComponentInHTMLData")(js.Any.fromFunction1((t0: java.lang.String) => uriComponentInHTMLData(t0).runNow()))
    __obj.updateDynamic("uriComponentInSingleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriComponentInSingleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriComponentInUnQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriComponentInUnQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriFragmentInDoubleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriFragmentInDoubleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriFragmentInHTMLComment")(js.Any.fromFunction1((t0: java.lang.String) => uriFragmentInHTMLComment(t0).runNow()))
    __obj.updateDynamic("uriFragmentInHTMLData")(js.Any.fromFunction1((t0: java.lang.String) => uriFragmentInHTMLData(t0).runNow()))
    __obj.updateDynamic("uriFragmentInSingleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriFragmentInSingleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriFragmentInUnQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriFragmentInUnQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriInDoubleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriInDoubleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriInHTMLComment")(js.Any.fromFunction1((t0: java.lang.String) => uriInHTMLComment(t0).runNow()))
    __obj.updateDynamic("uriInHTMLData")(js.Any.fromFunction1((t0: java.lang.String) => uriInHTMLData(t0).runNow()))
    __obj.updateDynamic("uriInSingleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriInSingleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriInUnQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriInUnQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriPathInDoubleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriPathInDoubleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriPathInHTMLComment")(js.Any.fromFunction1((t0: java.lang.String) => uriPathInHTMLComment(t0).runNow()))
    __obj.updateDynamic("uriPathInHTMLData")(js.Any.fromFunction1((t0: java.lang.String) => uriPathInHTMLData(t0).runNow()))
    __obj.updateDynamic("uriPathInSingleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriPathInSingleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriPathInUnQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriPathInUnQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriQueryInDoubleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriQueryInDoubleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriQueryInHTMLComment")(js.Any.fromFunction1((t0: java.lang.String) => uriQueryInHTMLComment(t0).runNow()))
    __obj.updateDynamic("uriQueryInHTMLData")(js.Any.fromFunction1((t0: java.lang.String) => uriQueryInHTMLData(t0).runNow()))
    __obj.updateDynamic("uriQueryInSingleQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriQueryInSingleQuotedAttr(t0).runNow()))
    __obj.updateDynamic("uriQueryInUnQuotedAttr")(js.Any.fromFunction1((t0: java.lang.String) => uriQueryInUnQuotedAttr(t0).runNow()))
    __obj.asInstanceOf[XSSFilters_]
  }
}

