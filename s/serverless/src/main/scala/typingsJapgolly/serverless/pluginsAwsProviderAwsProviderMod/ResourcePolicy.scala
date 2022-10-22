package typingsJapgolly.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.serverless.serverlessStrings.Allow
import typingsJapgolly.serverless.serverlessStrings.Deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicy extends StObject {
  
  var Action: js.UndefOr[String | js.Array[String] | StringDictionary[Any]] = js.undefined
  
  var Condition: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var Effect: Allow | Deny
  
  var Principal: js.UndefOr[String | js.Array[String] | StringDictionary[Any]] = js.undefined
  
  var Resource: js.UndefOr[String | js.Array[String] | StringDictionary[Any]] = js.undefined
}
object ResourcePolicy {
  
  inline def apply(Effect: Allow | Deny): ResourcePolicy = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePolicy]
  }
  
  extension [Self <: ResourcePolicy](x: Self) {
    
    inline def setAction(value: String | js.Array[String] | StringDictionary[Any]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "Action", js.Array(value*))
    
    inline def setCondition(value: StringDictionary[Any]): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setEffect(value: Allow | Deny): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: String | js.Array[String] | StringDictionary[Any]): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    inline def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value*))
    
    inline def setResource(value: String | js.Array[String] | StringDictionary[Any]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value*))
  }
}
