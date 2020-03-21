package typingsJapgolly.imagemin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Plugin = js.Function1[/* input */ typingsJapgolly.node.Buffer, js.Promise[typingsJapgolly.node.Buffer]]
}
