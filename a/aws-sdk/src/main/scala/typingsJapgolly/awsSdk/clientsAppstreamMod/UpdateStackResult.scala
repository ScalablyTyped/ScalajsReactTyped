package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStackResult extends StObject {
  
  /**
    * Information about the stack.
    */
  var Stack: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.Stack] = js.undefined
}
object UpdateStackResult {
  
  inline def apply(): UpdateStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackResult]
  }
  
  extension [Self <: UpdateStackResult](x: Self) {
    
    inline def setStack(value: Stack): Self = StObject.set(x, "Stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "Stack", js.undefined)
  }
}
