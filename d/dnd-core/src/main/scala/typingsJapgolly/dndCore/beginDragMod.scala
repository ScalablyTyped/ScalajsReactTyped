package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.interfacesMod.Action
import typingsJapgolly.dndCore.interfacesMod.BeginDragOptions
import typingsJapgolly.dndCore.interfacesMod.BeginDragPayload
import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop/beginDrag", JSImport.Namespace)
@js.native
object beginDragMod extends js.Object {
  def default(manager: DragDropManager): js.Function2[
    /* sourceIds */ js.UndefOr[js.Array[String]], 
    /* options */ js.UndefOr[BeginDragOptions], 
    js.UndefOr[Action[BeginDragPayload]]
  ] = js.native
}

