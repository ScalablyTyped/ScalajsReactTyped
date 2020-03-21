package typingsJapgolly.sanitizer.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISaxHandler extends js.Object {
  def cdata(text: String, param: js.Any): Unit
  def comment(text: String, param: js.Any): Unit
  def endDoc(param: js.Any): Unit
  def endTag(name: String, param: js.Any): Unit
  def pcdata(text: String, param: js.Any): Unit
  def rcdata(text: String, param: js.Any): Unit
  def startDoc(param: js.Any): Unit
  def startTag(name: String, attribs: js.Array[String], param: js.Any): Unit
}

object ISaxHandler {
  @scala.inline
  def apply(
    cdata: (String, js.Any) => Callback,
    comment: (String, js.Any) => Callback,
    endDoc: js.Any => Callback,
    endTag: (String, js.Any) => Callback,
    pcdata: (String, js.Any) => Callback,
    rcdata: (String, js.Any) => Callback,
    startDoc: js.Any => Callback,
    startTag: (String, js.Array[String], js.Any) => Callback
  ): ISaxHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cdata")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => cdata(t0, t1).runNow()))
    __obj.updateDynamic("comment")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => comment(t0, t1).runNow()))
    __obj.updateDynamic("endDoc")(js.Any.fromFunction1((t0: js.Any) => endDoc(t0).runNow()))
    __obj.updateDynamic("endTag")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => endTag(t0, t1).runNow()))
    __obj.updateDynamic("pcdata")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => pcdata(t0, t1).runNow()))
    __obj.updateDynamic("rcdata")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => rcdata(t0, t1).runNow()))
    __obj.updateDynamic("startDoc")(js.Any.fromFunction1((t0: js.Any) => startDoc(t0).runNow()))
    __obj.updateDynamic("startTag")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Array[java.lang.String], t2: js.Any) => startTag(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISaxHandler]
  }
}

