package typingsJapgolly.antd.esTableInterfaceMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandIconProps[T] extends js.Object {
  var expandable: Boolean = js.native
  var expanded: Boolean = js.native
  var needIndentSpaced: Boolean = js.native
  var prefixCls: String = js.native
  var record: T = js.native
  def onExpand(record: T): Unit = js.native
  def onExpand(record: T, event: ReactMouseEventFrom[Element]): Unit = js.native
}

