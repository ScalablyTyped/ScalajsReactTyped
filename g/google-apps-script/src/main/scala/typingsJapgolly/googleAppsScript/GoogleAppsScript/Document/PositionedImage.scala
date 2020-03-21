package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fixed position image anchored to a Paragraph. Unlike an InlineImage, a PositionedImage is
  * not an Element. It does not have a
  * parent or sibling Element. Instead,
  * it is anchored to a Paragraph or ListItem, and is placed via offsets from
  * that anchor. A PositionedImage has an ID that can be used to reference it.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Append a new paragraph.
  *     var paragraph = body.appendParagraph("New paragraph to anchor the image to.");
  *     *
  *     // Get an image in Drive from its ID.
  *     var image = DriveApp.getFileById('ENTER_IMAGE_FILE_ID_HERE').getBlob();
  *
  *     // Add the PositionedImage with offsets (in points).
  *     var posImage = paragraph.addPositionedImage(image)
  *         .setTopOffset(60)
  *         .setLeftOffset(40);
  */
trait PositionedImage extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getHeight(): Integer
  def getId(): String
  def getLayout(): PositionedLayout
  def getLeftOffset(): Double
  def getParagraph(): Paragraph
  def getTopOffset(): Double
  def getWidth(): Integer
  def setHeight(height: Integer): PositionedImage
  def setLayout(layout: PositionedLayout): PositionedImage
  def setLeftOffset(offset: Double): PositionedImage
  def setTopOffset(offset: Double): PositionedImage
  def setWidth(width: Integer): PositionedImage
}

object PositionedImage {
  @scala.inline
  def apply(
    getAs: String => CallbackTo[Blob],
    getBlob: CallbackTo[Blob],
    getHeight: CallbackTo[Integer],
    getId: CallbackTo[String],
    getLayout: CallbackTo[PositionedLayout],
    getLeftOffset: CallbackTo[Double],
    getParagraph: CallbackTo[Paragraph],
    getTopOffset: CallbackTo[Double],
    getWidth: CallbackTo[Integer],
    setHeight: Integer => CallbackTo[PositionedImage],
    setLayout: PositionedLayout => CallbackTo[PositionedImage],
    setLeftOffset: Double => CallbackTo[PositionedImage],
    setTopOffset: Double => CallbackTo[PositionedImage],
    setWidth: Integer => CallbackTo[PositionedImage]
  ): PositionedImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(js.Any.fromFunction1((t0: java.lang.String) => getAs(t0).runNow()))
    __obj.updateDynamic("getBlob")(getBlob.toJsFn)
    __obj.updateDynamic("getHeight")(getHeight.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getLayout")(getLayout.toJsFn)
    __obj.updateDynamic("getLeftOffset")(getLeftOffset.toJsFn)
    __obj.updateDynamic("getParagraph")(getParagraph.toJsFn)
    __obj.updateDynamic("getTopOffset")(getTopOffset.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setHeight(t0).runNow()))
    __obj.updateDynamic("setLayout")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Document.PositionedLayout) => setLayout(t0).runNow()))
    __obj.updateDynamic("setLeftOffset")(js.Any.fromFunction1((t0: scala.Double) => setLeftOffset(t0).runNow()))
    __obj.updateDynamic("setTopOffset")(js.Any.fromFunction1((t0: scala.Double) => setTopOffset(t0).runNow()))
    __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setWidth(t0).runNow()))
    __obj.asInstanceOf[PositionedImage]
  }
}

