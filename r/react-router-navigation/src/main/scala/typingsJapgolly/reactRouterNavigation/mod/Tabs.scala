package typingsJapgolly.reactRouterNavigation.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactRouterNavigation.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "Tabs")
@js.native
class Tabs ()
  extends Component[TabBarComponentProps, AnonKey, js.Any] {
  @JSName("props")
  var props_Tabs: TabBarComponentProps = js.native
  def renderFooter(sceneProps: TabSubViewProps): Element | Null = js.native
  def renderHeader(sceneProps: TabSubViewProps): Element | Null = js.native
  def renderScene(sceneProps: TabSubViewProps): Element | Null = js.native
  def renderTabBar(sceneProps: TabSubViewProps, props: TabSubViewProps): Element | Null = js.native
}

