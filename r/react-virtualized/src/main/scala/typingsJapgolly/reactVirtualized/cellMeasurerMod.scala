package typingsJapgolly.reactVirtualized

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheParams
import typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/CellMeasurer", JSImport.Namespace)
@js.native
object cellMeasurerMod extends js.Object {
  @js.native
  class CellMeasurer ()
    extends Component[CellMeasurerProps, js.Object, js.Any]
  
  @js.native
  class CellMeasurerCache ()
    extends typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerCache {
    def this(params: CellMeasurerCacheParams) = this()
  }
  
}

