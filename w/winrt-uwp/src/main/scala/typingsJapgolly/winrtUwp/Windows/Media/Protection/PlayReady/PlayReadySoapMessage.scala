package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a SOAP message used in manual challenge requests. */
trait PlayReadySoapMessage extends StObject {
  
  /**
    * Retrieves the contents of the SOAP message.
    * @return The contents of the SOAP message.
    */
  def getMessageBody(): js.Array[Double]
  
  /** Gets a collection of the SOAP headers applied to the current SOAP request or SOAP response. */
  var messageHeaders: IPropertySet
  
  /** Gets the base URL of the XML Web service. */
  var uri: Uri
}
object PlayReadySoapMessage {
  
  inline def apply(getMessageBody: CallbackTo[js.Array[Double]], messageHeaders: IPropertySet, uri: Uri): PlayReadySoapMessage = {
    val __obj = js.Dynamic.literal(getMessageBody = getMessageBody.toJsFn, messageHeaders = messageHeaders.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadySoapMessage]
  }
  
  extension [Self <: PlayReadySoapMessage](x: Self) {
    
    inline def setGetMessageBody(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getMessageBody", value.toJsFn)
    
    inline def setMessageHeaders(value: IPropertySet): Self = StObject.set(x, "messageHeaders", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
