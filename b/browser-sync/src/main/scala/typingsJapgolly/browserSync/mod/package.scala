package typingsJapgolly.browserSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Hash[T] = org.scalablytyped.runtime.StringDictionary[T]
  type MiddlewareHandler = js.Function3[
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    js.Any
  ]
  type ProxyResponseMiddleware = js.Function3[
    /* proxyRes */ typingsJapgolly.node.httpMod.ServerResponse | typingsJapgolly.node.httpMod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    scala.Unit
  ]
}
