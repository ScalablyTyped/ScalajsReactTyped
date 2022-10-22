package typingsJapgolly.reactBootstrapTable.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrapTable.anon.Text
import typingsJapgolly.reactBootstrapTable.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CustomAttrs = StringDictionary[String | Double | Boolean]

type EditCheckboxOptionValue = String

type EditSelectOptionValue = js.Array[Double | String | Text]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactBootstrapTable.mod.TextFilter
  - typingsJapgolly.reactBootstrapTable.mod.SelectFilter
  - typingsJapgolly.reactBootstrapTable.mod.RegexFilter
  - typingsJapgolly.reactBootstrapTable.mod.NumberFilter
  - typingsJapgolly.reactBootstrapTable.mod.DateFilter
  - typingsJapgolly.reactBootstrapTable.mod.CustomFilter[scala.Any, scala.Any]
*/
type Filter = _Filter | (CustomFilter[Any, Any])

type FilterData[CustomFilterValue /* <: js.Object */] = StringDictionary[FilterValue | CustomFilterValue]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Array[scala.Double | java.lang.String]
  - typingsJapgolly.reactBootstrapTable.mod.DateFilterValue
  - typingsJapgolly.reactBootstrapTable.mod.NumberFilterValue
*/
type FilterValueData = _FilterValueData | (js.Array[Double | String]) | String | Double

type SelectFilterOptionsType = (StringDictionary[String | Double | Boolean]) & (NumberDictionary[String | Double | Boolean])

type SizePerPageList = js.Array[Double | Value]
