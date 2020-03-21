package typingsJapgolly.jupyterlabObservables.modeldbMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typingsJapgolly.jupyterlabObservables.observablemapMod.IObservableMap
import typingsJapgolly.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollaboratorMap extends IObservableMap[ICollaborator] {
  /**
    * The local collaborator on a model.
    */
  val localCollaborator: ICollaborator
}

object ICollaboratorMap {
  @scala.inline
  def apply(
    changed: ISignal[ICollaboratorMap, IChangedArgs[ICollaborator]],
    clear: Callback,
    delete: String => CallbackTo[js.UndefOr[ICollaborator]],
    dispose: Callback,
    get: String => CallbackTo[js.UndefOr[ICollaborator]],
    has: String => CallbackTo[Boolean],
    isDisposed: Boolean,
    keys: CallbackTo[js.Array[String]],
    localCollaborator: ICollaborator,
    set: (String, ICollaborator) => CallbackTo[js.UndefOr[ICollaborator]],
    size: Double,
    `type`: Map,
    values: CallbackTo[js.Array[ICollaborator]]
  ): ICollaboratorMap = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], localCollaborator = localCollaborator.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.jupyterlabObservables.modeldbMod.ICollaborator) => set(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[ICollaboratorMap]
  }
}

