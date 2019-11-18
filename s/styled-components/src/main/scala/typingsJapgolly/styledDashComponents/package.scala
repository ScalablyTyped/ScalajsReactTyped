package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponents {
  import typingsJapgolly.std.Exclude
  import typingsJapgolly.std.Pick

  // Helper type operators
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
