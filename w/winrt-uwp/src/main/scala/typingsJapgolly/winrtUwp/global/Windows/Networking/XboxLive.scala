package typingsJapgolly.winrtUwp.global.Windows.Networking

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus
import typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState
import typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus
import typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
object XboxLive {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  /* note: abstract class */ @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress")
  @js.native
  open class XboxLiveDeviceAddress ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress
  object XboxLiveDeviceAddress {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param base64 This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def createFromSnapshotBase64(base64: String): typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSnapshotBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress]
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def createFromSnapshotBuffer(buffer: IBuffer): typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSnapshotBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress]
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def createFromSnapshotBytes(buffer: js.Array[Double]): typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSnapshotBytes")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress]
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def getLocal(): typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocal")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress]
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.maxSnapshotBytesSize")
    @js.native
    def maxSnapshotBytesSize: Double = js.native
    inline def maxSnapshotBytesSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSnapshotBytesSize")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  /* note: abstract class */ @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair")
  @js.native
  open class XboxLiveEndpointPair ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair
  object XboxLiveEndpointPair {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remotePort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def findEndpointPairByHostNamesAndPorts(
      localHostName: typingsJapgolly.winrtUwp.Windows.Networking.HostName,
      localPort: String,
      remoteHostName: typingsJapgolly.winrtUwp.Windows.Networking.HostName,
      remotePort: String
    ): typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = (^.asInstanceOf[js.Dynamic].applyDynamic("findEndpointPairByHostNamesAndPorts")(localHostName.asInstanceOf[js.Any], localPort.asInstanceOf[js.Any], remoteHostName.asInstanceOf[js.Any], remotePort.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair]
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def findEndpointPairBySocketAddressBytes(localSocketAddress: js.Array[Double], remoteSocketAddress: js.Array[Double]): typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = (^.asInstanceOf[js.Dynamic].applyDynamic("findEndpointPairBySocketAddressBytes")(localSocketAddress.asInstanceOf[js.Any], remoteSocketAddress.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair]
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors")
  @js.native
  object XboxLiveEndpointPairCreationBehaviors extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors & Double
      ] = js.native
    
    /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.none & Double = js.native
    
    /* 1 */ val reevaluatePath: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.reevaluatePath & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  /* note: abstract class */ @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult")
  @js.native
  open class XboxLiveEndpointPairCreationResult ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var deviceAddress: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var endpointPair: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var isExistingPathEvaluation: Boolean = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var status: XboxLiveEndpointPairCreationStatus = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus")
  @js.native
  object XboxLiveEndpointPairCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus & Double
      ] = js.native
    
    /* 4 */ val canceled: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.canceled & Double = js.native
    
    /* 3 */ val localSystemNotAuthorized: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.localSystemNotAuthorized & Double = js.native
    
    /* 2 */ val noCompatibleNetworkPaths: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noCompatibleNetworkPaths & Double = js.native
    
    /* 1 */ val noLocalNetworks: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noLocalNetworks & Double = js.native
    
    /* 7 */ val refusedDueToConfiguration: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.refusedDueToConfiguration & Double = js.native
    
    /* 6 */ val remoteSystemNotAuthorized: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.remoteSystemNotAuthorized & Double = js.native
    
    /* 0 */ val succeeded: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.succeeded & Double = js.native
    
    /* 5 */ val timedOut: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.timedOut & Double = js.native
    
    /* 8 */ val unexpectedInternalError: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.unexpectedInternalError & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairState")
  @js.native
  object XboxLiveEndpointPairState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState & Double
      ] = js.native
    
    /* 2 */ val creatingInbound: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingInbound & Double = js.native
    
    /* 1 */ val creatingOutbound: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingOutbound & Double = js.native
    
    /* 6 */ val deleted: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deleted & Double = js.native
    
    /* 4 */ val deletingLocally: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deletingLocally & Double = js.native
    
    /* 0 */ val invalid: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.invalid & Double = js.native
    
    /* 3 */ val ready: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.ready & Double = js.native
    
    /* 5 */ val remoteEndpointTerminating: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.remoteEndpointTerminating & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  /* note: abstract class */ @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs")
  @js.native
  open class XboxLiveEndpointPairStateChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var newState: XboxLiveEndpointPairState = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var oldState: XboxLiveEndpointPairState = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  /* note: abstract class */ @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
  @js.native
  open class XboxLiveEndpointPairTemplate ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate
  object XboxLiveEndpointPairTemplate {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param name This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def getTemplateByName(name: String): typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateByName")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate]
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate.templates")
    @js.native
    def templates: IVectorView[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate
      ] = js.native
    inline def templates_=(
      x: IVectorView[
          typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templates")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  /* note: abstract class */ @JSGlobal("Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs")
  @js.native
  open class XboxLiveInboundEndpointPairCreatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var endpointPair: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveNetworkAccessKind")
  @js.native
  object XboxLiveNetworkAccessKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind & Double
      ] = js.native
    
    /* 1 */ val moderate: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.moderate & Double = js.native
    
    /* 0 */ val open: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.open & Double = js.native
    
    /* 2 */ val strict: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.strict & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement")
  @js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  open class XboxLiveQualityOfServiceMeasurement ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var deviceAddresses: IVector[typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress] = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def getMetricResult(
      deviceAddress: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress,
      metric: XboxLiveQualityOfServiceMetric
    ): typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def getMetricResultsForDevice(deviceAddress: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress): IVectorView[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
      ] = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def getMetricResultsForMetric(metric: XboxLiveQualityOfServiceMetric): IVectorView[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
      ] = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def getPrivatePayloadResult(deviceAddress: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress): typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def measureAsync(): IPromiseWithIAsyncAction = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var metricResults: IVectorView[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
      ] = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var metrics: IVector[XboxLiveQualityOfServiceMetric] = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var numberOfProbesToAttempt: Double = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var numberOfResultsPending: Double = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var privatePayloadResults: IVectorView[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult
      ] = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var shouldRequestPrivatePayloads: Boolean = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var timeoutInMilliseconds: Double = js.native
  }
  object XboxLiveQualityOfServiceMeasurement {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement")
    @js.native
    val ^ : js.Any = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    inline def clearPrivatePayload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPrivatePayload")().asInstanceOf[Unit]
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.isSystemInboundBandwidthConstrained")
    @js.native
    def isSystemInboundBandwidthConstrained: Boolean = js.native
    inline def isSystemInboundBandwidthConstrained_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSystemInboundBandwidthConstrained")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.isSystemOutboundBandwidthConstrained")
    @js.native
    def isSystemOutboundBandwidthConstrained: Boolean = js.native
    inline def isSystemOutboundBandwidthConstrained_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSystemOutboundBandwidthConstrained")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.maxPrivatePayloadSize")
    @js.native
    def maxPrivatePayloadSize: Double = js.native
    inline def maxPrivatePayloadSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxPrivatePayloadSize")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.maxSimultaneousProbeConnections")
    @js.native
    def maxSimultaneousProbeConnections: Double = js.native
    inline def maxSimultaneousProbeConnections_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSimultaneousProbeConnections")(x.asInstanceOf[js.Any])
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param payload This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def publishPrivatePayloadBytes(payload: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("publishPrivatePayloadBytes")(payload.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.publishedPrivatePayload")
    @js.native
    def publishedPrivatePayload: IBuffer = js.native
    inline def publishedPrivatePayload_=(x: IBuffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("publishedPrivatePayload")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus")
  @js.native
  object XboxLiveQualityOfServiceMeasurementStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus & Double
      ] = js.native
    
    /* 7 */ val canceled: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.canceled & Double = js.native
    
    /* 1 */ val inProgress: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgress & Double = js.native
    
    /* 2 */ val inProgressWithProvisionalResults: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgressWithProvisionalResults & Double = js.native
    
    /* 6 */ val localSystemNotAuthorized: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.localSystemNotAuthorized & Double = js.native
    
    /* 5 */ val noCompatibleNetworkPaths: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noCompatibleNetworkPaths & Double = js.native
    
    /* 4 */ val noLocalNetworks: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noLocalNetworks & Double = js.native
    
    /* 0 */ val notStarted: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.notStarted & Double = js.native
    
    /* 10 */ val refusedDueToConfiguration: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.refusedDueToConfiguration & Double = js.native
    
    /* 9 */ val remoteSystemNotAuthorized: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.remoteSystemNotAuthorized & Double = js.native
    
    /* 3 */ val succeeded: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.succeeded & Double = js.native
    
    /* 8 */ val timedOut: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.timedOut & Double = js.native
    
    /* 11 */ val unexpectedInternalError: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.unexpectedInternalError & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric")
  @js.native
  object XboxLiveQualityOfServiceMetric extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric & Double
      ] = js.native
    
    /* 6 */ val averageInboundBitsPerSecond: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageInboundBitsPerSecond & Double = js.native
    
    /* 0 */ val averageLatencyInMilliseconds: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageLatencyInMilliseconds & Double = js.native
    
    /* 3 */ val averageOutboundBitsPerSecond: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageOutboundBitsPerSecond & Double = js.native
    
    /* 8 */ val maxInboundBitsPerSecond: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxInboundBitsPerSecond & Double = js.native
    
    /* 2 */ val maxLatencyInMilliseconds: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxLatencyInMilliseconds & Double = js.native
    
    /* 5 */ val maxOutboundBitsPerSecond: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxOutboundBitsPerSecond & Double = js.native
    
    /* 7 */ val minInboundBitsPerSecond: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minInboundBitsPerSecond & Double = js.native
    
    /* 1 */ val minLatencyInMilliseconds: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minLatencyInMilliseconds & Double = js.native
    
    /* 4 */ val minOutboundBitsPerSecond: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minOutboundBitsPerSecond & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  /* note: abstract class */ @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult")
  @js.native
  open class XboxLiveQualityOfServiceMetricResult ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var deviceAddress: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var metric: XboxLiveQualityOfServiceMetric = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var status: XboxLiveQualityOfServiceMeasurementStatus = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var value: Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  /* note: abstract class */ @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult")
  @js.native
  open class XboxLiveQualityOfServicePrivatePayloadResult ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var deviceAddress: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var status: XboxLiveQualityOfServiceMeasurementStatus = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var value: IBuffer = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveSocketKind")
  @js.native
  object XboxLiveSocketKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind & Double] = js.native
    
    /* 1 */ val datagram: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.datagram & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.none & Double = js.native
    
    /* 2 */ val stream: typingsJapgolly.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.stream & Double = js.native
  }
}
