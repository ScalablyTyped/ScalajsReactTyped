package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.proto
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.rest
import typingsJapgolly.googleGax.buildSrcApitypesMod.GRPCCall
import typingsJapgolly.googleGax.buildSrcApitypesMod.GaxCall
import typingsJapgolly.googleGax.buildSrcClientInterfaceMod.ClientOptions
import typingsJapgolly.googleGax.buildSrcDescriptorMod.Descriptor
import typingsJapgolly.googleGax.buildSrcGaxMod.BackoffSettings
import typingsJapgolly.googleGax.buildSrcGaxMod.CallOptions
import typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings
import typingsJapgolly.googleGax.buildSrcGaxMod.ClientConfig
import typingsJapgolly.googleGax.buildSrcGrpcMod.GrpcClient
import typingsJapgolly.googleGax.buildSrcGrpcMod.GrpcClientOptions
import typingsJapgolly.googleGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.LROOperation
import typingsJapgolly.googleGax.buildSrcOperationsClientMod.OperationsClientBuilder
import typingsJapgolly.googleGax.buildSrcStreamingCallsStreamingMod.StreamType
import typingsJapgolly.googleGax.mod.fallback.Operation_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoffallback extends StObject {
  
  var BundleDescriptor: Instantiable4[
    /* bundledField */ String, 
    /* requestDiscriminatorFields */ js.Array[String], 
    /* subresponseField */ String, 
    /* byteLengthFunction */ js.Function, 
    typingsJapgolly.googleGax.mod.fallback.BundleDescriptor
  ] = js.native
  
  var CallSettings: Instantiable0[typingsJapgolly.googleGax.mod.fallback.CallSettings] = js.native
  
  var GoogleError: TypeofGoogleError = js.native
  
  var GrpcClient: TypeofGrpcClient = js.native
  
  var IamClient: TypeofIamClient = js.native
  
  var LocationsClient: TypeofLocationsClient = js.native
  
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
    typingsJapgolly.googleGax.mod.fallback.OperationsClient
  ] = js.native
  
  var PageDescriptor: Instantiable3[
    /* requestPageTokenField */ String, 
    /* responsePageTokenField */ String, 
    /* resourceField */ String, 
    typingsJapgolly.googleGax.mod.fallback.PageDescriptor
  ] = js.native
  
  var PathTemplate: Instantiable1[/* data */ String, typingsJapgolly.googleGax.mod.fallback.PathTemplate] = js.native
  
  var RetryOptions: Instantiable2[
    /* retryCodes */ js.Array[Double], 
    /* backoffSettings */ BackoffSettings, 
    typingsJapgolly.googleGax.mod.fallback.RetryOptions
  ] = js.native
  
  var StreamDescriptor: Instantiable1[
    /* streamType */ StreamType, 
    typingsJapgolly.googleGax.mod.fallback.StreamDescriptor
  ] = js.native
  
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
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, fallback: Boolean): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor, fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor, fallback: Boolean): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, fallback: Boolean): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, fallback: Boolean): GaxCall = js.native
  
  def createDefaultBackoffSettings(): BackoffSettings = js.native
  
  val defaultToObjectOptions: TypeofdefaultToObjectOpti = js.native
  
  val fallback: Any = js.native
  
  def lro(options: GrpcClientOptions): OperationsClientBuilder = js.native
  
  def operation(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = js.native
  def operation(
    op: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ): typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = js.native
  
  val protobuf: Typeofprotobuf = js.native
  
  val protobufMinimal: TypeofprotobufMinimal = js.native
  
  val routingHeader: TypeofroutingHeader = js.native
  
  val version: String = js.native
  
  def warn(code: String, message: String): Unit = js.native
  def warn(code: String, message: String, warnType: String): Unit = js.native
}
