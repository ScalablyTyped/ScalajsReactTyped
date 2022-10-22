package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTasksParams extends StObject {
  
  var listActiveTasksOnly: Boolean
}
object ListTasksParams {
  
  inline def apply(listActiveTasksOnly: Boolean): ListTasksParams = {
    val __obj = js.Dynamic.literal(listActiveTasksOnly = listActiveTasksOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksParams]
  }
  
  extension [Self <: ListTasksParams](x: Self) {
    
    inline def setListActiveTasksOnly(value: Boolean): Self = StObject.set(x, "listActiveTasksOnly", value.asInstanceOf[js.Any])
  }
}
