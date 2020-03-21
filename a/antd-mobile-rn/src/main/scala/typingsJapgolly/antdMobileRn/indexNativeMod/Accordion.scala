package typingsJapgolly.antdMobileRn.indexNativeMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion
  extends Component[AccordionNativeProps, js.Any, js.Any] {
  def onChange(idx: Double): Unit = js.native
  def renderContent(section: AccordionHeader): Element = js.native
  def renderHeader(section: AccordionHeader, _underscore: Double, isActive: Boolean): Element = js.native
}

