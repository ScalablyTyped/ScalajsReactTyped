package typingsJapgolly.twilioSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeMod {
  type Equal[T] = js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  type Less[T] = js.Function2[/* x */ T, /* y */ T, scala.Boolean]
}
