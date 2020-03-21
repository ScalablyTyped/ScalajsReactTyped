package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout item that displays an image. Items can be accessed or created from a Form.
  *
  *     // Open a form by ID and add a new image item
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var img = UrlFetchApp.fetch('https://www.google.com/images/srpr/logo4w.png');
  *     form.addImageItem()
  *         .setTitle('Google')
  *         .setHelpText('Google Logo') // The help text is the image description
  *         .setImage(img);
  */
trait ImageItem extends js.Object {
  def duplicate(): ImageItem
  def getAlignment(): Alignment
  def getHelpText(): String
  def getId(): Integer
  def getImage(): Blob
  def getIndex(): Integer
  def getTitle(): String
  def getType(): ItemType
  def getWidth(): Integer
  def setAlignment(alignment: Alignment): ImageItem
  def setHelpText(text: String): ImageItem
  def setImage(image: BlobSource): ImageItem
  def setTitle(title: String): ImageItem
  def setWidth(width: Integer): ImageItem
}

object ImageItem {
  @scala.inline
  def apply(
    duplicate: CallbackTo[ImageItem],
    getAlignment: CallbackTo[Alignment],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getImage: CallbackTo[Blob],
    getIndex: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    getWidth: CallbackTo[Integer],
    setAlignment: Alignment => CallbackTo[ImageItem],
    setHelpText: String => CallbackTo[ImageItem],
    setImage: BlobSource => CallbackTo[ImageItem],
    setTitle: String => CallbackTo[ImageItem],
    setWidth: Integer => CallbackTo[ImageItem]
  ): ImageItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duplicate")(duplicate.toJsFn)
    __obj.updateDynamic("getAlignment")(getAlignment.toJsFn)
    __obj.updateDynamic("getHelpText")(getHelpText.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getImage")(getImage.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("setAlignment")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.Alignment) => setAlignment(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setImage")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.BlobSource) => setImage(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setWidth(t0).runNow()))
    __obj.asInstanceOf[ImageItem]
  }
}

