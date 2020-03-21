package typingsJapgolly.reactRouterNavigation.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactRouterNavigationCore.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card
  extends RouteProps
     with NavBarProps {
  var key: String
}

@JSImport("react-router-navigation", "Card")
@js.native
object Card extends js.Object {
  def apply(props: CardProps): Element = js.native
}

