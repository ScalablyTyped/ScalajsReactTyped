package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLocalDisksOutput extends StObject {
  
  /**
    * A JSON object containing the following fields:    ListLocalDisksOutput$Disks   
    */
  var Disks: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.Disks] = js.undefined
  
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object ListLocalDisksOutput {
  
  inline def apply(): ListLocalDisksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocalDisksOutput]
  }
  
  extension [Self <: ListLocalDisksOutput](x: Self) {
    
    inline def setDisks(value: Disks): Self = StObject.set(x, "Disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "Disks", js.undefined)
    
    inline def setDisksVarargs(value: Disk*): Self = StObject.set(x, "Disks", js.Array(value*))
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
