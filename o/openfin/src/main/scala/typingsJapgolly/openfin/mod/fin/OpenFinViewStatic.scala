package typingsJapgolly.openfin.mod.fin

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinViewStatic extends js.Object {
  /**
    * Creates a new View.
    * @param { View~options } options - View creation options
    * @return {Promise.<View>}
    * @tutorial View.create
    * @experimental
    * @static
    */
  def create(options: ViewCreationOptions): js.Promise[View]
  /**
    * Asynchronously returns a View object that represents the current view
    * @return {Promise.<View>}
    * @tutorial View.getCurrent
    * @experimental
    * @static
    */
  def getCurrent(): js.Promise[View]
  /**
    * Synchronously returns a View object that represents the current view
    * @return {View}
    * @tutorial View.getCurrentSync
    * @experimental
    * @static
    */
  def getCurrentSync(): View
  /**
    * Asynchronously returns a View object that represents an existing view.
    * @param { Identity } identity
    * @return {Promise.<View>}
    * @tutorial View.wrap
    * @experimental
    * @static
    */
  def wrap(identity: Identity): js.Promise[View]
  /**
    * Synchronously returns a View object that represents an existing view.
    * @param { Identity } identity
    * @return {View}
    * @tutorial View.wrapSync
    * @experimental
    * @static
    */
  def wrapSync(identity: Identity): View
}

object OpenFinViewStatic {
  @scala.inline
  def apply(
    create: ViewCreationOptions => CallbackTo[js.Promise[View]],
    getCurrent: CallbackTo[js.Promise[View]],
    getCurrentSync: CallbackTo[View],
    wrap: Identity => CallbackTo[js.Promise[View]],
    wrapSync: Identity => CallbackTo[View]
  ): OpenFinViewStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.openfin.mod.fin.ViewCreationOptions) => create(t0).runNow()))
    __obj.updateDynamic("getCurrent")(getCurrent.toJsFn)
    __obj.updateDynamic("getCurrentSync")(getCurrentSync.toJsFn)
    __obj.updateDynamic("wrap")(js.Any.fromFunction1((t0: typingsJapgolly.openfin.mod.fin.Identity) => wrap(t0).runNow()))
    __obj.updateDynamic("wrapSync")(js.Any.fromFunction1((t0: typingsJapgolly.openfin.mod.fin.Identity) => wrapSync(t0).runNow()))
    __obj.asInstanceOf[OpenFinViewStatic]
  }
}

