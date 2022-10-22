package typingsJapgolly.firebaseFirestoreCompat

import typingsJapgolly.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiFieldValueMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/api/field_value", "FieldValue")
  @js.native
  open class FieldValue protected ()
    extends typingsJapgolly.firebaseFirestoreTypes.mod.FieldValue
       with Compat[typingsJapgolly.firebaseFirestore.mod.FieldValue] {
    def this(_delegate: typingsJapgolly.firebaseFirestore.mod.FieldValue) = this()
    
    /* CompleteClass */
    var _delegate: typingsJapgolly.firebaseFirestore.mod.FieldValue = js.native
    
    def isEqual(other: FieldValue): Boolean = js.native
  }
  /* static members */
  object FieldValue {
    
    @JSImport("@firebase/firestore-compat/dist/src/api/field_value", "FieldValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def arrayRemove(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]
    
    inline def arrayUnion(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]
    
    inline def delete(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[FieldValue]
    
    inline def increment(n: Double): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[FieldValue]
    
    inline def serverTimestamp(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[FieldValue]
  }
}
