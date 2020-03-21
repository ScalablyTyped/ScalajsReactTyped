package typingsJapgolly.arraySort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type ComparisonArg[T] = java.lang.String | typingsJapgolly.arraySort.mod.Comparator[T]
  type ComparisonArgs[T] = typingsJapgolly.arraySort.mod.ComparisonArg[T] | js.Array[typingsJapgolly.arraySort.mod.ComparisonArg[T]]
}
