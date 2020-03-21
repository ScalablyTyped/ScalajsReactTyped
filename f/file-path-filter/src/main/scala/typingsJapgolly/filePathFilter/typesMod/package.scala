package typingsJapgolly.filePathFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnyFilter = typingsJapgolly.filePathFilter.typesMod.FilterCriteria | typingsJapgolly.filePathFilter.PartialFiltersFilterCrite
  type FilterCriteria = typingsJapgolly.filePathFilter.typesMod.FilterCriterion | js.Array[typingsJapgolly.filePathFilter.typesMod.FilterCriterion]
  type FilterCriterion = scala.Boolean | java.lang.String | js.RegExp | typingsJapgolly.filePathFilter.typesMod.FilterFunction
  type FilterFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type MapFunction = js.Function1[/* repeated */ js.Any, java.lang.String]
}
