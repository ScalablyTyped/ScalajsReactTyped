package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewZoneChangeAccessor extends js.Object {
  /**
    * Create a new view zone.
    * @param zone Zone to create
    * @return A unique identifier to the view zone.
    */
  def addZone(zone: IViewZone): String
  /**
    * Change a zone's position.
    * The editor will rescan the `afterLineNumber` and `afterColumn` properties of a view zone.
    */
  def layoutZone(id: String): Unit
  /**
    * Remove a zone
    * @param id A unique identifier to the view zone, as returned by the `addZone` call.
    */
  def removeZone(id: String): Unit
}

object IViewZoneChangeAccessor {
  @scala.inline
  def apply(
    addZone: IViewZone => CallbackTo[String],
    layoutZone: String => Callback,
    removeZone: String => Callback
  ): IViewZoneChangeAccessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addZone")(js.Any.fromFunction1((t0: typingsJapgolly.monacoEditor.mod.editor.IViewZone) => addZone(t0).runNow()))
    __obj.updateDynamic("layoutZone")(js.Any.fromFunction1((t0: java.lang.String) => layoutZone(t0).runNow()))
    __obj.updateDynamic("removeZone")(js.Any.fromFunction1((t0: java.lang.String) => removeZone(t0).runNow()))
    __obj.asInstanceOf[IViewZoneChangeAccessor]
  }
}

