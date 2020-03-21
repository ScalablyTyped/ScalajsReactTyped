package typingsJapgolly.reactSizeme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type WithSizeOnSizeCallback = js.Function1[/* size */ typingsJapgolly.reactSizeme.AnonHeight, scala.Unit]
}
