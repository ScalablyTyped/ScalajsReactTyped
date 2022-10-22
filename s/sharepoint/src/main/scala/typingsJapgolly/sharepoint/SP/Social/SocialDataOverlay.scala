package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an overlay.
  An overlay is a substring in a post that represents a user, document, site, tag, or link.
  The SocialPost class contains an array of SocialDataOverlay objects.
  Each of the SocialDataOverlay objects specifies a link or one or more actors. */
trait SocialDataOverlay
  extends StObject
     with ClientValueObject {
  
  /** Specifies one or more actors as an array of integers where each integer specifies an index into the SocialThreadActors array.
    This property is only available if the get_overlayType() has a value of SocialDataOverlayType.actors. */
  def get_actorIndexes(): js.Array[Double]
  
  /** The Index property specifies the starting position of the overlay in the SocialPostText string  */
  def get_index(): Double
  
  /** The Length property specifies the number of characters in the overlay.  */
  def get_length(): Double
  
  /** The LinkUri property specifies the URI of the link.
    This property is only available if the get_overlayType() has a value of SocialDataOverlayType.link.  */
  def get_linkUri(): String
  
  /** Specifies whether the overlay is a link or one or more actors. */
  def get_overlayType(): SocialDataOverlayType
}
object SocialDataOverlay {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_actorIndexes: CallbackTo[js.Array[Double]],
    get_index: CallbackTo[Double],
    get_length: CallbackTo[Double],
    get_linkUri: CallbackTo[String],
    get_overlayType: CallbackTo[SocialDataOverlayType],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialDataOverlay = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_actorIndexes = get_actorIndexes.toJsFn, get_index = get_index.toJsFn, get_length = get_length.toJsFn, get_linkUri = get_linkUri.toJsFn, get_overlayType = get_overlayType.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialDataOverlay]
  }
  
  extension [Self <: SocialDataOverlay](x: Self) {
    
    inline def setGet_actorIndexes(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "get_actorIndexes", value.toJsFn)
    
    inline def setGet_index(value: CallbackTo[Double]): Self = StObject.set(x, "get_index", value.toJsFn)
    
    inline def setGet_length(value: CallbackTo[Double]): Self = StObject.set(x, "get_length", value.toJsFn)
    
    inline def setGet_linkUri(value: CallbackTo[String]): Self = StObject.set(x, "get_linkUri", value.toJsFn)
    
    inline def setGet_overlayType(value: CallbackTo[SocialDataOverlayType]): Self = StObject.set(x, "get_overlayType", value.toJsFn)
  }
}
