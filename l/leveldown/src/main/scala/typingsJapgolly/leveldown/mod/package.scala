package typingsJapgolly.leveldown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Bytes = java.lang.String | typingsJapgolly.node.Buffer
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* size */ scala.Double, scala.Unit]
}
