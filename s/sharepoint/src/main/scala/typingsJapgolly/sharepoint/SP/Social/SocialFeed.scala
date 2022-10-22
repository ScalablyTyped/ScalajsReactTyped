package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a feed, which contains an array of SocialThreads, each of which specifies a root SocialPost object and an array of response SocialPost objects. */
trait SocialFeed
  extends StObject
     with ClientValueObject {
  
  /** Specifies attributes of the returned feed.
    The attributes specify if the requested feed has additional threads that were not included in the returned thread. */
  def get_attributes(): SocialFeedAttributes
  
  /** Returns the date-time of the most recent post that was requested.
    The most recent post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property. */
  def get_newestProcessed(): String
  
  /** The OldestProcessed property returns the date-time of the oldest post that was requested.
    The oldest post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property */
  def get_oldestProcessed(): String
  
  /** Contains the social threads in the feed. */
  def get_threads(): js.Array[SocialThread]
  
  /** Returns the number of mentions of the current user that have been added to the feed on the server since the time that the unread mention count was cleared for the current user. */
  def get_unreadMentionCount(): Double
}
object SocialFeed {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_attributes: CallbackTo[SocialFeedAttributes],
    get_newestProcessed: CallbackTo[String],
    get_oldestProcessed: CallbackTo[String],
    get_threads: CallbackTo[js.Array[SocialThread]],
    get_typeId: CallbackTo[String],
    get_unreadMentionCount: CallbackTo[Double],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialFeed = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_attributes = get_attributes.toJsFn, get_newestProcessed = get_newestProcessed.toJsFn, get_oldestProcessed = get_oldestProcessed.toJsFn, get_threads = get_threads.toJsFn, get_typeId = get_typeId.toJsFn, get_unreadMentionCount = get_unreadMentionCount.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialFeed]
  }
  
  extension [Self <: SocialFeed](x: Self) {
    
    inline def setGet_attributes(value: CallbackTo[SocialFeedAttributes]): Self = StObject.set(x, "get_attributes", value.toJsFn)
    
    inline def setGet_newestProcessed(value: CallbackTo[String]): Self = StObject.set(x, "get_newestProcessed", value.toJsFn)
    
    inline def setGet_oldestProcessed(value: CallbackTo[String]): Self = StObject.set(x, "get_oldestProcessed", value.toJsFn)
    
    inline def setGet_threads(value: CallbackTo[js.Array[SocialThread]]): Self = StObject.set(x, "get_threads", value.toJsFn)
    
    inline def setGet_unreadMentionCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_unreadMentionCount", value.toJsFn)
  }
}
