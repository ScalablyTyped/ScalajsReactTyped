package typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod

import typingsJapgolly.chainsafeLibp2pGossipsub.anon.AsyncValidationMcacheHit
import typingsJapgolly.chainsafeLibp2pGossipsub.anon.BehaviourPenaltyThreshold
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.^
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getMetrics(register: MetricsRegister, topicStrToLabel: TopicStrToLabel, opts: BehaviourPenaltyThreshold): AsyncValidationMcacheHit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetrics")(register.asInstanceOf[js.Any], topicStrToLabel.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AsyncValidationMcacheHit]

type AvgMinMaxConfig[Labels /* <: LabelsGeneric */] = GaugeConfig[Labels]

type CollectFn[Labels /* <: LabelsGeneric */] = js.Function1[/* metric */ Gauge[Labels], Unit]

type LabelsGeneric = Record[String, js.UndefOr[String]]

type Metrics = ReturnType[
js.Function3[
  /* register */ MetricsRegister, 
  /* topicStrToLabel */ TopicStrToLabel, 
  /* opts */ BehaviourPenaltyThreshold, 
  AsyncValidationMcacheHit
]]

type PeersByScoreThreshold = Record[ScoreThreshold, Double]

type TopicLabel = String

type TopicStrToLabel = Map[TopicStr, TopicLabel]
