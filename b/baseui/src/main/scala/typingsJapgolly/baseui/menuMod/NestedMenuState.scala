package typingsJapgolly.baseui.menuMod

import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedMenuState extends js.Object {
  var menus: js.Array[Ref]
}

object NestedMenuState {
  @scala.inline
  def apply(menus: js.Array[Ref]): NestedMenuState = {
    val __obj = js.Dynamic.literal(menus = menus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NestedMenuState]
  }
}

