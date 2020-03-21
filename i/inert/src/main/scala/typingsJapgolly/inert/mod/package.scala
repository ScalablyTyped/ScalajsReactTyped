package typingsJapgolly.inert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RequestHandler[T] = js.Function1[/* request */ typingsJapgolly.hapi.mod.Request, T]
}
