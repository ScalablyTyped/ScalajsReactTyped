package typingsJapgolly.lesgo

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.jsonwebtoken.anon.DecodeOptionscompletetrue
import typingsJapgolly.jsonwebtoken.anon.DecodeOptionsjsontrue
import typingsJapgolly.jsonwebtoken.anon.VerifyOptionscompletefals
import typingsJapgolly.jsonwebtoken.anon.VerifyOptionscompletetrue
import typingsJapgolly.jsonwebtoken.mod.DecodeOptions
import typingsJapgolly.jsonwebtoken.mod.GetPublicKeyOrSecret
import typingsJapgolly.jsonwebtoken.mod.Jwt
import typingsJapgolly.jsonwebtoken.mod.JwtPayload
import typingsJapgolly.jsonwebtoken.mod.Secret
import typingsJapgolly.jsonwebtoken.mod.SignCallback
import typingsJapgolly.jsonwebtoken.mod.SignOptions
import typingsJapgolly.jsonwebtoken.mod.VerifyCallback
import typingsJapgolly.jsonwebtoken.mod.VerifyOptions
import typingsJapgolly.lesgo.anon.Data
import typingsJapgolly.lesgo.anon.Validate
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesJwtserviceMod {
  
  @JSImport("lesgo/services/JWTService", JSImport.Default)
  @js.native
  open class default[TDecoded /* <: js.Object | String */] protected ()
    extends StObject
       with JWTService[TDecoded] {
    def this(token: String, config: Config[TDecoded]) = this()
    
    /* protected */ /* CompleteClass */
    var decoded: TDecoded = js.native
    
    /* CompleteClass */
    override def jwt(): JWTPackage = js.native
    
    /* protected */ /* CompleteClass */
    var jwtpkg: JWTPackage = js.native
    
    /* protected */ /* CompleteClass */
    var settings: typingsJapgolly.lesgo.anon.Config[TDecoded] = js.native
    
    /* CompleteClass */
    override def validate(): JWTService[TDecoded] = js.native
  }
  
  trait Config[T] extends StObject {
    
    var customClaims: Validate[T]
    
    var iss: Data
    
    var secret: Secret
  }
  object Config {
    
    inline def apply[T](customClaims: Validate[T], iss: Data, secret: Secret): Config[T] = {
      val __obj = js.Dynamic.literal(customClaims = customClaims.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[T]]
    }
    
    extension [Self <: Config[?], T](x: Self & Config[T]) {
      
      inline def setCustomClaims(value: Validate[T]): Self = StObject.set(x, "customClaims", value.asInstanceOf[js.Any])
      
      inline def setIss(value: Data): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: Secret): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JWTPackage extends StObject {
    
    var JsonWebTokenError: Instantiable1[/* message */ String, typingsJapgolly.jsonwebtoken.mod.JsonWebTokenError] = js.native
    
    var NotBeforeError: Instantiable2[
        /* message */ String, 
        /* date */ js.Date, 
        typingsJapgolly.jsonwebtoken.mod.NotBeforeError
      ] = js.native
    
    var TokenExpiredError: Instantiable2[
        /* message */ String, 
        /* expiredAt */ js.Date, 
        typingsJapgolly.jsonwebtoken.mod.TokenExpiredError
      ] = js.native
    
    def decode(token: String): Null | JwtPayload | String = js.native
    def decode(token: String, options: DecodeOptionscompletetrue): Null | Jwt = js.native
    def decode(token: String, options: DecodeOptionsjsontrue): Null | JwtPayload = js.native
    def decode(token: String, options: DecodeOptions): Null | JwtPayload | String = js.native
    
    def sign(payload: String, secretOrPrivateKey: Secret): String = js.native
    def sign(payload: String, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
    def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
    def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    def sign(payload: js.Object, secretOrPrivateKey: Secret): String = js.native
    def sign(payload: js.Object, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
    def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
    def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    def sign(payload: Buffer, secretOrPrivateKey: Secret): String = js.native
    def sign(payload: Buffer, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
    def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
    def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    
    def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      callback: VerifyCallback[JwtPayload | String]
    ): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      options: Unit,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptionscompletefals): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      options: VerifyOptionscompletefals,
      callback: VerifyCallback[JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptionscompletetrue): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      options: VerifyOptionscompletetrue,
      callback: VerifyCallback[Jwt]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptions): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      options: VerifyOptions,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: Secret): JwtPayload | String = js.native
    def verify(token: String, secretOrPublicKey: Secret, callback: VerifyCallback[JwtPayload | String]): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: Secret,
      options: Unit,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletefals): JwtPayload | String = js.native
    def verify(
      token: String,
      secretOrPublicKey: Secret,
      options: VerifyOptionscompletefals,
      callback: VerifyCallback[JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletetrue): Jwt = js.native
    def verify(
      token: String,
      secretOrPublicKey: Secret,
      options: VerifyOptionscompletetrue,
      callback: VerifyCallback[Jwt]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptions): Jwt | JwtPayload | String = js.native
    def verify(
      token: String,
      secretOrPublicKey: Secret,
      options: VerifyOptions,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    @JSName("verify")
    def verify_Unit(token: String, secretOrPublicKey: Secret): Unit = js.native
    @JSName("verify")
    def verify_Unit(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletefals): Unit = js.native
    @JSName("verify")
    def verify_Unit(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletetrue): Unit = js.native
    @JSName("verify")
    def verify_Unit(token: String, secretOrPublicKey: Secret, options: VerifyOptions): Unit = js.native
  }
  
  trait JWTService[TDecoded /* <: js.Object | String */] extends StObject {
    
    /* protected */ var decoded: TDecoded
    
    def jwt(): JWTPackage
    
    /* protected */ var jwtpkg: JWTPackage
    
    /* protected */ var settings: typingsJapgolly.lesgo.anon.Config[TDecoded]
    
    def validate(): JWTService[TDecoded]
  }
  object JWTService {
    
    inline def apply[TDecoded /* <: js.Object | String */](
      decoded: TDecoded,
      jwt: CallbackTo[JWTPackage],
      jwtpkg: JWTPackage,
      settings: typingsJapgolly.lesgo.anon.Config[TDecoded],
      validate: CallbackTo[JWTService[TDecoded]]
    ): JWTService[TDecoded] = {
      val __obj = js.Dynamic.literal(decoded = decoded.asInstanceOf[js.Any], jwt = jwt.toJsFn, jwtpkg = jwtpkg.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], validate = validate.toJsFn)
      __obj.asInstanceOf[JWTService[TDecoded]]
    }
    
    extension [Self <: JWTService[?], TDecoded /* <: js.Object | String */](x: Self & JWTService[TDecoded]) {
      
      inline def setDecoded(value: TDecoded): Self = StObject.set(x, "decoded", value.asInstanceOf[js.Any])
      
      inline def setJwt(value: CallbackTo[JWTPackage]): Self = StObject.set(x, "jwt", value.toJsFn)
      
      inline def setJwtpkg(value: JWTPackage): Self = StObject.set(x, "jwtpkg", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: typingsJapgolly.lesgo.anon.Config[TDecoded]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: CallbackTo[JWTService[TDecoded]]): Self = StObject.set(x, "validate", value.toJsFn)
    }
  }
}
