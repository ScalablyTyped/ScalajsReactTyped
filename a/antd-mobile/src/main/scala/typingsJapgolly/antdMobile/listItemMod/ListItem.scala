package typingsJapgolly.antdMobile.listItemMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem
  extends Component[ListItemProps, js.Any, js.Any] {
  var debounceTimeout: js.Any = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MListItem(): Unit = js.native
  def onClick(ev: ReactMouseEventFrom[HTMLDivElement]): Unit = js.native
}

