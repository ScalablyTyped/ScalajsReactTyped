package typingsJapgolly.sqlJs.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SqlJs {
  type ParamsCallback = js.Function1[/* obj */ typingsJapgolly.sqlJs.moduleMod.SqlJs.ParamsObject, scala.Unit]
  type ParamsObject = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.sqlJs.moduleMod.SqlJs.ValueType]
  type ValueType = scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array | scala.Null
}
