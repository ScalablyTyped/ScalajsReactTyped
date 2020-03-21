package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.interfacesMod.BackendFactory
import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any): DragDropManager = js.native
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any, debugMode: Boolean): DragDropManager = js.native
  @js.native
  object HandlerRole extends js.Object {
    /* "SOURCE" */ val SOURCE: typingsJapgolly.dndCore.interfacesMod.HandlerRole.SOURCE with String = js.native
    /* "TARGET" */ val TARGET: typingsJapgolly.dndCore.interfacesMod.HandlerRole.TARGET with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.dndCore.interfacesMod.HandlerRole with String] = js.native
  }
  
}

