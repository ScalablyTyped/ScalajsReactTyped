package typingsJapgolly.clientSessions

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cookies.mod.SetOption
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("client-sessions", JSImport.Namespace)
  @js.native
  val ^ : Sessions = js.native
  
  trait ComputeHmacOptions extends StObject {
    
    var signatureAlgorithm: String
    
    var signatureKey: Buffer
  }
  object ComputeHmacOptions {
    
    inline def apply(signatureAlgorithm: String, signatureKey: Buffer): ComputeHmacOptions = {
      val __obj = js.Dynamic.literal(signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureKey = signatureKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeHmacOptions]
    }
    
    extension [Self <: ComputeHmacOptions](x: Self) {
      
      inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSignatureKey(value: Buffer): Self = StObject.set(x, "signatureKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait CookieOptions
    extends StObject
       with SetOption {
    
    /**
      * a boolean indicating whether the cookie will expire when browser closes or not
      * (false by default).
      */
    var ephemeral: js.UndefOr[Boolean] = js.undefined
  }
  object CookieOptions {
    
    inline def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    extension [Self <: CookieOptions](x: Self) {
      
      inline def setEphemeral(value: Boolean): Self = StObject.set(x, "ephemeral", value.asInstanceOf[js.Any])
      
      inline def setEphemeralUndefined: Self = StObject.set(x, "ephemeral", js.undefined)
    }
  }
  
  trait DecodeResult extends StObject {
    
    var content: Any
    
    var createdAt: Double
    
    var duration: Double
  }
  object DecodeResult {
    
    inline def apply(content: Any, createdAt: Double, duration: Double): DecodeResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeResult]
    }
    
    extension [Self <: DecodeResult](x: Self) {
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    }
  }
  
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  
  type RequestHandler = js.Function3[/* req */ Any, /* res */ Any, /* next */ NextFunction, Any]
  
  trait SessionOptions extends StObject {
    
    /**
      * if expiresIn < activeDuration, the session will be extended by activeDuration milliseconds.
      * Default: 5 minutes
      */
    var activeDuration: js.UndefOr[Double] = js.undefined
    
    var cookie: js.UndefOr[CookieOptions] = js.undefined
    
    /**
      * session cookie name.
      * Default: 'session_state'
      */
    var cookieName: js.UndefOr[String] = js.undefined
    
    /**
      * how long the session will stay valid in ms.
      * Default: 24 hours
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * session accessor on the request object.
      * Default: 'session'
      */
    var requestKey: js.UndefOr[String] = js.undefined
    
    /**
      * encryption secret for the session.
      * required
      */
    var secret: String
  }
  object SessionOptions {
    
    inline def apply(secret: String): SessionOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionOptions]
    }
    
    extension [Self <: SessionOptions](x: Self) {
      
      inline def setActiveDuration(value: Double): Self = StObject.set(x, "activeDuration", value.asInstanceOf[js.Any])
      
      inline def setActiveDurationUndefined: Self = StObject.set(x, "activeDuration", js.undefined)
      
      inline def setCookie(value: CookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setRequestKey(value: String): Self = StObject.set(x, "requestKey", value.asInstanceOf[js.Any])
      
      inline def setRequestKeyUndefined: Self = StObject.set(x, "requestKey", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Sessions extends StObject {
    
    def apply(options: SessionOptions): RequestHandler = js.native
    
    var util: Util = js.native
  }
  
  @js.native
  trait Util extends StObject {
    
    def computeHmac(options: Any, iv: String, ciphertext: String, duration: Double, createdAt: Double): Buffer = js.native
    
    def decode(options: SessionOptions, encoded: String): DecodeResult = js.native
    
    def encode(options: SessionOptions, content: Any): String = js.native
    def encode(options: SessionOptions, content: Any, duration: Double): String = js.native
    def encode(options: SessionOptions, content: Any, duration: Double, createdAt: Double): String = js.native
    def encode(options: SessionOptions, content: Any, duration: Unit, createdAt: Double): String = js.native
  }
  
  type _To = Sessions
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Sessions = ^
}
