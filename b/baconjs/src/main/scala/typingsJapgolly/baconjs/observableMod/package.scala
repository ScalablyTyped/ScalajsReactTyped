package typingsJapgolly.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observableMod {
  type ObservableConstructor = js.Function2[
    /* description */ typingsJapgolly.baconjs.describeMod.Desc, 
    /* subscribe */ typingsJapgolly.baconjs.typesMod.Subscribe[js.Any], 
    typingsJapgolly.baconjs.observableMod.Observable[js.Any]
  ]
}
