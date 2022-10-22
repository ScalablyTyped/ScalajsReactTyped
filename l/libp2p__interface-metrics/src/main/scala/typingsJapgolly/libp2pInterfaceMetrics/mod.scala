package typingsJapgolly.libp2pInterfaceMetrics

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.itStreamTypes.mod.Duplex
import typingsJapgolly.libp2pInterfaceMetrics.anon.ByteLength
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type CalculateComponentMetric = js.Function0[js.Promise[ComponentMetric] | ComponentMetric]
  
  type ComponentMetric = Double | ComponentMetricsGroup
  
  type ComponentMetricsGroup = Record[String, Double]
  
  trait ComponentMetricsTracker extends StObject {
    
    /**
      * Returns tracked metrics key by system, component, metric, value
      */
    def getComponentMetrics(): Map[String, Map[String, Map[String, TrackedMetric]]]
    
    /**
      * Update the stored metric value for the given system and component
      */
    def updateComponentMetric(data: ComponentMetricsUpdate): Unit
  }
  object ComponentMetricsTracker {
    
    inline def apply(
      getComponentMetrics: CallbackTo[Map[String, Map[String, Map[String, TrackedMetric]]]],
      updateComponentMetric: ComponentMetricsUpdate => Callback
    ): ComponentMetricsTracker = {
      val __obj = js.Dynamic.literal(getComponentMetrics = getComponentMetrics.toJsFn, updateComponentMetric = js.Any.fromFunction1((t0: ComponentMetricsUpdate) => updateComponentMetric(t0).runNow()))
      __obj.asInstanceOf[ComponentMetricsTracker]
    }
    
    extension [Self <: ComponentMetricsTracker](x: Self) {
      
      inline def setGetComponentMetrics(value: CallbackTo[Map[String, Map[String, Map[String, TrackedMetric]]]]): Self = StObject.set(x, "getComponentMetrics", value.toJsFn)
      
      inline def setUpdateComponentMetric(value: ComponentMetricsUpdate => Callback): Self = StObject.set(x, "updateComponentMetric", js.Any.fromFunction1((t0: ComponentMetricsUpdate) => value(t0).runNow()))
    }
  }
  
  trait ComponentMetricsUpdate extends StObject {
    
    /**
      * Name of the system component that contains the metric
      */
    var component: String
    
    /**
      * Optional help for the metric
      */
    var help: js.UndefOr[String] = js.undefined
    
    /**
      * Optional label for the metric
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the metric being tracked
      */
    var metric: String
    
    /**
      * Name of the system, e.g. libp2p, ipfs, etc
      */
    var system: String
    
    /**
      * The value or function to calculate the value
      */
    var value: ComponentMetric | CalculateComponentMetric
  }
  object ComponentMetricsUpdate {
    
    inline def apply(
      component: String,
      metric: String,
      system: String,
      value: ComponentMetric | CalculateComponentMetric
    ): ComponentMetricsUpdate = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentMetricsUpdate]
    }
    
    extension [Self <: ComponentMetricsUpdate](x: Self) {
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ComponentMetric | CalculateComponentMetric): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueCallbackTo(value: CallbackTo[js.Promise[ComponentMetric] | ComponentMetric]): Self = StObject.set(x, "value", value.toJsFn)
    }
  }
  
  trait Metrics
    extends StObject
       with StreamMetrics
       with ComponentMetricsTracker
  object Metrics {
    
    inline def apply(
      forPeer: PeerId => js.UndefOr[Stats],
      forProtocol: String => js.UndefOr[Stats],
      getComponentMetrics: CallbackTo[Map[String, Map[String, Map[String, TrackedMetric]]]],
      getGlobal: CallbackTo[Stats],
      getPeers: CallbackTo[js.Array[String]],
      getProtocols: CallbackTo[js.Array[String]],
      onPeerDisconnected: PeerId => Callback,
      trackStream: TrackStreamOptions => Callback,
      updateComponentMetric: ComponentMetricsUpdate => Callback,
      updatePlaceholder: (PeerId, PeerId) => Callback
    ): Metrics = {
      val __obj = js.Dynamic.literal(forPeer = js.Any.fromFunction1(forPeer), forProtocol = js.Any.fromFunction1(forProtocol), getComponentMetrics = getComponentMetrics.toJsFn, getGlobal = getGlobal.toJsFn, getPeers = getPeers.toJsFn, getProtocols = getProtocols.toJsFn, onPeerDisconnected = js.Any.fromFunction1((t0: PeerId) => onPeerDisconnected(t0).runNow()), trackStream = js.Any.fromFunction1((t0: TrackStreamOptions) => trackStream(t0).runNow()), updateComponentMetric = js.Any.fromFunction1((t0: ComponentMetricsUpdate) => updateComponentMetric(t0).runNow()), updatePlaceholder = js.Any.fromFunction2((t0: PeerId, t1: PeerId) => (updatePlaceholder(t0, t1)).runNow()))
      __obj.asInstanceOf[Metrics]
    }
  }
  
  trait MetricsInit extends StObject {
    
    var computeThrottleMaxQueueSize: Double
    
    var computeThrottleTimeout: Double
    
    var enabled: Boolean
    
    var maxOldPeersRetention: Double
    
    var movingAverageIntervals: js.Array[Double]
  }
  object MetricsInit {
    
    inline def apply(
      computeThrottleMaxQueueSize: Double,
      computeThrottleTimeout: Double,
      enabled: Boolean,
      maxOldPeersRetention: Double,
      movingAverageIntervals: js.Array[Double]
    ): MetricsInit = {
      val __obj = js.Dynamic.literal(computeThrottleMaxQueueSize = computeThrottleMaxQueueSize.asInstanceOf[js.Any], computeThrottleTimeout = computeThrottleTimeout.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], maxOldPeersRetention = maxOldPeersRetention.asInstanceOf[js.Any], movingAverageIntervals = movingAverageIntervals.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsInit]
    }
    
    extension [Self <: MetricsInit](x: Self) {
      
      inline def setComputeThrottleMaxQueueSize(value: Double): Self = StObject.set(x, "computeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setComputeThrottleTimeout(value: Double): Self = StObject.set(x, "computeThrottleTimeout", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setMaxOldPeersRetention(value: Double): Self = StObject.set(x, "maxOldPeersRetention", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervals(value: js.Array[Double]): Self = StObject.set(x, "movingAverageIntervals", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervalsVarargs(value: Double*): Self = StObject.set(x, "movingAverageIntervals", js.Array(value*))
    }
  }
  
  trait MovingAverage extends StObject {
    
    var deviation: Double
    
    var forecast: Double
    
    var movingAverage: Double
    
    def push(time: Double, value: Double): Unit
    
    var variance: Double
  }
  object MovingAverage {
    
    inline def apply(
      deviation: Double,
      forecast: Double,
      movingAverage: Double,
      push: (Double, Double) => Callback,
      variance: Double
    ): MovingAverage = {
      val __obj = js.Dynamic.literal(deviation = deviation.asInstanceOf[js.Any], forecast = forecast.asInstanceOf[js.Any], movingAverage = movingAverage.asInstanceOf[js.Any], push = js.Any.fromFunction2((t0: Double, t1: Double) => (push(t0, t1)).runNow()), variance = variance.asInstanceOf[js.Any])
      __obj.asInstanceOf[MovingAverage]
    }
    
    extension [Self <: MovingAverage](x: Self) {
      
      inline def setDeviation(value: Double): Self = StObject.set(x, "deviation", value.asInstanceOf[js.Any])
      
      inline def setForecast(value: Double): Self = StObject.set(x, "forecast", value.asInstanceOf[js.Any])
      
      inline def setMovingAverage(value: Double): Self = StObject.set(x, "movingAverage", value.asInstanceOf[js.Any])
      
      inline def setPush(value: (Double, Double) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    }
  }
  
  trait MovingAverages extends StObject {
    
    var dataReceived: js.Array[MovingAverage]
    
    var dataSent: js.Array[MovingAverage]
  }
  object MovingAverages {
    
    inline def apply(dataReceived: js.Array[MovingAverage], dataSent: js.Array[MovingAverage]): MovingAverages = {
      val __obj = js.Dynamic.literal(dataReceived = dataReceived.asInstanceOf[js.Any], dataSent = dataSent.asInstanceOf[js.Any])
      __obj.asInstanceOf[MovingAverages]
    }
    
    extension [Self <: MovingAverages](x: Self) {
      
      inline def setDataReceived(value: js.Array[MovingAverage]): Self = StObject.set(x, "dataReceived", value.asInstanceOf[js.Any])
      
      inline def setDataReceivedVarargs(value: MovingAverage*): Self = StObject.set(x, "dataReceived", js.Array(value*))
      
      inline def setDataSent(value: js.Array[MovingAverage]): Self = StObject.set(x, "dataSent", value.asInstanceOf[js.Any])
      
      inline def setDataSentVarargs(value: MovingAverage*): Self = StObject.set(x, "dataSent", js.Array(value*))
    }
  }
  
  trait Stats extends StObject {
    
    /**
      * Returns a clone of the internal movingAverages
      */
    def getMovingAverages(): MovingAverages
    
    /**
      * Returns a clone of the current stats.
      */
    def getSnapshot(): TransferStats
    
    /**
      * Pushes the given operation data to the queue, along with the
      * current Timestamp, then resets the update timer.
      */
    def push(counter: String, inc: Double): Unit
  }
  object Stats {
    
    inline def apply(
      getMovingAverages: CallbackTo[MovingAverages],
      getSnapshot: CallbackTo[TransferStats],
      push: (String, Double) => Callback
    ): Stats = {
      val __obj = js.Dynamic.literal(getMovingAverages = getMovingAverages.toJsFn, getSnapshot = getSnapshot.toJsFn, push = js.Any.fromFunction2((t0: String, t1: Double) => (push(t0, t1)).runNow()))
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setGetMovingAverages(value: CallbackTo[MovingAverages]): Self = StObject.set(x, "getMovingAverages", value.toJsFn)
      
      inline def setGetSnapshot(value: CallbackTo[TransferStats]): Self = StObject.set(x, "getSnapshot", value.toJsFn)
      
      inline def setPush(value: (String, Double) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  trait StreamMetrics extends StObject {
    
    /**
      * Returns the `Stats` object for the given `PeerId` whether it
      * is a live peer, or in the disconnected peer LRU cache.
      */
    def forPeer(peerId: PeerId): js.UndefOr[Stats]
    
    /**
      * Returns the `Stats` object for the given `protocol`
      */
    def forProtocol(protocol: String): js.UndefOr[Stats]
    
    /**
      * Returns the global `Stats` object
      */
    def getGlobal(): Stats
    
    /**
      * Returns a list of `PeerId` strings currently being tracked
      */
    def getPeers(): js.Array[String]
    
    /**
      * Returns a list of all protocol strings currently being tracked.
      */
    def getProtocols(): js.Array[String]
    
    /**
      * Should be called when all connections to a given peer
      * have closed. The `Stats` collection for the peer will
      * be stopped and moved to an LRU for temporary retention.
      */
    def onPeerDisconnected(peerId: PeerId): Unit
    
    /**
      * Tracks data running through a given Duplex Iterable `stream`. If
      * the `peerId` is not provided, a placeholder string will be created and
      * returned. This allows lazy tracking of a peer when the peer is not yet known.
      * When the `PeerId` is known, `Metrics.updatePlaceholder` should be called
      * with the placeholder string returned from here, and the known `PeerId`.
      */
    def trackStream(data: TrackStreamOptions): Unit
    
    /**
      * Replaces the `PeerId` string with the given `peerId`.
      * If stats are already being tracked for the given `peerId`, the
      * placeholder stats will be merged with the existing stats.
      */
    def updatePlaceholder(placeholder: PeerId, peerId: PeerId): Unit
  }
  object StreamMetrics {
    
    inline def apply(
      forPeer: PeerId => js.UndefOr[Stats],
      forProtocol: String => js.UndefOr[Stats],
      getGlobal: CallbackTo[Stats],
      getPeers: CallbackTo[js.Array[String]],
      getProtocols: CallbackTo[js.Array[String]],
      onPeerDisconnected: PeerId => Callback,
      trackStream: TrackStreamOptions => Callback,
      updatePlaceholder: (PeerId, PeerId) => Callback
    ): StreamMetrics = {
      val __obj = js.Dynamic.literal(forPeer = js.Any.fromFunction1(forPeer), forProtocol = js.Any.fromFunction1(forProtocol), getGlobal = getGlobal.toJsFn, getPeers = getPeers.toJsFn, getProtocols = getProtocols.toJsFn, onPeerDisconnected = js.Any.fromFunction1((t0: PeerId) => onPeerDisconnected(t0).runNow()), trackStream = js.Any.fromFunction1((t0: TrackStreamOptions) => trackStream(t0).runNow()), updatePlaceholder = js.Any.fromFunction2((t0: PeerId, t1: PeerId) => (updatePlaceholder(t0, t1)).runNow()))
      __obj.asInstanceOf[StreamMetrics]
    }
    
    extension [Self <: StreamMetrics](x: Self) {
      
      inline def setForPeer(value: PeerId => js.UndefOr[Stats]): Self = StObject.set(x, "forPeer", js.Any.fromFunction1(value))
      
      inline def setForProtocol(value: String => js.UndefOr[Stats]): Self = StObject.set(x, "forProtocol", js.Any.fromFunction1(value))
      
      inline def setGetGlobal(value: CallbackTo[Stats]): Self = StObject.set(x, "getGlobal", value.toJsFn)
      
      inline def setGetPeers(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getPeers", value.toJsFn)
      
      inline def setGetProtocols(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getProtocols", value.toJsFn)
      
      inline def setOnPeerDisconnected(value: PeerId => Callback): Self = StObject.set(x, "onPeerDisconnected", js.Any.fromFunction1((t0: PeerId) => value(t0).runNow()))
      
      inline def setTrackStream(value: TrackStreamOptions => Callback): Self = StObject.set(x, "trackStream", js.Any.fromFunction1((t0: TrackStreamOptions) => value(t0).runNow()))
      
      inline def setUpdatePlaceholder(value: (PeerId, PeerId) => Callback): Self = StObject.set(x, "updatePlaceholder", js.Any.fromFunction2((t0: PeerId, t1: PeerId) => (value(t0, t1)).runNow()))
    }
  }
  
  trait TrackStreamOptions extends StObject {
    
    /**
      * The protocol the stream is running
      */
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * The id of the remote peer that's connected
      */
    var remotePeer: PeerId
    
    /**
      * A duplex iterable stream
      */
    var stream: Duplex[ByteLength, Any, js.Promise[Unit]]
  }
  object TrackStreamOptions {
    
    inline def apply(remotePeer: PeerId, stream: Duplex[ByteLength, Any, js.Promise[Unit]]): TrackStreamOptions = {
      val __obj = js.Dynamic.literal(remotePeer = remotePeer.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackStreamOptions]
    }
    
    extension [Self <: TrackStreamOptions](x: Self) {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRemotePeer(value: PeerId): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Duplex[ByteLength, Any, js.Promise[Unit]]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrackedMetric extends StObject {
    
    /**
      * A function that returns a value or a group of values
      */
    def calculate(): js.Promise[ComponentMetric] | ComponentMetric
    /**
      * A function that returns a value or a group of values
      */
    @JSName("calculate")
    var calculate_Original: CalculateComponentMetric
    
    /**
      * In systems that support them, this help text can help make graphs more interpretable
      */
    var help: js.UndefOr[String] = js.undefined
    
    /**
      * In systems that support them, this label can help make graphs more interpretable
      */
    var label: js.UndefOr[String] = js.undefined
  }
  object TrackedMetric {
    
    inline def apply(calculate: CallbackTo[js.Promise[ComponentMetric] | ComponentMetric]): TrackedMetric = {
      val __obj = js.Dynamic.literal(calculate = calculate.toJsFn)
      __obj.asInstanceOf[TrackedMetric]
    }
    
    extension [Self <: TrackedMetric](x: Self) {
      
      inline def setCalculate(value: CallbackTo[js.Promise[ComponentMetric] | ComponentMetric]): Self = StObject.set(x, "calculate", value.toJsFn)
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait TransferStats extends StObject {
    
    var dataReceived: js.BigInt
    
    var dataSent: js.BigInt
  }
  object TransferStats {
    
    inline def apply(dataReceived: js.BigInt, dataSent: js.BigInt): TransferStats = {
      val __obj = js.Dynamic.literal(dataReceived = dataReceived.asInstanceOf[js.Any], dataSent = dataSent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferStats]
    }
    
    extension [Self <: TransferStats](x: Self) {
      
      inline def setDataReceived(value: js.BigInt): Self = StObject.set(x, "dataReceived", value.asInstanceOf[js.Any])
      
      inline def setDataSent(value: js.BigInt): Self = StObject.set(x, "dataSent", value.asInstanceOf[js.Any])
    }
  }
}
