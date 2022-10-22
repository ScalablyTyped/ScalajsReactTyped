package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.azdata.mod.connection.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundOperationInfo extends StObject {
  
  /**
    * Connection information
    */
  var connection: js.UndefOr[Connection] = js.undefined
  
  /**
    * Operation Description
    */
  var description: String
  
  /**
    * Operation Display Name
    */
  var displayName: String
  
  /**
    * True if the operation is cancelable
    */
  var isCancelable: Boolean
  
  /**
    * The actual operation to execute
    */
  def operation(operation: BackgroundOperation): Unit
  
  /**
    * The operation id. A unique id will be assigned to it If not specified a
    */
  var operationId: js.UndefOr[String] = js.undefined
}
object BackgroundOperationInfo {
  
  inline def apply(
    description: String,
    displayName: String,
    isCancelable: Boolean,
    operation: BackgroundOperation => Callback
  ): BackgroundOperationInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isCancelable = isCancelable.asInstanceOf[js.Any], operation = js.Any.fromFunction1((t0: BackgroundOperation) => operation(t0).runNow()))
    __obj.asInstanceOf[BackgroundOperationInfo]
  }
  
  extension [Self <: BackgroundOperationInfo](x: Self) {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIsCancelable(value: Boolean): Self = StObject.set(x, "isCancelable", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: BackgroundOperation => Callback): Self = StObject.set(x, "operation", js.Any.fromFunction1((t0: BackgroundOperation) => value(t0).runNow()))
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
