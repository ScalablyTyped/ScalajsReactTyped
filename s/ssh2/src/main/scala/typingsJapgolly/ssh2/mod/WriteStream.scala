package typingsJapgolly.ssh2.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.ssh2.ssh2Strings.open_
import typingsJapgolly.ssh2.ssh2Strings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteStream extends Writable {
  
  def close(cb: Callback): Unit = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_open(eventName: open_, listener: js.Function1[/* handle */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(eventName: ready, listener: js.Function0[Unit]): this.type = js.native
  
  def open(): Unit = js.native
  
  var pending: Boolean = js.native
}
