package typingsJapgolly.sockjsClient.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sockjs-client", JSImport.Namespace)
@js.native
class ^ protected () extends WebSocket {
  def this(url: String) = this()
  def this(url: String, _reserved: js.Any) = this()
  def this(url: String, _reserved: js.Any, options: Options) = this()
}

@JSImport("sockjs-client", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (Instantiable1[/* url */ String, WebSocket]) with (Instantiable2[/* url */ String, /* _reserved */ js.Any, WebSocket]) with (Instantiable3[/* url */ String, /* _reserved */ js.Any, /* options */ Options, WebSocket])
    ] {
  var CLOSED: typingsJapgolly.sockjsClient.mod.CLOSED = js.native
  var CLOSING: typingsJapgolly.sockjsClient.mod.CLOSING = js.native
  var CONNECTING: typingsJapgolly.sockjsClient.mod.CONNECTING = js.native
  var OPEN: typingsJapgolly.sockjsClient.mod.OPEN = js.native
  def apply(url: String): org.scalajs.dom.raw.WebSocket = js.native
  def apply(url: String, _reserved: js.Any): org.scalajs.dom.raw.WebSocket = js.native
  def apply(url: String, _reserved: js.Any, options: Options): org.scalajs.dom.raw.WebSocket = js.native
}

