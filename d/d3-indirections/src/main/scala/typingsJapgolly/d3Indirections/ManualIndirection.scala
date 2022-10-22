package typingsJapgolly.d3Indirections

import typingsJapgolly.d3Indirections.anon.ResourceUid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An indirection that can have a resource.
  */
trait ManualIndirection
  extends StObject
     with IndirectionBase
     with Indirection {
  
  var manualIndirection: ResourceUid
}
object ManualIndirection {
  
  inline def apply(manualIndirection: ResourceUid, name: String, resourceType: ResourceType, uid: String): ManualIndirection = {
    val __obj = js.Dynamic.literal(manualIndirection = manualIndirection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualIndirection]
  }
  
  extension [Self <: ManualIndirection](x: Self) {
    
    inline def setManualIndirection(value: ResourceUid): Self = StObject.set(x, "manualIndirection", value.asInstanceOf[js.Any])
  }
}
