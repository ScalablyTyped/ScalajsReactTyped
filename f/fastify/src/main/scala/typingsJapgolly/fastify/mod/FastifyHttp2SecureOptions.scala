package typingsJapgolly.fastify.mod

import typingsJapgolly.fastify.fastifyBooleans.`true`
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.node.http2Mod.Http2SecureServer
import typingsJapgolly.node.http2Mod.SecureServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastifyHttp2SecureOptions[Server /* <: Http2SecureServer */, Logger /* <: FastifyBaseLogger */]
  extends StObject
     with FastifyServerOptions[Server, Logger] {
  
  var http2: `true`
  
  var http2SessionTimeout: js.UndefOr[Double] = js.undefined
  
  var https: SecureServerOptions
}
object FastifyHttp2SecureOptions {
  
  inline def apply[Server /* <: Http2SecureServer */, Logger /* <: FastifyBaseLogger */](https: SecureServerOptions): FastifyHttp2SecureOptions[Server, Logger] = {
    val __obj = js.Dynamic.literal(http2 = true, https = https.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyHttp2SecureOptions[Server, Logger]]
  }
  
  extension [Self <: FastifyHttp2SecureOptions[?, ?], Server /* <: Http2SecureServer */, Logger /* <: FastifyBaseLogger */](x: Self & (FastifyHttp2SecureOptions[Server, Logger])) {
    
    inline def setHttp2(value: `true`): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2SessionTimeout(value: Double): Self = StObject.set(x, "http2SessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setHttp2SessionTimeoutUndefined: Self = StObject.set(x, "http2SessionTimeout", js.undefined)
    
    inline def setHttps(value: SecureServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
  }
}
