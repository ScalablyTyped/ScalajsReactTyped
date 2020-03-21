package typingsJapgolly.nodeStatsd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ js.UndefOr[js.Error], 
    /* bytes */ js.UndefOr[typingsJapgolly.node.Buffer], 
    scala.Unit
  ]
}
