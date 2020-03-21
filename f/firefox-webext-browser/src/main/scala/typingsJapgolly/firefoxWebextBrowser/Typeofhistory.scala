package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.history.HistoryItem
import typingsJapgolly.firefoxWebextBrowser.browser.history.VisitItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhistory extends js.Object {
  /** Fired when the title of a URL is changed in the browser history. */
  val onTitleChanged: WebExtEvent[js.Function1[/* changed */ AnonTitleString, Unit]]
  /**
    * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is
    * purged from history.
    */
  val onVisitRemoved: WebExtEvent[js.Function1[/* removed */ AnonAllHistory, Unit]]
  /* history events */
  /**
    * Fired when a URL is visited, providing the HistoryItem data for that URL. This event fires before the page has
    * loaded.
    */
  val onVisited: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]]
  /**
    * Adds a URL to the history with a default visitTime of the current time and a default transition type of "link".
    */
  def addUrl(details: AnonTransition): js.Promise[Unit]
  /** Deletes all items from the history. */
  def deleteAll(): js.Promise[Unit]
  /**
    * Removes all items within the specified date range from the history. Pages will not be removed from the history
    * unless all visits fall within the range.
    */
  def deleteRange(range: AnonStartTime): js.Promise[Unit]
  /** Removes all occurrences of the given URL from the history. */
  def deleteUrl(details: AnonUrlString): js.Promise[Unit]
  /** Retrieves information about visits to a URL. */
  def getVisits(details: AnonUrlString): js.Promise[js.Array[VisitItem]]
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  def search(query: AnonEndTime): js.Promise[js.Array[HistoryItem]]
}

object Typeofhistory {
  @scala.inline
  def apply(
    addUrl: AnonTransition => CallbackTo[js.Promise[Unit]],
    deleteAll: CallbackTo[js.Promise[Unit]],
    deleteRange: AnonStartTime => CallbackTo[js.Promise[Unit]],
    deleteUrl: AnonUrlString => CallbackTo[js.Promise[Unit]],
    getVisits: AnonUrlString => CallbackTo[js.Promise[js.Array[VisitItem]]],
    onTitleChanged: WebExtEvent[js.Function1[/* changed */ AnonTitleString, Unit]],
    onVisitRemoved: WebExtEvent[js.Function1[/* removed */ AnonAllHistory, Unit]],
    onVisited: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]],
    search: AnonEndTime => CallbackTo[js.Promise[js.Array[HistoryItem]]]
  ): Typeofhistory = {
    val __obj = js.Dynamic.literal(onTitleChanged = onTitleChanged.asInstanceOf[js.Any], onVisitRemoved = onVisitRemoved.asInstanceOf[js.Any], onVisited = onVisited.asInstanceOf[js.Any])
    __obj.updateDynamic("addUrl")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonTransition) => addUrl(t0).runNow()))
    __obj.updateDynamic("deleteAll")(deleteAll.toJsFn)
    __obj.updateDynamic("deleteRange")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonStartTime) => deleteRange(t0).runNow()))
    __obj.updateDynamic("deleteUrl")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonUrlString) => deleteUrl(t0).runNow()))
    __obj.updateDynamic("getVisits")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonUrlString) => getVisits(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonEndTime) => search(t0).runNow()))
    __obj.asInstanceOf[Typeofhistory]
  }
}

