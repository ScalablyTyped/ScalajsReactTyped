package typingsJapgolly.tinymce.mod.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18n extends js.Object {
  var rtl: Boolean
  def add(code: String, items: js.Array[js.Object]): Unit
  def getCode(): String
  def setCode(newCode: String): Unit
  def translate(text: String): String
}

object i18n {
  @scala.inline
  def apply(
    add: (String, js.Array[js.Object]) => Callback,
    getCode: CallbackTo[String],
    rtl: Boolean,
    setCode: String => Callback,
    translate: String => CallbackTo[String]
  ): i18n = {
    val __obj = js.Dynamic.literal(rtl = rtl.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Object]) => add(t0, t1).runNow()))
    __obj.updateDynamic("getCode")(getCode.toJsFn)
    __obj.updateDynamic("setCode")(js.Any.fromFunction1((t0: java.lang.String) => setCode(t0).runNow()))
    __obj.updateDynamic("translate")(js.Any.fromFunction1((t0: java.lang.String) => translate(t0).runNow()))
    __obj.asInstanceOf[i18n]
  }
}

