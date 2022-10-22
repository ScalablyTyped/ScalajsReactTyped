package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a reference to a post in another thread.
  The referenced post can be a post with a tag, a post that is liked, a post that mentions a user, or a post that is a reply. */
trait SocialPostReference
  extends StObject
     with ClientValueObject {
  
  /** Provides a digest of the thread containing the referenced post */
  def get_digest(): SocialThread
  
  def get_post(): SocialPost
  
  /** Specifies the unique identifier of the thread containing the referenced post. */
  def get_threadId(): String
  
  /** Specifies the current owner of the thread as an index into the SocialThreadActors array. */
  def get_threadOwnerIndex(): Double
}
object SocialPostReference {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_digest: CallbackTo[SocialThread],
    get_post: CallbackTo[SocialPost],
    get_threadId: CallbackTo[String],
    get_threadOwnerIndex: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialPostReference = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_digest = get_digest.toJsFn, get_post = get_post.toJsFn, get_threadId = get_threadId.toJsFn, get_threadOwnerIndex = get_threadOwnerIndex.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialPostReference]
  }
  
  extension [Self <: SocialPostReference](x: Self) {
    
    inline def setGet_digest(value: CallbackTo[SocialThread]): Self = StObject.set(x, "get_digest", value.toJsFn)
    
    inline def setGet_post(value: CallbackTo[SocialPost]): Self = StObject.set(x, "get_post", value.toJsFn)
    
    inline def setGet_threadId(value: CallbackTo[String]): Self = StObject.set(x, "get_threadId", value.toJsFn)
    
    inline def setGet_threadOwnerIndex(value: CallbackTo[Double]): Self = StObject.set(x, "get_threadOwnerIndex", value.toJsFn)
  }
}
