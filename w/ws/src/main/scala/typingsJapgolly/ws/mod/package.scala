package typingsJapgolly.ws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * CertMeta represents the accepted types for certificate & key data.
    */
  type CertMeta = java.lang.String | (js.Array[typingsJapgolly.node.Buffer | java.lang.String]) | typingsJapgolly.node.Buffer
  /**
    * Data represents the message payload received over the WebSocket.
    */
  type Data = java.lang.String | typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.ArrayBuffer | js.Array[typingsJapgolly.node.Buffer]
  /**
    * VerifyClientCallbackAsync is an asynchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ typingsJapgolly.ws.AnonOrigin, 
    /* callback */ js.Function4[
      /* res */ scala.Boolean, 
      /* code */ js.UndefOr[scala.Double], 
      /* message */ js.UndefOr[java.lang.String], 
      /* headers */ js.UndefOr[typingsJapgolly.node.httpMod.OutgoingHttpHeaders], 
      scala.Unit
    ], 
    scala.Unit
  ]
  /**
    * VerifyClientCallbackSync is a synchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackSync = js.Function1[/* info */ typingsJapgolly.ws.AnonOrigin, scala.Boolean]
}
