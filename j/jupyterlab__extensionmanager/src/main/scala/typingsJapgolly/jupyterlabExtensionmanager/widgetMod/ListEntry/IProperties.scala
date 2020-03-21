package typingsJapgolly.jupyterlabExtensionmanager.widgetMod.ListEntry

import japgolly.scalajs.react.Callback
import typingsJapgolly.jupyterlabExtensionmanager.modelMod.Action
import typingsJapgolly.jupyterlabExtensionmanager.modelMod.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperties extends js.Object {
  /**
    * The entry to visualize.
    */
  var entry: IEntry
  /**
    * Callback to use for performing an action on the entry.
    */
  def performAction(action: Action, entry: IEntry): Unit
}

object IProperties {
  @scala.inline
  def apply(entry: IEntry, performAction: (Action, IEntry) => Callback): IProperties = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.updateDynamic("performAction")(js.Any.fromFunction2((t0: typingsJapgolly.jupyterlabExtensionmanager.modelMod.Action, t1: typingsJapgolly.jupyterlabExtensionmanager.modelMod.IEntry) => performAction(t0, t1).runNow()))
    __obj.asInstanceOf[IProperties]
  }
}

