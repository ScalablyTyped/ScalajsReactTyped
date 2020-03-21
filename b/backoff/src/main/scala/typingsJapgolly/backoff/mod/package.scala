package typingsJapgolly.backoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FunctionCallAny = typingsJapgolly.backoff.mod.FunctionCall[js.Array[_]] with typingsJapgolly.backoff.mod.FunctionCallArgsAny
  type TypedFunctionCall[T, E, R1, R2, R3] = typingsJapgolly.backoff.mod.FunctionCall[T] with (typingsJapgolly.backoff.mod.FunctionCallArgs[E, R1, R2, R3])
}
