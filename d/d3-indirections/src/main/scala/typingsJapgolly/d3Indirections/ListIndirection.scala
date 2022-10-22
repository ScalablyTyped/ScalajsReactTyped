package typingsJapgolly.d3Indirections

import typingsJapgolly.d3Indirections.anon.ResourceIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An indirection with a list of resources to choose from.
  */
trait ListIndirection
  extends StObject
     with IndirectionBase
     with Indirection {
  
  var listIndirection: ResourceIndex
}
object ListIndirection {
  
  inline def apply(listIndirection: ResourceIndex, name: String, resourceType: ResourceType, uid: String): ListIndirection = {
    val __obj = js.Dynamic.literal(listIndirection = listIndirection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndirection]
  }
  
  extension [Self <: ListIndirection](x: Self) {
    
    inline def setListIndirection(value: ResourceIndex): Self = StObject.set(x, "listIndirection", value.asInstanceOf[js.Any])
  }
}
