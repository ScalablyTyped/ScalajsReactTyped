package typingsJapgolly.antd.libTagMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_Absolute
import typingsJapgolly.antd.Anon_BackgroundColor
import typingsJapgolly.antd.Anon_VisibleBoolean
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Component[TagProps, TagState, js.Any] {
  @JSName("state")
  var state_Tag: Anon_VisibleBoolean = js.native
  def getTagClassName(hasGetPrefixCls: ConfigConsumerProps): String = js.native
  def getTagStyle(): Anon_BackgroundColor | Anon_Absolute = js.native
  def handleIconClick(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def isPresetColor(): Boolean = js.native
  def renderCloseIcon(): Element | Null = js.native
  def renderTag(configProps: ConfigConsumerProps): Element = js.native
  def setVisible(visible: Boolean, e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
}

