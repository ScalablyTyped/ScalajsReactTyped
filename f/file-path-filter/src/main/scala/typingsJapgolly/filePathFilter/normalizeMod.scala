package typingsJapgolly.filePathFilter

import typingsJapgolly.filePathFilter.typesMod.AnyFilter
import typingsJapgolly.filePathFilter.typesMod.FilterFunction
import typingsJapgolly.filePathFilter.typesMod.Filters
import typingsJapgolly.filePathFilter.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  def normalize(criteria: AnyFilter, opts: Options): Filters[js.Array[FilterFunction]] = js.native
}

