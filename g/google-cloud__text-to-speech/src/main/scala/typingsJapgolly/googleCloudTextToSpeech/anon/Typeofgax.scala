package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.proto
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.rest
import typingsJapgolly.googleGax.buildSrcApitypesMod.APICallback
import typingsJapgolly.googleGax.buildSrcApitypesMod.GRPCCall
import typingsJapgolly.googleGax.buildSrcApitypesMod.GaxCall
import typingsJapgolly.googleGax.buildSrcBundlingCallsBundleExecutorMod.BundleOptions
import typingsJapgolly.googleGax.buildSrcClientInterfaceMod.ClientOptions
import typingsJapgolly.googleGax.buildSrcDescriptorMod.Descriptor
import typingsJapgolly.googleGax.buildSrcGaxMod.BackoffSettings
import typingsJapgolly.googleGax.buildSrcGaxMod.BundlingConfig
import typingsJapgolly.googleGax.buildSrcGaxMod.CallOptions
import typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings
import typingsJapgolly.googleGax.buildSrcGaxMod.ClientConfig
import typingsJapgolly.googleGax.buildSrcGaxMod.RetryOptions
import typingsJapgolly.googleGax.buildSrcGrpcMod.GrpcClient
import typingsJapgolly.googleGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.LROOperation
import typingsJapgolly.googleGax.buildSrcStreamingCallsStreamingMod.StreamType
import typingsJapgolly.googleGax.mod.Operation_
import typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofgax extends StObject {
  
  var BundleDescriptor: Instantiable4[
    /* bundledField */ String, 
    /* requestDiscriminatorFields */ js.Array[String], 
    /* subresponseField */ String, 
    /* byteLengthFunction */ js.Function, 
    typingsJapgolly.googleGax.mod.BundleDescriptor
  ] = js.native
  
  var CallSettings: Instantiable0[typingsJapgolly.googleGax.mod.CallSettings] = js.native
  
  var ChannelCredentials: TypeofChannelCredentialsInstantiable = js.native
  
  var ClientStub: Instantiable2[
    /* address */ String, 
    /* credentials */ ChannelCredentials, 
    typingsJapgolly.googleGax.mod.ClientStub
  ] = js.native
  
  var GoogleAuth: TypeofGoogleAuth = js.native
  
  var GoogleError: TypeofGoogleErrorInstantiable = js.native
  
  var GoogleProtoFilesRoot: TypeofGoogleProtoFilesRoo = js.native
  
  var GrpcClient: TypeofGrpcClientInstantiable = js.native
  
  var IamClient: TypeofIamClient = js.native
  
  var LocationsClient: TypeofLocationsClient = js.native
  
  var OngoingCall: Instantiable1[/* callback */ APICallback, typingsJapgolly.googleGax.mod.OngoingCall] = js.native
  
  var Operation: Instantiable3[
    /* grpcOp */ LROOperation, 
    /* longrunningDescriptor */ LongRunningDescriptor, 
    /* backoffSettings */ BackoffSettings, 
    Operation_
  ] = js.native
  
  var OperationsClient: Instantiable3[
    /* gaxGrpc */ GrpcClient, 
    /* operationsProtos */ Any, 
    /* options */ ClientOptions, 
    typingsJapgolly.googleGax.mod.OperationsClient
  ] = js.native
  
  var PageDescriptor: Instantiable3[
    /* requestPageTokenField */ String, 
    /* responsePageTokenField */ String, 
    /* resourceField */ String, 
    typingsJapgolly.googleGax.mod.PageDescriptor
  ] = js.native
  
  var PathTemplate: Instantiable1[/* data */ String, typingsJapgolly.googleGax.mod.PathTemplate] = js.native
  
  var RetryOptions: Instantiable2[
    /* retryCodes */ js.Array[Double], 
    /* backoffSettings */ BackoffSettings, 
    typingsJapgolly.googleGax.mod.RetryOptions
  ] = js.native
  
  var StreamDescriptor: Instantiable1[/* streamType */ StreamType, typingsJapgolly.googleGax.mod.StreamDescriptor] = js.native
  
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object
  ): Any = js.native
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object,
    otherArgs: js.Object
  ): Any = js.native
  
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, _fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, _fallback: Boolean): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(
    func: js.Promise[GRPCCall],
    settings: CallSettings,
    descriptor: Descriptor,
    _fallback: proto | rest
  ): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor, _fallback: Boolean): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, _fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, _fallback: Boolean): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, _fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, _fallback: Boolean): GaxCall = js.native
  
  def createBackoffSettings(initialRetryDelayMillis: Double, retryDelayMultiplier: Double, maxRetryDelayMillis: Double): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  
  def createBundleOptions(options: BundlingConfig): BundleOptions = js.native
  
  val createByteLengthFunction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GrpcClient.createByteLengthFunction */ Any = js.native
  
  def createDefaultBackoffSettings(): BackoffSettings = js.native
  
  def createMaxRetriesBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    maxRetries: Double
  ): BackoffSettings = js.native
  
  def createRetryOptions(retryCodes: js.Array[Double], backoffSettings: BackoffSettings): RetryOptions = js.native
  
  val fallback: Typeoffallback = js.native
  
  val grpc: Typeofgrpc = js.native
  
  val lro: Any = js.native
  
  def operation(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = js.native
  def operation(
    op: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ): typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = js.native
  
  val protobuf: TypeofprotobufBufferReader = js.native
  
  val protobufMinimal: TypeofprotobufMinimalBufferReader = js.native
  
  val routingHeader: TypeofroutingHeader = js.native
  
  val serializer: Typeofserializer = js.native
  
  val version: Any = js.native
  
  def warn(code: String, message: String): Unit = js.native
  def warn(code: String, message: String, warnType: String): Unit = js.native
}
