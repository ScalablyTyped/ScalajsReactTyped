package typingsJapgolly.winrtUwp

import typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyLicense
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsIPlayReadyLicense extends js.Object {
  /** The items in the collection. */ var items: IPlayReadyLicense
  /** The number of items in the collection. */ var returnValue: Double
}

object AnonItemsIPlayReadyLicense {
  @scala.inline
  def apply(items: IPlayReadyLicense, returnValue: Double): AnonItemsIPlayReadyLicense = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsIPlayReadyLicense]
  }
}

