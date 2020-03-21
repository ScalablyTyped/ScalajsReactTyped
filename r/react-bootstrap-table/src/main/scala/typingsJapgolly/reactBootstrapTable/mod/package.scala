package typingsJapgolly.reactBootstrapTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomAttrs = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  type EditCheckboxOptionValue = java.lang.String
  type EditSelectOptionValue = js.Array[typingsJapgolly.reactBootstrapTable.AnonValue | scala.Double | java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactBootstrapTable.mod.TextFilter
    - typingsJapgolly.reactBootstrapTable.mod.SelectFilter
    - typingsJapgolly.reactBootstrapTable.mod.RegexFilter
    - typingsJapgolly.reactBootstrapTable.mod.NumberFilter
    - typingsJapgolly.reactBootstrapTable.mod.DateFilter
    - typingsJapgolly.reactBootstrapTable.mod.CustomFilter[js.Any, js.Any]
  */
  type Filter = typingsJapgolly.reactBootstrapTable.mod._Filter | (typingsJapgolly.reactBootstrapTable.mod.CustomFilter[js.Any, js.Any])
  type FilterData[CustomFilterValue /* <: js.Object */] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactBootstrapTable.mod.FilterValue | CustomFilterValue]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typingsJapgolly.reactBootstrapTable.mod.DateFilterValue
    - typingsJapgolly.reactBootstrapTable.mod.NumberFilterValue
  */
  type FilterValueData = typingsJapgolly.reactBootstrapTable.mod._FilterValueData | (js.Array[scala.Double | java.lang.String]) | java.lang.String | scala.Double
  type SelectFilterOptionsType = (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]) with (org.scalablytyped.runtime.NumberDictionary[java.lang.String | scala.Double | scala.Boolean])
  type SizePerPageList = js.Array[typingsJapgolly.reactBootstrapTable.AnonText | scala.Double]
}
