package typingsJapgolly.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSqlInjectionMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsJapgolly.awsSdk.clientsWafMod.ChangeToken] = js.undefined
  
  /**
    * A SqlInjectionMatchSet.
    */
  var SqlInjectionMatchSet: js.UndefOr[typingsJapgolly.awsSdk.clientsWafMod.SqlInjectionMatchSet] = js.undefined
}
object CreateSqlInjectionMatchSetResponse {
  
  inline def apply(): CreateSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSqlInjectionMatchSetResponse]
  }
  
  extension [Self <: CreateSqlInjectionMatchSetResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    inline def setSqlInjectionMatchSet(value: SqlInjectionMatchSet): Self = StObject.set(x, "SqlInjectionMatchSet", value.asInstanceOf[js.Any])
    
    inline def setSqlInjectionMatchSetUndefined: Self = StObject.set(x, "SqlInjectionMatchSet", js.undefined)
  }
}
