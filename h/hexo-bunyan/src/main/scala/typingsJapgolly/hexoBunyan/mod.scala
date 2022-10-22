package typingsJapgolly.hexoBunyan

import typingsJapgolly.bunyan.mod.LogLevel
import typingsJapgolly.bunyan.mod.Logger
import typingsJapgolly.bunyan.mod.LoggerOptions
import typingsJapgolly.bunyan.mod.RingBufferOptions
import typingsJapgolly.bunyan.mod.RotatingFileStreamOptions
import typingsJapgolly.bunyan.mod.StdSerializers_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hexo-bunyan", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends typingsJapgolly.bunyan.mod.^ {
    def this(options: LoggerOptions) = this()
  }
  @JSImport("hexo-bunyan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hexo-bunyan", "DEBUG")
  @js.native
  val DEBUG: Double = js.native
  
  @JSImport("hexo-bunyan", "ERROR")
  @js.native
  val ERROR: Double = js.native
  
  @JSImport("hexo-bunyan", "FATAL")
  @js.native
  val FATAL: Double = js.native
  
  @JSImport("hexo-bunyan", "INFO")
  @js.native
  val INFO: Double = js.native
  
  @JSImport("hexo-bunyan", "RingBuffer")
  @js.native
  open class RingBuffer protected ()
    extends typingsJapgolly.bunyan.mod.RingBuffer {
    def this(options: RingBufferOptions) = this()
  }
  
  @JSImport("hexo-bunyan", "RotatingFileStream")
  @js.native
  open class RotatingFileStream protected ()
    extends typingsJapgolly.bunyan.mod.RotatingFileStream {
    def this(options: RotatingFileStreamOptions) = this()
  }
  
  @JSImport("hexo-bunyan", "TRACE")
  @js.native
  val TRACE: Double = js.native
  
  @JSImport("hexo-bunyan", "WARN")
  @js.native
  val WARN: Double = js.native
  
  inline def createLogger(options: LoggerOptions): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(options.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  /* Inlined {[ name in bunyan.bunyan.LogLevelString ]: number} */
  object levelFromName {
    
    @JSImport("hexo-bunyan", "levelFromName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hexo-bunyan", "levelFromName.debug")
    @js.native
    def debug: Double = js.native
    inline def debug_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.error")
    @js.native
    def error: Double = js.native
    inline def error_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.fatal")
    @js.native
    def fatal: Double = js.native
    inline def fatal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fatal")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.info")
    @js.native
    def info: Double = js.native
    inline def info_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.trace")
    @js.native
    def trace: Double = js.native
    inline def trace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.warn")
    @js.native
    def warn: Double = js.native
    inline def warn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
  
  inline def resolveLevel(value: LogLevel): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLevel")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def safeCycles(): js.Function2[/* key */ String, /* value */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeCycles")().asInstanceOf[js.Function2[/* key */ String, /* value */ Any, Any]]
  
  @JSImport("hexo-bunyan", "stdSerializers")
  @js.native
  val stdSerializers: StdSerializers_ = js.native
}
