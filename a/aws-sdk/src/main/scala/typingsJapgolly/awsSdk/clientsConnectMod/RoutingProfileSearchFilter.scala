package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingProfileSearchFilter extends StObject {
  
  var TagFilter: js.UndefOr[ControlPlaneTagFilter] = js.undefined
}
object RoutingProfileSearchFilter {
  
  inline def apply(): RoutingProfileSearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingProfileSearchFilter]
  }
  
  extension [Self <: RoutingProfileSearchFilter](x: Self) {
    
    inline def setTagFilter(value: ControlPlaneTagFilter): Self = StObject.set(x, "TagFilter", value.asInstanceOf[js.Any])
    
    inline def setTagFilterUndefined: Self = StObject.set(x, "TagFilter", js.undefined)
  }
}
