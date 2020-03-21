package typingsJapgolly.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dojox {
  type analytics = typingsJapgolly.dojo.dojox.analytics_
  type collections = typingsJapgolly.dojo.dojox.collections_
  type color = typingsJapgolly.dojo.dojox.color_
  type drawing = typingsJapgolly.dojo.dojox.drawing_
  type dtl = typingsJapgolly.dojo.dojox.dtl_
  type flash = typingsJapgolly.dojo.dojox.flash_
  type fx = typingsJapgolly.dojo.dojox.fx_
  type gfx = typingsJapgolly.dojo.dojox.gfx_
  type gfx3d = typingsJapgolly.dojo.dojox.gfx3d_
  type highlight = typingsJapgolly.dojo.dojox.highlight_
  type html = typingsJapgolly.dojo.dojox.html_
  type image = typingsJapgolly.dojo.dojox.image_
  type main = typingsJapgolly.dojo.dojox.main_
  type math = typingsJapgolly.dojo.dojox.math_
  type mobile = typingsJapgolly.dojo.dojox.mobile_
  type mvc = typingsJapgolly.dojo.dojox.mvc_
  type sketch = typingsJapgolly.dojo.dojox.sketch_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/socket.html
    *
    * Provides a simple socket connection using WebSocket, or alternate
    * communication mechanisms in legacy browsers for comet-style communication. This is based
    * on the WebSocket API and returns an object that implements the WebSocket interface:
    * http://dev.w3.org/html5/websockets/#websocket
    * Provides socket connections. This can be used with virtually any Comet protocol.
    *
    * @param argsOrUrl This uses the same arguments as the other I/O functions in Dojo, or aURL to connect to. The URL should be a relative URL in order to properlywork with WebSockets (it can still be host relative, like //other-site.org/endpoint)
    */
  type socket = js.Function1[/* argsOrUrl */ js.Object, scala.Unit]
  type sql = typingsJapgolly.dojo.dojox.sql_
  type timing = typingsJapgolly.dojo.dojox.timing_
  type uuid = typingsJapgolly.dojo.dojox.uuid_
  type validate = typingsJapgolly.dojo.dojox.validate_
}
