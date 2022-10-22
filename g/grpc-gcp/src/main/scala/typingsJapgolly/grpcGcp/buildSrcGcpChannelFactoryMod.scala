package typingsJapgolly.grpcGcp

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.grpcGcp.anon.TypeofCallCredentials
import typingsJapgolly.grpcGcp.anon.TypeofChannelCredentials
import typingsJapgolly.grpcGcp.anon.TypeofMetadata
import typingsJapgolly.grpcGcp.anon.TypeofServerCredentials
import typingsJapgolly.grpcGcp.anon.Typeofcredentials
import typingsJapgolly.grpcGcp.anon.Typeofexperimental
import typingsJapgolly.grpcGcp.buildSrcChannelRefMod.ChannelRef
import typingsJapgolly.grpcGcp.buildSrcGeneratedGrpcGcpMod.grpc.gcp.IAffinityConfig
import typingsJapgolly.grpcGrpcJs.anon.PartialConsole
import typingsJapgolly.grpcGrpcJs.buildSrcChannelMod.Channel
import typingsJapgolly.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typingsJapgolly.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCallInterface
import typingsJapgolly.grpcGrpcJs.buildSrcClientMod.Client
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.PackageDefinition
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.ServiceClientConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcServerMod.Server
import typingsJapgolly.grpcGrpcJs.mod.ChannelCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGcpChannelFactoryMod {
  
  @JSImport("grpc-gcp/build/src/gcp_channel_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGcpChannelFactoryClass(grpc: GrpcModule): GcpChannelFactoryConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getGcpChannelFactoryClass")(grpc.asInstanceOf[js.Any]).asInstanceOf[GcpChannelFactoryConstructor]
  
  @js.native
  trait GcpChannelFactoryConstructor
    extends StObject
       with Instantiable3[
          /* address */ String, 
          /* credentials */ ChannelCredentials, 
          /* options */ Any, 
          GcpChannelFactoryInterface
        ]
  
  @js.native
  trait GcpChannelFactoryInterface
    extends StObject
       with Channel {
    
    def bind(channelRef: ChannelRef, affinityKey: String): Unit = js.native
    
    def getAffinityConfig(methodName: String): IAffinityConfig = js.native
    
    def getChannelRef(): ChannelRef = js.native
    def getChannelRef(affinityKey: String): ChannelRef = js.native
    
    def shouldRequestDebugHeaders(): Boolean = js.native
    def shouldRequestDebugHeaders(lastRequested: js.Date): Boolean = js.native
    
    def unbind(): Unit = js.native
    def unbind(boundKey: String): Unit = js.native
  }
  
  @js.native
  trait GrpcModule extends StObject {
    
    var CallCredentials: TypeofCallCredentials = js.native
    
    var Channel: Instantiable3[
        /* target */ String, 
        /* credentials */ typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials, 
        /* options */ ChannelOptions, 
        typingsJapgolly.grpcGrpcJs.mod.Channel
      ] = js.native
    
    var ChannelCredentials: TypeofChannelCredentials = js.native
    
    var Client: Instantiable2[
        /* address */ String, 
        /* credentials */ typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials, 
        typingsJapgolly.grpcGrpcJs.mod.Client
      ] = js.native
    
    var InterceptingCall: Instantiable1[
        /* nextCall */ InterceptingCallInterface, 
        typingsJapgolly.grpcGrpcJs.mod.InterceptingCall
      ] = js.native
    
    var InterceptorConfigurationError: Instantiable1[/* message */ String, typingsJapgolly.grpcGrpcJs.mod.InterceptorConfigurationError] = js.native
    
    var ListenerBuilder: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.ListenerBuilder] = js.native
    
    var Metadata: TypeofMetadata = js.native
    
    var RequesterBuilder: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.RequesterBuilder] = js.native
    
    var Server: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.Server] = js.native
    
    var ServerCredentials: TypeofServerCredentials = js.native
    
    var StatusBuilder: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.StatusBuilder] = js.native
    
    def addAdminServicesToServer(server: Server): Unit = js.native
    
    def closeClient(client: Client): Unit = js.native
    
    val credentials: Typeofcredentials = js.native
    
    val experimental: Typeofexperimental = js.native
    
    def getChannelzHandlers(): Any = js.native
    
    def getChannelzServiceDefinition(): Any = js.native
    
    def getClientChannel(client: Client): Channel = js.native
    
    def load(filename: Any, format: Any, options: Any): scala.Nothing = js.native
    
    def loadObject(value: Any, options: Any): scala.Nothing = js.native
    
    def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
    
    def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
    
    def setLogger(logger: PartialConsole): Unit = js.native
    
    def waitForClientReady(client: Client, deadline: js.Date, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def waitForClientReady(client: Client, deadline: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
}
