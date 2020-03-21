package typingsJapgolly.reactRouterNavigation.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "Navigation")
@js.native
class Navigation ()
  extends Component[NavigationComponentProps, js.Object, js.Any] {
  @JSName("props")
  var props_Navigation: NavigationComponentProps = js.native
  def renderHeader(sceneProps: CardSubViewProps, props: CardSubViewProps): Node = js.native
  def renderSceneComponent(sceneProps: CardSubViewProps): js.UndefOr[ComponentClassP[js.Object]] = js.native
}

