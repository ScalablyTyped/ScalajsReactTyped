package typingsJapgolly.graylog2

import typingsJapgolly.graylog2.anon.FnCall
import typingsJapgolly.graylog2.anon.ReadonlyGraylogConfig
import typingsJapgolly.graylog2.anon.Readonlyhoststringportnum
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graylog2", "graylog")
  @js.native
  open class graylog protected () extends EventEmitter {
    def this(config: ReadonlyGraylogConfig) = this()
    
    def alert(message: String): Unit = js.native
    def alert(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def alert(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def alert(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def alert(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def alert(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def alert(message: String, fullMessage: String): Unit = js.native
    def alert(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def alert(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def alert(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def alert(message: js.Error): Unit = js.native
    def alert(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def alert(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def alert(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def alert(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def alert(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def alert(message: Record[String, Any]): Unit = js.native
    def alert(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def alert(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def alert(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    @JSName("alert")
    var alert_Original: FnCall = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def critical(message: String): Unit = js.native
    def critical(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def critical(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def critical(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def critical(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def critical(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def critical(message: String, fullMessage: String): Unit = js.native
    def critical(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def critical(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def critical(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def critical(message: js.Error): Unit = js.native
    def critical(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def critical(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def critical(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def critical(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def critical(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def critical(message: Record[String, Any]): Unit = js.native
    def critical(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def critical(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def critical(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    @JSName("critical")
    var critical_Original: FnCall = js.native
    
    def debug(message: String): Unit = js.native
    def debug(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def debug(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def debug(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def debug(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def debug(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def debug(message: String, fullMessage: String): Unit = js.native
    def debug(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def debug(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def debug(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def debug(message: js.Error): Unit = js.native
    def debug(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def debug(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def debug(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def debug(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def debug(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def debug(message: Record[String, Any]): Unit = js.native
    def debug(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def debug(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def debug(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    @JSName("debug")
    var debug_Original: FnCall = js.native
    
    def emergency(message: String): Unit = js.native
    def emergency(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def emergency(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def emergency(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def emergency(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def emergency(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def emergency(message: String, fullMessage: String): Unit = js.native
    def emergency(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def emergency(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def emergency(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def emergency(message: js.Error): Unit = js.native
    def emergency(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def emergency(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def emergency(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def emergency(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def emergency(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def emergency(message: Record[String, Any]): Unit = js.native
    def emergency(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def emergency(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def emergency(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    @JSName("emergency")
    var emergency_Original: FnCall = js.native
    
    def error(message: String): Unit = js.native
    def error(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def error(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def error(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def error(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def error(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def error(message: String, fullMessage: String): Unit = js.native
    def error(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def error(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def error(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def error(message: js.Error): Unit = js.native
    def error(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def error(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def error(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def error(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def error(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def error(message: Record[String, Any]): Unit = js.native
    def error(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def error(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def error(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    @JSName("error")
    var error_Original: FnCall = js.native
    
    def info(message: String): Unit = js.native
    def info(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def info(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def info(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def info(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def info(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def info(message: String, fullMessage: String): Unit = js.native
    def info(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def info(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def info(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def info(message: js.Error): Unit = js.native
    def info(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def info(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def info(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def info(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def info(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def info(message: Record[String, Any]): Unit = js.native
    def info(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def info(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def info(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    @JSName("info")
    var info_Original: FnCall = js.native
    
    def log(message: String): Unit = js.native
    def log(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def log(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def log(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def log(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def log(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def log(message: String, fullMessage: String): Unit = js.native
    def log(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def log(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def log(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def log(message: js.Error): Unit = js.native
    def log(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def log(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def log(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def log(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def log(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def log(message: Record[String, Any]): Unit = js.native
    def log(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def log(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def log(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    
    def notice(message: String): Unit = js.native
    def notice(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def notice(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def notice(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def notice(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def notice(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def notice(message: String, fullMessage: String): Unit = js.native
    def notice(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def notice(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def notice(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def notice(message: js.Error): Unit = js.native
    def notice(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def notice(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def notice(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def notice(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def notice(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def notice(message: Record[String, Any]): Unit = js.native
    def notice(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def notice(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def notice(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    @JSName("notice")
    var notice_Original: FnCall = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def warn(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def warn(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def warn(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def warn(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def warn(message: String, fullMessage: String): Unit = js.native
    def warn(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def warn(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def warn(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def warn(message: js.Error): Unit = js.native
    def warn(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def warn(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def warn(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def warn(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def warn(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def warn(message: Record[String, Any]): Unit = js.native
    def warn(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def warn(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def warn(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    @JSName("warn")
    var warn_Original: FnCall = js.native
    
    def warning(message: String): Unit = js.native
    def warning(message: String, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def warning(message: String, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def warning(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def warning(message: String, additionalFields: Record[String, Any]): Unit = js.native
    def warning(message: String, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def warning(message: String, fullMessage: String): Unit = js.native
    def warning(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def warning(message: String, fullMessage: String, additionalFields: Record[String, Any]): Unit = js.native
    def warning(message: String, fullMessage: String, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def warning(message: js.Error): Unit = js.native
    def warning(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def warning(message: js.Error, _underscore: Unit, additionalFields: Record[String, Any], timestamp: Double): Unit = js.native
    def warning(message: js.Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def warning(message: js.Error, additionalFields: Record[String, Any]): Unit = js.native
    def warning(message: js.Error, additionalFields: Record[String, Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def warning(message: Record[String, Any]): Unit = js.native
    def warning(message: Record[String, Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def warning(message: Record[String, Any], _underscore: Unit, additionalFields: Record[String, Any]): Unit = js.native
    def warning(
      message: Record[String, Any],
      _underscore: Unit,
      additionalFields: Record[String, Any],
      timestamp: Double
    ): Unit = js.native
    @JSName("warning")
    var warning_Original: FnCall = js.native
  }
  object graylog {
    
    @JSImport("graylog2", "graylog.graylog")
    @js.native
    val graylog: typingsJapgolly.graylog2.mod.graylog = js.native
  }
  
  trait GraylogConfig extends StObject {
    
    /**
      * The max UDP packet size. Should never exceed the MTU of your system.
      * The default value is 1400
      */
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The strategy for a message compression:
      *  "always"  -  every message will be compressed with zlib.deflate
      *  "never"   -  no compression
      *  "optimal" -  messages bigger than GraylogConfig.bufferSize will be compressed
      *
      *  The default value is "optimal"
      */
    var deflate: js.UndefOr[GraylogDeflate] = js.undefined
    
    /**
      * The facility - log's field type in Graylog.
      * The default value is "Node.js"
      */
    var facility: js.UndefOr[String] = js.undefined
    
    /**
      * The name of a host.
      * The default value is "os.hostname()"
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * The list of graylog servers
      */
    var servers: js.Array[Readonlyhoststringportnum]
  }
  object GraylogConfig {
    
    inline def apply(servers: js.Array[Readonlyhoststringportnum]): GraylogConfig = {
      val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraylogConfig]
    }
    
    extension [Self <: GraylogConfig](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setDeflate(value: GraylogDeflate): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      inline def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      inline def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setServers(value: js.Array[Readonlyhoststringportnum]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      inline def setServersVarargs(value: Readonlyhoststringportnum*): Self = StObject.set(x, "servers", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graylog2.graylog2Strings.optimal
    - typingsJapgolly.graylog2.graylog2Strings.always
    - typingsJapgolly.graylog2.graylog2Strings.never
  */
  trait GraylogDeflate extends StObject
  object GraylogDeflate {
    
    inline def always: typingsJapgolly.graylog2.graylog2Strings.always = "always".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.always]
    
    inline def never: typingsJapgolly.graylog2.graylog2Strings.never = "never".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.never]
    
    inline def optimal: typingsJapgolly.graylog2.graylog2Strings.optimal = "optimal".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.optimal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graylog2.graylog2Strings.log
    - typingsJapgolly.graylog2.graylog2Strings.emergency
    - typingsJapgolly.graylog2.graylog2Strings.alert
    - typingsJapgolly.graylog2.graylog2Strings.critical
    - typingsJapgolly.graylog2.graylog2Strings.error
    - typingsJapgolly.graylog2.graylog2Strings.warning
    - typingsJapgolly.graylog2.graylog2Strings.warn
    - typingsJapgolly.graylog2.graylog2Strings.notice
    - typingsJapgolly.graylog2.graylog2Strings.info
    - typingsJapgolly.graylog2.graylog2Strings.debug
  */
  trait GraylogLogMethod extends StObject
  object GraylogLogMethod {
    
    inline def alert: typingsJapgolly.graylog2.graylog2Strings.alert = "alert".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.alert]
    
    inline def critical: typingsJapgolly.graylog2.graylog2Strings.critical = "critical".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.critical]
    
    inline def debug: typingsJapgolly.graylog2.graylog2Strings.debug = "debug".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.debug]
    
    inline def emergency: typingsJapgolly.graylog2.graylog2Strings.emergency = "emergency".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.emergency]
    
    inline def error: typingsJapgolly.graylog2.graylog2Strings.error = "error".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.error]
    
    inline def info: typingsJapgolly.graylog2.graylog2Strings.info = "info".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.info]
    
    inline def log: typingsJapgolly.graylog2.graylog2Strings.log = "log".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.log]
    
    inline def notice: typingsJapgolly.graylog2.graylog2Strings.notice = "notice".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.notice]
    
    inline def warn: typingsJapgolly.graylog2.graylog2Strings.warn = "warn".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.warn]
    
    inline def warning: typingsJapgolly.graylog2.graylog2Strings.warning = "warning".asInstanceOf[typingsJapgolly.graylog2.graylog2Strings.warning]
  }
}
