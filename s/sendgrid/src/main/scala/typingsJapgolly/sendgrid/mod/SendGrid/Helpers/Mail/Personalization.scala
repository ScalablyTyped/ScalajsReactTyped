package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sendgrid.AnonCc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Personalization extends js.Object {
  def addBcc(email: Email): Unit
  def addCc(email: Email): Unit
  def addCustomArg(substitution: CustomArgs): Unit
  def addHeader(header: Header): Unit
  def addSubstitution(substitution: Substitution): Unit
  def addTo(email: Email): Unit
  def getBccs(): js.Array[Email]
  def getCcs(): js.Array[Email]
  def getCustomArgs(): js.Array[CustomArgs]
  def getHeaders(): js.Array[Header]
  def getSendAt(): Double
  def getSubject(): String
  def getSubstitutions(): StringDictionary[String]
  def getTos(): js.Array[Email]
  def setSendAt(sendAt: Double): Unit
  def setSubject(subject: String): Unit
  def toJSON(): AnonCc
}

object Personalization {
  @scala.inline
  def apply(
    addBcc: Email => Callback,
    addCc: Email => Callback,
    addCustomArg: CustomArgs => Callback,
    addHeader: Header => Callback,
    addSubstitution: Substitution => Callback,
    addTo: Email => Callback,
    getBccs: CallbackTo[js.Array[Email]],
    getCcs: CallbackTo[js.Array[Email]],
    getCustomArgs: CallbackTo[js.Array[CustomArgs]],
    getHeaders: CallbackTo[js.Array[Header]],
    getSendAt: CallbackTo[Double],
    getSubject: CallbackTo[String],
    getSubstitutions: CallbackTo[StringDictionary[String]],
    getTos: CallbackTo[js.Array[Email]],
    setSendAt: Double => Callback,
    setSubject: String => Callback,
    toJSON: CallbackTo[AnonCc]
  ): Personalization = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addBcc")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Email) => addBcc(t0).runNow()))
    __obj.updateDynamic("addCc")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Email) => addCc(t0).runNow()))
    __obj.updateDynamic("addCustomArg")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.CustomArgs) => addCustomArg(t0).runNow()))
    __obj.updateDynamic("addHeader")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Header) => addHeader(t0).runNow()))
    __obj.updateDynamic("addSubstitution")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Substitution) => addSubstitution(t0).runNow()))
    __obj.updateDynamic("addTo")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Email) => addTo(t0).runNow()))
    __obj.updateDynamic("getBccs")(getBccs.toJsFn)
    __obj.updateDynamic("getCcs")(getCcs.toJsFn)
    __obj.updateDynamic("getCustomArgs")(getCustomArgs.toJsFn)
    __obj.updateDynamic("getHeaders")(getHeaders.toJsFn)
    __obj.updateDynamic("getSendAt")(getSendAt.toJsFn)
    __obj.updateDynamic("getSubject")(getSubject.toJsFn)
    __obj.updateDynamic("getSubstitutions")(getSubstitutions.toJsFn)
    __obj.updateDynamic("getTos")(getTos.toJsFn)
    __obj.updateDynamic("setSendAt")(js.Any.fromFunction1((t0: scala.Double) => setSendAt(t0).runNow()))
    __obj.updateDynamic("setSubject")(js.Any.fromFunction1((t0: java.lang.String) => setSubject(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Personalization]
  }
}

