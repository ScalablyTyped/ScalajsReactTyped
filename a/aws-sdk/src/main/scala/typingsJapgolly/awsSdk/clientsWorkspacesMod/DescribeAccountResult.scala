package typingsJapgolly.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountResult extends StObject {
  
  /**
    * The IP address range, specified as an IPv4 CIDR block, used for the management network interface. The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkspacesMod.DedicatedTenancyManagementCidrRange] = js.undefined
  
  /**
    * The status of BYOL (whether BYOL is enabled or disabled).
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined
}
object DescribeAccountResult {
  
  inline def apply(): DescribeAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountResult]
  }
  
  extension [Self <: DescribeAccountResult](x: Self) {
    
    inline def setDedicatedTenancyManagementCidrRange(value: DedicatedTenancyManagementCidrRange): Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", value.asInstanceOf[js.Any])
    
    inline def setDedicatedTenancyManagementCidrRangeUndefined: Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", js.undefined)
    
    inline def setDedicatedTenancySupport(value: DedicatedTenancySupportResultEnum): Self = StObject.set(x, "DedicatedTenancySupport", value.asInstanceOf[js.Any])
    
    inline def setDedicatedTenancySupportUndefined: Self = StObject.set(x, "DedicatedTenancySupport", js.undefined)
  }
}
