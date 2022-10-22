package typingsJapgolly.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any Indirection Resource assignment.
  *
  * This abstract type never gets sent via a PUT request.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.d3Indirections.ManualAssignment
  - typingsJapgolly.d3Indirections.ListAssignment
*/
trait Assignment extends StObject
object Assignment {
  
  inline def ListAssignment(resourceIndex: Double, uid: String): typingsJapgolly.d3Indirections.ListAssignment = {
    val __obj = js.Dynamic.literal(resourceIndex = resourceIndex.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.d3Indirections.ListAssignment]
  }
  
  inline def ManualAssignment(resourceUid: String, uid: String): typingsJapgolly.d3Indirections.ManualAssignment = {
    val __obj = js.Dynamic.literal(resourceUid = resourceUid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.d3Indirections.ManualAssignment]
  }
}
