package typingsJapgolly.jsonRpcWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler[TConnection /* <: typingsJapgolly.jsonRpcWs.mod.Connection */, ParamType, ParamCallbackType] = js.ThisFunction2[
    /* this */ TConnection, 
    /* params */ ParamType, 
    /* reply */ typingsJapgolly.jsonRpcWs.mod.ReplyCallback[ParamCallbackType], 
    scala.Unit
  ]
  type ReplyCallback[ParamType] = js.Function2[/* error */ js.Any, /* params */ js.UndefOr[ParamType], scala.Unit]
}
