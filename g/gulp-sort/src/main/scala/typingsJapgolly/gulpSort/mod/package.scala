package typingsJapgolly.gulpSort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IComparatorFunction = js.Function2[
    /* file1 */ typingsJapgolly.vinyl.mod.File, 
    /* file2 */ typingsJapgolly.vinyl.mod.File, 
    scala.Double
  ]
}
