package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a post read from the server. */
trait SocialPost
  extends StObject
     with ClientValueObject {
  
  /** Specifies an image, document preview, or video preview attachment */
  def get_attachment(): SocialAttachment
  
  /** Describes attributes about the post, such as whether the current user can delete or like the post.  */
  def get_attributes(): SocialPostAttributes
  
  /** Specifies the author of the post as an index to the social thread's Actors array. */
  def get_authorIndex(): Double
  
  /** Specifies the date and time that the post was created on the server. */
  def get_createdTime(): String
  
  /** Specifies the unique identifier of the post. */
  def get_id(): String
  
  /** Specifies information about users who like the post. */
  def get_likerInfo(): SocialPostActorInfo
  
  /** Specifies the date and time that the post was last modified on the server. */
  def get_modifiedTime(): String
  
  /** An array of objects in a post, where each object represents a user, document, site, tag, or link. */
  def get_overlays(): js.Array[SocialDataOverlay]
  
  /** Specifies whether a post is the root post or a reply post in a thread */
  def get_postType(): SocialPostType
  
  /** Specifies the URI of the image to be displayed with the post.  */
  def get_preferredImageUri(): String
  
  /** Specifies the link to a web site associated with the application that created the post. */
  def get_source(): SocialLink
  
  /** Specifies the text of the post. */
  def get_text(): String
}
object SocialPost {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_attachment: CallbackTo[SocialAttachment],
    get_attributes: CallbackTo[SocialPostAttributes],
    get_authorIndex: CallbackTo[Double],
    get_createdTime: CallbackTo[String],
    get_id: CallbackTo[String],
    get_likerInfo: CallbackTo[SocialPostActorInfo],
    get_modifiedTime: CallbackTo[String],
    get_overlays: CallbackTo[js.Array[SocialDataOverlay]],
    get_postType: CallbackTo[SocialPostType],
    get_preferredImageUri: CallbackTo[String],
    get_source: CallbackTo[SocialLink],
    get_text: CallbackTo[String],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialPost = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_attachment = get_attachment.toJsFn, get_attributes = get_attributes.toJsFn, get_authorIndex = get_authorIndex.toJsFn, get_createdTime = get_createdTime.toJsFn, get_id = get_id.toJsFn, get_likerInfo = get_likerInfo.toJsFn, get_modifiedTime = get_modifiedTime.toJsFn, get_overlays = get_overlays.toJsFn, get_postType = get_postType.toJsFn, get_preferredImageUri = get_preferredImageUri.toJsFn, get_source = get_source.toJsFn, get_text = get_text.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialPost]
  }
  
  extension [Self <: SocialPost](x: Self) {
    
    inline def setGet_attachment(value: CallbackTo[SocialAttachment]): Self = StObject.set(x, "get_attachment", value.toJsFn)
    
    inline def setGet_attributes(value: CallbackTo[SocialPostAttributes]): Self = StObject.set(x, "get_attributes", value.toJsFn)
    
    inline def setGet_authorIndex(value: CallbackTo[Double]): Self = StObject.set(x, "get_authorIndex", value.toJsFn)
    
    inline def setGet_createdTime(value: CallbackTo[String]): Self = StObject.set(x, "get_createdTime", value.toJsFn)
    
    inline def setGet_id(value: CallbackTo[String]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_likerInfo(value: CallbackTo[SocialPostActorInfo]): Self = StObject.set(x, "get_likerInfo", value.toJsFn)
    
    inline def setGet_modifiedTime(value: CallbackTo[String]): Self = StObject.set(x, "get_modifiedTime", value.toJsFn)
    
    inline def setGet_overlays(value: CallbackTo[js.Array[SocialDataOverlay]]): Self = StObject.set(x, "get_overlays", value.toJsFn)
    
    inline def setGet_postType(value: CallbackTo[SocialPostType]): Self = StObject.set(x, "get_postType", value.toJsFn)
    
    inline def setGet_preferredImageUri(value: CallbackTo[String]): Self = StObject.set(x, "get_preferredImageUri", value.toJsFn)
    
    inline def setGet_source(value: CallbackTo[SocialLink]): Self = StObject.set(x, "get_source", value.toJsFn)
    
    inline def setGet_text(value: CallbackTo[String]): Self = StObject.set(x, "get_text", value.toJsFn)
  }
}
