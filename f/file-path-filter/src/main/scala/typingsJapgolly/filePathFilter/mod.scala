package typingsJapgolly.filePathFilter

import typingsJapgolly.filePathFilter.typesMod.AnyFilter
import typingsJapgolly.filePathFilter.typesMod.FilterCriteria
import typingsJapgolly.filePathFilter.typesMod.FilterCriterion
import typingsJapgolly.filePathFilter.typesMod.FilterFunction
import typingsJapgolly.filePathFilter.typesMod.Filters
import typingsJapgolly.filePathFilter.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createFilter(options: Options, criteria: FilterCriterion*): FilterFunction = js.native
  def createFilter(options: Options, criteria: AnyFilter): FilterFunction = js.native
  def createFilter(options: Options, filters: Filters[FilterCriteria]): FilterFunction = js.native
  def default(criteria: FilterCriterion*): FilterFunction = js.native
  def default(criteria: AnyFilter): FilterFunction = js.native
  def default(filters: Filters[FilterCriteria]): FilterFunction = js.native
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}

