package typingsJapgolly.grpcGrpcJs

import typingsJapgolly.grpcGrpcJs.anon.PartialChannelControlHelp
import typingsJapgolly.grpcGrpcJs.anon.PartialFailurePercentageE
import typingsJapgolly.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetHandlers
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetServiceDefinition
import typingsJapgolly.grpcGrpcJs.buildSrcBackoffTimeoutMod.BackoffOptions
import typingsJapgolly.grpcGrpcJs.buildSrcCallStreamMod.StatusObject
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
import typingsJapgolly.grpcGrpcJs.grpcGrpcJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcExperimentalMod {
  
  @JSImport("@grpc/grpc-js/build/src/experimental", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "BackoffTimeout")
  @js.native
  open class BackoffTimeout protected ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcBackoffTimeoutMod.BackoffTimeout {
    def this(callback: js.Function0[Unit]) = this()
    def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js/build/src/experimental", "BaseFilter")
  @js.native
  open class BaseFilter ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.BaseFilter
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js/build/src/experimental", "BaseSubchannelWrapper")
  @js.native
  open class BaseSubchannelWrapper protected ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcSubchannelInterfaceMod.BaseSubchannelWrapper {
    def this(child: SubchannelInterface) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "ChildLoadBalancerHandler")
  @js.native
  open class ChildLoadBalancerHandler protected ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerChildHandlerMod.ChildLoadBalancerHandler {
    def this(channelControlHelper: ChannelControlHelper) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "FilterStackFactory")
  @js.native
  open class FilterStackFactory protected ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcFilterStackMod.FilterStackFactory {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "OutlierDetectionLoadBalancingConfig")
  @js.native
  open class OutlierDetectionLoadBalancingConfig protected ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig {
    def this(
      intervalMs: Double | Null,
      baseEjectionTimeMs: Double | Null,
      maxEjectionTimeMs: Double | Null,
      maxEjectionPercent: Double | Null,
      successRateEjection: PartialSuccessRateEjectio | Null,
      failurePercentageEjection: PartialFailurePercentageE | Null,
      childPolicy: js.Array[LoadBalancingConfig]
    ) = this()
  }
  /* static members */
  object OutlierDetectionLoadBalancingConfig {
    
    @JSImport("@grpc/grpc-js/build/src/experimental", "OutlierDetectionLoadBalancingConfig")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromJson(obj: Any): typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromJson")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig]
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "PickResultType")
  @js.native
  object PickResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType & Double] = js.native
    
    /* 0 */ val COMPLETE: typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType.COMPLETE & Double = js.native
    
    /* 3 */ val DROP: typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType.DROP & Double = js.native
    
    /* 1 */ val QUEUE: typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType.QUEUE & Double = js.native
    
    /* 2 */ val TRANSIENT_FAILURE: typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType.TRANSIENT_FAILURE & Double = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "QueuePicker")
  @js.native
  open class QueuePicker protected ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.QueuePicker {
    def this(loadBalancer: LoadBalancer) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "UnavailablePicker")
  @js.native
  open class UnavailablePicker ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.UnavailablePicker {
    def this(status: StatusObject) = this()
  }
  
  inline def createChildChannelControlHelper(parent: ChannelControlHelper, overrides: PartialChannelControlHelp): ChannelControlHelper = (^.asInstanceOf[js.Dynamic].applyDynamic("createChildChannelControlHelper")(parent.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[ChannelControlHelper]
  
  inline def durationToMs(duration: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMs")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstUsableConfig")(configs.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingConfig]
  
  inline def getFirstUsableConfig_true(configs: js.Array[LoadBalancingConfig], fallbackTodefault: `true`): LoadBalancingConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstUsableConfig")(configs.asInstanceOf[js.Any], fallbackTodefault.asInstanceOf[js.Any])).asInstanceOf[LoadBalancingConfig]
  
  inline def log(severity: LogVerbosity, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(severity.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def registerAdminService(getServiceDefinition: GetServiceDefinition, getHandlers: GetHandlers): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdminService")(getServiceDefinition.asInstanceOf[js.Any], getHandlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerLoadBalancerType(
    typeName: String,
    loadBalancerType: LoadBalancerConstructor,
    loadBalancingConfigType: LoadBalancingConfigConstructor
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadBalancerType")(typeName.asInstanceOf[js.Any], loadBalancerType.asInstanceOf[js.Any], loadBalancingConfigType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResolver")(scheme.asInstanceOf[js.Any], resolverClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def subchannelAddressToString(address: SubchannelAddress): String = ^.asInstanceOf[js.Dynamic].applyDynamic("subchannelAddressToString")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trace(severity: LogVerbosity, tracer: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(severity.asInstanceOf[js.Any], tracer.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def uriToString(uri: GrpcUri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uriToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateLoadBalancingConfig(obj: Any): LoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLoadBalancingConfig")(obj.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingConfig]
}
