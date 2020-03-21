package typingsJapgolly.walk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type WalkNamesEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ js.Array[java.lang.String], 
    /* next */ typingsJapgolly.walk.mod.WalkNext, 
    scala.Unit
  ]
  type WalkNext = js.Function0[scala.Unit]
  type WalkStatArrayEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ js.Array[typingsJapgolly.walk.mod.WalkStats], 
    /* next */ typingsJapgolly.walk.mod.WalkNext, 
    scala.Unit
  ]
  type WalkStatEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ typingsJapgolly.walk.mod.WalkStats, 
    /* next */ typingsJapgolly.walk.mod.WalkNext, 
    scala.Unit
  ]
}
