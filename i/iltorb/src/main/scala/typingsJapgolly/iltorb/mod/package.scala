package typingsJapgolly.iltorb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IltorbCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* output */ typingsJapgolly.node.Buffer, 
    scala.Unit
  ]
}
