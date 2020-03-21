package typingsJapgolly.reapop.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var name: String
  var primary: Boolean
  def onClick(): Unit
}

object Button {
  @scala.inline
  def apply(name: String, onClick: Callback, primary: Boolean): Button = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.asInstanceOf[Button]
  }
}

