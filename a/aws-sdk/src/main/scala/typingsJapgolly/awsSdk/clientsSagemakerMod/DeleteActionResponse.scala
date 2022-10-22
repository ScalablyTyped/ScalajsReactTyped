package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteActionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the action.
    */
  var ActionArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ActionArn] = js.undefined
}
object DeleteActionResponse {
  
  inline def apply(): DeleteActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteActionResponse]
  }
  
  extension [Self <: DeleteActionResponse](x: Self) {
    
    inline def setActionArn(value: ActionArn): Self = StObject.set(x, "ActionArn", value.asInstanceOf[js.Any])
    
    inline def setActionArnUndefined: Self = StObject.set(x, "ActionArn", js.undefined)
  }
}
