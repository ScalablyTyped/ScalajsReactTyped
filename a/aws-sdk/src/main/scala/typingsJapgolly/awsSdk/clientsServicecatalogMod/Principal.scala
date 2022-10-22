package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Principal extends StObject {
  
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.PrincipalARN] = js.undefined
  
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.PrincipalType] = js.undefined
}
object Principal {
  
  inline def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  
  extension [Self <: Principal](x: Self) {
    
    inline def setPrincipalARN(value: PrincipalARN): Self = StObject.set(x, "PrincipalARN", value.asInstanceOf[js.Any])
    
    inline def setPrincipalARNUndefined: Self = StObject.set(x, "PrincipalARN", js.undefined)
    
    inline def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
  }
}
