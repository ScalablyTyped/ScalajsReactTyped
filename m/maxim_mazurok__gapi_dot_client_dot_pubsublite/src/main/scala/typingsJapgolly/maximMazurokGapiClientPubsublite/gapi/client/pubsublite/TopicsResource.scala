package typingsJapgolly.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Alt
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Fields
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Key
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Name
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Resource
import typingsJapgolly.maximMazurokGapiClientPubsublite.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicsResource extends StObject {
  
  /**
    * Compute the head cursor for the partition. The head cursor's offset is guaranteed to be less than or equal to all messages which have not yet been acknowledged as published, and
    * greater than the offset of any message whose publish has already been acknowledged. It is zero if there have never been messages in the partition.
    */
  def computeHeadCursor(request: QuotaUser): Request[ComputeHeadCursorResponse] = js.native
  def computeHeadCursor(
    request: typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Topic,
    body: ComputeHeadCursorRequest
  ): Request[ComputeHeadCursorResponse] = js.native
  
  /** Compute statistics about a range of messages in a given topic and partition. */
  def computeMessageStats(request: Resource): Request[ComputeMessageStatsResponse] = js.native
  def computeMessageStats(
    request: typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Topic,
    body: ComputeMessageStatsRequest
  ): Request[ComputeMessageStatsResponse] = js.native
  
  def computeTimeCursor(
    request: typingsJapgolly.maximMazurokGapiClientPubsublite.anon.Topic,
    body: ComputeTimeCursorRequest
  ): Request[ComputeTimeCursorResponse] = js.native
  /** Compute the corresponding cursor for a publish or event time in a topic partition. */
  def computeTimeCursor(request: UploadType): Request[ComputeTimeCursorResponse] = js.native
  
  /** Creates a new topic. */
  def create(request: Key): Request[Topic] = js.native
  def create(request: Oauthtoken, body: Topic): Request[Topic] = js.native
  
  /** Deletes the specified topic. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Returns the topic configuration. */
  def get(): Request[Topic] = js.native
  def get(request: Alt): Request[Topic] = js.native
  
  /** Returns the partition information for the requested topic. */
  def getPartitions(): Request[TopicPartitions] = js.native
  def getPartitions(request: Alt): Request[TopicPartitions] = js.native
  
  /** Lists the topics attached to the specified reservation. */
  /** Returns the list of topics for the given project. */
  def list(): Request[ListReservationTopicsResponse] = js.native
  def list(request: Fields): Request[ListReservationTopicsResponse] = js.native
  def list(request: PageSize): Request[ListTopicsResponse] = js.native
  
  /** Updates properties of the specified topic. */
  def patch(request: Name): Request[Topic] = js.native
  def patch(request: PrettyPrint, body: Topic): Request[Topic] = js.native
  
  var subscriptions: SubscriptionsResource = js.native
}
