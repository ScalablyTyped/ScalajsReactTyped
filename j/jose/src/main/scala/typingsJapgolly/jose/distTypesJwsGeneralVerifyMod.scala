package typingsJapgolly.jose

import typingsJapgolly.jose.distTypesTypesMod.FlattenedJWSInput
import typingsJapgolly.jose.distTypesTypesMod.GeneralJWSInput
import typingsJapgolly.jose.distTypesTypesMod.GeneralVerifyResult
import typingsJapgolly.jose.distTypesTypesMod.GetKeyFunction
import typingsJapgolly.jose.distTypesTypesMod.JWSHeaderParameters
import typingsJapgolly.jose.distTypesTypesMod.KeyLike
import typingsJapgolly.jose.distTypesTypesMod.ResolvedKey
import typingsJapgolly.jose.distTypesTypesMod.VerifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwsGeneralVerifyMod {
  
  @JSImport("jose/dist/types/jws/general/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generalVerify(jws: GeneralJWSInput, getKey: GeneralVerifyGetKey): js.Promise[GeneralVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey]]
  inline def generalVerify(jws: GeneralJWSInput, getKey: GeneralVerifyGetKey, options: VerifyOptions): js.Promise[GeneralVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  
  type GeneralVerifyGetKey = GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]
}
