package typingsJapgolly.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNodeAction. */
trait DialogNodeAction extends StObject {
  
  /** The type of action to invoke. */
  var action_type: js.UndefOr[String] = js.undefined
  
  /** The name of the context variable that the client application will use to pass in credentials for the action. */
  var credentials: js.UndefOr[String] = js.undefined
  
  /** The name of the action. */
  var name: String
  
  /** A map of key/value pairs to be provided to the action. */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /** The location in the dialog context where the result of the action is stored. */
  var result_variable: String
}
object DialogNodeAction {
  
  inline def apply(name: String, result_variable: String): DialogNodeAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result_variable = result_variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeAction]
  }
  
  extension [Self <: DialogNodeAction](x: Self) {
    
    inline def setAction_type(value: String): Self = StObject.set(x, "action_type", value.asInstanceOf[js.Any])
    
    inline def setAction_typeUndefined: Self = StObject.set(x, "action_type", js.undefined)
    
    inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setResult_variable(value: String): Self = StObject.set(x, "result_variable", value.asInstanceOf[js.Any])
  }
}
