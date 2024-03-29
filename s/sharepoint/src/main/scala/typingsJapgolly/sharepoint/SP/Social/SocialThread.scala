package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a thread that is stored on the server.
  The thread contains a root post and zero or more reply posts. */
trait SocialThread
  extends StObject
     with ClientValueObject {
  
  /** Specifies the users who have created a post in the returned thread and also contains any users, documents, sites, and tags that are referenced in any of the posts in the returned thread. */
  def get_actors(): js.Array[SocialActor]
  
  /** Specifies attributes of the thread, such as whether the current user can reply or lock the thread and whether the thread is a digest of a thread on the server, whether the number of replies has reached the maximum, and whether the thread is locked. */
  def get_attributes(): SocialThreadAttributes
  
  /** Specifies the unique identification of the thread. */
  def get_id(): String
  
  /** Specifies the thread owner as an index into the Actors array.
    Typically, the thread owner is the user who created the root post, but the thread owner can be any user included in the Actors array. */
  def get_ownerIndex(): Double
  
  /** Specifies a URI that is a permanent reference to the thread, if such a permanent reference is available.  */
  def get_permalink(): String
  
  /** Specifies a reference to a post in another thread.
    The PostReference property is available only if the ThreadType has a value of ReplyReference, LikeReference, MentionReference, or TagReference.  */
  def get_postReference(): SocialPostReference
  
  /** Returns an array of zero or more reply posts.
    The server can return a subset of the reply posts that are stored on the server. */
  def get_replies(): js.Array[SocialPost]
  
  def get_rootPost(): SocialPost
  
  /** Provides information about conditions that were encountered retrieving the thread that did not prevent the operation from completing. */
  def get_status(): SocialStatusCode
  
  /** Specifies if the thread is a normal thread created by one or more CreatePost calls or a reference post generated by the server when a user replies to a post, likes a post, or creates a post with a tag or mention */
  def get_threadType(): SocialThreadType
  
  def get_totalReplyCount(): Double
}
object SocialThread {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_actors: CallbackTo[js.Array[SocialActor]],
    get_attributes: CallbackTo[SocialThreadAttributes],
    get_id: CallbackTo[String],
    get_ownerIndex: CallbackTo[Double],
    get_permalink: CallbackTo[String],
    get_postReference: CallbackTo[SocialPostReference],
    get_replies: CallbackTo[js.Array[SocialPost]],
    get_rootPost: CallbackTo[SocialPost],
    get_status: CallbackTo[SocialStatusCode],
    get_threadType: CallbackTo[SocialThreadType],
    get_totalReplyCount: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialThread = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_actors = get_actors.toJsFn, get_attributes = get_attributes.toJsFn, get_id = get_id.toJsFn, get_ownerIndex = get_ownerIndex.toJsFn, get_permalink = get_permalink.toJsFn, get_postReference = get_postReference.toJsFn, get_replies = get_replies.toJsFn, get_rootPost = get_rootPost.toJsFn, get_status = get_status.toJsFn, get_threadType = get_threadType.toJsFn, get_totalReplyCount = get_totalReplyCount.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialThread]
  }
  
  extension [Self <: SocialThread](x: Self) {
    
    inline def setGet_actors(value: CallbackTo[js.Array[SocialActor]]): Self = StObject.set(x, "get_actors", value.toJsFn)
    
    inline def setGet_attributes(value: CallbackTo[SocialThreadAttributes]): Self = StObject.set(x, "get_attributes", value.toJsFn)
    
    inline def setGet_id(value: CallbackTo[String]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_ownerIndex(value: CallbackTo[Double]): Self = StObject.set(x, "get_ownerIndex", value.toJsFn)
    
    inline def setGet_permalink(value: CallbackTo[String]): Self = StObject.set(x, "get_permalink", value.toJsFn)
    
    inline def setGet_postReference(value: CallbackTo[SocialPostReference]): Self = StObject.set(x, "get_postReference", value.toJsFn)
    
    inline def setGet_replies(value: CallbackTo[js.Array[SocialPost]]): Self = StObject.set(x, "get_replies", value.toJsFn)
    
    inline def setGet_rootPost(value: CallbackTo[SocialPost]): Self = StObject.set(x, "get_rootPost", value.toJsFn)
    
    inline def setGet_status(value: CallbackTo[SocialStatusCode]): Self = StObject.set(x, "get_status", value.toJsFn)
    
    inline def setGet_threadType(value: CallbackTo[SocialThreadType]): Self = StObject.set(x, "get_threadType", value.toJsFn)
    
    inline def setGet_totalReplyCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_totalReplyCount", value.toJsFn)
  }
}
