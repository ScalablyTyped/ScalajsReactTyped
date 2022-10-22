package typingsJapgolly.jose

import typingsJapgolly.jose.distTypesJwtProduceMod.ProduceJWT
import typingsJapgolly.jose.distTypesTypesMod.JWTHeaderParameters
import typingsJapgolly.jose.distTypesTypesMod.JWTPayload
import typingsJapgolly.jose.distTypesTypesMod.KeyLike
import typingsJapgolly.jose.distTypesTypesMod.SignOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwtSignMod {
  
  @JSImport("jose/dist/types/jwt/sign", "SignJWT")
  @js.native
  open class SignJWT protected () extends ProduceJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
    
    /* private */ var _protectedHeader: Any = js.native
    
    /**
      * Sets the JWS Protected Header on the SignJWT object.
      *
      * @param protectedHeader JWS Protected Header. Must contain an "alg" (JWS Algorithm) property.
      */
    def setProtectedHeader(protectedHeader: JWTHeaderParameters): this.type = js.native
    
    def sign(key: js.typedarray.Uint8Array): js.Promise[String] = js.native
    def sign(key: js.typedarray.Uint8Array, options: SignOptions): js.Promise[String] = js.native
    /**
      * Signs and returns the JWT.
      *
      * @param key Private Key or Secret to sign the JWT with.
      * @param options JWT Sign options.
      */
    def sign(key: KeyLike): js.Promise[String] = js.native
    def sign(key: KeyLike, options: SignOptions): js.Promise[String] = js.native
  }
}
