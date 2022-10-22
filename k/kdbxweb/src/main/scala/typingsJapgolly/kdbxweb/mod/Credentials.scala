package typingsJapgolly.kdbxweb.mod

import typingsJapgolly.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxChallengeResponseFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Credentials")
@js.native
open class Credentials ()
  extends typingsJapgolly.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxCredentials {
  def this(password: typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue) = this()
  def this(password: Null, keyFile: js.typedarray.ArrayBuffer) = this()
  def this(password: Null, keyFile: js.typedarray.Uint8Array) = this()
  def this(
    password: typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue,
    keyFile: js.typedarray.ArrayBuffer
  ) = this()
  def this(
    password: typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue,
    keyFile: js.typedarray.Uint8Array
  ) = this()
  def this(password: Null, keyFile: js.typedarray.ArrayBuffer, challengeResponse: KdbxChallengeResponseFn) = this()
  def this(password: Null, keyFile: js.typedarray.Uint8Array, challengeResponse: KdbxChallengeResponseFn) = this()
  def this(password: Null, keyFile: Null, challengeResponse: KdbxChallengeResponseFn) = this()
  def this(password: Null, keyFile: Unit, challengeResponse: KdbxChallengeResponseFn) = this()
  def this(
    password: typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue,
    keyFile: js.typedarray.ArrayBuffer,
    challengeResponse: KdbxChallengeResponseFn
  ) = this()
  def this(
    password: typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue,
    keyFile: js.typedarray.Uint8Array,
    challengeResponse: KdbxChallengeResponseFn
  ) = this()
  def this(
    password: typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue,
    keyFile: Null,
    challengeResponse: KdbxChallengeResponseFn
  ) = this()
  def this(
    password: typingsJapgolly.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue,
    keyFile: Unit,
    challengeResponse: KdbxChallengeResponseFn
  ) = this()
}
/* static members */
object Credentials {
  
  @JSImport("kdbxweb", "Credentials")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createKeyFileWithHash(keyBytes: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeyFileWithHash")(keyBytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def createKeyFileWithHash(keyBytes: js.typedarray.ArrayBuffer, version: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("createKeyFileWithHash")(keyBytes.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def createRandomKeyFile(): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandomKeyFile")().asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def createRandomKeyFile(version: Double): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandomKeyFile")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}
