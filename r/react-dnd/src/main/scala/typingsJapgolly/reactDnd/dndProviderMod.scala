package typingsJapgolly.reactDnd

import typingsJapgolly.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DndProvider", JSImport.Namespace)
@js.native
object dndProviderMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactDnd.AnonManager
    - typingsJapgolly.reactDnd.AnonBackend[BackendContext, BackendOptions]
  */
  trait DndProviderProps[BackendContext, BackendOptions] extends js.Object
  
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
}

