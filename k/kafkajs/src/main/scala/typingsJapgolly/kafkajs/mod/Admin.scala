package typingsJapgolly.kafkajs.mod

import typingsJapgolly.kafkajs.anon.Brokers
import typingsJapgolly.kafkajs.anon.Earliest
import typingsJapgolly.kafkajs.anon.Filters
import typingsJapgolly.kafkajs.anon.GroupId
import typingsJapgolly.kafkajs.anon.Groups
import typingsJapgolly.kafkajs.anon.IncludeSynonyms
import typingsJapgolly.kafkajs.anon.Partitions
import typingsJapgolly.kafkajs.anon.PartitionsTopic
import typingsJapgolly.kafkajs.anon.Resources
import typingsJapgolly.kafkajs.anon.SeekEntryhighstringlowstr
import typingsJapgolly.kafkajs.anon.Timeout
import typingsJapgolly.kafkajs.anon.TimeoutTopics
import typingsJapgolly.kafkajs.anon.Topic
import typingsJapgolly.kafkajs.anon.Topics
import typingsJapgolly.kafkajs.anon.TopicsArray
import typingsJapgolly.kafkajs.anon.`0`
import typingsJapgolly.kafkajs.anon.`1`
import typingsJapgolly.kafkajs.kafkajsStrings.adminDotconnect
import typingsJapgolly.kafkajs.kafkajsStrings.adminDotdisconnect
import typingsJapgolly.kafkajs.kafkajsStrings.adminDotnetworkDotrequest
import typingsJapgolly.kafkajs.kafkajsStrings.adminDotnetworkDotrequest_queue_size
import typingsJapgolly.kafkajs.kafkajsStrings.adminDotnetworkDotrequest_timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Admin extends StObject {
  
  def alterConfigs(configs: Resources): js.Promise[Any] = js.native
  
  def alterPartitionReassignments(request: TimeoutTopics): js.Promise[Unit] = js.native
  
  def connect(): js.Promise[Unit] = js.native
  
  def createAcls(options: typingsJapgolly.kafkajs.anon.Acl): js.Promise[Boolean] = js.native
  
  def createPartitions(options: typingsJapgolly.kafkajs.anon.TopicPartitions): js.Promise[Boolean] = js.native
  
  def createTopics(options: Timeout): js.Promise[Boolean] = js.native
  
  def deleteAcls(options: Filters): js.Promise[DeleteAclResponse] = js.native
  
  def deleteGroups(groupIds: js.Array[String]): js.Promise[js.Array[DeleteGroupsResult]] = js.native
  
  def deleteTopicRecords(options: PartitionsTopic): js.Promise[Unit] = js.native
  
  def deleteTopics(options: Topics): js.Promise[Unit] = js.native
  
  def describeAcls(options: AclFilter): js.Promise[DescribeAclResponse] = js.native
  
  def describeCluster(): js.Promise[Brokers] = js.native
  
  def describeConfigs(configs: IncludeSynonyms): js.Promise[DescribeConfigResponse] = js.native
  
  def describeGroups(groupIds: js.Array[String]): js.Promise[GroupDescriptions] = js.native
  
  def disconnect(): js.Promise[Unit] = js.native
  
  val events: AdminEvents = js.native
  
  def fetchOffsets(options: GroupId): js.Promise[js.Array[Partitions]] = js.native
  
  def fetchTopicMetadata(): js.Promise[`0`] = js.native
  def fetchTopicMetadata(options: TopicsArray): js.Promise[`0`] = js.native
  
  def fetchTopicOffsets(topic: String): js.Promise[js.Array[SeekEntryhighstringlowstr]] = js.native
  
  def fetchTopicOffsetsByTimestamp(topic: String): js.Promise[js.Array[SeekEntry]] = js.native
  def fetchTopicOffsetsByTimestamp(topic: String, timestamp: Double): js.Promise[js.Array[SeekEntry]] = js.native
  
  def listGroups(): js.Promise[Groups] = js.native
  
  def listPartitionReassignments(request: `1`): js.Promise[ListPartitionReassignmentsResponse] = js.native
  
  def listTopics(): js.Promise[js.Array[String]] = js.native
  
  def logger(): Logger = js.native
  
  def on(
    eventName: ValueOf[AdminEvents],
    listener: js.Function1[/* event */ InstrumentationEvent[Any], Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_adminconnect(eventName: adminDotconnect, listener: js.Function1[/* event */ ConnectEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_admindisconnect(eventName: adminDotdisconnect, listener: js.Function1[/* event */ DisconnectEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_adminnetworkrequest(eventName: adminDotnetworkDotrequest, listener: js.Function1[/* event */ RequestEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_adminnetworkrequestqueuesize(
    eventName: adminDotnetworkDotrequest_queue_size,
    listener: js.Function1[/* event */ RequestQueueSizeEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_adminnetworkrequesttimeout(
    eventName: adminDotnetworkDotrequest_timeout,
    listener: js.Function1[/* event */ RequestTimeoutEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  
  def resetOffsets(options: Earliest): js.Promise[Unit] = js.native
  
  def setOffsets(options: Topic): js.Promise[Unit] = js.native
}
