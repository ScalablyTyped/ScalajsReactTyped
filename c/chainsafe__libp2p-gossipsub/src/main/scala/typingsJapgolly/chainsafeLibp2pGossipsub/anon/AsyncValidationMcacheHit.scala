package typingsJapgolly.chainsafeLibp2pGossipsub.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.IRPC
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.AvgMinMax
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.Gauge
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.Histogram
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.InclusionReason
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.LabelsGeneric
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreWeights
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.ToSendGroupCount
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicStrToLabel
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcScorePeerScoreThresholdsMod.PeerScoreThresholds
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageAcceptance
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.PeerIdStr
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReasonObj
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncValidationMcacheHit extends StObject {
  
  /** When the user validates a message, it tries to re propagate it to its mesh peers. If the
    *  message expires from the memcache before it can be validated, we count this a cache miss
    *  and it is an indicator that the memcache size should be increased.
    *  = rust-libp2p `mcache_misses` */
  var asyncValidationMcacheHit: Gauge[Hit]
  
  /** Message validation results for each topic.
    *  Invalid == Reject?
    *  = rust-libp2p `invalid_messages`, `accepted_messages`, `ignored_messages`, `rejected_messages` */
  var asyncValidationResult: Gauge[Acceptance]
  
  var behaviourPenalty: Histogram[LabelsGeneric]
  
  /** Unbounded cache sizes */
  var cacheSize: Gauge[Cache]
  
  /** Track duplicate message delivery time */
  var duplicateMsgDeliveryDelay: Histogram[LabelsGeneric]
  
  /** Total count of late msg delivery total by topic */
  var duplicateMsgLateDelivery: Gauge[TopicTopicLabel]
  
  /** The time it takes to complete one iteration of the heartbeat. */
  var heartbeatDuration: Histogram[LabelsGeneric]
  
  /** Heartbeat run took longer than heartbeat interval so next is skipped */
  var heartbeatSkipped: Gauge[LabelsGeneric]
  
  /** Total received IHAVE messages that we ignore for some reason */
  var ihaveRcvIgnored: Gauge[ReasonIHaveIgnoreReason]
  
  /** Total received IHAVE messages by topic */
  var ihaveRcvMsgids: Gauge[TopicTopicLabel]
  
  /** Total messages per topic we don't have. Not actual requests.
    *  The number of times we have decided that an IWANT control message is required for this
    *  topic. A very high metric might indicate an underperforming network.
    *  = rust-libp2p `topic_iwant_msgs` */
  var ihaveRcvNotSeenMsgids: Gauge[TopicTopicLabel]
  
  var iwantPromiseBroken: Gauge[LabelsGeneric]
  
  /** Histogram of delivery time of resolved IWANT promises */
  var iwantPromiseDeliveryTime: Histogram[LabelsGeneric]
  
  /** Total count of resolved IWANT promises */
  var iwantPromiseResolved: Gauge[LabelsGeneric]
  
  /** Total count of peers we have asked IWANT promises that are resolved */
  var iwantPromiseResolvedPeers: Gauge[LabelsGeneric]
  
  var iwantPromiseStarted: Gauge[LabelsGeneric]
  
  /** Total requested messageIDs that we don't have */
  var iwantRcvDonthaveMsgids: Gauge[LabelsGeneric]
  
  /** Total received IWANT messages by topic */
  var iwantRcvMsgids: Gauge[TopicTopicLabel]
  
  /** Current mcache msg count */
  var mcacheSize: Gauge[LabelsGeneric]
  
  /** Number of times we remove peers in a topic mesh for different reasons.
    *  = rust-libp2p `mesh_peer_churn_events` */
  var meshPeerChurnEvents: Gauge[Topic]
  
  /** Number of peers in our mesh. This metric should be updated with the count of peers for a
    *  topic in the mesh regardless of inclusion and churn events.
    *  = rust-libp2p `mesh_peer_counts` */
  var meshPeerCounts: Gauge[TopicStr]
  
  /** Number of times we include peers in a topic mesh for different reasons.
    *  = rust-libp2p `mesh_peer_inclusion_events` */
  var meshPeerInclusionEvents: Gauge[Reason]
  
  /** Total count of msg forwarded by topic */
  var msgForwardCount: Gauge[TopicTopicLabel]
  
  /** Total count of peers that we forward a msg to */
  var msgForwardPeers: Gauge[TopicTopicLabel]
  
  /** Total count of msg publish data.length bytes */
  var msgPublishBytes: Gauge[TopicTopicLabel]
  
  /** Total count of msg published by topic */
  var msgPublishCount: Gauge[TopicTopicLabel]
  
  /** Total count of peers that we publish a msg to */
  var msgPublishPeers: Gauge[TopicTopicLabel]
  
  /** Total count of peers (by group) that we publish a msg to */
  var msgPublishPeersByGroup: Gauge[PeerGroup]
  
  /** Tracks specific reason of invalid */
  var msgReceivedInvalid: Gauge[Error]
  
  /** Total count of recv msgs before any validation */
  var msgReceivedPreValidation: Gauge[TopicTopicLabel]
  
  /** Tracks distribution of recv msgs by duplicate, invalid, valid */
  var msgReceivedStatus: Gauge[Status]
  
  /** Register the inclusion of peers in our mesh due to some reason. */
  def onAddToMesh(
    topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    reason: InclusionReason,
    count: Double
  ): Unit
  
  def onDuplicateMsgDelivery(
    topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    deliveryDelayMs: Double,
    isLateDelivery: Boolean
  ): Unit
  
  def onForwardMsg(topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, tosendCount: Double): Unit
  
  def onIhaveRcv(
    topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    ihave: Double,
    idonthave: Double
  ): Unit
  
  def onIwantRcv(
    iwantByTopic: Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double],
    iwantDonthave: Double
  ): Unit
  
  /** We joined a topic */
  def onJoin(topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): Unit
  
  /** We left a topic */
  def onLeave(topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): Unit
  
  def onMsgRecvInvalid(
    topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    reason: RejectReasonObj
  ): Unit
  
  def onMsgRecvPreValidation(topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): Unit
  
  def onMsgRecvResult(topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, status: MessageStatus): Unit
  
  def onPublishMsg(
    topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    tosendGroupCount: ToSendGroupCount,
    tosendCount: Double,
    dataLen: Double
  ): Unit
  
  /** Register the removal of peers in our mesh due to some reason */
  def onRemoveFromMesh(
    topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    reason: ChurnReason,
    count: Double
  ): Unit
  
  def onReportValidation(
    topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr,
    acceptance: MessageAcceptance
  ): Unit
  
  def onReportValidationMcacheHit(hit: Boolean): Unit
  
  def onRpcRecv(rpc: IRPC, rpcBytes: Double): Unit
  
  def onRpcSent(rpc: IRPC, rpcBytes: Double): Unit
  
  /**
    * - in handle_graft() Penalty::GraftBackoff
    * - in apply_iwant_penalties() Penalty::BrokenPromise
    * - in metric_score() P3 Penalty::MessageDeficit
    * - in metric_score() P6 Penalty::IPColocation
    */
  def onScorePenalty(penalty: ScorePenalty): Unit
  
  /** Current count of peers by score threshold */
  var peersByScoreThreshold: Gauge[Threshold]
  
  /** Gossipsub supports floodsub, gossipsub v1.0 and gossipsub v1.1. Peers are classified based
    *  on which protocol they support. This metric keeps track of the number of peers that are
    *  connected of each type. */
  var peersPerProtocol: Gauge[Protocol]
  
  var protocolsEnabled: Gauge[Protocol]
  
  def registerScorePerMesh(
    mesh: Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Set[PeerIdStr]],
    scoreByPeer: Map[PeerIdStr, Double]
  ): Unit
  
  def registerScoreWeights(sw: ScoreWeights[js.Array[Double]]): Unit
  
  def registerScores(scores: js.Array[Double], scoreThresholds: PeerScoreThresholds): Unit
  
  var rpcRecvBytes: Gauge[LabelsGeneric]
  
  var rpcRecvControl: Gauge[LabelsGeneric]
  
  var rpcRecvCount: Gauge[LabelsGeneric]
  
  var rpcRecvGraft: Gauge[LabelsGeneric]
  
  var rpcRecvIHave: Gauge[LabelsGeneric]
  
  var rpcRecvIWant: Gauge[LabelsGeneric]
  
  var rpcRecvMessage: Gauge[LabelsGeneric]
  
  /** Total count of RPC dropped because acceptFrom() == false */
  var rpcRecvNotAccepted: Gauge[LabelsGeneric]
  
  var rpcRecvPrune: Gauge[LabelsGeneric]
  
  var rpcRecvSubscription: Gauge[LabelsGeneric]
  
  var rpcSentBytes: Gauge[LabelsGeneric]
  
  var rpcSentControl: Gauge[LabelsGeneric]
  
  var rpcSentCount: Gauge[LabelsGeneric]
  
  var rpcSentGraft: Gauge[LabelsGeneric]
  
  var rpcSentIHave: Gauge[LabelsGeneric]
  
  var rpcSentIWant: Gauge[LabelsGeneric]
  
  var rpcSentMessage: Gauge[LabelsGeneric]
  
  var rpcSentPrune: Gauge[LabelsGeneric]
  
  var rpcSentSubscription: Gauge[LabelsGeneric]
  
  var score: AvgMinMax[LabelsGeneric]
  
  var scoreCachedDelta: Histogram[LabelsGeneric]
  
  /** Total times score() is called */
  var scoreFnCalls: Gauge[LabelsGeneric]
  
  /** Total times score() call actually computed computeScore(), no cache */
  var scoreFnRuns: Gauge[LabelsGeneric]
  
  /** Histogram of the scores for each mesh topic. */
  var scorePerMesh: AvgMinMax[TopicTopicLabel]
  
  /** Separate score weights */
  var scoreWeights: AvgMinMax[P]
  
  /** A counter of the kind of penalties being applied to peers. */
  var scoringPenalties: Gauge[Penalty]
  
  def toTopic(topicStr: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr): TopicLabel
  
  /** Number of peers subscribed to each topic. This allows us to analyze a topic's behaviour
    * regardless of our subscription status. */
  var topicPeersCount: Gauge[TopicStr]
  
  var topicStrToLabel: TopicStrToLabel
  
  /** Status of our subscription to this topic. This metric allows analyzing other topic metrics
    *  filtered by our current subscription status.
    *  = rust-libp2p `topic_subscription_status` */
  var topicSubscriptionStatus: Gauge[TopicStr]
}
object AsyncValidationMcacheHit {
  
