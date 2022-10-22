package typingsJapgolly.kafkaNode.mod

import typingsJapgolly.kafkaNode.kafkaNodeStrings.connect
import typingsJapgolly.kafkaNode.kafkaNodeStrings.error
import typingsJapgolly.kafkaNode.kafkaNodeStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "Offset")
@js.native
open class Offset protected () extends StObject {
  def this(client: KafkaClient) = this()
  
  def commit(
    groupId: String,
    payloads: js.Array[OffsetCommitRequest],
    cb: js.Function2[/* error */ Any, /* data */ Any, Any]
  ): Unit = js.native
  
  def fetch(payloads: js.Array[OffsetRequest], cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  
  def fetchCommits(
    groupId: String,
    payloads: js.Array[OffsetFetchRequest],
    cb: js.Function2[/* error */ Any, /* data */ Any, Any]
  ): Unit = js.native
  
  def fetchEarliestOffsets(topics: js.Array[String], cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  
  def fetchLatestOffsets(topics: js.Array[String], cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  
  def on(eventName: ready | connect, cb: js.Function0[Any]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, cb: js.Function1[/* error */ Any, Any]): Unit = js.native
}
