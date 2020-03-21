package typingsJapgolly.angularWebsocket.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websocket {
  /**
    * Creates and opens an IWebSocket instance.
    *
    * @param url url to connect to
    * @return websocket instance
    */
  type IWebSocketProvider = js.Function3[
    /* url */ java.lang.String, 
    /* protocols */ js.UndefOr[
      java.lang.String | js.Array[java.lang.String] | typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
    ], 
    /* options */ js.UndefOr[
      typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
    ], 
    typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket
  ]
}
