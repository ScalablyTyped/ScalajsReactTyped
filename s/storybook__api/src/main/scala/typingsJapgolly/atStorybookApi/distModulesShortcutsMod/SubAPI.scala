package typingsJapgolly.atStorybookApi.distModulesShortcutsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getShortcutKeys(): Shortcuts
  def handleKeydownEvent(
    api: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any,
    event: Event
  ): Unit
  def handleShortcutFeature(
    api: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any,
    feature: Action
  ): Unit
  def restoreAllDefaultShortcuts(): js.Promise[Shortcuts]
  def restoreDefaultShortcut(action: Action): js.Promise[KeyCollection]
  def setShortcut(action: Action, value: KeyCollection): js.Promise[KeyCollection]
  def setShortcuts(shortcuts: Shortcuts): js.Promise[Shortcuts]
}

object SubAPI {
  @scala.inline
  def apply(
    getShortcutKeys: CallbackTo[Shortcuts],
    handleKeydownEvent: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any, Event) => Callback,
    handleShortcutFeature: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any, Action) => Callback,
    restoreAllDefaultShortcuts: CallbackTo[js.Promise[Shortcuts]],
    restoreDefaultShortcut: Action => CallbackTo[js.Promise[KeyCollection]],
    setShortcut: (Action, KeyCollection) => CallbackTo[js.Promise[KeyCollection]],
    setShortcuts: Shortcuts => CallbackTo[js.Promise[Shortcuts]]
  ): SubAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getShortcutKeys")(getShortcutKeys.toJsFn)
    __obj.updateDynamic("handleKeydownEvent")(js.Any.fromFunction2((t0: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any, t1: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Event) => handleKeydownEvent(t0, t1).runNow()))
    __obj.updateDynamic("handleShortcutFeature")(js.Any.fromFunction2((t0: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any, t1: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Action) => handleShortcutFeature(t0, t1).runNow()))
    __obj.updateDynamic("restoreAllDefaultShortcuts")(restoreAllDefaultShortcuts.toJsFn)
    __obj.updateDynamic("restoreDefaultShortcut")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Action) => restoreDefaultShortcut(t0).runNow()))
    __obj.updateDynamic("setShortcut")(js.Any.fromFunction2((t0: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Action, t1: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.KeyCollection) => setShortcut(t0, t1).runNow()))
    __obj.updateDynamic("setShortcuts")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Shortcuts) => setShortcuts(t0).runNow()))
    __obj.asInstanceOf[SubAPI]
  }
}

