package typingsJapgolly.antd.tagMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.AnonAlignContent
import typingsJapgolly.antd.AnonBackgroundColor
import typingsJapgolly.antd.AnonVisibleBoolean
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Component[TagProps, TagState, js.Any] {
  @JSName("state")
  var state_Tag: AnonVisibleBoolean = js.native
  def getTagClassName(hasGetPrefixClsDirection: ConfigConsumerProps): String = js.native
  def getTagStyle(): AnonBackgroundColor | AnonAlignContent = js.native
  def handleIconClick(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def isPresetColor(): Boolean = js.native
  def renderCloseIcon(): Element | Null = js.native
  def renderTag(configProps: ConfigConsumerProps): Element = js.native
  def setVisible(visible: Boolean, e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
}

