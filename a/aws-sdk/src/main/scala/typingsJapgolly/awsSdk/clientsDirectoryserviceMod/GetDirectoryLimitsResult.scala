package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDirectoryLimitsResult extends StObject {
  
  /**
    * A DirectoryLimits object that contains the directory limits for the current Region.
    */
  var DirectoryLimits: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.DirectoryLimits] = js.undefined
}
object GetDirectoryLimitsResult {
  
  inline def apply(): GetDirectoryLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDirectoryLimitsResult]
  }
  
  extension [Self <: GetDirectoryLimitsResult](x: Self) {
    
    inline def setDirectoryLimits(value: DirectoryLimits): Self = StObject.set(x, "DirectoryLimits", value.asInstanceOf[js.Any])
    
    inline def setDirectoryLimitsUndefined: Self = StObject.set(x, "DirectoryLimits", js.undefined)
  }
}
