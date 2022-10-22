package typingsJapgolly.kafkajs.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.kafkajs.anon.ApiKey
import typingsJapgolly.kafkajs.anon.ApiName
import typingsJapgolly.kafkajs.anon.AssignedTopics
import typingsJapgolly.kafkajs.anon.Duration
import typingsJapgolly.kafkajs.anon.Error
import typingsJapgolly.kafkajs.anon.GroupGenerationIdGroupId
import typingsJapgolly.kafkajs.anon.GroupIdMemberId
import typingsJapgolly.kafkajs.anon.GroupProtocol
import typingsJapgolly.kafkajs.anon.IBatchProcessEventduratio
import typingsJapgolly.kafkajs.anon.MaxVersion
import typingsJapgolly.kafkajs.anon.MemberId
import typingsJapgolly.kafkajs.anon.NodeIdNumber
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApiVersions = NumberDictionary[MaxVersion]

type Assignment = StringDictionary[js.Array[Double]]

type BrokersFunction = js.Function0[js.Array[String] | js.Promise[js.Array[String]]]

type ConnectEvent = InstrumentationEvent[Null]

type ConsumerCommitOffsetsEvent = InstrumentationEvent[MemberId]

type ConsumerCrashEvent = InstrumentationEvent[Error]

type ConsumerEachBatchPayload = EachBatchPayload

type ConsumerEachMessagePayload = EachMessagePayload

type ConsumerEndBatchProcessEvent = InstrumentationEvent[IBatchProcessEventduratio]

type ConsumerFetchEvent = InstrumentationEvent[Duration]

type ConsumerFetchStartEvent = InstrumentationEvent[NodeIdNumber]

type ConsumerGroupJoinEvent = InstrumentationEvent[GroupProtocol]

type ConsumerHeartbeatEvent = InstrumentationEvent[GroupGenerationIdGroupId]

type ConsumerRebalancingEvent = InstrumentationEvent[GroupIdMemberId]

type ConsumerReceivedUnsubcribedTopicsEvent = InstrumentationEvent[AssignedTopics]

type ConsumerStartBatchProcessEvent = InstrumentationEvent[IBatchProcessEvent]

type DefaultPartitioner = ICustomPartitioner

type DisconnectEvent = InstrumentationEvent[Null]

type EachBatchHandler = js.Function1[/* payload */ EachBatchPayload, js.Promise[Unit]]

type EachMessageHandler = js.Function1[/* payload */ EachMessagePayload, js.Promise[Unit]]

type ICustomPartitioner = js.Function0[js.Function1[/* args */ PartitionerArgs, Double]]

type IHeaders = StringDictionary[js.UndefOr[Buffer | String | (js.Array[Buffer | String])]]

type IMemberAssignment = StringDictionary[js.Array[Double]]

type ISocketFactory = js.Function1[/* args */ ISocketFactoryArgs, Socket]

type LegacyPartitioner = ICustomPartitioner

type PartitionAssigner = js.Function1[/* config */ typingsJapgolly.kafkajs.anon.Cluster, Assigner]

type RemoveInstrumentationEventListener[T] = js.Function0[Unit]

type RequestEvent = InstrumentationEvent[ApiKey]

type RequestQueueSizeEvent = InstrumentationEvent[typingsJapgolly.kafkajs.anon.Broker]

type RequestTimeoutEvent = InstrumentationEvent[ApiName]

type SASLOptions = SASLMechanismOptions[SASLMechanism]

type SeekEntry = PartitionOffset

type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any

type logCreator = js.Function1[/* logLevel */ logLevel, js.Function1[/* entry */ LogEntry, Unit]]
