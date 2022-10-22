package typingsJapgolly.opentelemetryInstrumentationGrpc

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.grpc.mod.ChannelCredentials
import typingsJapgolly.grpc.mod.Client
import typingsJapgolly.grpc.mod.GenericClientOptions
import typingsJapgolly.grpc.mod.Metadata
import typingsJapgolly.grpc.mod.ServerDuplexStream
import typingsJapgolly.grpc.mod.ServerReadableStream
import typingsJapgolly.grpc.mod.ServerUnaryCall
import typingsJapgolly.grpc.mod.ServerWritableStream
import typingsJapgolly.grpc.mod.ServiceDefinition
import typingsJapgolly.grpc.mod.ServiceError
import typingsJapgolly.grpc.mod.writeFlags
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.opentelemetryInstrumentationGrpc.anon.Request
import typingsJapgolly.std.FunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGrpcTypesMod {
  
  @js.native
  trait GrpcClientFunc
    extends StObject
       with FunctionConstructor {
    
    var path: String = js.native
    
    var requestStream: Boolean = js.native
    
    var responseStream: Boolean = js.native
  }
  
  trait GrpcInternalClientTypes extends StObject {
    
    def makeClientConstructor(methods: ServiceDefinition[Any], serviceName: String, classOptions: GenericClientOptions): Instantiable3[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        /* options */ js.UndefOr[js.Object], 
        Client
      ]
    @JSName("makeClientConstructor")
    var makeClientConstructor_Original: js.Function3[
        /* methods */ ServiceDefinition[Any], 
        /* serviceName */ String, 
        /* classOptions */ GenericClientOptions, 
        Instantiable3[
          /* address */ String, 
          /* credentials */ ChannelCredentials, 
          /* options */ js.UndefOr[js.Object], 
          Client
        ]
      ]
  }
  object GrpcInternalClientTypes {
    
    inline def apply(
      makeClientConstructor: (/* methods */ ServiceDefinition[Any], /* serviceName */ String, /* classOptions */ GenericClientOptions) => Instantiable3[
          /* address */ String, 
          /* credentials */ ChannelCredentials, 
          /* options */ js.UndefOr[js.Object], 
          Client
        ]
    ): GrpcInternalClientTypes = {
      val __obj = js.Dynamic.literal(makeClientConstructor = js.Any.fromFunction3(makeClientConstructor))
      __obj.asInstanceOf[GrpcInternalClientTypes]
    }
    
    extension [Self <: GrpcInternalClientTypes](x: Self) {
      
      inline def setMakeClientConstructor(
        value: (/* methods */ ServiceDefinition[Any], /* serviceName */ String, /* classOptions */ GenericClientOptions) => Instantiable3[
              /* address */ String, 
              /* credentials */ ChannelCredentials, 
              /* options */ js.UndefOr[js.Object], 
              Client
            ]
      ): Self = StObject.set(x, "makeClientConstructor", js.Any.fromFunction3(value))
    }
  }
  
  trait GrpcStatus extends StObject {
    
    var code: Double
    
    var details: String
    
    var metadata: Metadata
  }
  object GrpcStatus {
    
    inline def apply(code: Double, details: String, metadata: Metadata): GrpcStatus = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrpcStatus]
    }
    
    extension [Self <: GrpcStatus](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  type SendUnaryDataCallback = js.Function4[
    /* error */ ServiceError | Null, 
    /* value */ js.UndefOr[Any], 
    /* trailer */ js.UndefOr[Metadata], 
    /* flags */ js.UndefOr[writeFlags], 
    Unit
  ]
  
  type ServerCall = Instantiable0[
    (ServerDuplexStream[js.Object, js.Object]) | ServerReadableStream[js.Object] | ServerUnaryCall[js.Object] | (ServerWritableStream[js.Object, js.Object])
  ]
  
  type ServerCallWithMeta = ServerCall & Request & EventEmitter
}
