package typingsJapgolly.graphiteUdp

import japgolly.scalajs.react.Callback
import typingsJapgolly.graphiteUdp.graphiteUdpStrings.udp4
import typingsJapgolly.graphiteUdp.graphiteUdpStrings.udp6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphite-udp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("graphite-udp", "Client")
  @js.native
  open class Client () extends StObject {
    def this(clientOptions: ClientOptions) = this()
    
    /**
      * During the interval time option, if 2 or more metrics with the same name are sent, metrics will be added (summed)
      */
    def add(name: String, value: Double): Unit = js.native
    
    /**
      * Close the underlying UDP client socket
      *
      * @return void
      */
    def close(): Unit = js.native
    
    /**
      * During the interval time option, if 2 or more metrics with the same name are sent, the last one will be used
      */
    def put(name: String, value: Double): Unit = js.native
  }
  
  inline def createClient(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[Client]
  inline def createClient(clientOptions: ClientOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(clientOptions.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  trait ClientOptions extends StObject {
    
    /**
      * called when metrics are sent
      * Defaults to null
      */
    var callback: js.UndefOr[js.Function2[/* error */ js.Error, /* metrics */ Any, Unit]] = js.undefined
    
    /**
      * graphite server host or ip
      * Defaults to 127.0.0.1
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Interval to group metrics by in milliseconds
      * Defaults to 5000 (5s)
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * split into smaller UDP packets
      * Defaults to 4096
      */
    var maxPacketSize: js.UndefOr[Double] = js.undefined
    
    /**
      * graphite server udp port
      * Defaults to 2003
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Prefix for each metric name
      * Defaults to ''
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Suffix for each metrtic name
      * Defaults to ''
      */
    var suffix: js.UndefOr[String] = js.undefined
    
    /**
      * udp type (udp4 or udp6)
      * Defaults to udp4
      */
    var `type`: js.UndefOr[udp4 | udp6] = js.undefined
    
    /**
      * log messages to console
      * Defaults to false
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setCallback(value: (/* error */ js.Error, /* metrics */ Any) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* metrics */ Any) => (value(t0, t1)).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
      
      inline def setMaxPacketSizeUndefined: Self = StObject.set(x, "maxPacketSize", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setType(value: udp4 | udp6): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
