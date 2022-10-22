package typingsJapgolly.jose

import typingsJapgolly.jose.distTypesTypesMod.FlattenedJWSInput
import typingsJapgolly.jose.distTypesTypesMod.GetKeyFunction
import typingsJapgolly.jose.distTypesTypesMod.JWTClaimVerificationOptions
import typingsJapgolly.jose.distTypesTypesMod.JWTHeaderParameters
import typingsJapgolly.jose.distTypesTypesMod.JWTVerifyResult
import typingsJapgolly.jose.distTypesTypesMod.KeyLike
import typingsJapgolly.jose.distTypesTypesMod.ResolvedKey
import typingsJapgolly.jose.distTypesTypesMod.VerifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwtVerifyMod {
  
  @JSImport("jose/dist/types/jwt/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jwtVerify(jwt: String, getKey: JWTVerifyGetKey): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: String, getKey: JWTVerifyGetKey, options: JWTVerifyOptions): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: String, key: js.typedarray.Uint8Array): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: js.typedarray.Uint8Array, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: KeyLike): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: KeyLike, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, getKey: JWTVerifyGetKey): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, getKey: JWTVerifyGetKey, options: JWTVerifyOptions): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: KeyLike): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: KeyLike, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  
  type JWTVerifyGetKey = GetKeyFunction[JWTHeaderParameters, FlattenedJWSInput]
  
  trait JWTVerifyOptions
    extends StObject
       with VerifyOptions
       with JWTClaimVerificationOptions
  object JWTVerifyOptions {
    
    inline def apply(): JWTVerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWTVerifyOptions]
    }
  }
}
