package typingsJapgolly.mitm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = typingsJapgolly.mitm.mod.SocketConnectCallback | typingsJapgolly.mitm.mod.SocketConnectionCallback | typingsJapgolly.mitm.mod.HttpCallback
  type HttpCallback = js.Function2[
    /* request */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* response */ typingsJapgolly.node.httpMod.ServerResponse, 
    scala.Unit
  ]
  type SocketConnectCallback = js.Function2[
    /* socket */ typingsJapgolly.mitm.mod.BypassableSocket, 
    /* opts */ typingsJapgolly.mitm.mod.SocketOptions, 
    scala.Unit
  ]
  type SocketConnectionCallback = js.Function2[
    /* socket */ typingsJapgolly.node.netMod.Socket, 
    /* opts */ typingsJapgolly.mitm.mod.SocketOptions, 
    scala.Unit
  ]
}
