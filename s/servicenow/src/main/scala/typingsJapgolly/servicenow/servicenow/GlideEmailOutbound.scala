package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideEmailOutbound extends js.Object {
  def addAddress(`type`: String, address: String, displayName: String): Unit
  def getSubject(): String
  def setBody(bodyText: String): Unit
  def setFrom(address: String): Unit
  def setReplyTo(address: String): Unit
  def setSubject(subject: String): Unit
}

object GlideEmailOutbound {
  @scala.inline
  def apply(
    addAddress: (String, String, String) => Callback,
    getSubject: CallbackTo[String],
    setBody: String => Callback,
    setFrom: String => Callback,
    setReplyTo: String => Callback,
    setSubject: String => Callback
  ): GlideEmailOutbound = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAddress")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => addAddress(t0, t1, t2).runNow()))
    __obj.updateDynamic("getSubject")(getSubject.toJsFn)
    __obj.updateDynamic("setBody")(js.Any.fromFunction1((t0: java.lang.String) => setBody(t0).runNow()))
    __obj.updateDynamic("setFrom")(js.Any.fromFunction1((t0: java.lang.String) => setFrom(t0).runNow()))
    __obj.updateDynamic("setReplyTo")(js.Any.fromFunction1((t0: java.lang.String) => setReplyTo(t0).runNow()))
    __obj.updateDynamic("setSubject")(js.Any.fromFunction1((t0: java.lang.String) => setSubject(t0).runNow()))
    __obj.asInstanceOf[GlideEmailOutbound]
  }
}

