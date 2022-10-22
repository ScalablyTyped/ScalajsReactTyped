package typingsJapgolly.jose

import typingsJapgolly.jose.distTypesTypesMod.FlattenedJWSInput
import typingsJapgolly.jose.distTypesTypesMod.FlattenedVerifyResult
import typingsJapgolly.jose.distTypesTypesMod.GetKeyFunction
import typingsJapgolly.jose.distTypesTypesMod.JWSHeaderParameters
import typingsJapgolly.jose.distTypesTypesMod.KeyLike
import typingsJapgolly.jose.distTypesTypesMod.ResolvedKey
import typingsJapgolly.jose.distTypesTypesMod.VerifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwsFlattenedVerifyMod {
  
  @JSImport("jose/dist/types/jws/flattened/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenedVerify(jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey): js.Promise[FlattenedVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey]]
  inline def flattenedVerify(jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey, options: VerifyOptions): js.Promise[FlattenedVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  
  type FlattenedVerifyGetKey = GetKeyFunction[js.UndefOr[JWSHeaderParameters], FlattenedJWSInput]
}
