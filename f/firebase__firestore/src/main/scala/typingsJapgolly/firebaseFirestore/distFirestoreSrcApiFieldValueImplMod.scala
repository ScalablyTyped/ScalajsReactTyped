package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcApiFieldValueImplMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/field_value_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayRemove(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]
  
  inline def arrayUnion(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]
  
  inline def deleteField(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[FieldValue]
  
  inline def increment(n: Double): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[FieldValue]
  
  inline def serverTimestamp(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[FieldValue]
}
