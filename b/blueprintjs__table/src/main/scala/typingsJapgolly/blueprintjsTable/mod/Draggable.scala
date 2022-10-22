package typingsJapgolly.blueprintjsTable.mod

import typingsJapgolly.blueprintjsTable.anon.PreventDefault
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDraggableMod.IDraggableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Draggable")
@js.native
open class Draggable protected ()
  extends typingsJapgolly.blueprintjsTable.libEsmInteractionsDraggableMod.Draggable {
  def this(props: IDraggableProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: IDraggableProps, context: Any) = this()
}
/* static members */
object Draggable {
  
  @JSImport("@blueprintjs/table", "Draggable")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "Draggable.defaultProps")
  @js.native
  def defaultProps: PreventDefault = js.native
  inline def defaultProps_=(x: PreventDefault): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
