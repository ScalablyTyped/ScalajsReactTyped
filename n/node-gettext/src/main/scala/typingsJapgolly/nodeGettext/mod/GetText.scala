package typingsJapgolly.nodeGettext.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeGettext.nodeGettextStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetText extends js.Object {
  def addTranslations(locale: String, domain: String, translations: js.Object): Unit
  def dgettext(domain: String, msgid: String): String
  def dngettext(domain: String, msgid: String, msgidPlural: String, count: Double): String
  def dnpgettext(domain: String, msgctxt: String, msgid: String, msgidPlural: String, count: Double): String
  def dpgettext(domain: String, msgctxt: String, msgid: String): String
  def emit(eventName: String, eventData: js.Any): Unit
  def getComment(domain: String, msgctxt: String, msgid: String): js.Object | Boolean
  def gettext(msgid: String): String
  def ngettext(msgid: String, msgidPlural: String, count: Double): String
  def npgettext(msgctxt: String, msgid: String, msgidPlural: String, count: Double): String
  @JSName("off")
  def off_error(eventName: error, callback: js.Function1[/* error */ String, Unit]): Unit
  @JSName("on")
  def on_error(eventName: error, callback: js.Function1[/* error */ String, Unit]): Unit
  def pgettext(msgctxt: String, msgid: String): String
  def setLocale(locale: String): Unit
  def setTextDomain(domain: String): Unit
  def textdomain(domain: String): Unit
  def warn(message: String): Unit
}

object GetText {
  @scala.inline
  def apply(
    addTranslations: (String, String, js.Object) => Callback,
    dgettext: (String, String) => CallbackTo[String],
    dngettext: (String, String, String, Double) => CallbackTo[String],
    dnpgettext: (String, String, String, String, Double) => CallbackTo[String],
    dpgettext: (String, String, String) => CallbackTo[String],
    emit: (String, js.Any) => Callback,
    getComment: (String, String, String) => CallbackTo[js.Object | Boolean],
    gettext: String => CallbackTo[String],
    ngettext: (String, String, Double) => CallbackTo[String],
    npgettext: (String, String, String, Double) => CallbackTo[String],
    off: (error, js.Function1[/* error */ String, Unit]) => Callback,
    on: (error, js.Function1[/* error */ String, Unit]) => Callback,
    pgettext: (String, String) => CallbackTo[String],
    setLocale: String => Callback,
    setTextDomain: String => Callback,
    textdomain: String => Callback,
    warn: String => Callback
  ): GetText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addTranslations")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Object) => addTranslations(t0, t1, t2).runNow()))
    __obj.updateDynamic("dgettext")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => dgettext(t0, t1).runNow()))
    __obj.updateDynamic("dngettext")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: scala.Double) => dngettext(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("dnpgettext")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: scala.Double) => dnpgettext(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("dpgettext")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => dpgettext(t0, t1, t2).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("getComment")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => getComment(t0, t1, t2).runNow()))
    __obj.updateDynamic("gettext")(js.Any.fromFunction1((t0: java.lang.String) => gettext(t0).runNow()))
    __obj.updateDynamic("ngettext")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => ngettext(t0, t1, t2).runNow()))
    __obj.updateDynamic("npgettext")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: scala.Double) => npgettext(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: typingsJapgolly.nodeGettext.nodeGettextStrings.error, t1: js.Function1[/* error */ java.lang.String, scala.Unit]) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.nodeGettext.nodeGettextStrings.error, t1: js.Function1[/* error */ java.lang.String, scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("pgettext")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => pgettext(t0, t1).runNow()))
    __obj.updateDynamic("setLocale")(js.Any.fromFunction1((t0: java.lang.String) => setLocale(t0).runNow()))
    __obj.updateDynamic("setTextDomain")(js.Any.fromFunction1((t0: java.lang.String) => setTextDomain(t0).runNow()))
    __obj.updateDynamic("textdomain")(js.Any.fromFunction1((t0: java.lang.String) => textdomain(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.asInstanceOf[GetText]
  }
}

