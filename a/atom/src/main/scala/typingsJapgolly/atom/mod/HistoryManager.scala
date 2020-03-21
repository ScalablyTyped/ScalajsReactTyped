package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.AnonReloaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryManager extends js.Object {
  /**
    *  Clear all projects from the history.
    *  Note: This is not a privacy function - other traces will still exist, e.g.
    *  window state.
    */
  def clearProjects(): Unit
  /** Obtain a list of previously opened projects. */
  def getProjects(): js.Array[ProjectHistory]
  /** Invoke the given callback when the list of projects changes. */
  def onDidChangeProjects(callback: js.Function1[/* args */ AnonReloaded, Unit]): Disposable
}

object HistoryManager {
  @scala.inline
  def apply(
    clearProjects: Callback,
    getProjects: CallbackTo[js.Array[ProjectHistory]],
    onDidChangeProjects: js.Function1[/* args */ AnonReloaded, Unit] => CallbackTo[Disposable]
  ): HistoryManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearProjects")(clearProjects.toJsFn)
    __obj.updateDynamic("getProjects")(getProjects.toJsFn)
    __obj.updateDynamic("onDidChangeProjects")(js.Any.fromFunction1((t0: js.Function1[/* args */ typingsJapgolly.atom.AnonReloaded, scala.Unit]) => onDidChangeProjects(t0).runNow()))
    __obj.asInstanceOf[HistoryManager]
  }
}

