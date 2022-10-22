package typingsJapgolly.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "ProtectSaltGenerator")
@js.native
open class ProtectSaltGenerator protected ()
  extends typingsJapgolly.kdbxweb.distTypesCryptoProtectSaltGeneratorMod.ProtectSaltGenerator {
  def this(algo: typingsJapgolly.kdbxweb.distTypesCryptoChacha20Mod.ChaCha20) = this()
  def this(algo: typingsJapgolly.kdbxweb.distTypesCryptoSalsa20Mod.Salsa20) = this()
}
/* static members */
object ProtectSaltGenerator {
  
  @JSImport("kdbxweb", "ProtectSaltGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(key: js.typedarray.ArrayBuffer, crsAlgorithm: Double): js.Promise[
    typingsJapgolly.kdbxweb.distTypesCryptoProtectSaltGeneratorMod.ProtectSaltGenerator
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], crsAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typingsJapgolly.kdbxweb.distTypesCryptoProtectSaltGeneratorMod.ProtectSaltGenerator
  ]]
  inline def create(key: js.typedarray.Uint8Array, crsAlgorithm: Double): js.Promise[
    typingsJapgolly.kdbxweb.distTypesCryptoProtectSaltGeneratorMod.ProtectSaltGenerator
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], crsAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typingsJapgolly.kdbxweb.distTypesCryptoProtectSaltGeneratorMod.ProtectSaltGenerator
  ]]
}
