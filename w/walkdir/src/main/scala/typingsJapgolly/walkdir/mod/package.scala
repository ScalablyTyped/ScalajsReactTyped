package typingsJapgolly.walkdir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type WalkEventListener = js.ThisFunction3[
    /* this */ typingsJapgolly.walkdir.mod.WalkEmitter, 
    /* path */ java.lang.String, 
    /* stat */ typingsJapgolly.node.fsMod.Stats, 
    /* ignore */ js.Function1[/* path */ java.lang.String | js.Array[java.lang.String], scala.Unit], 
    scala.Unit
  ]
}
