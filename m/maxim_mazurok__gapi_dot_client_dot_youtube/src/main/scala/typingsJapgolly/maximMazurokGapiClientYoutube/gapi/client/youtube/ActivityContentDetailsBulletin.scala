package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityContentDetailsBulletin extends StObject {
  
  /** The resourceId object contains information that identifies the resource associated with a bulletin post. @mutable youtube.activities.insert */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}
object ActivityContentDetailsBulletin {
  
  inline def apply(): ActivityContentDetailsBulletin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsBulletin]
  }
  
  extension [Self <: ActivityContentDetailsBulletin](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
