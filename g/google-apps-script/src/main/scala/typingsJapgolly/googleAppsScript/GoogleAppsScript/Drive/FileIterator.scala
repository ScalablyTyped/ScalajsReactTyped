package typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An iterator that allows scripts to iterate over a potentially large collection of files. File
  * iterators can be acccessed from DriveApp or a Folder.
  *
  *     // Log the name of every file in the user's Drive.
  *     var files = DriveApp.getFiles();
  *     while (files.hasNext()) {
  *       var file = files.next();
  *       Logger.log(file.getName());
  *     }
  */
trait FileIterator extends js.Object {
  /**
    * Gets a token that can be used to resume this iteration at a later time.
    * This method is useful if processing an iterator in one execution would
    * exceed the maximum execution time. Continuation tokens are generally valid for one week.
    */
  def getContinuationToken(): String
  /** Determines whether calling next() will return an item. */
  def hasNext(): Boolean
  /**
    * Gets the next item in the collection of files or folders.
    * Throws an exception if no items remain.
    */
  def next(): File
}

object FileIterator {
  @scala.inline
  def apply(getContinuationToken: CallbackTo[String], hasNext: CallbackTo[Boolean], next: CallbackTo[File]): FileIterator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContinuationToken")(getContinuationToken.toJsFn)
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[FileIterator]
  }
}

