package typingsJapgolly.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tabris.anon.Offset
  - typingsJapgolly.tabris.anon.Reference
*/
trait ConstraintLikeObject
  extends StObject
     with _ConstraintValue
object ConstraintLikeObject {
  
  inline def Offset(reference: SiblingReferenceValue | PercentValue): typingsJapgolly.tabris.anon.Offset = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tabris.anon.Offset]
  }
  
  inline def Reference(offset: Offset): typingsJapgolly.tabris.anon.Reference = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tabris.anon.Reference]
  }
}
