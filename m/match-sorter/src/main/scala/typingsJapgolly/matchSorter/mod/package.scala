package typingsJapgolly.matchSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtendedKeyOptions[T] = typingsJapgolly.matchSorter.AnonKey[T] with (typingsJapgolly.matchSorter.AnonMinRanking | typingsJapgolly.matchSorter.AnonMaxRanking | typingsJapgolly.matchSorter.AnonThreshold)
  type KeyOptions[T] = java.lang.String | (js.Function1[/* item */ T, java.lang.String | js.Array[java.lang.String]])
}
