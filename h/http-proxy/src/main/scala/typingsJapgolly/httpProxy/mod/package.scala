package typingsJapgolly.httpProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function4[
    /* err */ js.Error, 
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* target */ js.UndefOr[typingsJapgolly.httpProxy.mod.ProxyTargetUrl], 
    scala.Unit
  ]
  type ProxyTarget = typingsJapgolly.httpProxy.mod.ProxyTargetUrl | typingsJapgolly.httpProxy.mod.ProxyTargetDetailed
  type ProxyTargetUrl = java.lang.String | typingsJapgolly.httpProxy.PartialUrl
}
