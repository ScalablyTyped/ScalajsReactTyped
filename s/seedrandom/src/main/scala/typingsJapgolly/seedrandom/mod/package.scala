package typingsJapgolly.seedrandom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type State = js.Object
  type seedrandomCallback = js.Function4[
    /* prng */ js.UndefOr[typingsJapgolly.seedrandom.mod.prng], 
    /* shortseed */ js.UndefOr[java.lang.String], 
    /* global */ js.UndefOr[scala.Boolean], 
    /* state */ js.UndefOr[typingsJapgolly.seedrandom.mod.State], 
    typingsJapgolly.seedrandom.mod.prng
  ]
}
