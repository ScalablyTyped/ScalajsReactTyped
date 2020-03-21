package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.gridCellTypesMod.IGridCellProps
import typingsJapgolly.officeUiFabricReact.gridTypesMod.IGridProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  @js.native
  class GridCell[T, P /* <: IGridCellProps[T] */] ()
    extends typingsJapgolly.officeUiFabricReact.gridMod.GridCell[T, P]
  
  val Grid: FunctionComponent[IGridProps] = js.native
  /* static members */
  @js.native
  object GridCell extends js.Object {
    var defaultProps: AnonDisabled = js.native
  }
  
}

