package typingsJapgolly.reactNative

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.ArrayBufferView
import typingsJapgolly.std.Blob
import typingsJapgolly.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocket extends EventTarget {
  var onclose: (js.Function1[/* event */ WebSocketCloseEvent, Unit]) | Null = js.native
  var onerror: (js.Function1[/* event */ WebSocketErrorEvent, Unit]) | Null = js.native
  var onmessage: (js.Function1[/* event */ WebSocketMessageEvent, Unit]) | Null = js.native
  var onopen: js.Function0[Unit] | Null = js.native
  val readyState: Double = js.native
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: String): Unit = js.native
  def send(data: String): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def send(data: ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}

@JSGlobal("WebSocket")
@js.native
object WebSocket
  extends Instantiable1[/* uri */ String, WebSocket]
     with Instantiable2[
      /* uri */ String, 
      (/* protocols */ js.Array[String]) | (/* protocols */ String), 
      WebSocket
    ]
     with Instantiable3[
      /* uri */ String, 
      (/* protocols */ js.Array[String]) | (/* protocols */ Null) | (/* protocols */ String), 
      /* options */ AnonDictoptionName, 
      WebSocket
    ] {
  val CLOSED: Double = js.native
  val CLOSING: Double = js.native
  val CONNECTING: Double = js.native
  val OPEN: Double = js.native
}

