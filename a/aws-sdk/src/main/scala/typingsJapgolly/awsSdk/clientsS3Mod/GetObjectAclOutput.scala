package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectAclOutput extends StObject {
  
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Grants] = js.undefined
  
  /**
    *  Container for the bucket owner's display name and ID.
    */
  var Owner: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Owner] = js.undefined
  
  var RequestCharged: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.RequestCharged] = js.undefined
}
object GetObjectAclOutput {
  
  inline def apply(): GetObjectAclOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectAclOutput]
  }
  
  extension [Self <: GetObjectAclOutput](x: Self) {
    
    inline def setGrants(value: Grants): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
    
    inline def setGrantsVarargs(value: Grant*): Self = StObject.set(x, "Grants", js.Array(value*))
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
