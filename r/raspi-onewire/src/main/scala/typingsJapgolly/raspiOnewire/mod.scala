package typingsJapgolly.raspiOnewire

import typingsJapgolly.node.Buffer
import typingsJapgolly.raspiPeripheral.mod.Peripheral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-onewire", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class OneWire () extends Peripheral {
    var _deviceIdMapping: js.Any = js.native
    /* private */ def _convertIDToMappingKey(deviceID: js.Any): js.Any = js.native
    /* private */ def _getNameFromID(deviceID: js.Any): js.Any = js.native
    def read(
      deviceID: js.Array[Double],
      numBytesToRead: Double,
      cb: js.Function2[/* err */ js.UndefOr[String | js.Error], /* data */ js.UndefOr[Buffer], Unit]
    ): Unit = js.native
    def readAllAvailable(
      deviceID: js.Array[Double],
      cb: js.Function2[/* err */ js.UndefOr[String | js.Error], /* data */ js.UndefOr[Buffer], Unit]
    ): Unit = js.native
    def searchForDevices(
      cb: js.Function2[
          /* readErr */ js.UndefOr[String | js.Error], 
          /* devices */ js.UndefOr[js.Array[js.Array[Double]]], 
          Unit
        ]
    ): Unit = js.native
  }
  
}

