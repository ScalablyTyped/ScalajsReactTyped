package typingsJapgolly.nodelibFsWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncMod {
  type AsyncCallback = js.Function2[
    /* err */ typingsJapgolly.nodelibFsWalk.typesMod.Errno, 
    /* entries */ js.Array[typingsJapgolly.nodelibFsWalk.typesMod.Entry], 
    scala.Unit
  ]
}
