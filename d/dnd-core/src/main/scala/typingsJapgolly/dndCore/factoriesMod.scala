package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.interfacesMod.BackendFactory
import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/factories", JSImport.Namespace)
@js.native
object factoriesMod extends js.Object {
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any): DragDropManager = js.native
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any, debugMode: Boolean): DragDropManager = js.native
}

