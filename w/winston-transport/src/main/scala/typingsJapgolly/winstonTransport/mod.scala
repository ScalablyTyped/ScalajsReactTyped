package typingsJapgolly.winstonTransport

import japgolly.scalajs.react.Callback
import typingsJapgolly.logform.mod.Format_
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston-transport", JSImport.Namespace)
  @js.native
  open class ^ () extends TransportStream {
    def this(opts: TransportStreamOptions) = this()
  }
  
  @js.native
  trait TransportStream extends Writable {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.native
    
    var format: js.UndefOr[Format_] = js.native
    
    var handleExceptions: js.UndefOr[Boolean] = js.native
    
    var handleRejections: js.UndefOr[Boolean] = js.native
    
    var level: js.UndefOr[String] = js.native
    
    var log: js.UndefOr[js.Function2[/* info */ Any, /* next */ js.Function0[Unit], Any]] = js.native
    
    var logv: js.UndefOr[js.Function2[/* info */ Any, /* next */ js.Function0[Unit], Any]] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  
  trait TransportStreamOptions extends StObject {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var format: js.UndefOr[Format_] = js.undefined
    
    var handleExceptions: js.UndefOr[Boolean] = js.undefined
    
    var handleRejections: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[js.Function2[/* info */ Any, /* next */ js.Function0[Unit], Any]] = js.undefined
    
    var logv: js.UndefOr[js.Function2[/* info */ Any, /* next */ js.Function0[Unit], Any]] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object TransportStreamOptions {
    
    inline def apply(): TransportStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportStreamOptions]
    }
    
    extension [Self <: TransportStreamOptions](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setFormat(value: Format_): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHandleExceptions(value: Boolean): Self = StObject.set(x, "handleExceptions", value.asInstanceOf[js.Any])
      
      inline def setHandleExceptionsUndefined: Self = StObject.set(x, "handleExceptions", js.undefined)
      
      inline def setHandleRejections(value: Boolean): Self = StObject.set(x, "handleRejections", value.asInstanceOf[js.Any])
      
      inline def setHandleRejectionsUndefined: Self = StObject.set(x, "handleRejections", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLog(value: (/* info */ Any, /* next */ js.Function0[Unit]) => Any): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setLogv(value: (/* info */ Any, /* next */ js.Function0[Unit]) => Any): Self = StObject.set(x, "logv", js.Any.fromFunction2(value))
      
      inline def setLogvUndefined: Self = StObject.set(x, "logv", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
