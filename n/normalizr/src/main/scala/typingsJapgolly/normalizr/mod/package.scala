package typingsJapgolly.normalizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SchemaValue[T] = typingsJapgolly.normalizr.mod.Schema_[T] | typingsJapgolly.normalizr.mod.SchemaValueFunction[T]
  type SchemaValueFunction[T] = js.Function1[/* t */ T, typingsJapgolly.normalizr.mod.Schema_[T]]
}
