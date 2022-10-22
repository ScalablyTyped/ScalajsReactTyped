package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an actor retrieved from server. An actor is a user, document, site, or tag. */
trait SocialActor
  extends StObject
     with ClientValueObject {
  
  /** The AccountName property returns the user account name.
    This property is only available for social actors of type "user". */
  def get_accountName(): String
  
  /** Identifies whether the actor is a user, document, site, or tag. */
  def get_actorType(): SocialActorType
  
  /** Specifies whether the actor can be followed by the current user. */
  def get_canFollow(): Boolean
  
  /** Returns the URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def get_contentUri(): String
  
  def get_emailAddress(): String
  
  /** Returns the URI of the user's followed content folder.
    This property is only available for social actors of type "user". */
  def get_followedContentUri(): String
  
  /** Returns the actor's unique identifier. */
  def get_id(): String
  
  /** Returns the URI of the image representing the actor.
    This property is only available if actor is User, Document, or Site. */
  def get_imageUri(): String
  
  /** Returns true if the current user is following the actor; otherwise, it returns false. */
  def get_isFollowed(): Boolean
  
  /** Returns the URI of the library containing the document.
    This property is only available for social actors of type "document". */
  def get_libraryUri(): String
  
  /** The Name property returns the actor's display name. */
  def get_name(): String
  
  /** Returns the URI of the user's personal site.
    This property is only available for social actors of type "user". */
  def get_personalSiteUri(): String
  
  /** Represents the status of retrieving the actor */
  def get_status(): SocialStatusCode
  
  /** The StatusText property returns the most recent post of the user.
    This property is only available for social actors of type "user". */
  def get_statusText(): String
  
  /** Returns the GUID of the tag.
    Only available for social actors of type "tag" */
  def get_tagGuid(): String
  
  /** Returns the user's title
    This property is only available for social actors of type "user". */
  def get_title(): String
  
  /** Returns the URI of the actor. */
  def get_uri(): String
}
object SocialActor {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_accountName: CallbackTo[String],
    get_actorType: CallbackTo[SocialActorType],
    get_canFollow: CallbackTo[Boolean],
    get_contentUri: CallbackTo[String],
    get_emailAddress: CallbackTo[String],
    get_followedContentUri: CallbackTo[String],
    get_id: CallbackTo[String],
    get_imageUri: CallbackTo[String],
    get_isFollowed: CallbackTo[Boolean],
    get_libraryUri: CallbackTo[String],
    get_name: CallbackTo[String],
    get_personalSiteUri: CallbackTo[String],
    get_status: CallbackTo[SocialStatusCode],
    get_statusText: CallbackTo[String],
    get_tagGuid: CallbackTo[String],
    get_title: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_uri: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialActor = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_accountName = get_accountName.toJsFn, get_actorType = get_actorType.toJsFn, get_canFollow = get_canFollow.toJsFn, get_contentUri = get_contentUri.toJsFn, get_emailAddress = get_emailAddress.toJsFn, get_followedContentUri = get_followedContentUri.toJsFn, get_id = get_id.toJsFn, get_imageUri = get_imageUri.toJsFn, get_isFollowed = get_isFollowed.toJsFn, get_libraryUri = get_libraryUri.toJsFn, get_name = get_name.toJsFn, get_personalSiteUri = get_personalSiteUri.toJsFn, get_status = get_status.toJsFn, get_statusText = get_statusText.toJsFn, get_tagGuid = get_tagGuid.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, get_uri = get_uri.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialActor]
  }
  
  extension [Self <: SocialActor](x: Self) {
    
    inline def setGet_accountName(value: CallbackTo[String]): Self = StObject.set(x, "get_accountName", value.toJsFn)
    
    inline def setGet_actorType(value: CallbackTo[SocialActorType]): Self = StObject.set(x, "get_actorType", value.toJsFn)
    
    inline def setGet_canFollow(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_canFollow", value.toJsFn)
    
    inline def setGet_contentUri(value: CallbackTo[String]): Self = StObject.set(x, "get_contentUri", value.toJsFn)
    
    inline def setGet_emailAddress(value: CallbackTo[String]): Self = StObject.set(x, "get_emailAddress", value.toJsFn)
    
    inline def setGet_followedContentUri(value: CallbackTo[String]): Self = StObject.set(x, "get_followedContentUri", value.toJsFn)
    
    inline def setGet_id(value: CallbackTo[String]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_imageUri(value: CallbackTo[String]): Self = StObject.set(x, "get_imageUri", value.toJsFn)
    
    inline def setGet_isFollowed(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isFollowed", value.toJsFn)
    
    inline def setGet_libraryUri(value: CallbackTo[String]): Self = StObject.set(x, "get_libraryUri", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_personalSiteUri(value: CallbackTo[String]): Self = StObject.set(x, "get_personalSiteUri", value.toJsFn)
    
    inline def setGet_status(value: CallbackTo[SocialStatusCode]): Self = StObject.set(x, "get_status", value.toJsFn)
    
    inline def setGet_statusText(value: CallbackTo[String]): Self = StObject.set(x, "get_statusText", value.toJsFn)
    
    inline def setGet_tagGuid(value: CallbackTo[String]): Self = StObject.set(x, "get_tagGuid", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_uri(value: CallbackTo[String]): Self = StObject.set(x, "get_uri", value.toJsFn)
  }
}
