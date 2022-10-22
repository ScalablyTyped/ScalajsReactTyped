package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies information about errors that the server has encountered. */
trait SocialExceptionDetails
  extends StObject
     with ClientValueObject {
  
  def get_internalErrorCode(): Double
  
  def get_internalMessage(): String
  
  def get_internalStackTrace(): String
  
  /** Specifies a type name associated with the internal error if a type name is available. */
  def get_internalTypeName(): String
  
  def get_status(): SocialStatusCode
}
object SocialExceptionDetails {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_internalErrorCode: CallbackTo[Double],
    get_internalMessage: CallbackTo[String],
    get_internalStackTrace: CallbackTo[String],
    get_internalTypeName: CallbackTo[String],
    get_status: CallbackTo[SocialStatusCode],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialExceptionDetails = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_internalErrorCode = get_internalErrorCode.toJsFn, get_internalMessage = get_internalMessage.toJsFn, get_internalStackTrace = get_internalStackTrace.toJsFn, get_internalTypeName = get_internalTypeName.toJsFn, get_status = get_status.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialExceptionDetails]
  }
  
  extension [Self <: SocialExceptionDetails](x: Self) {
    
    inline def setGet_internalErrorCode(value: CallbackTo[Double]): Self = StObject.set(x, "get_internalErrorCode", value.toJsFn)
    
    inline def setGet_internalMessage(value: CallbackTo[String]): Self = StObject.set(x, "get_internalMessage", value.toJsFn)
    
    inline def setGet_internalStackTrace(value: CallbackTo[String]): Self = StObject.set(x, "get_internalStackTrace", value.toJsFn)
    
    inline def setGet_internalTypeName(value: CallbackTo[String]): Self = StObject.set(x, "get_internalTypeName", value.toJsFn)
    
    inline def setGet_status(value: CallbackTo[SocialStatusCode]): Self = StObject.set(x, "get_status", value.toJsFn)
  }
}
