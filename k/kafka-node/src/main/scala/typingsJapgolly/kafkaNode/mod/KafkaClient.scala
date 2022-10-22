package typingsJapgolly.kafkaNode.mod

import typingsJapgolly.kafkaNode.kafkaNodeStrings.brokersChanged
import typingsJapgolly.kafkaNode.kafkaNodeStrings.close
import typingsJapgolly.kafkaNode.kafkaNodeStrings.connect
import typingsJapgolly.kafkaNode.kafkaNodeStrings.error
import typingsJapgolly.kafkaNode.kafkaNodeStrings.ready
import typingsJapgolly.kafkaNode.kafkaNodeStrings.reconnect
import typingsJapgolly.kafkaNode.kafkaNodeStrings.socket_error
import typingsJapgolly.kafkaNode.kafkaNodeStrings.zkReconnect
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "KafkaClient")
@js.native
open class KafkaClient () extends EventEmitter {
  def this(options: KafkaClientOptions) = this()
  
  def close(): Unit = js.native
  def close(cb: js.Function0[Unit]): Unit = js.native
  
  def connect(): Unit = js.native
  
  def createTopics(
    topics: js.Array[CreateTopicRequest],
    callback: js.Function2[/* error */ Any, /* result */ js.Array[CreateTopicResponse], Any]
  ): Unit = js.native
  
  def loadMetadataForTopics(
    topics: js.Array[String],
    callback: js.Function2[/* error */ Any, /* result */ MetadataResponse, Any]
  ): Unit = js.native
  
  // Note: socket_error is currently KafkaClient only, and zkReconnect is currently Client only.
  def on(
    eventName: brokersChanged | close | connect | ready | reconnect | zkReconnect,
    cb: js.Function0[Any]
  ): this.type = js.native
  def on(eventName: error | socket_error, cb: js.Function1[/* error */ Any, Any]): this.type = js.native
  
  def refreshMetadata(topics: js.Array[String]): Unit = js.native
  def refreshMetadata(topics: js.Array[String], cb: js.Function1[/* error */ js.UndefOr[Any], Any]): Unit = js.native
  
  def sendOffsetCommitV2Request(
    group: String,
    generationId: Double,
    memberId: String,
    commits: js.Array[OffsetCommitRequest],
    cb: js.Function2[/* error */ Any, /* data */ Any, Any]
  ): Unit = js.native
  
  def topicExists(topics: js.Array[String], cb: js.Function1[/* error */ js.UndefOr[TopicsNotExistError | Any], Any]): Unit = js.native
}
