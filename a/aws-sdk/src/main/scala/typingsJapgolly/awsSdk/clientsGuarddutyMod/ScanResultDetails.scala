package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanResultDetails extends StObject {
  
  /**
    * An enum value representing possible scan results.
    */
  var ScanResult: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.ScanResult] = js.undefined
}
object ScanResultDetails {
  
  inline def apply(): ScanResultDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanResultDetails]
  }
  
  extension [Self <: ScanResultDetails](x: Self) {
    
    inline def setScanResult(value: ScanResult): Self = StObject.set(x, "ScanResult", value.asInstanceOf[js.Any])
    
    inline def setScanResultUndefined: Self = StObject.set(x, "ScanResult", js.undefined)
  }
}
