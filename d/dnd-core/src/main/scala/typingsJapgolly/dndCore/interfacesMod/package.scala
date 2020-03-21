package typingsJapgolly.dndCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type ActionCreator[Payload] = js.Function1[/* args */ js.Array[js.Any], typingsJapgolly.dndCore.interfacesMod.Action[Payload]]
  type BackendFactory = js.Function3[
    /* manager */ typingsJapgolly.dndCore.interfacesMod.DragDropManager, 
    /* globalContext */ js.UndefOr[js.Any], 
    /* configuration */ js.UndefOr[js.Any], 
    typingsJapgolly.dndCore.interfacesMod.Backend
  ]
  type Identifier = java.lang.String | js.Symbol
  type Listener = js.Function0[scala.Unit]
  type SourceType = typingsJapgolly.dndCore.interfacesMod.Identifier
  type TargetType = typingsJapgolly.dndCore.interfacesMod.Identifier | js.Array[typingsJapgolly.dndCore.interfacesMod.Identifier]
  type Unsubscribe = js.Function0[scala.Unit]
}
