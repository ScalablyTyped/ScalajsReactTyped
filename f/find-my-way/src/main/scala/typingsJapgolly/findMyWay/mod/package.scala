package typingsJapgolly.findMyWay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler[V /* <: typingsJapgolly.findMyWay.mod.HTTPVersion */] = js.Function4[
    /* req */ typingsJapgolly.node.http2Mod.Http2ServerRequest | typingsJapgolly.node.httpMod.IncomingMessage, 
    /* res */ typingsJapgolly.node.http2Mod.Http2ServerResponse | typingsJapgolly.node.httpMod.ServerResponse, 
    /* params */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]], 
    /* store */ js.Any, 
    scala.Unit
  ]
}
