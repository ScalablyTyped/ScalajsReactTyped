package typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that allows scripts to iterate over a potentially large collection of folders. Folder
  * iterators can be acccessed from DriveApp, a File, or a Folder.
  *
  *     // Log the name of every folder in the user's Drive.
  *     var folders = DriveApp.getFolders();
  *     while (folders.hasNext()) {
  *       var folder = folders.next();
  *       Logger.log(folder.getName());
  *     }
  */
trait FolderIterator extends js.Object {
  def getContinuationToken(): String
  def hasNext(): Boolean
  def next(): Folder
}

object FolderIterator {
  @scala.inline
  def apply(getContinuationToken: CallbackTo[String], hasNext: CallbackTo[Boolean], next: CallbackTo[Folder]): FolderIterator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContinuationToken")(getContinuationToken.toJsFn)
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[FolderIterator]
  }
}

