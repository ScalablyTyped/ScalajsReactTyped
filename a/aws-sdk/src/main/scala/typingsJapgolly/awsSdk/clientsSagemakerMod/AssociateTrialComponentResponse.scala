package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTrialComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.TrialArn] = js.undefined
  
  /**
    * The ARN of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.TrialComponentArn] = js.undefined
}
object AssociateTrialComponentResponse {
  
  inline def apply(): AssociateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTrialComponentResponse]
  }
  
  extension [Self <: AssociateTrialComponentResponse](x: Self) {
    
    inline def setTrialArn(value: TrialArn): Self = StObject.set(x, "TrialArn", value.asInstanceOf[js.Any])
    
    inline def setTrialArnUndefined: Self = StObject.set(x, "TrialArn", js.undefined)
    
    inline def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
  }
}
