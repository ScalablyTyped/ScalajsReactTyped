package typingsJapgolly.chrome

import typingsJapgolly.chrome.chrome.bookmarks.BookmarkChangedEvent
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkChangesArg
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkChildrenReordered
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkCreateArg
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkCreatedEvent
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkDestinationArg
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkImportBeganEvent
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkImportEndedEvent
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkMovedEvent
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkRemovedEvent
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkSearchQuery
import typingsJapgolly.chrome.chrome.bookmarks.BookmarkTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofbookmarks extends js.Object {
  var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
  var MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
  var onChanged: BookmarkChangedEvent = js.native
  var onChildrenReordered: BookmarkChildrenReordered = js.native
  var onCreated: BookmarkCreatedEvent = js.native
  var onImportBegan: BookmarkImportBeganEvent = js.native
  var onImportEnded: BookmarkImportEndedEvent = js.native
  var onMoved: BookmarkMovedEvent = js.native
  var onRemoved: BookmarkRemovedEvent = js.native
  def create(bookmark: BookmarkCreateArg): Unit = js.native
  def create(bookmark: BookmarkCreateArg, callback: js.Function1[/* result */ BookmarkTreeNode, Unit]): Unit = js.native
  def get(idList: js.Array[String], callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def get(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def getChildren(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def getRecent(numberOfItems: Double, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def getSubTree(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def getTree(callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def move(id: String, destination: BookmarkDestinationArg): Unit = js.native
  def move(
    id: String,
    destination: BookmarkDestinationArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
  def remove(id: String): Unit = js.native
  def remove(id: String, callback: js.Function): Unit = js.native
  def removeTree(id: String): Unit = js.native
  def removeTree(id: String, callback: js.Function): Unit = js.native
  def search(query: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def search(query: BookmarkSearchQuery, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def update(id: String, changes: BookmarkChangesArg): Unit = js.native
  def update(
    id: String,
    changes: BookmarkChangesArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
}

