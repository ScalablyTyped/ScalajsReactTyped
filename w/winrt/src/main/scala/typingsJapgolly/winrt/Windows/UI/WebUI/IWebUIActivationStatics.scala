package typingsJapgolly.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUIActivationStatics extends js.Object {
  var onactivated: js.Any
  var onnavigated: js.Any
  var onresuming: js.Any
  var onsuspending: js.Any
}

object IWebUIActivationStatics {
  @scala.inline
  def apply(onactivated: js.Any, onnavigated: js.Any, onresuming: js.Any, onsuspending: js.Any): IWebUIActivationStatics = {
    val __obj = js.Dynamic.literal(onactivated = onactivated.asInstanceOf[js.Any], onnavigated = onnavigated.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWebUIActivationStatics]
  }
}

