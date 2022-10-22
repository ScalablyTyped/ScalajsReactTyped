package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an image, document preview, or video preview attachment.  */
trait SocialAttachment
  extends StObject
     with ClientValueObject {
  
  /** Specifies the type of object that the attachment contains. */
  def get_attachmentKind(): SocialAttachmentKind
  
  /** Specifies the action to take when the user selects the attachment.
    This property is only present if the AttachmentKind is Video. */
  def get_clickAction(): SocialAttachmentAction
  
  /** Specifies the URI of the attachment content. */
  def get_contentUri(): String
  
  /** Provides a text description of the attachment. */
  def get_description(): String
  
  /** Specifies the height of the attachment or of the attachment preview. */
  def get_height(): Double
  
  /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
  def get_length(): Double
  
  /** Provides the attachment name. */
  def get_name(): String
  
  /** Specifies the URI of the attachment's preview thumbnail.
    This property is only present if the AttachmentKind is Document or Video. */
  def get_previewUri(): String
  
  /** Provides the attachment URI. */
  def get_uri(): String
  
  /** Specifies the width of the attachment or of the attachment preview. */
  def get_width(): Double
  
  /** Specifies the type of object that the attachment contains. */
  def set_attachmentKind(value: SocialAttachmentKind): SocialAttachmentKind
  
  /** Specifies the action to take when the user selects the attachment.
    This property is only present if the AttachmentKind is Video. */
  def set_clickAction(value: SocialAttachmentAction): SocialAttachmentAction
  
  /** Specifies the URI of the attachment content. */
  def set_contentUri(value: String): String
  
  /** Provides a text description of the attachment. */
  def set_description(value: String): String
  
  /** Specifies the height of the attachment or of the attachment preview. */
  def set_height(value: Double): Double
  
  /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
  def set_length(value: Double): Double
  
  /** Provides the attachment name. */
  def set_name(value: String): String
  
  /** Specifies the URI of the attachment's preview thumbnail.
    This property is only present if the AttachmentKind is Document or Video. */
  def set_previewUri(value: String): String
  
  /** Provides the attachment URI. */
  def set_uri(value: String): String
  
  /** Specifies the width of the attachment or of the attachment preview. */
  def set_width(value: Double): Double
}
object SocialAttachment {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_attachmentKind: CallbackTo[SocialAttachmentKind],
    get_clickAction: CallbackTo[SocialAttachmentAction],
    get_contentUri: CallbackTo[String],
    get_description: CallbackTo[String],
    get_height: CallbackTo[Double],
    get_length: CallbackTo[Double],
    get_name: CallbackTo[String],
    get_previewUri: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_uri: CallbackTo[String],
    get_width: CallbackTo[Double],
    set_attachmentKind: SocialAttachmentKind => SocialAttachmentKind,
    set_clickAction: SocialAttachmentAction => SocialAttachmentAction,
    set_contentUri: String => String,
    set_description: String => String,
    set_height: Double => Double,
    set_length: Double => Double,
    set_name: String => String,
    set_previewUri: String => String,
    set_uri: String => String,
    set_width: Double => Double,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialAttachment = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_attachmentKind = get_attachmentKind.toJsFn, get_clickAction = get_clickAction.toJsFn, get_contentUri = get_contentUri.toJsFn, get_description = get_description.toJsFn, get_height = get_height.toJsFn, get_length = get_length.toJsFn, get_name = get_name.toJsFn, get_previewUri = get_previewUri.toJsFn, get_typeId = get_typeId.toJsFn, get_uri = get_uri.toJsFn, get_width = get_width.toJsFn, set_attachmentKind = js.Any.fromFunction1(set_attachmentKind), set_clickAction = js.Any.fromFunction1(set_clickAction), set_contentUri = js.Any.fromFunction1(set_contentUri), set_description = js.Any.fromFunction1(set_description), set_height = js.Any.fromFunction1(set_height), set_length = js.Any.fromFunction1(set_length), set_name = js.Any.fromFunction1(set_name), set_previewUri = js.Any.fromFunction1(set_previewUri), set_uri = js.Any.fromFunction1(set_uri), set_width = js.Any.fromFunction1(set_width), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialAttachment]
  }
  
  extension [Self <: SocialAttachment](x: Self) {
    
    inline def setGet_attachmentKind(value: CallbackTo[SocialAttachmentKind]): Self = StObject.set(x, "get_attachmentKind", value.toJsFn)
    
    inline def setGet_clickAction(value: CallbackTo[SocialAttachmentAction]): Self = StObject.set(x, "get_clickAction", value.toJsFn)
    
    inline def setGet_contentUri(value: CallbackTo[String]): Self = StObject.set(x, "get_contentUri", value.toJsFn)
    
    inline def setGet_description(value: CallbackTo[String]): Self = StObject.set(x, "get_description", value.toJsFn)
    
    inline def setGet_height(value: CallbackTo[Double]): Self = StObject.set(x, "get_height", value.toJsFn)
    
    inline def setGet_length(value: CallbackTo[Double]): Self = StObject.set(x, "get_length", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_previewUri(value: CallbackTo[String]): Self = StObject.set(x, "get_previewUri", value.toJsFn)
    
    inline def setGet_uri(value: CallbackTo[String]): Self = StObject.set(x, "get_uri", value.toJsFn)
    
    inline def setGet_width(value: CallbackTo[Double]): Self = StObject.set(x, "get_width", value.toJsFn)
    
    inline def setSet_attachmentKind(value: SocialAttachmentKind => SocialAttachmentKind): Self = StObject.set(x, "set_attachmentKind", js.Any.fromFunction1(value))
    
    inline def setSet_clickAction(value: SocialAttachmentAction => SocialAttachmentAction): Self = StObject.set(x, "set_clickAction", js.Any.fromFunction1(value))
    
    inline def setSet_contentUri(value: String => String): Self = StObject.set(x, "set_contentUri", js.Any.fromFunction1(value))
    
    inline def setSet_description(value: String => String): Self = StObject.set(x, "set_description", js.Any.fromFunction1(value))
    
    inline def setSet_height(value: Double => Double): Self = StObject.set(x, "set_height", js.Any.fromFunction1(value))
    
    inline def setSet_length(value: Double => Double): Self = StObject.set(x, "set_length", js.Any.fromFunction1(value))
    
    inline def setSet_name(value: String => String): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
    
    inline def setSet_previewUri(value: String => String): Self = StObject.set(x, "set_previewUri", js.Any.fromFunction1(value))
    
    inline def setSet_uri(value: String => String): Self = StObject.set(x, "set_uri", js.Any.fromFunction1(value))
    
    inline def setSet_width(value: Double => Double): Self = StObject.set(x, "set_width", js.Any.fromFunction1(value))
  }
}
