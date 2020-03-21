package typingsJapgolly.filePathFilter

import typingsJapgolly.filePathFilter.typesMod.AnyFilter
import typingsJapgolly.filePathFilter.typesMod.FilterCriteria
import typingsJapgolly.filePathFilter.typesMod.FilterCriterion
import typingsJapgolly.filePathFilter.typesMod.FilterFunction
import typingsJapgolly.filePathFilter.typesMod.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/file-path-filter", JSImport.Namespace)
@js.native
object filePathFilterMod extends js.Object {
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}

