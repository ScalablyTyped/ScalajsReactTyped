package typingsJapgolly.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Assign a list resource by setting its current index.
  */
trait ListAssignment
  extends StObject
     with AssignmentBase
     with Assignment {
  
  /** New index of the resource list to use. */
  var resourceIndex: Double
}
object ListAssignment {
  
  inline def apply(resourceIndex: Double, uid: String): ListAssignment = {
    val __obj = js.Dynamic.literal(resourceIndex = resourceIndex.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssignment]
  }
  
  extension [Self <: ListAssignment](x: Self) {
    
    inline def setResourceIndex(value: Double): Self = StObject.set(x, "resourceIndex", value.asInstanceOf[js.Any])
  }
}
