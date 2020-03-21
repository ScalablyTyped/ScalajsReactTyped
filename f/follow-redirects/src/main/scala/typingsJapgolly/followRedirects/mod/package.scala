package typingsJapgolly.followRedirects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Override[T, U] = (typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, java.lang.String]]) with U
  type WrappedScheme[T /* <: typingsJapgolly.followRedirects.mod.Scheme[_, _, _] */] = typingsJapgolly.followRedirects.mod.Override[T, typingsJapgolly.followRedirects.mod.RedirectScheme[js.Any, js.Any, js.Any]]
}
