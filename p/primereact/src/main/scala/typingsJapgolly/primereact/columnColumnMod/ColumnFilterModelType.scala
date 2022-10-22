package typingsJapgolly.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.primereact.columnColumnMod.ColumnFilterMetaData
  - typingsJapgolly.primereact.columnColumnMod.ColumnFilterMetaDataWithConstraint
*/
trait ColumnFilterModelType extends StObject
object ColumnFilterModelType {
  
  inline def ColumnFilterMetaData(matchMode: ColumnFilterMatchModeType, value: Any): typingsJapgolly.primereact.columnColumnMod.ColumnFilterMetaData = {
    val __obj = js.Dynamic.literal(matchMode = matchMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.primereact.columnColumnMod.ColumnFilterMetaData]
  }
  
  inline def ColumnFilterMetaDataWithConstraint(constraints: js.Array[ColumnFilterMetaData], operator: ColumnFilterOperatorType): typingsJapgolly.primereact.columnColumnMod.ColumnFilterMetaDataWithConstraint = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.primereact.columnColumnMod.ColumnFilterMetaDataWithConstraint]
  }
}
