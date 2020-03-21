package typingsJapgolly.sharepoint.SP.UI.ApplicationPages

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISelectorComponent extends js.Object {
  def get_callback(): js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]
  def get_componentType(): SelectorType
  def get_scopeKey(): String
  def get_selectedEntities(): js.Any
  def removeEntity(ent: ResolveEntity): Unit
  def revertTo(ent: ResolveEntity): Unit
  def setEntity(ent: ResolveEntity): Unit
  def set_callback(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit
  def set_selectedEntities(value: js.Any): Unit
}

object ISelectorComponent {
  @scala.inline
  def apply(
    get_callback: CallbackTo[js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]],
    get_componentType: CallbackTo[SelectorType],
    get_scopeKey: CallbackTo[String],
    get_selectedEntities: CallbackTo[js.Any],
    removeEntity: ResolveEntity => Callback,
    revertTo: ResolveEntity => Callback,
    setEntity: ResolveEntity => Callback,
    set_callback: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Callback,
    set_selectedEntities: js.Any => Callback
  ): ISelectorComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get_callback")(get_callback.toJsFn)
    __obj.updateDynamic("get_componentType")(get_componentType.toJsFn)
    __obj.updateDynamic("get_scopeKey")(get_scopeKey.toJsFn)
    __obj.updateDynamic("get_selectedEntities")(get_selectedEntities.toJsFn)
    __obj.updateDynamic("removeEntity")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.UI.ApplicationPages.ResolveEntity) => removeEntity(t0).runNow()))
    __obj.updateDynamic("revertTo")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.UI.ApplicationPages.ResolveEntity) => revertTo(t0).runNow()))
    __obj.updateDynamic("setEntity")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.UI.ApplicationPages.ResolveEntity) => setEntity(t0).runNow()))
    __obj.updateDynamic("set_callback")(js.Any.fromFunction1((t0: js.Function2[/* sender */ js.Any, /* e */ typingsJapgolly.microsoftAjax.Sys.EventArgs, scala.Unit]) => set_callback(t0).runNow()))
    __obj.updateDynamic("set_selectedEntities")(js.Any.fromFunction1((t0: js.Any) => set_selectedEntities(t0).runNow()))
    __obj.asInstanceOf[ISelectorComponent]
  }
}

