package typingsJapgolly.reactVirtualized

import typingsJapgolly.reactVirtualized.esMultiGridMod.MultiGridProps
import typingsJapgolly.reactVirtualized.esMultiGridMod.MultiGridState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/MultiGrid", JSImport.Namespace)
@js.native
object multiGridMod extends js.Object {
  @js.native
  class MultiGrid ()
    extends typingsJapgolly.reactVirtualized.esMultiGridMod.MultiGrid
  
  /* static members */
  @js.native
  object MultiGrid extends js.Object {
    var defaultProps: AnonClassNameBottomRightGrid = js.native
    var propTypes: AnonClassNameBottomLeftGrid = js.native
    def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = js.native
  }
  
}

