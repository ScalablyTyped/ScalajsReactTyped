package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  def getContent(): String
  def getContentId(): String
  def getDisposition(): String
  def getFilename(): String
  def getType(): String
  def setContent(content: String): Unit
  def setContentId(contentId: String): Unit
  def setDisposition(disposition: String): Unit
  def setFilename(filename: String): Unit
  def setType(`type`: String): Unit
  def toJSON(): AnonContent
}

object Attachment {
  @scala.inline
  def apply(
    getContent: CallbackTo[String],
    getContentId: CallbackTo[String],
    getDisposition: CallbackTo[String],
    getFilename: CallbackTo[String],
    getType: CallbackTo[String],
    setContent: String => Callback,
    setContentId: String => Callback,
    setDisposition: String => Callback,
    setFilename: String => Callback,
    setType: String => Callback,
    toJSON: CallbackTo[AnonContent]
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("getContentId")(getContentId.toJsFn)
    __obj.updateDynamic("getDisposition")(getDisposition.toJsFn)
    __obj.updateDynamic("getFilename")(getFilename.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("setContent")(js.Any.fromFunction1((t0: java.lang.String) => setContent(t0).runNow()))
    __obj.updateDynamic("setContentId")(js.Any.fromFunction1((t0: java.lang.String) => setContentId(t0).runNow()))
    __obj.updateDynamic("setDisposition")(js.Any.fromFunction1((t0: java.lang.String) => setDisposition(t0).runNow()))
    __obj.updateDynamic("setFilename")(js.Any.fromFunction1((t0: java.lang.String) => setFilename(t0).runNow()))
    __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: java.lang.String) => setType(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Attachment]
  }
}

