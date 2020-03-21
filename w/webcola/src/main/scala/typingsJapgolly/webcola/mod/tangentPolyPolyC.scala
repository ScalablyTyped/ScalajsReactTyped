package typingsJapgolly.webcola.mod

import typingsJapgolly.webcola.AnonT1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "tangent_PolyPolyC")
@js.native
object tangentPolyPolyC extends js.Object {
  def apply(
    V: js.Array[typingsJapgolly.webcola.geomMod.Point],
    W: js.Array[typingsJapgolly.webcola.geomMod.Point],
    t1: js.Function2[
      /* a */ typingsJapgolly.webcola.geomMod.Point, 
      /* b */ js.Array[typingsJapgolly.webcola.geomMod.Point], 
      Double
    ],
    t2: js.Function2[
      /* a */ typingsJapgolly.webcola.geomMod.Point, 
      /* b */ js.Array[typingsJapgolly.webcola.geomMod.Point], 
      Double
    ],
    cmp1: js.Function3[
      /* a */ typingsJapgolly.webcola.geomMod.Point, 
      /* b */ typingsJapgolly.webcola.geomMod.Point, 
      /* c */ typingsJapgolly.webcola.geomMod.Point, 
      Boolean
    ],
    cmp2: js.Function3[
      /* a */ typingsJapgolly.webcola.geomMod.Point, 
      /* b */ typingsJapgolly.webcola.geomMod.Point, 
      /* c */ typingsJapgolly.webcola.geomMod.Point, 
      Boolean
    ]
  ): AnonT1 = js.native
}

