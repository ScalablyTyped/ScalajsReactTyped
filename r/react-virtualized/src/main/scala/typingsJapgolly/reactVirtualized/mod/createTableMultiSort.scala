package typingsJapgolly.reactVirtualized.mod

import typingsJapgolly.reactVirtualized.AnonSortBy
import typingsJapgolly.reactVirtualized.esTableMod.MultiSortOptions
import typingsJapgolly.reactVirtualized.esTableMod.MultiSortReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized", "createTableMultiSort")
@js.native
object createTableMultiSort extends js.Object {
  def apply(sortCallback: js.Function1[/* params */ AnonSortBy, Unit]): MultiSortReturn = js.native
  def apply(sortCallback: js.Function1[/* params */ AnonSortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
}

