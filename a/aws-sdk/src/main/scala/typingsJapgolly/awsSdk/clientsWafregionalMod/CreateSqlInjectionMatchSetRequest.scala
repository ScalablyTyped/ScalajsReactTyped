package typingsJapgolly.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSqlInjectionMatchSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsJapgolly.awsSdk.clientsWafregionalMod.ChangeToken
  
  /**
    * A friendly name or description for the SqlInjectionMatchSet that you're creating. You can't change Name after you create the SqlInjectionMatchSet.
    */
  var Name: ResourceName
}
object CreateSqlInjectionMatchSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateSqlInjectionMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSqlInjectionMatchSetRequest]
  }
  
  extension [Self <: CreateSqlInjectionMatchSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
