package typingsJapgolly.nodeRal

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodeRal.anon.App
import typingsJapgolly.nodeRal.mod.Balance.BalanceContextClass
import typingsJapgolly.nodeRal.mod.RAL.NormalizerManager
import typingsJapgolly.nodeRal.nodeRalBooleans.`false`
import typingsJapgolly.nodeRal.nodeRalStrings.GBK
import typingsJapgolly.nodeRal.nodeRalStrings.GET
import typingsJapgolly.nodeRal.nodeRalStrings.POST
import typingsJapgolly.nodeRal.nodeRalStrings.`utf-8`
import typingsJapgolly.nodeRal.nodeRalStrings.hashring
import typingsJapgolly.nodeRal.nodeRalStrings.http
import typingsJapgolly.nodeRal.nodeRalStrings.https
import typingsJapgolly.nodeRal.nodeRalStrings.random
import typingsJapgolly.nodeRal.nodeRalStrings.redis
import typingsJapgolly.nodeRal.nodeRalStrings.roundrobin
import typingsJapgolly.nodeRal.nodeRalStrings.soap
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-ral", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("node-ral", "Balance")
  @js.native
  open class Balance () extends StObject {
    
    def fetchServer(balanceContext: BalanceContextClass, conf: Any, prevBackend: Server): Server = js.native
    
    def getCategory(): Any = js.native
    
    def getContextClass(): BalanceContextConstructor = js.native
  }
  /* static members */
  object Balance {
    
    @JSImport("node-ral", "Balance")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-ral", "Balance.BalanceContext")
    @js.native
    def BalanceContext: BalanceContextConstructor = js.native
    
    @JSImport("node-ral", "Balance.BalanceContextClass")
    @js.native
    open class BalanceContextClass protected () extends StObject {
      def this(serviceID: String, service: Service) = this()
      
      var crossIDCServers: js.Array[String] = js.native
      
      var currentIDC: String = js.native
      
      var reqIDCServers: js.Array[String] = js.native
      
      var serviceID: String = js.native
    }
    
    inline def BalanceContext_=(x: BalanceContextConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BalanceContext")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Config extends StObject {
    
    def clearConf(): Unit = js.native
    
    def disableUpdate(): Unit = js.native
    
    def enableUpdate(interval: Double, all: Boolean, cb: js.Function2[/* err */ Any, /* confs */ Any, Any]): Unit = js.native
    
    def getConf(name: String): Service = js.native
    
    def getConfNames(): js.Array[String] = js.native
    
    def getContext(serviceID: String): Service = js.native
    def getContext(serviceID: String, options: Service): Service = js.native
    
    def getRawConf(): Any = js.native
    
    def getUpdateNeededRawConf(): Any = js.native
    
    def isAutoUpdateEnabled(): Boolean = js.native
    
    def load(confPath: String): js.Object = js.native
    
    def loadRawConf(): Service = js.native
    def loadRawConf(config: Service): Service = js.native
    
    def normalize(): js.Object = js.native
    def normalize(config: Service): js.Object = js.native
    
    var normalizerManager: NormalizerManager = js.native
  }
  @JSImport("node-ral", "Config")
  @js.native
  val Config: typingsJapgolly.nodeRal.mod.Config = js.native
  
  /* note: abstract class */ @JSImport("node-ral", "ConfigNormalizer")
  @js.native
  open class ConfigNormalizer () extends RalModule {
    
    def needUpdate(): Boolean = js.native
    def needUpdate(config: Any): Boolean = js.native
    
    def normalizeConfig(config: Any): typingsJapgolly.nodeRal.mod.Config = js.native
  }
  
  /* note: abstract class */ @JSImport("node-ral", "Converter")
  @js.native
  open class Converter () extends RalModule {
    
    var isStreamify: `false` = js.native
    
    def pack(config: Service, data: Any): Buffer = js.native
    
    def unpack(config: Service, data: Any): Any = js.native
  }
  
  @JSImport("node-ral", "Logger")
  @js.native
  val Logger: LoggerFactory = js.native
  
  inline def Middleware(): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Middleware")().asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]]
  inline def Middleware(options: Service): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Middleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resp */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]]
  
  /* note: abstract class */ @JSImport("node-ral", "Protocol")
  @js.native
  open class Protocol () extends RalModule {
    
    def _request(config: Any, callback: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def beforeRequest(context: Any): Any = js.native
    
    def normalizeConfig(context: Any): Any = js.native
    
    def talk(config: Any, callback: Any): Any = js.native
  }
  /* static members */
  object Protocol {
    
    @JSImport("node-ral", "Protocol")
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeRequest(context: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeRequest")(context.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def normalizeConfig(context: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeConfig")(context.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  object RAL {
    
    inline def apply(serviceName: String): RalRunner = ^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any]).asInstanceOf[RalRunner]
    inline def apply(serviceName: String, options: js.Object): RalRunner = (^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RalRunner]
    
    @JSImport("node-ral", "RAL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-ral", "RAL.NormalizerManager")
    @js.native
    open class NormalizerManager () extends StObject {
      
      @JSName("apply")
      def apply(config: js.Object): js.Object = js.native
      
      def needUpdate(config: Any): Boolean = js.native
      
      var normalizers: js.Array[String] = js.native
      
      def setConfigNormalizer(normalizers: js.Array[String]): Unit = js.native
    }
    
    @JSImport("node-ral", "RAL.RalRunner")
    @js.native
    open class RalRunner protected () extends EventEmitter {
      def this(serviceName: String) = this()
      def this(serviceName: String, options: js.Object) = this()
      
      def callRetry(err: Any): Unit = js.native
      
      def doRequest(): Unit = js.native
      
      def getLogInfo(): LogInfo = js.native
      
      def throwError(err: Any): Unit = js.native
    }
    
    inline def appendExtPath(extPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("appendExtPath")(extPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getConf(name: String): typingsJapgolly.nodeRal.mod.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getConf")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeRal.mod.Config]
    
    inline def getRawConf(name: String): typingsJapgolly.nodeRal.mod.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawConf")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeRal.mod.Config]
    
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
    inline def reload(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setConfigNormalizer(normalizers: ConfigNormalizer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfigNormalizer")(normalizers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def RALPromise[T](name: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("RALPromise")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def RALPromise[T](name: String, options: js.Object): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("RALPromise")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  /* note: abstract class */ @JSImport("node-ral", "RalModule")
  @js.native
  open class RalModule () extends StObject {
    
    def getCategory(): String = js.native
    
    def getName(): String = js.native
  }
  /* static members */
  object RalModule {
    
    @JSImport("node-ral", "RalModule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    inline def load(pathOrModule: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pathOrModule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def load(pathOrModule: RalModule): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pathOrModule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("node-ral", "RalModule.modules")
    @js.native
    def modules: StringDictionary[RalModule] = js.native
    inline def modules_=(x: StringDictionary[RalModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
  }
  
  type BalanceContextConstructor = Instantiable2[/* serviceID */ String, /* service */ Service, BalanceContextClass]
  
  trait LogInfo extends StObject {
    
    var conv: String
    
    var cost: String
    
    var method: String
    
    var pack: String
    
    var path: String
    
    var prot: String
    
    var proxy: String
    
    var query: String
    
    var read: String
    
    var remote: String
    
    var requestID: String
    
    var retry: String
    
    var service: String
    
    var talk: String
    
    var unpack: String
    
    var write: String
  }
  object LogInfo {
    
    inline def apply(
      conv: String,
      cost: String,
      method: String,
      pack: String,
      path: String,
      prot: String,
      proxy: String,
      query: String,
      read: String,
      remote: String,
      requestID: String,
      retry: String,
      service: String,
      talk: String,
      unpack: String,
      write: String
    ): LogInfo = {
      val __obj = js.Dynamic.literal(conv = conv.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prot = prot.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], requestID = requestID.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], talk = talk.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfo]
    }
    
    extension [Self <: LogInfo](x: Self) {
      
      inline def setConv(value: String): Self = StObject.set(x, "conv", value.asInstanceOf[js.Any])
      
      inline def setCost(value: String): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPack(value: String): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProt(value: String): Self = StObject.set(x, "prot", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRequestID(value: String): Self = StObject.set(x, "requestID", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: String): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setTalk(value: String): Self = StObject.set(x, "talk", value.asInstanceOf[js.Any])
      
      inline def setUnpack(value: String): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoggerFactory extends StObject {
    
    def apply(prefix: String): RalLogger = js.native
    
    var options: App = js.native
  }
  
  trait RalLogger extends StObject {
    
    def debug(param: Any*): Unit
    
    def fatal(param: Any*): Unit
    
    def notice(param: Any*): Unit
    
    def trace(param: Any*): Unit
    
    def warning(param: Any*): Unit
  }
  object RalLogger {
    
    inline def apply(
      debug: /* repeated */ Any => Callback,
      fatal: /* repeated */ Any => Callback,
      notice: /* repeated */ Any => Callback,
      trace: /* repeated */ Any => Callback,
      warning: /* repeated */ Any => Callback
    ): RalLogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), fatal = js.Any.fromFunction1((t0: /* repeated */ Any) => fatal(t0).runNow()), notice = js.Any.fromFunction1((t0: /* repeated */ Any) => notice(t0).runNow()), trace = js.Any.fromFunction1((t0: /* repeated */ Any) => trace(t0).runNow()), warning = js.Any.fromFunction1((t0: /* repeated */ Any) => warning(t0).runNow()))
      __obj.asInstanceOf[RalLogger]
    }
    
    extension [Self <: RalLogger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setFatal(value: /* repeated */ Any => Callback): Self = StObject.set(x, "fatal", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setNotice(value: /* repeated */ Any => Callback): Self = StObject.set(x, "notice", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setTrace(value: /* repeated */ Any => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setWarning(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warning", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
  
  trait Server extends StObject {
    
    var host: String
    
    var idc: js.UndefOr[String] = js.undefined
    
    var port: String | Double
  }
  object Server {
    
    inline def apply(host: String, port: String | Double): Server = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    extension [Self <: Server](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setIdc(value: String): Self = StObject.set(x, "idc", value.asInstanceOf[js.Any])
      
      inline def setIdcUndefined: Self = StObject.set(x, "idc", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait Service extends StObject {
    
    var balance: random | roundrobin | hashring
    
    var data: js.UndefOr[Any] = js.undefined
    
    var encoding: js.UndefOr[`utf-8` | GBK] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
    
    var hybird: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[GET | POST] = js.undefined
    
    var pack: buildInConverter
    
    var path: js.UndefOr[String] = js.undefined
    
    var protocol: http | https | soap | redis
    
    var query: js.UndefOr[Any] = js.undefined
    
    var retry: js.UndefOr[Double] = js.undefined
    
    var server: js.Array[Server]
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var unpack: buildInConverter
  }
  object Service {
    
    inline def apply(
      balance: random | roundrobin | hashring,
      pack: buildInConverter,
      protocol: http | https | soap | redis,
      server: js.Array[Server],
      unpack: buildInConverter
    ): Service = {
      val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    extension [Self <: Service](x: Self) {
      
      inline def setBalance(value: random | roundrobin | hashring): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEncoding(value: `utf-8` | GBK): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHybird(value: Boolean): Self = StObject.set(x, "hybird", value.asInstanceOf[js.Any])
      
      inline def setHybirdUndefined: Self = StObject.set(x, "hybird", js.undefined)
      
      inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPack(value: buildInConverter): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProtocol(value: http | https | soap | redis): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setServer(value: js.Array[Server]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerVarargs(value: Server*): Self = StObject.set(x, "server", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUnpack(value: buildInConverter): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeRal.nodeRalStrings.form
    - typingsJapgolly.nodeRal.nodeRalStrings.formData
    - typingsJapgolly.nodeRal.nodeRalStrings.json
    - typingsJapgolly.nodeRal.nodeRalStrings.protobuf
    - typingsJapgolly.nodeRal.nodeRalStrings.querystring
    - typingsJapgolly.nodeRal.nodeRalStrings.raw
    - typingsJapgolly.nodeRal.nodeRalStrings.redis
    - typingsJapgolly.nodeRal.nodeRalStrings.stream
    - typingsJapgolly.nodeRal.nodeRalStrings.string
  */
  trait buildInConverter extends StObject
  object buildInConverter {
    
    inline def form: typingsJapgolly.nodeRal.nodeRalStrings.form = "form".asInstanceOf[typingsJapgolly.nodeRal.nodeRalStrings.form]
    
    inline def formData: typingsJapgolly.nodeRal.nodeRalStrings.formData = "formData".asInstanceOf[typingsJapgolly.nodeRal.nodeRalStrings.formData]
    
    inline def json: typingsJapgolly.nodeRal.nodeRalStrings.json = "json".asInstanceOf[typingsJapgolly.nodeRal.nodeRalStrings.json]
    
    inline def protobuf: typingsJapgolly.nodeRal.nodeRalStrings.protobuf = "protobuf".asInstanceOf[typingsJapgolly.nodeRal.nodeRalStrings.protobuf]
    
    inline def querystring: typingsJapgolly.nodeRal.nodeRalStrings.querystring = "querystring".asInstanceOf[typingsJapgolly.nodeRal.nodeRalStrings.querystring]
    
    inline def raw: typingsJapgolly.nodeRal.nodeRalStrings.raw = "raw".asInstanceOf[typingsJapgolly.nodeRal.nodeRalStrings.raw]
    
    inline def redis: typingsJapgolly.nodeRal.nodeRalStrings.redis = "redis".asInstanceOf[typingsJapgolly.nodeRal.nodeRalStrings.redis]
    
    inline def stream: typingsJapgolly.nodeRal.nodeRalStrings.stream = "stream".asInstanceOf[typingsJapgolly.nodeRal.nodeRalStrings.stream]
    
    inline def string: typingsJapgolly.nodeRal.nodeRalStrings.string = "string".asInstanceOf[typingsJapgolly.nodeRal.nodeRalStrings.string]
  }
}
