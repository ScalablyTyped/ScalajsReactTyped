package typingsJapgolly.sharepoint.SP.UserProfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returns information about a request to follow an item. */
trait FollowResult
  extends StObject
     with ClientValueObject {
  
  /** Contains the item being followed. */
  def get_item(): FollowedItem
  
  /** Provides information about the attempt to follow an item. */
  def get_resultType(): FollowResultType
}
object FollowResult {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_item: CallbackTo[FollowedItem],
    get_resultType: CallbackTo[FollowResultType],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): FollowResult = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_item = get_item.toJsFn, get_resultType = get_resultType.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[FollowResult]
  }
  
  extension [Self <: FollowResult](x: Self) {
    
    inline def setGet_item(value: CallbackTo[FollowedItem]): Self = StObject.set(x, "get_item", value.toJsFn)
    
    inline def setGet_resultType(value: CallbackTo[FollowResultType]): Self = StObject.set(x, "get_resultType", value.toJsFn)
  }
}
