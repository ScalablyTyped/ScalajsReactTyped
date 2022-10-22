package typingsJapgolly.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableResponse extends StObject {
  
  /**
    * The updated Timestream table.
    */
  var Table: js.UndefOr[typingsJapgolly.awsSdk.clientsTimestreamwriteMod.Table] = js.undefined
}
object UpdateTableResponse {
  
  inline def apply(): UpdateTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableResponse]
  }
  
  extension [Self <: UpdateTableResponse](x: Self) {
    
    inline def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
