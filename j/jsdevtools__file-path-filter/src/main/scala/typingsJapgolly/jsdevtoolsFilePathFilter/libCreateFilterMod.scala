package typingsJapgolly.jsdevtoolsFilePathFilter

import typingsJapgolly.jsdevtoolsFilePathFilter.libTypesMod.AnyFilter
import typingsJapgolly.jsdevtoolsFilePathFilter.libTypesMod.FilterCriteria
import typingsJapgolly.jsdevtoolsFilePathFilter.libTypesMod.FilterCriterion
import typingsJapgolly.jsdevtoolsFilePathFilter.libTypesMod.FilterFunction
import typingsJapgolly.jsdevtoolsFilePathFilter.libTypesMod.Filters
import typingsJapgolly.jsdevtoolsFilePathFilter.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateFilterMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/create-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFilter(options: Options, criteria: FilterCriterion*): FilterFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(scala.List(options.asInstanceOf[js.Any]).`++`(criteria.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FilterFunction]
  inline def createFilter(options: Options, criteria: AnyFilter): FilterFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(options.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[FilterFunction]
  inline def createFilter(options: Options, filters: Filters[FilterCriteria]): FilterFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(options.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[FilterFunction]
}
