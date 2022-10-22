package typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIssue extends StObject {
  
  /** Describes a blocked resource issue. */
  var blockedResource: js.UndefOr[BlockedResource] = js.undefined
}
object ResourceIssue {
  
  inline def apply(): ResourceIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIssue]
  }
  
  extension [Self <: ResourceIssue](x: Self) {
    
    inline def setBlockedResource(value: BlockedResource): Self = StObject.set(x, "blockedResource", value.asInstanceOf[js.Any])
    
    inline def setBlockedResourceUndefined: Self = StObject.set(x, "blockedResource", js.undefined)
  }
}
