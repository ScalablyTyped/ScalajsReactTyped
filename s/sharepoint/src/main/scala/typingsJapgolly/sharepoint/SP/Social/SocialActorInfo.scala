package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies an actor to the server. An actor can be a user, document, site, or tag. */
trait SocialActorInfo
  extends StObject
     with ClientValueObject {
  
  /** User account name.
    This property is only available for social actors of type "user". */
  def get_accountName(): String
  
  /** Identifies whether the actor is a user, document, site, or tag. */
  def get_actorType(): SocialActorType
  
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def get_contentUri(): String
  
  /** Actor's unique identifier. */
  def get_id(): String
  
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  def get_tagGuid(): String
  
  /** User account name.
    This property is only available for social actors of type "user". */
  def set_accountName(value: String): String
  
  /** Identifies whether the actor is a user, document, site, or tag. */
  def set_actorType(value: SocialActorType): SocialActorType
  
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def set_contentUri(value: String): String
  
  /** Actor's unique identifier. */
  def set_id(value: String): String
  
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  def set_tagGuid(value: String): String
}
object SocialActorInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_accountName: CallbackTo[String],
    get_actorType: CallbackTo[SocialActorType],
    get_contentUri: CallbackTo[String],
    get_id: CallbackTo[String],
    get_tagGuid: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_accountName: String => String,
    set_actorType: SocialActorType => SocialActorType,
    set_contentUri: String => String,
    set_id: String => String,
    set_tagGuid: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialActorInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_accountName = get_accountName.toJsFn, get_actorType = get_actorType.toJsFn, get_contentUri = get_contentUri.toJsFn, get_id = get_id.toJsFn, get_tagGuid = get_tagGuid.toJsFn, get_typeId = get_typeId.toJsFn, set_accountName = js.Any.fromFunction1(set_accountName), set_actorType = js.Any.fromFunction1(set_actorType), set_contentUri = js.Any.fromFunction1(set_contentUri), set_id = js.Any.fromFunction1(set_id), set_tagGuid = js.Any.fromFunction1(set_tagGuid), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialActorInfo]
  }
  
  extension [Self <: SocialActorInfo](x: Self) {
    
    inline def setGet_accountName(value: CallbackTo[String]): Self = StObject.set(x, "get_accountName", value.toJsFn)
    
    inline def setGet_actorType(value: CallbackTo[SocialActorType]): Self = StObject.set(x, "get_actorType", value.toJsFn)
    
    inline def setGet_contentUri(value: CallbackTo[String]): Self = StObject.set(x, "get_contentUri", value.toJsFn)
    
    inline def setGet_id(value: CallbackTo[String]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_tagGuid(value: CallbackTo[String]): Self = StObject.set(x, "get_tagGuid", value.toJsFn)
    
    inline def setSet_accountName(value: String => String): Self = StObject.set(x, "set_accountName", js.Any.fromFunction1(value))
    
    inline def setSet_actorType(value: SocialActorType => SocialActorType): Self = StObject.set(x, "set_actorType", js.Any.fromFunction1(value))
    
    inline def setSet_contentUri(value: String => String): Self = StObject.set(x, "set_contentUri", js.Any.fromFunction1(value))
    
    inline def setSet_id(value: String => String): Self = StObject.set(x, "set_id", js.Any.fromFunction1(value))
    
    inline def setSet_tagGuid(value: String => String): Self = StObject.set(x, "set_tagGuid", js.Any.fromFunction1(value))
  }
}
