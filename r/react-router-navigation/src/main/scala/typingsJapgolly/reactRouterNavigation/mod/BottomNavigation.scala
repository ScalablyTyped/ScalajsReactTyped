package typingsJapgolly.reactRouterNavigation.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactRouterNavigation.AnonKey
import typingsJapgolly.reactRouterNavigation.AnonLazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "BottomNavigation")
@js.native
class BottomNavigation ()
  extends Component[BottomNavigationProps, AnonKey, js.Any] {
  def renderNavigationBar(sceneProps: TabSubViewProps, props: TabSubViewProps): Node = js.native
  def renderPager(sceneProps: TabSubViewProps): Node = js.native
  def renderScene(sceneProps: TabSubViewProps): Element = js.native
  def renderSceneView(sceneProps: TabSubViewProps): Node = js.native
}

/* static members */
@JSImport("react-router-navigation", "BottomNavigation")
@js.native
object BottomNavigation extends js.Object {
  var defaultProps: AnonLazy = js.native
}

