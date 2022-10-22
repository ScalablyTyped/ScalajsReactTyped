package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a set of users, documents, sites, and tags by an index into the SocialThreadActors array  */
trait SocialPostActorInfo
  extends StObject
     with ClientValueObject {
  
  def get_includesCurrentUser(): Boolean
  
  /** Specifies an array of indexes into the SocialThreadActors array.
    The server can choose to return a limited set of actors. For example, the server can choose to return a subset of the users that like a post. */
  def get_indexes(): js.Array[Double]
  
  def get_totalCount(): Double
}
object SocialPostActorInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_includesCurrentUser: CallbackTo[Boolean],
    get_indexes: CallbackTo[js.Array[Double]],
    get_totalCount: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialPostActorInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_includesCurrentUser = get_includesCurrentUser.toJsFn, get_indexes = get_indexes.toJsFn, get_totalCount = get_totalCount.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialPostActorInfo]
  }
  
  extension [Self <: SocialPostActorInfo](x: Self) {
    
    inline def setGet_includesCurrentUser(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_includesCurrentUser", value.toJsFn)
    
    inline def setGet_indexes(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "get_indexes", value.toJsFn)
    
    inline def setGet_totalCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_totalCount", value.toJsFn)
  }
}
