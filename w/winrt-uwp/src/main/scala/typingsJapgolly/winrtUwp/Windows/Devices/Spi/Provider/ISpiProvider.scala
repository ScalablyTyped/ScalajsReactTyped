package typingsJapgolly.winrtUwp.Windows.Devices.Spi.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents actions common to SPI controller providers. */
trait ISpiProvider extends js.Object {
  var getControllersAsync: js.Any
}

object ISpiProvider {
  @scala.inline
  def apply(getControllersAsync: js.Any): ISpiProvider = {
    val __obj = js.Dynamic.literal(getControllersAsync = getControllersAsync.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpiProvider]
  }
}

