package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.interfacesMod.Action
import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import typingsJapgolly.dndCore.interfacesMod.HoverOptions
import typingsJapgolly.dndCore.interfacesMod.HoverPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop/hover", JSImport.Namespace)
@js.native
object hoverMod extends js.Object {
  def default(manager: DragDropManager): js.Function2[
    /* targetIdsArg */ js.Array[String], 
    /* hasClientOffset */ js.UndefOr[HoverOptions], 
    Action[HoverPayload]
  ] = js.native
}

