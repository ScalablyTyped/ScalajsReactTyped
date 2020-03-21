package typingsJapgolly.reactRouterNative.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRouter.mod.Omit
import typingsJapgolly.reactRouter.mod.RouteComponentProps
import typingsJapgolly.reactRouter.mod.StaticContext
import typingsJapgolly.reactRouter.mod.WithRouterProps
import typingsJapgolly.reactRouter.mod.WithRouterStatics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-native", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClassP[(Omit[P, String]) with WithRouterProps[C] with js.Object]) with WithRouterStatics[C] = js.native
}

