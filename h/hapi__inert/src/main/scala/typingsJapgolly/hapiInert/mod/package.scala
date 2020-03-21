package typingsJapgolly.hapiInert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RequestHandler[T] = js.Function1[/* request */ typingsJapgolly.hapiHapi.mod.Request, T]
}
