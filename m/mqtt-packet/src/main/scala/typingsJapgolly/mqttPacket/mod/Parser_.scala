package typingsJapgolly.mqttPacket.mod

import typingsJapgolly.mqttPacket.mqttPacketStrings.error
import typingsJapgolly.mqttPacket.mqttPacketStrings.packet
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser_
  extends StObject
     with EventEmitter {
  
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* error */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_packet(event: packet, callback: js.Function1[/* packet */ Packet, Unit]): this.type = js.native
  
  def parse(buffer: Buffer): Double = js.native
  def parse(buffer: Buffer, opts: js.Object): Double = js.native
}
