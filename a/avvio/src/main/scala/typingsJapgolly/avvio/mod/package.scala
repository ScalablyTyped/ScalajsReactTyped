package typingsJapgolly.avvio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OnClose[I, C] = js.Function1[/* fn */ js.Function2[/* context */ C, /* done */ js.Function, scala.Unit], C]
  type Plugin[O, I] = js.Function3[
    /* server */ typingsJapgolly.avvio.mod.context[I], 
    /* options */ O, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit], 
    scala.Unit
  ]
  type Use[I, C] = js.Function2[
    /* fn */ typingsJapgolly.avvio.mod.Plugin[js.Any, I], 
    /* options */ js.UndefOr[js.Any], 
    C
  ]
  type context[I] = typingsJapgolly.avvio.mod.mixedInstance[I] | typingsJapgolly.avvio.mod.Avvio[I]
  type mixedInstance[I] = I with typingsJapgolly.avvio.mod.Server[I]
}
