package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout item that displays a video. Items can be accessed or created from a Form.
  *
  *     // Open a form by ID and add three new video items, using a long URL,
  *     // a short URL, and a video ID.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('www.youtube.com/watch?v=1234abcdxyz');
  *
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('youtu.be/1234abcdxyz');
  *
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('1234abcdxyz');
  */
trait VideoItem extends js.Object {
  def duplicate(): VideoItem
  def getAlignment(): Alignment
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getTitle(): String
  def getType(): ItemType
  def getWidth(): Integer
  def setAlignment(alignment: Alignment): VideoItem
  def setHelpText(text: String): VideoItem
  def setTitle(title: String): VideoItem
  def setVideoUrl(youtubeUrl: String): VideoItem
  def setWidth(width: Integer): VideoItem
}

object VideoItem {
  @scala.inline
  def apply(
    duplicate: CallbackTo[VideoItem],
    getAlignment: CallbackTo[Alignment],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    getWidth: CallbackTo[Integer],
    setAlignment: Alignment => CallbackTo[VideoItem],
    setHelpText: String => CallbackTo[VideoItem],
    setTitle: String => CallbackTo[VideoItem],
    setVideoUrl: String => CallbackTo[VideoItem],
    setWidth: Integer => CallbackTo[VideoItem]
  ): VideoItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duplicate")(duplicate.toJsFn)
    __obj.updateDynamic("getAlignment")(getAlignment.toJsFn)
    __obj.updateDynamic("getHelpText")(getHelpText.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("setAlignment")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.Alignment) => setAlignment(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setVideoUrl")(js.Any.fromFunction1((t0: java.lang.String) => setVideoUrl(t0).runNow()))
    __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setWidth(t0).runNow()))
    __obj.asInstanceOf[VideoItem]
  }
}

