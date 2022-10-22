package typingsJapgolly.fastify.mod

import typingsJapgolly.fastify.fastifyBooleans.`true`
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.node.http2Mod.Http2Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastifyHttp2Options[Server /* <: Http2Server */, Logger /* <: FastifyBaseLogger */]
  extends StObject
     with FastifyServerOptions[Server, Logger] {
  
  var http2: `true`
  
  var http2SessionTimeout: js.UndefOr[Double] = js.undefined
}
object FastifyHttp2Options {
  
  inline def apply[Server /* <: Http2Server */, Logger /* <: FastifyBaseLogger */](): FastifyHttp2Options[Server, Logger] = {
    val __obj = js.Dynamic.literal(http2 = true)
    __obj.asInstanceOf[FastifyHttp2Options[Server, Logger]]
  }
  
  extension [Self <: FastifyHttp2Options[?, ?], Server /* <: Http2Server */, Logger /* <: FastifyBaseLogger */](x: Self & (FastifyHttp2Options[Server, Logger])) {
    
    inline def setHttp2(value: `true`): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2SessionTimeout(value: Double): Self = StObject.set(x, "http2SessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setHttp2SessionTimeoutUndefined: Self = StObject.set(x, "http2SessionTimeout", js.undefined)
  }
}
