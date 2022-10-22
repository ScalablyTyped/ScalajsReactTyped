package typingsJapgolly.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "ProtectedValue")
@js.native
open class ProtectedValue protected ()
  extends typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue {
  def this(value: js.typedarray.ArrayBuffer, salt: js.typedarray.ArrayBuffer) = this()
}
/* static members */
object ProtectedValue {
  
  @JSImport("kdbxweb", "ProtectedValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBase64(base64: String): typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue]
  
  /**
    * Keep in mind that you're passing the ownership of this array, the contents will be destroyed
    */
  inline def fromBinary(binary: js.typedarray.ArrayBuffer): typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(binary.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue]
  
  inline def fromString(str: String): typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue]
}
