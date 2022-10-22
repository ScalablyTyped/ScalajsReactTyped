package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContextResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the context.
    */
  var ContextArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ContextArn] = js.undefined
}
object UpdateContextResponse {
  
  inline def apply(): UpdateContextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContextResponse]
  }
  
  extension [Self <: UpdateContextResponse](x: Self) {
    
    inline def setContextArn(value: ContextArn): Self = StObject.set(x, "ContextArn", value.asInstanceOf[js.Any])
    
    inline def setContextArnUndefined: Self = StObject.set(x, "ContextArn", js.undefined)
  }
}
