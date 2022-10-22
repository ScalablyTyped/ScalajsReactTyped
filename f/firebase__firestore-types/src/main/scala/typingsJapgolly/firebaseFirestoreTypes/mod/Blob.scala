package typingsJapgolly.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "Blob")
@js.native
/* private */ open class Blob () extends StObject {
  
  def isEqual(other: Blob): Boolean = js.native
  
  def toBase64(): String = js.native
  
  def toUint8Array(): js.typedarray.Uint8Array = js.native
}
/* static members */
object Blob {
  
  @JSImport("@firebase/firestore-types", "Blob")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBase64String(base64: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  inline def fromUint8Array(array: js.typedarray.Uint8Array): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[Blob]
}
