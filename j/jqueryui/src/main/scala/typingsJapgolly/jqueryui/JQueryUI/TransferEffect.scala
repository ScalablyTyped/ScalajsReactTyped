package typingsJapgolly.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferEffect extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object TransferEffect {
  @scala.inline
  def apply(className: String = null, to: String = null): TransferEffect = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferEffect]
  }
}

