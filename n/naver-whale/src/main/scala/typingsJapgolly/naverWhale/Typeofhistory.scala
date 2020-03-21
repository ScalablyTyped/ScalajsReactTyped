package typingsJapgolly.naverWhale

import typingsJapgolly.chrome.chrome.history.HistoryItem
import typingsJapgolly.chrome.chrome.history.HistoryQuery
import typingsJapgolly.chrome.chrome.history.HistoryVisitRemovedEvent
import typingsJapgolly.chrome.chrome.history.HistoryVisitedEvent
import typingsJapgolly.chrome.chrome.history.Range
import typingsJapgolly.chrome.chrome.history.Url
import typingsJapgolly.chrome.chrome.history.VisitItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofhistory extends js.Object {
  var onVisitRemoved: HistoryVisitRemovedEvent = js.native
  var onVisited: HistoryVisitedEvent = js.native
  def addUrl(details: Url): Unit = js.native
  def addUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  def deleteAll(callback: js.Function0[Unit]): Unit = js.native
  def deleteRange(range: Range, callback: js.Function0[Unit]): Unit = js.native
  def deleteUrl(details: Url): Unit = js.native
  def deleteUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  def getVisits(details: Url, callback: js.Function1[/* results */ js.Array[VisitItem], Unit]): Unit = js.native
  def search(query: HistoryQuery, callback: js.Function1[/* results */ js.Array[HistoryItem], Unit]): Unit = js.native
}

