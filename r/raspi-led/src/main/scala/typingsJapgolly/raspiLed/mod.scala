package typingsJapgolly.raspiLed

import typingsJapgolly.raspiLed.raspiLedNumbers.`0`
import typingsJapgolly.raspiLed.raspiLedNumbers.`1`
import typingsJapgolly.raspiPeripheral.mod.Peripheral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-led", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LED () extends Peripheral {
    def hasLed(): Boolean = js.native
    def read(): `0` | `1` = js.native
    @JSName("write")
    def write_0(value: `0`): Unit = js.native
    @JSName("write")
    def write_1(value: `1`): Unit = js.native
  }
  
  val OFF: `0` = js.native
  val ON: `1` = js.native
}

