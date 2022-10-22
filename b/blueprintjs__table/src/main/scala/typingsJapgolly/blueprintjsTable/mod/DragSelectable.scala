package typingsJapgolly.blueprintjsTable.mod

import typingsJapgolly.blueprintjsTable.anon.PartialIDragSelectablePro
import typingsJapgolly.blueprintjsTable.libEsmInteractionsSelectableMod.IDragSelectableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "DragSelectable")
@js.native
open class DragSelectable protected ()
  extends typingsJapgolly.blueprintjsTable.libEsmInteractionsSelectableMod.DragSelectable {
  def this(props: IDragSelectableProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: IDragSelectableProps, context: Any) = this()
}
/* static members */
object DragSelectable {
  
  @JSImport("@blueprintjs/table", "DragSelectable")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "DragSelectable.defaultProps")
  @js.native
  def defaultProps: PartialIDragSelectablePro = js.native
  inline def defaultProps_=(x: PartialIDragSelectablePro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
