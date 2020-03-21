package typingsJapgolly.markdownIt

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayReplaceAt extends js.Object {
  def arrayReplaceAt(src: js.Array[_], pos: Double, newElements: js.Array[_]): js.Array[_]
  def assign(obj: js.Any): js.Any
  def escapeHtml(str: String): String
  def escapeRE(str: String): String
  def fromCodePoint(str: String): String
  def has(`object`: js.Any, key: String): Boolean
  def isMdAsciiPunct(str: js.Any): Boolean
  def isPunctChar(str: js.Any): Boolean
  def isSpace(str: js.Any): Boolean
  def isString(obj: js.Any): Boolean
  def isValidEntityCode(str: js.Any): Boolean
  def isWhiteSpace(str: js.Any): Boolean
  def normalizeReference(str: String): String
  def unescapeAll(str: String): String
  def unescapeMd(str: String): String
}

object AnonArrayReplaceAt {
  @scala.inline
  def apply(
    arrayReplaceAt: (js.Array[js.Any], Double, js.Array[js.Any]) => CallbackTo[js.Array[js.Any]],
    assign: js.Any => CallbackTo[js.Any],
    escapeHtml: String => CallbackTo[String],
    escapeRE: String => CallbackTo[String],
    fromCodePoint: String => CallbackTo[String],
    has: (js.Any, String) => CallbackTo[Boolean],
    isMdAsciiPunct: js.Any => CallbackTo[Boolean],
    isPunctChar: js.Any => CallbackTo[Boolean],
    isSpace: js.Any => CallbackTo[Boolean],
    isString: js.Any => CallbackTo[Boolean],
    isValidEntityCode: js.Any => CallbackTo[Boolean],
    isWhiteSpace: js.Any => CallbackTo[Boolean],
    normalizeReference: String => CallbackTo[String],
    unescapeAll: String => CallbackTo[String],
    unescapeMd: String => CallbackTo[String]
  ): AnonArrayReplaceAt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrayReplaceAt")(js.Any.fromFunction3((t0: js.Array[js.Any], t1: scala.Double, t2: js.Array[js.Any]) => arrayReplaceAt(t0, t1, t2).runNow()))
    __obj.updateDynamic("assign")(js.Any.fromFunction1((t0: js.Any) => assign(t0).runNow()))
    __obj.updateDynamic("escapeHtml")(js.Any.fromFunction1((t0: java.lang.String) => escapeHtml(t0).runNow()))
    __obj.updateDynamic("escapeRE")(js.Any.fromFunction1((t0: java.lang.String) => escapeRE(t0).runNow()))
    __obj.updateDynamic("fromCodePoint")(js.Any.fromFunction1((t0: java.lang.String) => fromCodePoint(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => has(t0, t1).runNow()))
    __obj.updateDynamic("isMdAsciiPunct")(js.Any.fromFunction1((t0: js.Any) => isMdAsciiPunct(t0).runNow()))
    __obj.updateDynamic("isPunctChar")(js.Any.fromFunction1((t0: js.Any) => isPunctChar(t0).runNow()))
    __obj.updateDynamic("isSpace")(js.Any.fromFunction1((t0: js.Any) => isSpace(t0).runNow()))
    __obj.updateDynamic("isString")(js.Any.fromFunction1((t0: js.Any) => isString(t0).runNow()))
    __obj.updateDynamic("isValidEntityCode")(js.Any.fromFunction1((t0: js.Any) => isValidEntityCode(t0).runNow()))
    __obj.updateDynamic("isWhiteSpace")(js.Any.fromFunction1((t0: js.Any) => isWhiteSpace(t0).runNow()))
    __obj.updateDynamic("normalizeReference")(js.Any.fromFunction1((t0: java.lang.String) => normalizeReference(t0).runNow()))
    __obj.updateDynamic("unescapeAll")(js.Any.fromFunction1((t0: java.lang.String) => unescapeAll(t0).runNow()))
    __obj.updateDynamic("unescapeMd")(js.Any.fromFunction1((t0: java.lang.String) => unescapeMd(t0).runNow()))
    __obj.asInstanceOf[AnonArrayReplaceAt]
  }
}

