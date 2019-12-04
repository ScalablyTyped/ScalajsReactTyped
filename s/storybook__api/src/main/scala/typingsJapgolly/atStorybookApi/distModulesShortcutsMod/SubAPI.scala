package typingsJapgolly.atStorybookApi.distModulesShortcutsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atStorybookApi.atStorybookApiMod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getShortcutKeys(): Shortcuts
  def handleKeydownEvent(api: API, event: Event): Unit
  def handleShortcutFeature(api: API, feature: Action): Unit
  def restoreAllDefaultShortcuts(): js.Promise[Shortcuts]
  def restoreDefaultShortcut(action: Action): js.Promise[KeyCollection]
  def setShortcut(action: Action, value: KeyCollection): js.Promise[KeyCollection]
  def setShortcuts(shortcuts: Shortcuts): js.Promise[Shortcuts]
}

object SubAPI {
  @scala.inline
  def apply(
    getShortcutKeys: CallbackTo[Shortcuts],
    handleKeydownEvent: (API, Event) => Callback,
    handleShortcutFeature: (API, Action) => Callback,
    restoreAllDefaultShortcuts: CallbackTo[js.Promise[Shortcuts]],
    restoreDefaultShortcut: Action => CallbackTo[js.Promise[KeyCollection]],
    setShortcut: (Action, KeyCollection) => CallbackTo[js.Promise[KeyCollection]],
    setShortcuts: Shortcuts => CallbackTo[js.Promise[Shortcuts]]
  ): SubAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getShortcutKeys")(getShortcutKeys.toJsFn)
    __obj.updateDynamic("handleKeydownEvent")(js.Any.fromFunction2((t0: typingsJapgolly.atStorybookApi.atStorybookApiMod.API, t1: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Event) => handleKeydownEvent(t0, t1).runNow()))
    __obj.updateDynamic("handleShortcutFeature")(js.Any.fromFunction2((t0: typingsJapgolly.atStorybookApi.atStorybookApiMod.API, t1: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Action) => handleShortcutFeature(t0, t1).runNow()))
    __obj.updateDynamic("restoreAllDefaultShortcuts")(restoreAllDefaultShortcuts.toJsFn)
    __obj.updateDynamic("restoreDefaultShortcut")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Action) => restoreDefaultShortcut(t0).runNow()))
    __obj.updateDynamic("setShortcut")(js.Any.fromFunction2((t0: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Action, t1: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.KeyCollection) => setShortcut(t0, t1).runNow()))
    __obj.updateDynamic("setShortcuts")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Shortcuts) => setShortcuts(t0).runNow()))
    __obj.asInstanceOf[SubAPI]
  }
}

