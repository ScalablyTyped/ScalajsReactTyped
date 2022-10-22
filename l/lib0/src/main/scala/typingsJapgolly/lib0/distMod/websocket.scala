package typingsJapgolly.lib0.distMod

import typingsJapgolly.lib0.anon.BinaryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websocket {
  
  @JSImport("lib0/dist", "websocket.WebsocketClient")
  @js.native
  open class WebsocketClient protected ()
    extends typingsJapgolly.lib0.distWebsocketMod.WebsocketClient {
    /**
      * @param {string} url
      * @param {object} [opts]
      * @param {'arraybuffer' | 'blob' | null} [opts.binaryType] Set `ws.binaryType`
      */
    def this(url: String) = this()
    def this(url: String, hasBinaryType: BinaryType) = this()
  }
}
