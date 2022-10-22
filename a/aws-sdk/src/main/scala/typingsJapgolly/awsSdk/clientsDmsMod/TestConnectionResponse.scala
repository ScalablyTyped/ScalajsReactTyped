package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestConnectionResponse extends StObject {
  
  /**
    * The connection tested.
    */
  var Connection: js.UndefOr[typingsJapgolly.awsSdk.clientsDmsMod.Connection] = js.undefined
}
object TestConnectionResponse {
  
  inline def apply(): TestConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestConnectionResponse]
  }
  
  extension [Self <: TestConnectionResponse](x: Self) {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
