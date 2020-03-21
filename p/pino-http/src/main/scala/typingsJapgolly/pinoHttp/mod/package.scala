package typingsJapgolly.pinoHttp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenReqId = js.Function1[
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    typingsJapgolly.pinoHttp.mod.ReqId
  ]
  type HttpLogger = js.Function2[
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    scala.Unit
  ]
  type ReqId = scala.Double | java.lang.String | js.Object
}
