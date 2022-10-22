package typingsJapgolly.engineIo

import typingsJapgolly.engineIo.buildServerMod.AttachOptions
import typingsJapgolly.engineIo.buildServerMod.BaseServer
import typingsJapgolly.engineIo.buildServerMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUserverMod {
  
  @JSImport("engine.io/build/userver", "uServer")
  @js.native
  /**
    * Server constructor.
    *
    * @param {Object} opts - options
    * @api public
    */
  open class uServer () extends BaseServer {
    def this(opts: ServerOptions) = this()
    
    /* private */ var abortRequest: Any = js.native
    
    /**
      * Attach the engine to a µWebSockets.js server
      * @param app
      * @param options
      */
    def attach(app: Any): Unit = js.native
    def attach(app: Any, options: AttachOptions & uOptions): Unit = js.native
    
    /* private */ var handleRequest: Any = js.native
    
    /* private */ var handleUpgrade: Any = js.native
    
    /**
      * Prepares a request by processing the query string.
      *
      * @api private
      */
    /* private */ var prepare: Any = js.native
  }
  
  trait uOptions extends StObject {
    
    /**
      * What permessage-deflate compression to use. uWS.DISABLED, uWS.SHARED_COMPRESSOR or any of the uWS.DEDICATED_COMPRESSOR_xxxKB.
      * @default uWS.DISABLED
      */
    var compression: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum amount of seconds that may pass without sending or getting a message. Connection is closed if this timeout passes. Resolution (granularity) for timeouts are typically 4 seconds, rounded to closest. Disable by using 0.
      * @default 120
      */
    var idleTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum length of allowed backpressure per socket when publishing or sending messages. Slow receivers with too high backpressure will be skipped until they catch up or timeout.
      * @default 1024 * 1024
      */
    var maxBackpressure: js.UndefOr[Double] = js.undefined
  }
  object uOptions {
    
    inline def apply(): uOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[uOptions]
    }
    
    extension [Self <: uOptions](x: Self) {
      
      inline def setCompression(value: Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setMaxBackpressure(value: Double): Self = StObject.set(x, "maxBackpressure", value.asInstanceOf[js.Any])
      
      inline def setMaxBackpressureUndefined: Self = StObject.set(x, "maxBackpressure", js.undefined)
    }
  }
}
