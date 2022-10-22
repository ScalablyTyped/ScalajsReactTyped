package typingsJapgolly.opentelemetryInstrumentationGrpc

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import typingsJapgolly.grpcGrpcJs.mod.Client
import typingsJapgolly.grpcGrpcJs.mod.Metadata
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.opentelemetryApi.buildSrcTraceSpanMod.Span
import typingsJapgolly.opentelemetryInstrumentationGrpc.anon.OriginalName
import typingsJapgolly.opentelemetryInstrumentationGrpc.anon.TypeofgrpcJs
import typingsJapgolly.opentelemetryInstrumentationGrpc.buildSrcGrpcJsTypesMod.GrpcClientFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGrpcJsClientUtilsMod {
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/grpc-js/clientUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMetadata(grpcClient: TypeofgrpcJs, original: GrpcClientFunc, args: js.Array[Any | Metadata]): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(grpcClient.asInstanceOf[js.Any], original.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  inline def getMethodsToWrap(
    client: Instantiable2[/* address */ String, /* credentials */ ChannelCredentials, Client],
    methods: StringDictionary[OriginalName]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMethodsToWrap")(client.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def makeGrpcClientRemoteCall(original: GrpcClientFunc, args: js.Array[Any], metadata: Metadata, self: Client): js.Function1[/* span */ Span, EventEmitter] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGrpcClientRemoteCall")(original.asInstanceOf[js.Any], args.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* span */ Span, EventEmitter]]
  
  inline def setSpanContext(metadata: Metadata): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSpanContext")(metadata.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
