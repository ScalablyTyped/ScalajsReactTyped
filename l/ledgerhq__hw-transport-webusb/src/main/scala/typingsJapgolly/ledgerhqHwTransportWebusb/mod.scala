package typingsJapgolly.ledgerhqHwTransportWebusb

import typingsJapgolly.ledgerhqHwTransport.mod.DescriptorEvent
import typingsJapgolly.ledgerhqHwTransport.mod.Observer
import typingsJapgolly.ledgerhqHwTransport.mod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport-webusb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.ledgerhqHwTransport.mod.default[String] {
    def this(device: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def listen(observer: Observer[DescriptorEvent[String]]): Subscription = js.native
    def open(device: String): js.Promise[TransportWebUSB] = js.native
    def openConnection(): js.Promise[TransportWebUSB] = js.native
    def request(): js.Promise[TransportWebUSB] = js.native
  }
  
  type TransportWebUSB = typingsJapgolly.ledgerhqHwTransport.mod.default[String]
}

