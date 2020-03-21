package typingsJapgolly.kdbush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayType = typingsJapgolly.std.Int8ArrayConstructor | typingsJapgolly.std.Int16ArrayConstructor | typingsJapgolly.std.Int32ArrayConstructor | typingsJapgolly.std.Float32ArrayConstructor | typingsJapgolly.std.Float64ArrayConstructor | typingsJapgolly.std.ArrayConstructor
  type Get[T] = js.Function1[/* point */ T, scala.Double]
  type Points = js.Array[js.Array[scala.Double]]
}
