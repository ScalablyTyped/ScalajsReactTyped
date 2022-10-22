package typingsJapgolly.jose

import typingsJapgolly.jose.distTypesTypesMod.DecryptOptions
import typingsJapgolly.jose.distTypesTypesMod.FlattenedDecryptResult
import typingsJapgolly.jose.distTypesTypesMod.FlattenedJWE
import typingsJapgolly.jose.distTypesTypesMod.GetKeyFunction
import typingsJapgolly.jose.distTypesTypesMod.JWEHeaderParameters
import typingsJapgolly.jose.distTypesTypesMod.KeyLike
import typingsJapgolly.jose.distTypesTypesMod.ResolvedKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJweFlattenedDecryptMod {
  
  @JSImport("jose/dist/types/jwe/flattened/decrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenedDecrypt(jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey): js.Promise[FlattenedDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey, options: DecryptOptions): js.Promise[FlattenedDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  
  type FlattenedDecryptGetKey = GetKeyFunction[js.UndefOr[JWEHeaderParameters], FlattenedJWE]
}
