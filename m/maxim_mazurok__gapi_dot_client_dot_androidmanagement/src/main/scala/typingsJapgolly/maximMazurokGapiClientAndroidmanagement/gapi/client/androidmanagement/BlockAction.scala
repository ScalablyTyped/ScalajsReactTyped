package typingsJapgolly.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockAction extends StObject {
  
  /** Number of days the policy is non-compliant before the device or work profile is blocked. To block access immediately, set to 0. blockAfterDays must be less than wipeAfterDays. */
  var blockAfterDays: js.UndefOr[Double] = js.undefined
  
  /** Specifies the scope of this BlockAction. Only applicable to devices that are company-owned. */
  var blockScope: js.UndefOr[String] = js.undefined
}
object BlockAction {
  
  inline def apply(): BlockAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockAction]
  }
  
  extension [Self <: BlockAction](x: Self) {
    
    inline def setBlockAfterDays(value: Double): Self = StObject.set(x, "blockAfterDays", value.asInstanceOf[js.Any])
    
    inline def setBlockAfterDaysUndefined: Self = StObject.set(x, "blockAfterDays", js.undefined)
    
    inline def setBlockScope(value: String): Self = StObject.set(x, "blockScope", value.asInstanceOf[js.Any])
    
    inline def setBlockScopeUndefined: Self = StObject.set(x, "blockScope", js.undefined)
  }
}