  inline def apply(
    asyncValidationMcacheHit: Gauge[Hit],
    asyncValidationResult: Gauge[Acceptance],
    behaviourPenalty: Histogram[LabelsGeneric],
    cacheSize: Gauge[Cache],
    duplicateMsgDeliveryDelay: Histogram[LabelsGeneric],
    duplicateMsgLateDelivery: Gauge[TopicTopicLabel],
    heartbeatDuration: Histogram[LabelsGeneric],
    heartbeatSkipped: Gauge[LabelsGeneric],
    ihaveRcvIgnored: Gauge[ReasonIHaveIgnoreReason],
    ihaveRcvMsgids: Gauge[TopicTopicLabel],
    ihaveRcvNotSeenMsgids: Gauge[TopicTopicLabel],
    iwantPromiseBroken: Gauge[LabelsGeneric],
    iwantPromiseDeliveryTime: Histogram[LabelsGeneric],
    iwantPromiseResolved: Gauge[LabelsGeneric],
    iwantPromiseResolvedPeers: Gauge[LabelsGeneric],
    iwantPromiseStarted: Gauge[LabelsGeneric],
    iwantRcvDonthaveMsgids: Gauge[LabelsGeneric],
    iwantRcvMsgids: Gauge[TopicTopicLabel],
    mcacheSize: Gauge[LabelsGeneric],
    meshPeerChurnEvents: Gauge[Topic],
    meshPeerCounts: Gauge[TopicStr],
    meshPeerInclusionEvents: Gauge[Reason],
    msgForwardCount: Gauge[TopicTopicLabel],
    msgForwardPeers: Gauge[TopicTopicLabel],
    msgPublishBytes: Gauge[TopicTopicLabel],
    msgPublishCount: Gauge[TopicTopicLabel],
    msgPublishPeers: Gauge[TopicTopicLabel],
    msgPublishPeersByGroup: Gauge[PeerGroup],
    msgReceivedInvalid: Gauge[Error],
    msgReceivedPreValidation: Gauge[TopicTopicLabel],
    msgReceivedStatus: Gauge[Status],
    onAddToMesh: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, InclusionReason, Double) => Callback,
    onDuplicateMsgDelivery: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double, Boolean) => Callback,
    onForwardMsg: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double) => Callback,
    onIhaveRcv: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double, Double) => Callback,
    onIwantRcv: (Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double], Double) => Callback,
    onJoin: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Callback,
    onLeave: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Callback,
    onMsgRecvInvalid: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, RejectReasonObj) => Callback,
    onMsgRecvPreValidation: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Callback,
    onMsgRecvResult: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, MessageStatus) => Callback,
    onPublishMsg: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, ToSendGroupCount, Double, Double) => Callback,
    onRemoveFromMesh: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, ChurnReason, Double) => Callback,
    onReportValidation: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, MessageAcceptance) => Callback,
    onReportValidationMcacheHit: Boolean => Callback,
    onRpcRecv: (IRPC, Double) => Callback,
    onRpcSent: (IRPC, Double) => Callback,
    onScorePenalty: ScorePenalty => Callback,
    peersByScoreThreshold: Gauge[Threshold],
    peersPerProtocol: Gauge[Protocol],
    protocolsEnabled: Gauge[Protocol],
    registerScorePerMesh: (Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Set[PeerIdStr]], Map[PeerIdStr, Double]) => Callback,
    registerScoreWeights: ScoreWeights[js.Array[Double]] => Callback,
    registerScores: (js.Array[Double], PeerScoreThresholds) => Callback,
    rpcRecvBytes: Gauge[LabelsGeneric],
    rpcRecvControl: Gauge[LabelsGeneric],
    rpcRecvCount: Gauge[LabelsGeneric],
    rpcRecvGraft: Gauge[LabelsGeneric],
    rpcRecvIHave: Gauge[LabelsGeneric],
    rpcRecvIWant: Gauge[LabelsGeneric],
    rpcRecvMessage: Gauge[LabelsGeneric],
    rpcRecvNotAccepted: Gauge[LabelsGeneric],
    rpcRecvPrune: Gauge[LabelsGeneric],
    rpcRecvSubscription: Gauge[LabelsGeneric],
    rpcSentBytes: Gauge[LabelsGeneric],
    rpcSentControl: Gauge[LabelsGeneric],
    rpcSentCount: Gauge[LabelsGeneric],
    rpcSentGraft: Gauge[LabelsGeneric],
    rpcSentIHave: Gauge[LabelsGeneric],
    rpcSentIWant: Gauge[LabelsGeneric],
    rpcSentMessage: Gauge[LabelsGeneric],
    rpcSentPrune: Gauge[LabelsGeneric],
    rpcSentSubscription: Gauge[LabelsGeneric],
    score: AvgMinMax[LabelsGeneric],
    scoreCachedDelta: Histogram[LabelsGeneric],
    scoreFnCalls: Gauge[LabelsGeneric],
    scoreFnRuns: Gauge[LabelsGeneric],
    scorePerMesh: AvgMinMax[TopicTopicLabel],
    scoreWeights: AvgMinMax[P],
    scoringPenalties: Gauge[Penalty],
    toTopic: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => TopicLabel,
    topicPeersCount: Gauge[TopicStr],
    topicStrToLabel: TopicStrToLabel,
    topicSubscriptionStatus: Gauge[TopicStr]
  ): AsyncValidationMcacheHit = {
    val __obj = js.Dynamic.literal(asyncValidationMcacheHit = asyncValidationMcacheHit.asInstanceOf[js.Any], asyncValidationResult = asyncValidationResult.asInstanceOf[js.Any], behaviourPenalty = behaviourPenalty.asInstanceOf[js.Any], cacheSize = cacheSize.asInstanceOf[js.Any], duplicateMsgDeliveryDelay = duplicateMsgDeliveryDelay.asInstanceOf[js.Any], duplicateMsgLateDelivery = duplicateMsgLateDelivery.asInstanceOf[js.Any], heartbeatDuration = heartbeatDuration.asInstanceOf[js.Any], heartbeatSkipped = heartbeatSkipped.asInstanceOf[js.Any], ihaveRcvIgnored = ihaveRcvIgnored.asInstanceOf[js.Any], ihaveRcvMsgids = ihaveRcvMsgids.asInstanceOf[js.Any], ihaveRcvNotSeenMsgids = ihaveRcvNotSeenMsgids.asInstanceOf[js.Any], iwantPromiseBroken = iwantPromiseBroken.asInstanceOf[js.Any], iwantPromiseDeliveryTime = iwantPromiseDeliveryTime.asInstanceOf[js.Any], iwantPromiseResolved = iwantPromiseResolved.asInstanceOf[js.Any], iwantPromiseResolvedPeers = iwantPromiseResolvedPeers.asInstanceOf[js.Any], iwantPromiseStarted = iwantPromiseStarted.asInstanceOf[js.Any], iwantRcvDonthaveMsgids = iwantRcvDonthaveMsgids.asInstanceOf[js.Any], iwantRcvMsgids = iwantRcvMsgids.asInstanceOf[js.Any], mcacheSize = mcacheSize.asInstanceOf[js.Any], meshPeerChurnEvents = meshPeerChurnEvents.asInstanceOf[js.Any], meshPeerCounts = meshPeerCounts.asInstanceOf[js.Any], meshPeerInclusionEvents = meshPeerInclusionEvents.asInstanceOf[js.Any], msgForwardCount = msgForwardCount.asInstanceOf[js.Any], msgForwardPeers = msgForwardPeers.asInstanceOf[js.Any], msgPublishBytes = msgPublishBytes.asInstanceOf[js.Any], msgPublishCount = msgPublishCount.asInstanceOf[js.Any], msgPublishPeers = msgPublishPeers.asInstanceOf[js.Any], msgPublishPeersByGroup = msgPublishPeersByGroup.asInstanceOf[js.Any], msgReceivedInvalid = msgReceivedInvalid.asInstanceOf[js.Any], msgReceivedPreValidation = msgReceivedPreValidation.asInstanceOf[js.Any], msgReceivedStatus = msgReceivedStatus.asInstanceOf[js.Any], onAddToMesh = js.Any.fromFunction3((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: InclusionReason, t2: Double) => (onAddToMesh(t0, t1, t2)).runNow()), onDuplicateMsgDelivery = js.Any.fromFunction3((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: Double, t2: Boolean) => (onDuplicateMsgDelivery(t0, t1, t2)).runNow()), onForwardMsg = js.Any.fromFunction2((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: Double) => (onForwardMsg(t0, t1)).runNow()), onIhaveRcv = js.Any.fromFunction3((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: Double, t2: Double) => (onIhaveRcv(t0, t1, t2)).runNow()), onIwantRcv = js.Any.fromFunction2((t0: Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double], t1: Double) => (onIwantRcv(t0, t1)).runNow()), onJoin = js.Any.fromFunction1((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr) => onJoin(t0).runNow()), onLeave = js.Any.fromFunction1((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr) => onLeave(t0).runNow()), onMsgRecvInvalid = js.Any.fromFunction2((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: RejectReasonObj) => (onMsgRecvInvalid(t0, t1)).runNow()), onMsgRecvPreValidation = js.Any.fromFunction1((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr) => onMsgRecvPreValidation(t0).runNow()), onMsgRecvResult = js.Any.fromFunction2((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: MessageStatus) => (onMsgRecvResult(t0, t1)).runNow()), onPublishMsg = js.Any.fromFunction4((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: ToSendGroupCount, t2: Double, t3: Double) => (onPublishMsg(t0, t1, t2, t3)).runNow()), onRemoveFromMesh = js.Any.fromFunction3((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: ChurnReason, t2: Double) => (onRemoveFromMesh(t0, t1, t2)).runNow()), onReportValidation = js.Any.fromFunction2((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: MessageAcceptance) => (onReportValidation(t0, t1)).runNow()), onReportValidationMcacheHit = js.Any.fromFunction1((t0: Boolean) => onReportValidationMcacheHit(t0).runNow()), onRpcRecv = js.Any.fromFunction2((t0: IRPC, t1: Double) => (onRpcRecv(t0, t1)).runNow()), onRpcSent = js.Any.fromFunction2((t0: IRPC, t1: Double) => (onRpcSent(t0, t1)).runNow()), onScorePenalty = js.Any.fromFunction1((t0: ScorePenalty) => onScorePenalty(t0).runNow()), peersByScoreThreshold = peersByScoreThreshold.asInstanceOf[js.Any], peersPerProtocol = peersPerProtocol.asInstanceOf[js.Any], protocolsEnabled = protocolsEnabled.asInstanceOf[js.Any], registerScorePerMesh = js.Any.fromFunction2((t0: Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Set[PeerIdStr]], t1: Map[PeerIdStr, Double]) => (registerScorePerMesh(t0, t1)).runNow()), registerScoreWeights = js.Any.fromFunction1((t0: ScoreWeights[js.Array[Double]]) => registerScoreWeights(t0).runNow()), registerScores = js.Any.fromFunction2((t0: js.Array[Double], t1: PeerScoreThresholds) => (registerScores(t0, t1)).runNow()), rpcRecvBytes = rpcRecvBytes.asInstanceOf[js.Any], rpcRecvControl = rpcRecvControl.asInstanceOf[js.Any], rpcRecvCount = rpcRecvCount.asInstanceOf[js.Any], rpcRecvGraft = rpcRecvGraft.asInstanceOf[js.Any], rpcRecvIHave = rpcRecvIHave.asInstanceOf[js.Any], rpcRecvIWant = rpcRecvIWant.asInstanceOf[js.Any], rpcRecvMessage = rpcRecvMessage.asInstanceOf[js.Any], rpcRecvNotAccepted = rpcRecvNotAccepted.asInstanceOf[js.Any], rpcRecvPrune = rpcRecvPrune.asInstanceOf[js.Any], rpcRecvSubscription = rpcRecvSubscription.asInstanceOf[js.Any], rpcSentBytes = rpcSentBytes.asInstanceOf[js.Any], rpcSentControl = rpcSentControl.asInstanceOf[js.Any], rpcSentCount = rpcSentCount.asInstanceOf[js.Any], rpcSentGraft = rpcSentGraft.asInstanceOf[js.Any], rpcSentIHave = rpcSentIHave.asInstanceOf[js.Any], rpcSentIWant = rpcSentIWant.asInstanceOf[js.Any], rpcSentMessage = rpcSentMessage.asInstanceOf[js.Any], rpcSentPrune = rpcSentPrune.asInstanceOf[js.Any], rpcSentSubscription = rpcSentSubscription.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], scoreCachedDelta = scoreCachedDelta.asInstanceOf[js.Any], scoreFnCalls = scoreFnCalls.asInstanceOf[js.Any], scoreFnRuns = scoreFnRuns.asInstanceOf[js.Any], scorePerMesh = scorePerMesh.asInstanceOf[js.Any], scoreWeights = scoreWeights.asInstanceOf[js.Any], scoringPenalties = scoringPenalties.asInstanceOf[js.Any], toTopic = js.Any.fromFunction1(toTopic), topicPeersCount = topicPeersCount.asInstanceOf[js.Any], topicStrToLabel = topicStrToLabel.asInstanceOf[js.Any], topicSubscriptionStatus = topicSubscriptionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncValidationMcacheHit]
  }
  
  extension [Self <: AsyncValidationMcacheHit](x: Self) {
    
    inline def setAsyncValidationMcacheHit(value: Gauge[Hit]): Self = StObject.set(x, "asyncValidationMcacheHit", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidationResult(value: Gauge[Acceptance]): Self = StObject.set(x, "asyncValidationResult", value.asInstanceOf[js.Any])
    
    inline def setBehaviourPenalty(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "behaviourPenalty", value.asInstanceOf[js.Any])
    
    inline def setCacheSize(value: Gauge[Cache]): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    inline def setDuplicateMsgDeliveryDelay(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "duplicateMsgDeliveryDelay", value.asInstanceOf[js.Any])
    
    inline def setDuplicateMsgLateDelivery(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "duplicateMsgLateDelivery", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatDuration(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "heartbeatDuration", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatSkipped(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "heartbeatSkipped", value.asInstanceOf[js.Any])
    
    inline def setIhaveRcvIgnored(value: Gauge[ReasonIHaveIgnoreReason]): Self = StObject.set(x, "ihaveRcvIgnored", value.asInstanceOf[js.Any])
    
    inline def setIhaveRcvMsgids(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "ihaveRcvMsgids", value.asInstanceOf[js.Any])
    
    inline def setIhaveRcvNotSeenMsgids(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "ihaveRcvNotSeenMsgids", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseBroken(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseBroken", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseDeliveryTime(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseResolved(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseResolved", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseResolvedPeers(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseResolvedPeers", value.asInstanceOf[js.Any])
    
    inline def setIwantPromiseStarted(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantPromiseStarted", value.asInstanceOf[js.Any])
    
    inline def setIwantRcvDonthaveMsgids(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "iwantRcvDonthaveMsgids", value.asInstanceOf[js.Any])
    
    inline def setIwantRcvMsgids(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "iwantRcvMsgids", value.asInstanceOf[js.Any])
    
    inline def setMcacheSize(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "mcacheSize", value.asInstanceOf[js.Any])
    
    inline def setMeshPeerChurnEvents(value: Gauge[Topic]): Self = StObject.set(x, "meshPeerChurnEvents", value.asInstanceOf[js.Any])
    
    inline def setMeshPeerCounts(value: Gauge[TopicStr]): Self = StObject.set(x, "meshPeerCounts", value.asInstanceOf[js.Any])
    
    inline def setMeshPeerInclusionEvents(value: Gauge[Reason]): Self = StObject.set(x, "meshPeerInclusionEvents", value.asInstanceOf[js.Any])
    
    inline def setMsgForwardCount(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgForwardCount", value.asInstanceOf[js.Any])
    
    inline def setMsgForwardPeers(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgForwardPeers", value.asInstanceOf[js.Any])
    
    inline def setMsgPublishBytes(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgPublishBytes", value.asInstanceOf[js.Any])
    
    inline def setMsgPublishCount(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgPublishCount", value.asInstanceOf[js.Any])
    
    inline def setMsgPublishPeers(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgPublishPeers", value.asInstanceOf[js.Any])
    
    inline def setMsgPublishPeersByGroup(value: Gauge[PeerGroup]): Self = StObject.set(x, "msgPublishPeersByGroup", value.asInstanceOf[js.Any])
    
    inline def setMsgReceivedInvalid(value: Gauge[Error]): Self = StObject.set(x, "msgReceivedInvalid", value.asInstanceOf[js.Any])
    
    inline def setMsgReceivedPreValidation(value: Gauge[TopicTopicLabel]): Self = StObject.set(x, "msgReceivedPreValidation", value.asInstanceOf[js.Any])
    
    inline def setMsgReceivedStatus(value: Gauge[Status]): Self = StObject.set(x, "msgReceivedStatus", value.asInstanceOf[js.Any])
    
    inline def setOnAddToMesh(
      value: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, InclusionReason, Double) => Callback
    ): Self = StObject.set(x, "onAddToMesh", js.Any.fromFunction3((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: InclusionReason, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnDuplicateMsgDelivery(
      value: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double, Boolean) => Callback
    ): Self = StObject.set(x, "onDuplicateMsgDelivery", js.Any.fromFunction3((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: Double, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnForwardMsg(value: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double) => Callback): Self = StObject.set(x, "onForwardMsg", js.Any.fromFunction2((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnIhaveRcv(
      value: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double, Double) => Callback
    ): Self = StObject.set(x, "onIhaveRcv", js.Any.fromFunction3((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnIwantRcv(
      value: (Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double], Double) => Callback
    ): Self = StObject.set(x, "onIwantRcv", js.Any.fromFunction2((t0: Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Double], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnJoin(value: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Callback): Self = StObject.set(x, "onJoin", js.Any.fromFunction1((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr) => value(t0).runNow()))
    
    inline def setOnLeave(value: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Callback): Self = StObject.set(x, "onLeave", js.Any.fromFunction1((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr) => value(t0).runNow()))
    
    inline def setOnMsgRecvInvalid(
      value: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, RejectReasonObj) => Callback
    ): Self = StObject.set(x, "onMsgRecvInvalid", js.Any.fromFunction2((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: RejectReasonObj) => (value(t0, t1)).runNow()))
    
    inline def setOnMsgRecvPreValidation(value: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => Callback): Self = StObject.set(x, "onMsgRecvPreValidation", js.Any.fromFunction1((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr) => value(t0).runNow()))
    
    inline def setOnMsgRecvResult(
      value: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, MessageStatus) => Callback
    ): Self = StObject.set(x, "onMsgRecvResult", js.Any.fromFunction2((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: MessageStatus) => (value(t0, t1)).runNow()))
    
    inline def setOnPublishMsg(
      value: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, ToSendGroupCount, Double, Double) => Callback
    ): Self = StObject.set(x, "onPublishMsg", js.Any.fromFunction4((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: ToSendGroupCount, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnRemoveFromMesh(
      value: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, ChurnReason, Double) => Callback
    ): Self = StObject.set(x, "onRemoveFromMesh", js.Any.fromFunction3((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: ChurnReason, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnReportValidation(
      value: (typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, MessageAcceptance) => Callback
    ): Self = StObject.set(x, "onReportValidation", js.Any.fromFunction2((t0: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, t1: MessageAcceptance) => (value(t0, t1)).runNow()))
    
    inline def setOnReportValidationMcacheHit(value: Boolean => Callback): Self = StObject.set(x, "onReportValidationMcacheHit", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setOnRpcRecv(value: (IRPC, Double) => Callback): Self = StObject.set(x, "onRpcRecv", js.Any.fromFunction2((t0: IRPC, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnRpcSent(value: (IRPC, Double) => Callback): Self = StObject.set(x, "onRpcSent", js.Any.fromFunction2((t0: IRPC, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnScorePenalty(value: ScorePenalty => Callback): Self = StObject.set(x, "onScorePenalty", js.Any.fromFunction1((t0: ScorePenalty) => value(t0).runNow()))
    
    inline def setPeersByScoreThreshold(value: Gauge[Threshold]): Self = StObject.set(x, "peersByScoreThreshold", value.asInstanceOf[js.Any])
    
    inline def setPeersPerProtocol(value: Gauge[Protocol]): Self = StObject.set(x, "peersPerProtocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolsEnabled(value: Gauge[Protocol]): Self = StObject.set(x, "protocolsEnabled", value.asInstanceOf[js.Any])
    
    inline def setRegisterScorePerMesh(
      value: (Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Set[PeerIdStr]], Map[PeerIdStr, Double]) => Callback
    ): Self = StObject.set(x, "registerScorePerMesh", js.Any.fromFunction2((t0: Map[typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr, Set[PeerIdStr]], t1: Map[PeerIdStr, Double]) => (value(t0, t1)).runNow()))
    
    inline def setRegisterScoreWeights(value: ScoreWeights[js.Array[Double]] => Callback): Self = StObject.set(x, "registerScoreWeights", js.Any.fromFunction1((t0: ScoreWeights[js.Array[Double]]) => value(t0).runNow()))
    
    inline def setRegisterScores(value: (js.Array[Double], PeerScoreThresholds) => Callback): Self = StObject.set(x, "registerScores", js.Any.fromFunction2((t0: js.Array[Double], t1: PeerScoreThresholds) => (value(t0, t1)).runNow()))
    
    inline def setRpcRecvBytes(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvBytes", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvControl(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvControl", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvCount(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvCount", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvGraft(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvGraft", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvIHave(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvIHave", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvIWant(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvIWant", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvMessage(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvMessage", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvNotAccepted(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvNotAccepted", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvPrune(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvPrune", value.asInstanceOf[js.Any])
    
    inline def setRpcRecvSubscription(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcRecvSubscription", value.asInstanceOf[js.Any])
    
    inline def setRpcSentBytes(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentBytes", value.asInstanceOf[js.Any])
    
    inline def setRpcSentControl(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentControl", value.asInstanceOf[js.Any])
    
    inline def setRpcSentCount(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentCount", value.asInstanceOf[js.Any])
    
    inline def setRpcSentGraft(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentGraft", value.asInstanceOf[js.Any])
    
    inline def setRpcSentIHave(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentIHave", value.asInstanceOf[js.Any])
    
    inline def setRpcSentIWant(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentIWant", value.asInstanceOf[js.Any])
    
    inline def setRpcSentMessage(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentMessage", value.asInstanceOf[js.Any])
    
    inline def setRpcSentPrune(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentPrune", value.asInstanceOf[js.Any])
    
    inline def setRpcSentSubscription(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "rpcSentSubscription", value.asInstanceOf[js.Any])
    
    inline def setScore(value: AvgMinMax[LabelsGeneric]): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreCachedDelta(value: Histogram[LabelsGeneric]): Self = StObject.set(x, "scoreCachedDelta", value.asInstanceOf[js.Any])
    
    inline def setScoreFnCalls(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "scoreFnCalls", value.asInstanceOf[js.Any])
    
    inline def setScoreFnRuns(value: Gauge[LabelsGeneric]): Self = StObject.set(x, "scoreFnRuns", value.asInstanceOf[js.Any])
    
    inline def setScorePerMesh(value: AvgMinMax[TopicTopicLabel]): Self = StObject.set(x, "scorePerMesh", value.asInstanceOf[js.Any])
    
    inline def setScoreWeights(value: AvgMinMax[P]): Self = StObject.set(x, "scoreWeights", value.asInstanceOf[js.Any])
    
    inline def setScoringPenalties(value: Gauge[Penalty]): Self = StObject.set(x, "scoringPenalties", value.asInstanceOf[js.Any])
    
    inline def setToTopic(value: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr => TopicLabel): Self = StObject.set(x, "toTopic", js.Any.fromFunction1(value))
    
    inline def setTopicPeersCount(value: Gauge[TopicStr]): Self = StObject.set(x, "topicPeersCount", value.asInstanceOf[js.Any])
    
    inline def setTopicStrToLabel(value: TopicStrToLabel): Self = StObject.set(x, "topicStrToLabel", value.asInstanceOf[js.Any])
    
    inline def setTopicSubscriptionStatus(value: Gauge[TopicStr]): Self = StObject.set(x, "topicSubscriptionStatus", value.asInstanceOf[js.Any])
  }
}
