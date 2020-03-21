package typingsJapgolly.winrtUwp.Windows.Devices.Spi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for the connection with a device. */
@JSGlobal("Windows.Devices.Spi.SpiConnectionSettings")
@js.native
class SpiConnectionSettings protected () extends js.Object {
  /**
    * Initializes new instance of SpiConnectionSettings .
    * @param chipSelectLine The chip select line on which the connection will be made.
    */
  def this(chipSelectLine: Double) = this()
  /** Gets or sets the chip select line for the connection to the SPI device. */
  var chipSelectLine: Double = js.native
  /** Gets or sets the clock frequency for the connection. */
  var clockFrequency: Double = js.native
  /** Gets or sets the bit length for data on this connection. */
  var dataBitLength: Double = js.native
  /** Gets or sets the SpiMode for this connection. */
  var mode: SpiMode = js.native
  /** Gets or sets the sharing mode for the SPI connection. */
  var sharingMode: SpiSharingMode = js.native
}

