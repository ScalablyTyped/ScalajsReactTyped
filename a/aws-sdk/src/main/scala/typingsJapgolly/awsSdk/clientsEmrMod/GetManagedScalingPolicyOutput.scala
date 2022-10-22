package typingsJapgolly.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedScalingPolicyOutput extends StObject {
  
  /**
    * Specifies the managed scaling policy that is attached to an Amazon EMR cluster. 
    */
  var ManagedScalingPolicy: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrMod.ManagedScalingPolicy] = js.undefined
}
object GetManagedScalingPolicyOutput {
  
  inline def apply(): GetManagedScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManagedScalingPolicyOutput]
  }
  
  extension [Self <: GetManagedScalingPolicyOutput](x: Self) {
    
    inline def setManagedScalingPolicy(value: ManagedScalingPolicy): Self = StObject.set(x, "ManagedScalingPolicy", value.asInstanceOf[js.Any])
    
    inline def setManagedScalingPolicyUndefined: Self = StObject.set(x, "ManagedScalingPolicy", js.undefined)
  }
}
