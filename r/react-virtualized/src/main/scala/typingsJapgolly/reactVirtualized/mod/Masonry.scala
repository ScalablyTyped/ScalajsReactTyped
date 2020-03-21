package typingsJapgolly.reactVirtualized.mod

import typingsJapgolly.reactVirtualized.AnonKeyMapper
import typingsJapgolly.reactVirtualized.esMasonryMod.MasonryProps
import typingsJapgolly.reactVirtualized.esMasonryMod.MasonryState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized", "Masonry")
@js.native
class Masonry ()
  extends typingsJapgolly.reactVirtualized.esMasonryMod.Masonry

/* static members */
@JSImport("react-virtualized", "Masonry")
@js.native
object Masonry extends js.Object {
  var defaultProps: AnonKeyMapper = js.native
  def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = js.native
}

