package typingsJapgolly.oidcProvider.mod

import typingsJapgolly.oidcProvider.oidcProviderStrings.consent
import typingsJapgolly.oidcProvider.oidcProviderStrings.login
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptDetail extends StObject {
  
  var details: UnknownObject
  
  var name: login | consent | String
  
  var reasons: js.Array[String]
}
object PromptDetail {
  
  inline def apply(details: UnknownObject, name: login | consent | String, reasons: js.Array[String]): PromptDetail = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptDetail]
  }
  
  extension [Self <: PromptDetail](x: Self) {
    
    inline def setDetails(value: UnknownObject): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setName(value: login | consent | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReasons(value: js.Array[String]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsVarargs(value: String*): Self = StObject.set(x, "reasons", js.Array(value*))
  }
}
