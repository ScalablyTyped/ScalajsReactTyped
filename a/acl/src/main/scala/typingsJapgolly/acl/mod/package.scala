package typingsJapgolly.acl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Action = js.Function0[js.Any]
  type AllowedCallback = js.Function2[/* err */ js.Error, /* allowed */ scala.Boolean, js.Any]
  type AnyCallback = js.Function2[/* err */ js.Error, /* obj */ js.Any, js.Any]
  type Callback = js.Function1[/* err */ js.UndefOr[js.Error], js.Any]
  type GetUserId = js.Function2[
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    typingsJapgolly.acl.mod.Value
  ]
  type MemoryBackend = typingsJapgolly.acl.mod.Backend[js.Array[typingsJapgolly.acl.mod.Action]]
  // for mongodb backend
  type MongodbBackend = typingsJapgolly.acl.mod.Backend[typingsJapgolly.acl.mod.Callback]
  // for redis backend
  type RedisBackend = typingsJapgolly.acl.mod.Backend[typingsJapgolly.redis.mod.RedisClient]
  type Value = java.lang.String | scala.Double
  type Values = typingsJapgolly.acl.mod.Value | js.Array[typingsJapgolly.acl.mod.Value]
  type strings = java.lang.String | js.Array[java.lang.String]
}
