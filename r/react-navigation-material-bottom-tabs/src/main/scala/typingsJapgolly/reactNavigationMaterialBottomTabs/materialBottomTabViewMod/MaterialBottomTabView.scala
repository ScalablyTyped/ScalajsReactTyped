package typingsJapgolly.reactNavigationMaterialBottomTabs.materialBottomTabViewMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigationMaterialBottomTabs.AnonColor
import typingsJapgolly.reactNavigationMaterialBottomTabs.AnonRouteAnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialBottomTabView
  extends Component[Props, js.Object, js.Any] {
  def _getBarStyle(): js.Array[StyleProp[ViewStyle]] = js.native
  def _getColor(hasRoute: AnonRouteAnonKey): js.UndefOr[String] = js.native
  def _getInactiveColor(): js.UndefOr[String] = js.native
  def _getactiveColor(): js.UndefOr[String] = js.native
  def _isVisible(): js.UndefOr[Boolean] = js.native
  def _renderIcon(hasRouteFocusedColor: AnonColor): Node = js.native
}

