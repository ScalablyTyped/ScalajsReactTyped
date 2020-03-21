package typingsJapgolly.reduxBootstrap

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxBootstrap.interfacesMod.interfaces.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-bootstrap/dts/containers/root", JSImport.Namespace)
@js.native
object rootMod extends js.Object {
  def default(store: Store[_, AnyAction], history: History[LocationState], routes: Element): Element = js.native
  def default(
    store: Store[_, AnyAction],
    history: History[LocationState],
    routes: Element,
    routerProps: RouterProps
  ): Element = js.native
}

