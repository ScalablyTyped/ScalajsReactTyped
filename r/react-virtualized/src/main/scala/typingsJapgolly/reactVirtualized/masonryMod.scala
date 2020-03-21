package typingsJapgolly.reactVirtualized

import typingsJapgolly.reactVirtualized.esMasonryMod.MasonryProps
import typingsJapgolly.reactVirtualized.esMasonryMod.MasonryState
import typingsJapgolly.reactVirtualized.esMasonryMod.Positioner
import typingsJapgolly.reactVirtualized.esMasonryMod.createCellPositionerParams
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`150`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Masonry", JSImport.Namespace)
@js.native
object masonryMod extends js.Object {
  @js.native
  class Masonry ()
    extends typingsJapgolly.reactVirtualized.esMasonryMod.Masonry
  
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: `150` = js.native
  def createCellPositioner(params: createCellPositionerParams): Positioner = js.native
  /* static members */
  @js.native
  object Masonry extends js.Object {
    var defaultProps: AnonKeyMapper = js.native
    def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = js.native
  }
  
}

