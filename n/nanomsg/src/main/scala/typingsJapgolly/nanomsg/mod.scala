package typingsJapgolly.nanomsg

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nanomsg.nanomsgStrings.binary
import typingsJapgolly.nanomsg.nanomsgStrings.close
import typingsJapgolly.nanomsg.nanomsgStrings.data
import typingsJapgolly.nanomsg.nanomsgStrings.error
import typingsJapgolly.nanomsg.nanomsgStrings.text
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nanomsg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EventEmitter as new (): SocketEventEmitter * / any */ @JSImport("nanomsg", "Socket")
  @js.native
  open class Socket_ protected () extends StObject {
    def this(`type`: SocketType) = this()
    def this(`type`: SocketType, opts: Options) = this()
    
    var af_domain: Domain = js.native
    
    /* Socket API */
    def bind(addr: String): Double | Null = js.native
    
    var binding: Double = js.native
    
    var bound: StringDictionary[Double] = js.native
    
    /* Subscription API */
    def chan(list: js.Array[String]): Unit = js.native
    
    def close(): Unit = js.native
    
    var closed: js.UndefOr[Boolean] = js.native
    
    var closed_status: js.UndefOr[Double] = js.native
    
    def connect(addr: String): Double | Null = js.native
    
    var connected: StringDictionary[Double] = js.native
    
    def dontwait(): Boolean = js.native
    def dontwait(boolean: Boolean): Boolean = js.native
    
    def flush(): Unit = js.native
    
    def ipv6(): Boolean = js.native
    def ipv6(boolean: Boolean): Boolean = js.native
    
    def linger(): Double = js.native
    /* Sockopt API */
    def linger(duration: Double): Boolean = js.native
    
    def maxreconn(): Double = js.native
    def maxreconn(duration: Double): Boolean = js.native
    
    def maxttl(): Double = js.native
    def maxttl(hops: Double): Boolean = js.native
    
    var protocol: Protocol = js.native
    
    var queue: js.Array[Buffer | String] = js.native
    
    def rcvbuf(): Double = js.native
    def rcvbuf(size: Double): Boolean = js.native
    
    def rcvmaxsize(): Double = js.native
    def rcvmaxsize(size: Double): Boolean = js.native
    
    def rcvprio(): Double = js.native
    def rcvprio(priority: Double): Boolean = js.native
    
    def rcvtimeo(): Double = js.native
    def rcvtimeo(duration: Double): Boolean = js.native
    
    var receiver: Boolean = js.native
    
    def reconn(): Double = js.native
    def reconn(duration: Double): Boolean = js.native
    
    def rmchan(list: String*): Unit = js.native
    
    def send(buf: String): Double = js.native
    def send(buf: Buffer): Double = js.native
    
    var sender: Boolean = js.native
    
    def shutdown(addr: String): Double | Null = js.native
    
    def sndbuf(): Double = js.native
    def sndbuf(size: Double): Boolean = js.native
    
    def sndprio(): Double = js.native
    def sndprio(priority: Double): Boolean = js.native
    
    def sndtimeo(): Double = js.native
    def sndtimeo(duration: Double): Boolean = js.native
    
    def tcpnodelay(): Boolean = js.native
    def tcpnodelay(boolean: Boolean): Boolean = js.native
    
    var `type`: SocketType = js.native
    
    def wsopt(): String = js.native
    def wsopt(str: String): Boolean = js.native
  }
  
  inline def createDevice(sock1: Socket_, sock2: Socket_): Device_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDevice")(sock1.asInstanceOf[js.Any], sock2.asInstanceOf[js.Any])).asInstanceOf[Device_]
  
  inline def createSocket(`type`: SocketType): Socket_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket_]
  inline def createSocket(`type`: SocketType, opts: Options): Socket_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Socket_]
  
  inline def device(sock1: Socket_, sock2: Socket_): Device_ = (^.asInstanceOf[js.Dynamic].applyDynamic("device")(sock1.asInstanceOf[js.Any], sock2.asInstanceOf[js.Any])).asInstanceOf[Device_]
  
  inline def socket(`type`: SocketType): Socket_ = ^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket_]
  inline def socket(`type`: SocketType, opts: Options): Socket_ = (^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Socket_]
  
  inline def symbol(symbol: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(symbol.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def symbolInfo(symbol: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolInfo")(symbol.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def term(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("term")().asInstanceOf[Any]
  
  @js.native
  trait Device_ extends EventEmitter {
    
    var s1: Double = js.native
    
    var s2: Double = js.native
    
    var sock1: Socket_ = js.native
    
    var sock2: Socket_ = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nanomsg.nanomsgInts.`1`
    - typingsJapgolly.nanomsg.nanomsgInts.`2`
  */
  trait Domain extends StObject
  object Domain {
    
    inline def `1`: typingsJapgolly.nanomsg.nanomsgInts.`1` = 1.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`1`]
    
    inline def `2`: typingsJapgolly.nanomsg.nanomsgInts.`2` = 2.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`2`]
  }
  
  trait Options extends StObject {
    
    var chan: js.UndefOr[js.Array[String]] = js.undefined
    
    var dontwait: js.UndefOr[Boolean] = js.undefined
    
    var ipv6: js.UndefOr[Boolean] = js.undefined
    
    var linger: js.UndefOr[Double] = js.undefined
    
    var maxreconn: js.UndefOr[Double] = js.undefined
    
    var maxttl: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var rcvbuf: js.UndefOr[Double] = js.undefined
    
    var rcvmaxsize: js.UndefOr[Double] = js.undefined
    
    var rcvprio: js.UndefOr[Double] = js.undefined
    
    var rcvtimeo: js.UndefOr[Double] = js.undefined
    
    var reconn: js.UndefOr[Double] = js.undefined
    
    var sndbuf: js.UndefOr[Double] = js.undefined
    
    var sndprio: js.UndefOr[Double] = js.undefined
    
    var sndtimeo: js.UndefOr[Double] = js.undefined
    
    var tcpnodelay: js.UndefOr[Boolean] = js.undefined
    
    var wsopt: js.UndefOr[text | binary] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChan(value: js.Array[String]): Self = StObject.set(x, "chan", value.asInstanceOf[js.Any])
      
      inline def setChanUndefined: Self = StObject.set(x, "chan", js.undefined)
      
      inline def setChanVarargs(value: String*): Self = StObject.set(x, "chan", js.Array(value*))
      
      inline def setDontwait(value: Boolean): Self = StObject.set(x, "dontwait", value.asInstanceOf[js.Any])
      
      inline def setDontwaitUndefined: Self = StObject.set(x, "dontwait", js.undefined)
      
      inline def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
      
      inline def setLinger(value: Double): Self = StObject.set(x, "linger", value.asInstanceOf[js.Any])
      
      inline def setLingerUndefined: Self = StObject.set(x, "linger", js.undefined)
      
      inline def setMaxreconn(value: Double): Self = StObject.set(x, "maxreconn", value.asInstanceOf[js.Any])
      
      inline def setMaxreconnUndefined: Self = StObject.set(x, "maxreconn", js.undefined)
      
      inline def setMaxttl(value: Double): Self = StObject.set(x, "maxttl", value.asInstanceOf[js.Any])
      
      inline def setMaxttlUndefined: Self = StObject.set(x, "maxttl", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRcvbuf(value: Double): Self = StObject.set(x, "rcvbuf", value.asInstanceOf[js.Any])
      
      inline def setRcvbufUndefined: Self = StObject.set(x, "rcvbuf", js.undefined)
      
      inline def setRcvmaxsize(value: Double): Self = StObject.set(x, "rcvmaxsize", value.asInstanceOf[js.Any])
      
      inline def setRcvmaxsizeUndefined: Self = StObject.set(x, "rcvmaxsize", js.undefined)
      
      inline def setRcvprio(value: Double): Self = StObject.set(x, "rcvprio", value.asInstanceOf[js.Any])
      
      inline def setRcvprioUndefined: Self = StObject.set(x, "rcvprio", js.undefined)
      
      inline def setRcvtimeo(value: Double): Self = StObject.set(x, "rcvtimeo", value.asInstanceOf[js.Any])
      
      inline def setRcvtimeoUndefined: Self = StObject.set(x, "rcvtimeo", js.undefined)
      
      inline def setReconn(value: Double): Self = StObject.set(x, "reconn", value.asInstanceOf[js.Any])
      
      inline def setReconnUndefined: Self = StObject.set(x, "reconn", js.undefined)
      
      inline def setSndbuf(value: Double): Self = StObject.set(x, "sndbuf", value.asInstanceOf[js.Any])
      
      inline def setSndbufUndefined: Self = StObject.set(x, "sndbuf", js.undefined)
      
      inline def setSndprio(value: Double): Self = StObject.set(x, "sndprio", value.asInstanceOf[js.Any])
      
      inline def setSndprioUndefined: Self = StObject.set(x, "sndprio", js.undefined)
      
      inline def setSndtimeo(value: Double): Self = StObject.set(x, "sndtimeo", value.asInstanceOf[js.Any])
      
      inline def setSndtimeoUndefined: Self = StObject.set(x, "sndtimeo", js.undefined)
      
      inline def setTcpnodelay(value: Boolean): Self = StObject.set(x, "tcpnodelay", value.asInstanceOf[js.Any])
      
      inline def setTcpnodelayUndefined: Self = StObject.set(x, "tcpnodelay", js.undefined)
      
      inline def setWsopt(value: text | binary): Self = StObject.set(x, "wsopt", value.asInstanceOf[js.Any])
      
      inline def setWsoptUndefined: Self = StObject.set(x, "wsopt", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nanomsg.nanomsgInts.`16`
    - typingsJapgolly.nanomsg.nanomsgInts.`32`
    - typingsJapgolly.nanomsg.nanomsgInts.`33`
    - typingsJapgolly.nanomsg.nanomsgInts.`48`
    - typingsJapgolly.nanomsg.nanomsgInts.`49`
    - typingsJapgolly.nanomsg.nanomsgInts.`80`
    - typingsJapgolly.nanomsg.nanomsgInts.`81`
    - typingsJapgolly.nanomsg.nanomsgInts.`98`
    - typingsJapgolly.nanomsg.nanomsgInts.`99`
    - typingsJapgolly.nanomsg.nanomsgInts.`112`
  */
  trait Protocol extends StObject
  object Protocol {
    
    inline def `112`: typingsJapgolly.nanomsg.nanomsgInts.`112` = 112.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`112`]
    
    inline def `16`: typingsJapgolly.nanomsg.nanomsgInts.`16` = 16.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`16`]
    
    inline def `32`: typingsJapgolly.nanomsg.nanomsgInts.`32` = 32.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`32`]
    
    inline def `33`: typingsJapgolly.nanomsg.nanomsgInts.`33` = 33.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`33`]
    
    inline def `48`: typingsJapgolly.nanomsg.nanomsgInts.`48` = 48.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`48`]
    
    inline def `49`: typingsJapgolly.nanomsg.nanomsgInts.`49` = 49.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`49`]
    
    inline def `80`: typingsJapgolly.nanomsg.nanomsgInts.`80` = 80.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`80`]
    
    inline def `81`: typingsJapgolly.nanomsg.nanomsgInts.`81` = 81.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`81`]
    
    inline def `98`: typingsJapgolly.nanomsg.nanomsgInts.`98` = 98.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`98`]
    
    inline def `99`: typingsJapgolly.nanomsg.nanomsgInts.`99` = 99.asInstanceOf[typingsJapgolly.nanomsg.nanomsgInts.`99`]
  }
  
  @js.native
  trait SocketEventEmitter extends StObject {
    
    def addListener[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
    ): this.type = js.native
    
    def emit[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](
      event: E,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SocketEvents[E]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
        ]
    ): Boolean = js.native
    
    def eventNames(): js.Array[/* keyof nanomsg.nanomsg.SocketEvents */ data | error | close] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def listenerCount(event: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close): Double = js.native
    
    def listeners[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](event: E): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
      ] = js.native
    
    def off[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
    ): this.type = js.native
    
    def on[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
    ): this.type = js.native
    
    def once[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
    ): this.type = js.native
    
    def prependListener[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
    ): this.type = js.native
    
    def prependOnceListener[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
    ): this.type = js.native
    
    def rawListeners[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](event: E): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
      ] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close): this.type = js.native
    
    def removeListener[E /* <: /* keyof nanomsg.nanomsg.SocketEvents */ data | error | close */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: nanomsg.nanomsg.SocketEvents[E] */ js.Any
    ): this.type = js.native
    
    def setMaxListeners(maxListeners: Double): this.type = js.native
  }
  
  trait SocketEvents extends StObject {
    
    def close(): Unit
    
    def data(data: Buffer): Unit
    
    def error(error: Any): Unit
  }
  object SocketEvents {
    
    inline def apply(close: Callback, data: Buffer => Callback, error: Any => Callback): SocketEvents = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, data = js.Any.fromFunction1((t0: Buffer) => data(t0).runNow()), error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()))
      __obj.asInstanceOf[SocketEvents]
    }
    
    extension [Self <: SocketEvents](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setData(value: Buffer => Callback): Self = StObject.set(x, "data", js.Any.fromFunction1((t0: Buffer) => value(t0).runNow()))
      
      inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nanomsg.nanomsgStrings.pair
    - typingsJapgolly.nanomsg.nanomsgStrings.pub
    - typingsJapgolly.nanomsg.nanomsgStrings.sub
    - typingsJapgolly.nanomsg.nanomsgStrings.req
    - typingsJapgolly.nanomsg.nanomsgStrings.rep
    - typingsJapgolly.nanomsg.nanomsgStrings.push
    - typingsJapgolly.nanomsg.nanomsgStrings.pull
    - typingsJapgolly.nanomsg.nanomsgStrings.surveyor
    - typingsJapgolly.nanomsg.nanomsgStrings.respondent
    - typingsJapgolly.nanomsg.nanomsgStrings.bus
  */
  trait SocketType extends StObject
  object SocketType {
    
    inline def bus: typingsJapgolly.nanomsg.nanomsgStrings.bus = "bus".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.bus]
    
    inline def pair: typingsJapgolly.nanomsg.nanomsgStrings.pair = "pair".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.pair]
    
    inline def pub: typingsJapgolly.nanomsg.nanomsgStrings.pub = "pub".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.pub]
    
    inline def pull: typingsJapgolly.nanomsg.nanomsgStrings.pull = "pull".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.pull]
    
    inline def push: typingsJapgolly.nanomsg.nanomsgStrings.push = "push".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.push]
    
    inline def rep: typingsJapgolly.nanomsg.nanomsgStrings.rep = "rep".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.rep]
    
    inline def req: typingsJapgolly.nanomsg.nanomsgStrings.req = "req".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.req]
    
    inline def respondent: typingsJapgolly.nanomsg.nanomsgStrings.respondent = "respondent".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.respondent]
    
    inline def sub: typingsJapgolly.nanomsg.nanomsgStrings.sub = "sub".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.sub]
    
    inline def surveyor: typingsJapgolly.nanomsg.nanomsgStrings.surveyor = "surveyor".asInstanceOf[typingsJapgolly.nanomsg.nanomsgStrings.surveyor]
  }
}
