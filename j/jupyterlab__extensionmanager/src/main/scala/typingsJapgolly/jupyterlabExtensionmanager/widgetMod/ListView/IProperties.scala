package typingsJapgolly.jupyterlabExtensionmanager.widgetMod.ListView

import japgolly.scalajs.react.Callback
import typingsJapgolly.jupyterlabExtensionmanager.modelMod.Action
import typingsJapgolly.jupyterlabExtensionmanager.modelMod.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperties extends js.Object {
  /**
    * The extension entries to display.
    */
  var entries: js.Array[IEntry]
  /**
    * The number of pages that can be viewed via pagination.
    */
  var numPages: Double
  /**
    * The callback to use for changing the page
    */
  def onPage(page: Double): Unit
  /**
    * Callback to use for performing an action on an entry.
    */
  def performAction(action: Action, entry: IEntry): Unit
}

object IProperties {
  @scala.inline
  def apply(
    entries: js.Array[IEntry],
    numPages: Double,
    onPage: Double => Callback,
    performAction: (Action, IEntry) => Callback
  ): IProperties = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
    __obj.updateDynamic("onPage")(js.Any.fromFunction1((t0: scala.Double) => onPage(t0).runNow()))
    __obj.updateDynamic("performAction")(js.Any.fromFunction2((t0: typingsJapgolly.jupyterlabExtensionmanager.modelMod.Action, t1: typingsJapgolly.jupyterlabExtensionmanager.modelMod.IEntry) => performAction(t0, t1).runNow()))
    __obj.asInstanceOf[IProperties]
  }
}

