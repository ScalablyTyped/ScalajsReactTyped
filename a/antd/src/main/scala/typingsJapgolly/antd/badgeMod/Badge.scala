package typingsJapgolly.antd.badgeMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge
  extends Component[BadgeProps, js.Any, js.Any] {
  def getBadgeClassName(prefixCls: String): String = js.native
  def getBadgeClassName(prefixCls: String, direction: String): String = js.native
  def getDisplayCount(): String | Double | Null = js.native
  def getNumberedDisplayCount(): String | Double | Null = js.native
  def getScrollNumberTitle(): js.UndefOr[String | Double] = js.native
  def getStyleWithOffset(): js.UndefOr[CSSProperties] = js.native
  def hasStatus(): Boolean = js.native
  def isDot(): Boolean = js.native
  def isHidden(): Boolean = js.native
  def isZero(): Boolean = js.native
  def renderBadge(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderBadgeNumber(prefixCls: String, scrollNumberPrefixCls: String): Element | Null = js.native
  def renderDisplayComponent(): js.UndefOr[Element] = js.native
  def renderStatusText(prefixCls: String): Element | Null = js.native
}

