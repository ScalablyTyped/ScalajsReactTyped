package typingsJapgolly.reactNativeTabView.tabViewMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeTabView.AnonLayout
import typingsJapgolly.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabView[T /* <: Route */]
  extends Component[Props[T], State, js.Any] {
  var handleLayout: js.Any = js.native
  var jumpToIndex: js.Any = js.native
  @JSName("state")
  var state_TabView: AnonLayout = js.native
}

