package typingsJapgolly.tablesorter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tablesorter.filterFunctionMod.FilterFunction
import typingsJapgolly.tablesorter.tablesorterBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/FilterFunctionCollection", JSImport.Namespace)
@js.native
object filterFunctionCollectionMod extends js.Object {
  type FilterFunctionCollection[TElement] = /**
    * The display-name of the filter-function and the `FilterFunction` itself.
    */
  StringDictionary[FilterFunction[TElement] | `true`]
}

