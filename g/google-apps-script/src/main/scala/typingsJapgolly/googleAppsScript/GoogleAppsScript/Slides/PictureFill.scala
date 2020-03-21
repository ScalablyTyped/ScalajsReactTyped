package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A fill that renders an image that's stretched to the dimensions of its container.
  */
trait PictureFill extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getContentUrl(): String
  def getSourceUrl(): String
}

object PictureFill {
  @scala.inline
  def apply(
    getAs: String => CallbackTo[Blob],
    getBlob: CallbackTo[Blob],
    getContentUrl: CallbackTo[String],
    getSourceUrl: CallbackTo[String]
  ): PictureFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(js.Any.fromFunction1((t0: java.lang.String) => getAs(t0).runNow()))
    __obj.updateDynamic("getBlob")(getBlob.toJsFn)
    __obj.updateDynamic("getContentUrl")(getContentUrl.toJsFn)
    __obj.updateDynamic("getSourceUrl")(getSourceUrl.toJsFn)
    __obj.asInstanceOf[PictureFill]
  }
}

