package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the user actions that are allowed for the attachment object. */
trait SocialAttachmentAction
  extends StObject
     with ClientValueObject {
  
  /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
  def get_actionKind(): SocialAttachmentActionKind
  
  /** Specifies the URI associated with the action. */
  def get_actionUri(): String
  
  /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
  def set_actionKind(value: SocialAttachmentActionKind): SocialAttachmentActionKind
  
  /** Specifies the URI associated with the action. */
  def set_actionUri(value: String): String
}
object SocialAttachmentAction {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_actionKind: CallbackTo[SocialAttachmentActionKind],
    get_actionUri: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_actionKind: SocialAttachmentActionKind => SocialAttachmentActionKind,
    set_actionUri: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialAttachmentAction = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_actionKind = get_actionKind.toJsFn, get_actionUri = get_actionUri.toJsFn, get_typeId = get_typeId.toJsFn, set_actionKind = js.Any.fromFunction1(set_actionKind), set_actionUri = js.Any.fromFunction1(set_actionUri), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialAttachmentAction]
  }
  
  extension [Self <: SocialAttachmentAction](x: Self) {
    
    inline def setGet_actionKind(value: CallbackTo[SocialAttachmentActionKind]): Self = StObject.set(x, "get_actionKind", value.toJsFn)
    
    inline def setGet_actionUri(value: CallbackTo[String]): Self = StObject.set(x, "get_actionUri", value.toJsFn)
    
    inline def setSet_actionKind(value: SocialAttachmentActionKind => SocialAttachmentActionKind): Self = StObject.set(x, "set_actionKind", js.Any.fromFunction1(value))
    
    inline def setSet_actionUri(value: String => String): Self = StObject.set(x, "set_actionUri", js.Any.fromFunction1(value))
  }
}
