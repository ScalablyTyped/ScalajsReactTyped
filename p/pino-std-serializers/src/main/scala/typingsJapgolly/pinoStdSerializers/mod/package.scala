package typingsJapgolly.pinoStdSerializers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomErrorSerializer = js.Function1[
    /* err */ typingsJapgolly.pinoStdSerializers.mod.SerializedError, 
    typingsJapgolly.std.Record[java.lang.String, js.Any]
  ]
  type CustomRequestSerializer = js.Function1[
    /* req */ typingsJapgolly.pinoStdSerializers.mod.SerializedRequest, 
    typingsJapgolly.std.Record[java.lang.String, js.Any]
  ]
  type CustomResponseSerializer = js.Function1[
    /* res */ typingsJapgolly.pinoStdSerializers.mod.SerializedResponse, 
    typingsJapgolly.std.Record[java.lang.String, js.Any]
  ]
}
