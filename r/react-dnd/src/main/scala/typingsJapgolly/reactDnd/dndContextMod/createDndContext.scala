package typingsJapgolly.reactDnd.dndContextMod

import typingsJapgolly.dndCore.interfacesMod.BackendFactory
import typingsJapgolly.reactDnd.AnonDragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DndContext", "createDndContext")
@js.native
object createDndContext extends js.Object {
  def apply[BackendContext, BackendOptions](backend: BackendFactory): AnonDragDropManager = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): AnonDragDropManager = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): AnonDragDropManager = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): AnonDragDropManager = js.native
}

