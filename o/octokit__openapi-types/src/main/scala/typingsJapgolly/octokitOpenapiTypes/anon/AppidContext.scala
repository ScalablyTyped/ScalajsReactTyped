package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppidContext extends StObject {
  
  /** @description The ID of the GitHub App that must provide this check. Omit this field to automatically select the GitHub App that has recently provided this check, or any app if it was not set by a GitHub App. Pass -1 to explicitly allow any app to set the status. */
  var app_id: js.UndefOr[Double] = js.undefined
  
  /** @description The name of the required check */
  var context: String
}
object AppidContext {
  
  inline def apply(context: String): AppidContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppidContext]
  }
  
  extension [Self <: AppidContext](x: Self) {
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
