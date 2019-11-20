package typingsJapgolly.antd.esBadgeMod

import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge
  extends Component[BadgeProps, js.Any, js.Any] {
  def getBadgeClassName(prefixCls: String): String = js.native
  def getDispayCount(): String | Double | Null = js.native
  def getNumberedDispayCount(): String | Double | Null = js.native
  def getScrollNumberTitle(): js.UndefOr[String | Double] = js.native
  def getStyleWithOffset(): js.UndefOr[CSSProperties] = js.native
  def hasStatus(): Boolean = js.native
  def isDot(): Boolean = js.native
  def isHidden(): Boolean = js.native
  def isZero(): Boolean = js.native
  def renderBadge(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderBadgeNumber(prefixCls: String, scrollNumberPrefixCls: String): Element | Null = js.native
  def renderDispayComponent(): js.UndefOr[japgolly.scalajs.react.raw.React.Element] = js.native
  def renderStatusText(prefixCls: String): Element | Null = js.native
}

