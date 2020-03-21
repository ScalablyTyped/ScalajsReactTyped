package typingsJapgolly.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object astTypesMod {
  type Def = typingsJapgolly.astTypes.astTypesMod.Plugin[scala.Unit]
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type Plugin[T] = js.Function1[/* fork */ typingsJapgolly.astTypes.astTypesMod.Fork, T]
}
