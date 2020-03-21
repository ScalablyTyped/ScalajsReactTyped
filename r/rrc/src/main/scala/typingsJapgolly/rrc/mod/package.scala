package typingsJapgolly.rrc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentConstructor[Props] = typingsJapgolly.react.mod.ComponentType[Props]
  type GetKeyFunction[Params] = js.Function3[
    /* match */ typingsJapgolly.reactRouter.mod.`match`[Params], 
    /* route */ typingsJapgolly.rrc.mod.RouteConfiguration, 
    /* location */ typingsJapgolly.history.mod.Location[typingsJapgolly.history.mod.LocationState], 
    java.lang.String
  ]
  type IsActiveCallback = js.Function0[scala.Boolean]
  type OnUpdateCall = js.Function1[
    /* location */ typingsJapgolly.history.mod.Location[typingsJapgolly.history.mod.LocationState], 
    scala.Unit
  ]
  type PropIdCallback = js.Function0[java.lang.String]
  type WhenActiveReturnType[Props] = js.Function1[
    /* component */ typingsJapgolly.rrc.mod.ComponentConstructor[Props], 
    typingsJapgolly.rrc.mod.ComponentConstructor[Props]
  ]
}
