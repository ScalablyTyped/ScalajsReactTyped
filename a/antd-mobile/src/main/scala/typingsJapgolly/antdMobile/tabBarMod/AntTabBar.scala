package typingsJapgolly.antdMobile.tabBarMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antdMobile.tabBarPropsTypeMod.TabBarItemProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTabBar
  extends Component[AntTabbarProps, js.Any, js.Any] {
  def getTabs(): js.Array[TabBarItemProps] = js.native
  def renderTabBar(): Element = js.native
}

