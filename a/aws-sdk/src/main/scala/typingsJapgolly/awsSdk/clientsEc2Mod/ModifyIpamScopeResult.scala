package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamScopeResult extends StObject {
  
  /**
    * The results of the modification.
    */
  var IpamScope: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.IpamScope] = js.undefined
}
object ModifyIpamScopeResult {
  
  inline def apply(): ModifyIpamScopeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyIpamScopeResult]
  }
  
  extension [Self <: ModifyIpamScopeResult](x: Self) {
    
    inline def setIpamScope(value: IpamScope): Self = StObject.set(x, "IpamScope", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeUndefined: Self = StObject.set(x, "IpamScope", js.undefined)
  }
}
