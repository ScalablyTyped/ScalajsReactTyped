package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the content of a post in the SocialFeedManager.createPost method.
  The post consists of a text message, which can optionally include social tags, mentions of users, and links. */
trait SocialPostCreationData
  extends StObject
     with ClientValueObject {
  
  /** Specifies an image, document preview, or video preview to be used in the post. */
  def get_attachment(): SocialAttachment
  
  /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
    Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
  def get_contentItems(): js.Array[SocialDataItem]
  
  /** Contains the text body of the post. */
  def get_contentText(): String
  
  /** Specifies additional information when creating server-generated posts */
  def get_definitionData(): SocialPostDefinitionData
  
  /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
  def get_securityUris(): js.Array[String]
  
  /** Specifies the link to a web site associated with the application that created the post */
  def get_source(): SocialLink
  
  /** Indicates whether the post is to be used as the current user's new status message. */
  def get_updateStatusText(): Boolean
  
  /** Specifies an image, document preview, or video preview to be used in the post. */
  def set_attachment(value: SocialAttachment): SocialAttachment
  
  /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
    Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
  def set_contentItems(value: js.Array[SocialDataItem]): js.Array[SocialDataItem]
  
  /** Contains the text body of the post.
    It can optionally contain one or more substitution references to elements in the zero-based ContentItems array.
    A substitution reference consists of a series of characters that consist of an open-brace character ({) followed by one of more digits in the range 0 to 9 and terminated by a close-brace character (}).
    The substitution reference is replaced by the text value of the element in the in the array at the offset specified by the value of the digits.
    For example, the text string "{0}" is replaced by the first element in the ContentItems array. */
  def set_contentText(value: String): String
  
  /** Specifies additional information when creating server-generated posts */
  def set_definitionData(value: SocialPostDefinitionData): SocialPostDefinitionData
  
  /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
  def set_securityUris(value: js.Array[String]): js.Array[String]
  
  /** Specifies the link to a web site associated with the application that created the post */
  def set_source(value: SocialLink): SocialLink
  
  /** Indicates whether the post is to be used as the current user's new status message. */
  def set_updateStatusText(value: Boolean): Boolean
}
object SocialPostCreationData {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_attachment: CallbackTo[SocialAttachment],
    get_contentItems: CallbackTo[js.Array[SocialDataItem]],
    get_contentText: CallbackTo[String],
    get_definitionData: CallbackTo[SocialPostDefinitionData],
    get_securityUris: CallbackTo[js.Array[String]],
    get_source: CallbackTo[SocialLink],
    get_typeId: CallbackTo[String],
    get_updateStatusText: CallbackTo[Boolean],
    set_attachment: SocialAttachment => SocialAttachment,
    set_contentItems: js.Array[SocialDataItem] => js.Array[SocialDataItem],
    set_contentText: String => String,
    set_definitionData: SocialPostDefinitionData => SocialPostDefinitionData,
    set_securityUris: js.Array[String] => js.Array[String],
    set_source: SocialLink => SocialLink,
    set_updateStatusText: Boolean => Boolean,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialPostCreationData = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_attachment = get_attachment.toJsFn, get_contentItems = get_contentItems.toJsFn, get_contentText = get_contentText.toJsFn, get_definitionData = get_definitionData.toJsFn, get_securityUris = get_securityUris.toJsFn, get_source = get_source.toJsFn, get_typeId = get_typeId.toJsFn, get_updateStatusText = get_updateStatusText.toJsFn, set_attachment = js.Any.fromFunction1(set_attachment), set_contentItems = js.Any.fromFunction1(set_contentItems), set_contentText = js.Any.fromFunction1(set_contentText), set_definitionData = js.Any.fromFunction1(set_definitionData), set_securityUris = js.Any.fromFunction1(set_securityUris), set_source = js.Any.fromFunction1(set_source), set_updateStatusText = js.Any.fromFunction1(set_updateStatusText), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialPostCreationData]
  }
  
  extension [Self <: SocialPostCreationData](x: Self) {
    
    inline def setGet_attachment(value: CallbackTo[SocialAttachment]): Self = StObject.set(x, "get_attachment", value.toJsFn)
    
    inline def setGet_contentItems(value: CallbackTo[js.Array[SocialDataItem]]): Self = StObject.set(x, "get_contentItems", value.toJsFn)
    
    inline def setGet_contentText(value: CallbackTo[String]): Self = StObject.set(x, "get_contentText", value.toJsFn)
    
    inline def setGet_definitionData(value: CallbackTo[SocialPostDefinitionData]): Self = StObject.set(x, "get_definitionData", value.toJsFn)
    
    inline def setGet_securityUris(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_securityUris", value.toJsFn)
    
    inline def setGet_source(value: CallbackTo[SocialLink]): Self = StObject.set(x, "get_source", value.toJsFn)
    
    inline def setGet_updateStatusText(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_updateStatusText", value.toJsFn)
    
    inline def setSet_attachment(value: SocialAttachment => SocialAttachment): Self = StObject.set(x, "set_attachment", js.Any.fromFunction1(value))
    
    inline def setSet_contentItems(value: js.Array[SocialDataItem] => js.Array[SocialDataItem]): Self = StObject.set(x, "set_contentItems", js.Any.fromFunction1(value))
    
    inline def setSet_contentText(value: String => String): Self = StObject.set(x, "set_contentText", js.Any.fromFunction1(value))
    
    inline def setSet_definitionData(value: SocialPostDefinitionData => SocialPostDefinitionData): Self = StObject.set(x, "set_definitionData", js.Any.fromFunction1(value))
    
    inline def setSet_securityUris(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "set_securityUris", js.Any.fromFunction1(value))
    
    inline def setSet_source(value: SocialLink => SocialLink): Self = StObject.set(x, "set_source", js.Any.fromFunction1(value))
    
    inline def setSet_updateStatusText(value: Boolean => Boolean): Self = StObject.set(x, "set_updateStatusText", js.Any.fromFunction1(value))
  }
}
