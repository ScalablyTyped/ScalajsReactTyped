package typingsJapgolly.scBroker.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.scBroker.scBrokerStrings.brokerMessage
import typingsJapgolly.scBroker.scBrokerStrings.error
import typingsJapgolly.scBroker.scBrokerStrings.exit
import typingsJapgolly.scBroker.scBrokerStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerServer extends EventEmitter {
  var ipcAckTimeout: Double = js.native
  var options: SCBrokerServerOptions = js.native
  var port: js.UndefOr[Double] = js.native
  var socketPath: js.UndefOr[String] = js.native
  def destroy(): Unit = js.native
  @JSName("off")
  def off_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
  @JSName("off")
  def off_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
  @JSName("off")
  def off_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
  @JSName("on")
  def on_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
  @JSName("once")
  def once_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
  @JSName("once")
  def once_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  def sendToBroker(data: js.Any): Unit = js.native
  def sendToBroker(
    data: js.Any,
    callback: js.Function3[/* err */ js.Error | Null, /* data */ js.Any, /* brokerId */ String, Unit]
  ): Unit = js.native
}

