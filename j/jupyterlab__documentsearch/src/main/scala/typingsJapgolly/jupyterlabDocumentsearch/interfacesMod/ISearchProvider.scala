package typingsJapgolly.jupyterlabDocumentsearch.interfacesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phosphorSignaling.mod.ISignal
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchProvider[T /* <: Widget */] extends js.Object {
  /**
    * Signal indicating that something in the search has changed, so the UI should update
    */
  val changed: ISignal[ISearchProvider[T], Unit]
  /**
    * The current index of the selected match.
    */
  val currentMatchIndex: Double | Null
  /**
    * Set to true if the widget under search is read-only, false
    * if it is editable.  Will be used to determine whether to show
    * the replace option.
    */
  val isReadOnly: Boolean
  /**
    * The same list of matches provided by the startQuery promise resoluton
    */
  val matches: js.Array[ISearchMatch]
  /**
    * Clears state of a search provider to prepare for startQuery to be called
    * in order to start a new query or refresh an existing one.
    *
    * @returns A promise that resolves when the search provider is ready to
    * begin a new search.
    */
  def endQuery(): js.Promise[Unit]
  /**
    * Resets UI state as it was before the search process began.  Cleans up and
    * disposes of all internal state.
    *
    * @returns A promise that resolves when all state has been cleaned up.
    */
  def endSearch(): js.Promise[Unit]
  /**
    * Get an initial query value if applicable so that it can be entered
    * into the search box as an initial query
    *
    * @param searchTarget The widget to be searched
    *
    * @returns Initial value used to populate the search box.
    */
  def getInitialQuery(searchTarget: T): js.Any
  /**
    * Move the current match indicator to the next match.
    *
    * @returns A promise that resolves once the action has completed.
    */
  def highlightNext(): js.Promise[js.UndefOr[ISearchMatch]]
  /**
    * Move the current match indicator to the previous match.
    *
    * @returns A promise that resolves once the action has completed.
    */
  def highlightPrevious(): js.Promise[js.UndefOr[ISearchMatch]]
  /**
    * Replace all matches in the notebook with the provided text
    *
    * @returns A promise that resolves with a boolean indicating whether a replace occurred.
    */
  def replaceAllMatches(newText: String): js.Promise[Boolean]
  /**
    * Replace the currently selected match with the provided text
    *
    * @returns A promise that resolves with a boolean indicating whether a replace occurred.
    */
  def replaceCurrentMatch(newText: String): js.Promise[Boolean]
  /**
    * Initialize the search using the provided options.  Should update the UI
    * to highlight all matches and "select" whatever the first match should be.
    *
    * @param query A RegExp to be use to perform the search
    * @param searchTarget The widget to be searched
    *
    * @returns A promise that resolves with a list of all matches
    */
  def startQuery(query: js.RegExp, searchTarget: T): js.Promise[js.Array[ISearchMatch]]
}

object ISearchProvider {
  @scala.inline
  def apply[T /* <: Widget */](
    changed: ISignal[ISearchProvider[T], Unit],
    endQuery: CallbackTo[js.Promise[Unit]],
    endSearch: CallbackTo[js.Promise[Unit]],
    getInitialQuery: T => CallbackTo[js.Any],
    highlightNext: CallbackTo[js.Promise[js.UndefOr[ISearchMatch]]],
    highlightPrevious: CallbackTo[js.Promise[js.UndefOr[ISearchMatch]]],
    isReadOnly: Boolean,
    matches: js.Array[ISearchMatch],
    replaceAllMatches: String => CallbackTo[js.Promise[Boolean]],
    replaceCurrentMatch: String => CallbackTo[js.Promise[Boolean]],
    startQuery: (js.RegExp, T) => CallbackTo[js.Promise[js.Array[ISearchMatch]]],
    currentMatchIndex: Int | Double = null
  ): ISearchProvider[T] = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.updateDynamic("endQuery")(endQuery.toJsFn)
    __obj.updateDynamic("endSearch")(endSearch.toJsFn)
    __obj.updateDynamic("getInitialQuery")(js.Any.fromFunction1((t0: T) => getInitialQuery(t0).runNow()))
    __obj.updateDynamic("highlightNext")(highlightNext.toJsFn)
    __obj.updateDynamic("highlightPrevious")(highlightPrevious.toJsFn)
    __obj.updateDynamic("replaceAllMatches")(js.Any.fromFunction1((t0: java.lang.String) => replaceAllMatches(t0).runNow()))
    __obj.updateDynamic("replaceCurrentMatch")(js.Any.fromFunction1((t0: java.lang.String) => replaceCurrentMatch(t0).runNow()))
    __obj.updateDynamic("startQuery")(js.Any.fromFunction2((t0: js.RegExp, t1: T) => startQuery(t0, t1).runNow()))
    if (currentMatchIndex != null) __obj.updateDynamic("currentMatchIndex")(currentMatchIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchProvider[T]]
  }
}

