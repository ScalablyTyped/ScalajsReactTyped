package typingsJapgolly.elasticTransport

import typingsJapgolly.elasticTransport.anon.ALIVE
import typingsJapgolly.elasticTransport.anon.DEFAULT
import typingsJapgolly.elasticTransport.anon.None
import typingsJapgolly.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typingsJapgolly.elasticTransport.libDiagnosticMod.default
import typingsJapgolly.elasticTransport.libPoolBaseConnectionPoolMod.ConnectionPoolOptions
import typingsJapgolly.elasticTransport.libSerializerMod.SerializerOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportOptions
import typingsJapgolly.elasticTransport.libTypesMod.DiagnosticResult
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@elastic/transport", "BaseConnection")
  @js.native
  open class BaseConnection protected ()
    extends typingsJapgolly.elasticTransport.libConnectionMod.BaseConnection {
    def this(opts: ConnectionOptions) = this()
  }
  /* static members */
  object BaseConnection {
    
    @JSImport("@elastic/transport", "BaseConnection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/transport", "BaseConnection.statuses")
    @js.native
    def statuses: ALIVE = js.native
    inline def statuses_=(x: ALIVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statuses")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/transport", "BaseConnectionPool")
  @js.native
  open class BaseConnectionPool protected ()
    extends typingsJapgolly.elasticTransport.libPoolMod.BaseConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  @JSImport("@elastic/transport", "CloudConnectionPool")
  @js.native
  open class CloudConnectionPool protected ()
    extends typingsJapgolly.elasticTransport.libPoolMod.CloudConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  @JSImport("@elastic/transport", "ClusterConnectionPool")
  @js.native
  open class ClusterConnectionPool protected ()
    extends typingsJapgolly.elasticTransport.libPoolMod.ClusterConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  /* static members */
  object ClusterConnectionPool {
    
    @JSImport("@elastic/transport", "ClusterConnectionPool")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/transport", "ClusterConnectionPool.resurrectStrategies")
    @js.native
    def resurrectStrategies: None = js.native
    inline def resurrectStrategies_=(x: None): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resurrectStrategies")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/transport", "Diagnostic")
  @js.native
  open class Diagnostic () extends default
  
  @JSImport("@elastic/transport", "HttpConnection")
  @js.native
  open class HttpConnection protected ()
    extends typingsJapgolly.elasticTransport.libConnectionMod.HttpConnection {
    def this(opts: ConnectionOptions) = this()
  }
  
  @JSImport("@elastic/transport", "Serializer")
  @js.native
  open class Serializer ()
    extends typingsJapgolly.elasticTransport.libSerializerMod.default {
    def this(opts: SerializerOptions) = this()
  }
  
  @JSImport("@elastic/transport", "Transport")
  @js.native
  open class Transport protected ()
    extends typingsJapgolly.elasticTransport.libTransportMod.default {
    def this(opts: TransportOptions) = this()
  }
  /* static members */
  object Transport {
    
    @JSImport("@elastic/transport", "Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/transport", "Transport.sniffReasons")
    @js.native
    def sniffReasons: DEFAULT = js.native
    inline def sniffReasons_=(x: DEFAULT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sniffReasons")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/transport", "UndiciConnection")
  @js.native
  open class UndiciConnection protected ()
    extends typingsJapgolly.elasticTransport.libConnectionMod.UndiciConnection {
    def this(opts: ConnectionOptions) = this()
  }
  
  @JSImport("@elastic/transport", "WeightedConnectionPool")
  @js.native
  open class WeightedConnectionPool protected ()
    extends typingsJapgolly.elasticTransport.libPoolMod.WeightedConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  object errors {
    
    @JSImport("@elastic/transport", "errors.ConfigurationError")
    @js.native
    open class ConfigurationError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.ConfigurationError {
      def this(message: String) = this()
    }
    
    @JSImport("@elastic/transport", "errors.ConnectionError")
    @js.native
    open class ConnectionError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.ConnectionError {
      def this(message: String) = this()
      def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/transport", "errors.DeserializationError")
    @js.native
    open class DeserializationError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.DeserializationError {
      def this(message: String, data: String) = this()
    }
    
    @JSImport("@elastic/transport", "errors.ElasticsearchClientError")
    @js.native
    open class ElasticsearchClientError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.ElasticsearchClientError {
      def this(message: String) = this()
    }
    
    @JSImport("@elastic/transport", "errors.NoLivingConnectionsError")
    @js.native
    open class NoLivingConnectionsError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.NoLivingConnectionsError {
      def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/transport", "errors.ProductNotSupportedError")
    @js.native
    open class ProductNotSupportedError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.ProductNotSupportedError {
      def this(product: String) = this()
      def this(product: String, meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/transport", "errors.RequestAbortedError")
    @js.native
    open class RequestAbortedError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.RequestAbortedError {
      def this(message: String) = this()
      def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/transport", "errors.ResponseError")
    @js.native
    open class ResponseError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.ResponseError {
      def this(meta: DiagnosticResult[Any, Any]) = this()
    }
    
    @JSImport("@elastic/transport", "errors.SerializationError")
    @js.native
    open class SerializationError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.SerializationError {
      def this(message: String, data: Record[String, Any]) = this()
    }
    
    @JSImport("@elastic/transport", "errors.TimeoutError")
    @js.native
    open class TimeoutError protected ()
      extends typingsJapgolly.elasticTransport.libErrorsMod.TimeoutError {
      def this(message: String) = this()
      def this(message: String, meta: DiagnosticResult[Any, Any]) = this()
    }
  }
  
  @JSImport("@elastic/transport", "events")
  @js.native
  object events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.elasticTransport.libDiagnosticMod.events & String] = js.native
    
    /* "deserialization" */ val DESERIALIZATION: typingsJapgolly.elasticTransport.libDiagnosticMod.events.DESERIALIZATION & String = js.native
    
    /* "request" */ val REQUEST: typingsJapgolly.elasticTransport.libDiagnosticMod.events.REQUEST & String = js.native
    
    /* "response" */ val RESPONSE: typingsJapgolly.elasticTransport.libDiagnosticMod.events.RESPONSE & String = js.native
    
    /* "resurrect" */ val RESURRECT: typingsJapgolly.elasticTransport.libDiagnosticMod.events.RESURRECT & String = js.native
    
    /* "serialization" */ val SERIALIZATION: typingsJapgolly.elasticTransport.libDiagnosticMod.events.SERIALIZATION & String = js.native
    
    /* "sniff" */ val SNIFF: typingsJapgolly.elasticTransport.libDiagnosticMod.events.SNIFF & String = js.native
  }
}
