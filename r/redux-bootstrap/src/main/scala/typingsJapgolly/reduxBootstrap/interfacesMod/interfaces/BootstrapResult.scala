package typingsJapgolly.reduxBootstrap.interfacesMod.interfaces

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapResult extends js.Object {
  var history: History[LocationState]
  var output: js.Any
  var root: Element
  var store: Store[_, AnyAction]
}

object BootstrapResult {
  @scala.inline
  def apply(history: History[LocationState], output: js.Any, root: VdomElement, store: Store[_, AnyAction]): BootstrapResult = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapResult]
  }
}

