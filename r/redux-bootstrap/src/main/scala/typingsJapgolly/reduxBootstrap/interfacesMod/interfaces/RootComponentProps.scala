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

trait RootComponentProps extends js.Object {
  var history: History[LocationState]
  var routes: Element
  var store: Store[_, AnyAction]
}

object RootComponentProps {
  @scala.inline
  def apply(history: History[LocationState], routes: VdomElement, store: Store[_, AnyAction]): RootComponentProps = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootComponentProps]
  }
}

