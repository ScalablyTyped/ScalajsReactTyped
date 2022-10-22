package typingsJapgolly.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An index component consisting of field path and index type.  */
trait IndexSegment extends StObject {
  
  /** The field path of the component. */
  val fieldPath: _FieldPath
  
  /** The fields sorting order. */
  val kind: IndexKind
}
object IndexSegment {
  
  inline def apply(fieldPath: _FieldPath, kind: IndexKind): IndexSegment = {
    val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSegment]
  }
  
  extension [Self <: IndexSegment](x: Self) {
    
    inline def setFieldPath(value: _FieldPath): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setKind(value: IndexKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
