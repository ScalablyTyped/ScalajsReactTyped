package typingsJapgolly.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionOutput extends StObject {
  
  /**
    * The connection details, such as status, owner, and provider type.
    */
  var Connection: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.Connection] = js.undefined
}
object GetConnectionOutput {
  
  inline def apply(): GetConnectionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionOutput]
  }
  
  extension [Self <: GetConnectionOutput](x: Self) {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
