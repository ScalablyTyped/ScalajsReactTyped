package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a bookmark.
  *
  *     // Insert a bookmark at the cursor position and log its ID.
  *     var doc = DocumentApp.getActiveDocument();
  *     var cursor = doc.getCursor();
  *     var bookmark = doc.addBookmark(cursor);
  *     Logger.log(bookmark.getId());
  */
trait Bookmark extends js.Object {
  def getId(): String
  def getPosition(): Position
  def remove(): Unit
}

object Bookmark {
  @scala.inline
  def apply(getId: CallbackTo[String], getPosition: CallbackTo[Position], remove: Callback): Bookmark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[Bookmark]
  }
}

