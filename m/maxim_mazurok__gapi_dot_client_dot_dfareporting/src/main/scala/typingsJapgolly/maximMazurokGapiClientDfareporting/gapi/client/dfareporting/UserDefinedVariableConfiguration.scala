package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedVariableConfiguration extends StObject {
  
  /** Data type for the variable. This is a required field. */
  var dataType: js.UndefOr[String] = js.undefined
  
  /** User-friendly name for the variable which will appear in reports. This is a required field, must be less than 64 characters long, and cannot contain the following characters: ""<>". */
  var reportName: js.UndefOr[String] = js.undefined
  
  /** Variable name in the tag. This is a required field. */
  var variableType: js.UndefOr[String] = js.undefined
}
object UserDefinedVariableConfiguration {
  
  inline def apply(): UserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedVariableConfiguration]
  }
  
  extension [Self <: UserDefinedVariableConfiguration](x: Self) {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
    
    inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    
    inline def setVariableType(value: String): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
    
    inline def setVariableTypeUndefined: Self = StObject.set(x, "variableType", js.undefined)
  }
}
