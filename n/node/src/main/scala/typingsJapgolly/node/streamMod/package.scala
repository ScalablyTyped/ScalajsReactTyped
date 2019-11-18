package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamMod {
  import typingsJapgolly.node.Error

  type TransformCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* data */ js.UndefOr[js.Any], Unit]
}
