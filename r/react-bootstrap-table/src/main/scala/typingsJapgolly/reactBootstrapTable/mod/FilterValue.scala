package typingsJapgolly.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactBootstrapTable.mod.TextFilterData
  - typingsJapgolly.reactBootstrapTable.mod.SelectFilterData
  - typingsJapgolly.reactBootstrapTable.mod.RegexFilterData
  - typingsJapgolly.reactBootstrapTable.mod.NumberFilterData
  - typingsJapgolly.reactBootstrapTable.mod.DateFilterData
  - typingsJapgolly.reactBootstrapTable.mod.ArrayFilterData
*/
trait FilterValue extends StObject
object FilterValue {
  
  inline def ArrayFilterData(value: js.Array[Double | String]): typingsJapgolly.reactBootstrapTable.mod.ArrayFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayFilter")
    __obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.ArrayFilterData]
  }
  
  inline def DateFilterData(value: DateFilterValue): typingsJapgolly.reactBootstrapTable.mod.DateFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DateFilter")
    __obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.DateFilterData]
  }
  
  inline def NumberFilterData(value: NumberFilterValue): typingsJapgolly.reactBootstrapTable.mod.NumberFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberFilter")
    __obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.NumberFilterData]
  }
  
  inline def RegexFilterData(value: String): typingsJapgolly.reactBootstrapTable.mod.RegexFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegexFilter")
    __obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.RegexFilterData]
  }
  
  inline def SelectFilterData(value: String): typingsJapgolly.reactBootstrapTable.mod.SelectFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectFilter")
    __obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.SelectFilterData]
  }
  
  inline def TextFilterData(value: String): typingsJapgolly.reactBootstrapTable.mod.TextFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TextFilter")
    __obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.TextFilterData]
  }
}
