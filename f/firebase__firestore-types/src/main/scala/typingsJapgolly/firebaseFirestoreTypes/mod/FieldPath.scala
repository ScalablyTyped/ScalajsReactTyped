package typingsJapgolly.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "FieldPath")
@js.native
open class FieldPath protected () extends StObject {
  def this(fieldNames: String*) = this()
  
  def isEqual(other: FieldPath): Boolean = js.native
}
/* static members */
object FieldPath {
  
  @JSImport("@firebase/firestore-types", "FieldPath")
  @js.native
  val ^ : js.Any = js.native
  
  inline def documentId(): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[FieldPath]
}
