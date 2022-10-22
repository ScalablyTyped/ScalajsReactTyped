package typingsJapgolly.opentelemetryInstrumentationGrpc

import typingsJapgolly.grpcGrpcJs.buildSrcClientMod.UnaryCallback
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.ServiceClientConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcServerCallMod.ServerDuplexStream
import typingsJapgolly.grpcGrpcJs.buildSrcServerCallMod.ServerReadableStream
import typingsJapgolly.grpcGrpcJs.buildSrcServerCallMod.ServerUnaryCall
import typingsJapgolly.grpcGrpcJs.buildSrcServerCallMod.ServerWritableStream
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.opentelemetryInstrumentationGrpc.anon.Metadata
import typingsJapgolly.opentelemetryInstrumentationGrpc.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGrpcJsTypesMod {
  
  type GrpcClientFunc = (js.Function1[/* repeated */ Any, GrpcEmitter]) & Path
  
  @js.native
  trait GrpcEmitter extends EventEmitter
  
  @js.native
  trait MakeClientConstructorFunction extends StObject {
    
    def apply(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def apply(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  }
  
  type SendUnaryDataCallback[T] = UnaryCallback[T]
  
  type ServerCall[T, U] = (ServerUnaryCall[T, U]) | (ServerReadableStream[T, U]) | (ServerWritableStream[T, U]) | (ServerDuplexStream[T, U])
  
  type ServerCallWithMeta[T, U] = (ServerCall[T, U]) & Metadata
  
  type ServerRegisterFunction = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof grpcJs.Server.prototype.register */ Any
}
