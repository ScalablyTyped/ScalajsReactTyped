package typingsJapgolly.levelSublevel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Constructor = js.Function1[
    /* levelup */ typingsJapgolly.levelup.mod.LevelUp[
      typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN[js.Any, js.Any], 
      typingsJapgolly.abstractLeveldown.mod.AbstractIterator[js.Any, js.Any]
    ], 
    typingsJapgolly.levelSublevel.mod.Sublevel
  ]
  type Hook = js.Function2[
    /* ch */ js.Any, 
    /* add */ js.Function1[/* op */ typingsJapgolly.levelSublevel.mod.Batch | scala.Boolean, scala.Unit], 
    scala.Unit
  ]
}
