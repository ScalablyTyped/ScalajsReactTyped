package typingsJapgolly.reactDashRouter.reactDashRouterMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.history.historyMod.LocationState
import typingsJapgolly.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClassP[(Omit[P, String]) with WithRouterProps[C] with js.Object]) with WithRouterStatics[C] = js.native
}

