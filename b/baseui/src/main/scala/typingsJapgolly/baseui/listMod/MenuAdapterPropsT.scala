package typingsJapgolly.baseui.listMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuAdapterPropsT extends PropsT {
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean = js.native
  @JSName("$size")
  var $size: String = js.native
  // eslint-disable-next-line flowtype/no-weak-types
  var item: js.Any = js.native
  def onClick(event: ReactMouseEventFrom[HTMLLIElement]): js.Any = js.native
  def onMouseEnter(event: ReactMouseEventFrom[HTMLLIElement]): js.Any = js.native
}

