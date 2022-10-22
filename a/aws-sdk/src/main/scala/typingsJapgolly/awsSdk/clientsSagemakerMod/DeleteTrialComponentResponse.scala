package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrialComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component is being deleted.
    */
  var TrialComponentArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.TrialComponentArn] = js.undefined
}
object DeleteTrialComponentResponse {
  
  inline def apply(): DeleteTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrialComponentResponse]
  }
  
  extension [Self <: DeleteTrialComponentResponse](x: Self) {
    
    inline def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
  }
}
