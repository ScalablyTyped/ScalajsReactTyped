package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechBooleans.`true`
import typingsJapgolly.grpcGrpcJs.anon.PartialChannelControlHelp
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetHandlers
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetServiceDefinition
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import typingsJapgolly.grpcGrpcJs.buildSrcDurationMod.Duration
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.Filter
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.FilterFactory
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.ChannelControlHelper
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancer
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancerConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfigConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcResolverMod.ResolverConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelInterfaceMod.SubchannelInterface
import typingsJapgolly.grpcGrpcJs.buildSrcUriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofexperimental extends StObject {
  
  var BackoffTimeout: Instantiable1[
    /* callback */ js.Function0[Unit], 
    typingsJapgolly.googleGax.mod.grpc.experimental.BackoffTimeout
  ] = js.native
  
  var BaseFilter: Instantiable0[typingsJapgolly.googleGax.mod.grpc.experimental.BaseFilter] = js.native
  
  var BaseSubchannelWrapper: Instantiable1[
    /* child */ SubchannelInterface, 
    typingsJapgolly.googleGax.mod.grpc.experimental.BaseSubchannelWrapper
  ] = js.native
  
  var ChildLoadBalancerHandler: Instantiable1[
    /* channelControlHelper */ ChannelControlHelper, 
    typingsJapgolly.googleGax.mod.grpc.experimental.ChildLoadBalancerHandler
  ] = js.native
  
  var FilterStackFactory: Instantiable1[
    /* factories */ js.Array[FilterFactory[Filter]], 
    typingsJapgolly.googleGax.mod.grpc.experimental.FilterStackFactory
  ] = js.native
  
  var OutlierDetectionLoadBalancingConfig: TypeofOutlierDetectionLoa = js.native
  
  var QueuePicker: Instantiable1[
    /* loadBalancer */ LoadBalancer, 
    typingsJapgolly.googleGax.mod.grpc.experimental.QueuePicker
  ] = js.native
  
  var UnavailablePicker: Instantiable0[typingsJapgolly.googleGax.mod.grpc.experimental.UnavailablePicker] = js.native
  
  def createChildChannelControlHelper(parent: ChannelControlHelper, overrides: PartialChannelControlHelp): ChannelControlHelper = js.native
  
  def durationToMs(duration: Duration): Double = js.native
  
  def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig = js.native
  @JSName("getFirstUsableConfig")
  def getFirstUsableConfig_true(configs: js.Array[LoadBalancingConfig], fallbackTodefault: `true`): LoadBalancingConfig = js.native
  
  def log(severity: LogVerbosity, args: Any*): Unit = js.native
  
  def registerAdminService(getServiceDefinition: GetServiceDefinition, getHandlers: GetHandlers): Unit = js.native
  
  def registerLoadBalancerType(
    typeName: String,
    loadBalancerType: LoadBalancerConstructor,
    loadBalancingConfigType: LoadBalancingConfigConstructor
  ): Unit = js.native
  
  def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = js.native
  
  def subchannelAddressToString(address: SubchannelAddress): String = js.native
  
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
  
  def uriToString(uri: GrpcUri): String = js.native
  
  def validateLoadBalancingConfig(obj: Any): LoadBalancingConfig = js.native
}
