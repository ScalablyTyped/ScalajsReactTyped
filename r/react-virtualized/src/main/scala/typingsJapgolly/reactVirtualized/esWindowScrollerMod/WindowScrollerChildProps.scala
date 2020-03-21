package typingsJapgolly.reactVirtualized.esWindowScrollerMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactVirtualized.AnonScrollTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowScrollerChildProps extends js.Object {
  var height: Double = js.native
  var isScrolling: Boolean = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var width: Double = js.native
  def onChildScroll(params: AnonScrollTop): Unit = js.native
  def registerChild(): Unit = js.native
  def registerChild(element: Node): Unit = js.native
}

