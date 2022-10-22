package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityContentDetailsLike extends StObject {
  
  /** The resourceId object contains information that identifies the rated resource. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}
object ActivityContentDetailsLike {
  
  inline def apply(): ActivityContentDetailsLike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsLike]
  }
  
  extension [Self <: ActivityContentDetailsLike](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
