package typingsJapgolly.jose

import typingsJapgolly.jose.distTypesTypesMod.CompactDecryptResult
import typingsJapgolly.jose.distTypesTypesMod.CompactJWEHeaderParameters
import typingsJapgolly.jose.distTypesTypesMod.DecryptOptions
import typingsJapgolly.jose.distTypesTypesMod.FlattenedJWE
import typingsJapgolly.jose.distTypesTypesMod.GetKeyFunction
import typingsJapgolly.jose.distTypesTypesMod.KeyLike
import typingsJapgolly.jose.distTypesTypesMod.ResolvedKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJweCompactDecryptMod {
  
  @JSImport("jose/dist/types/jwe/compact/decrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compactDecrypt(jwe: String, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: String, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  
  type CompactDecryptGetKey = GetKeyFunction[CompactJWEHeaderParameters, FlattenedJWE]
}
