package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebControls {
  
  @js.native
  sealed trait MessageLevel extends StObject
  @JSGlobal("Microsoft.SharePoint.Client.Search.WebControls.MessageLevel")
  @js.native
  object MessageLevel extends StObject {
    
    @js.native
    sealed trait error
      extends StObject
         with MessageLevel
    
    @js.native
    sealed trait information
      extends StObject
         with MessageLevel
    
    @js.native
    sealed trait warning
      extends StObject
         with MessageLevel
  }
  
  trait ControlMessage
    extends StObject
       with ClientValueObject {
    
    def get_code(): Double
    
    def get_correlationID(): String
    
    def get_encodeDetails(): Boolean
    
    def get_header(): String
    
    def get_level(): MessageLevel
    
    def get_messageDetails(): String
    
    def get_messageDetailsForViewers(): String
    
    def get_serverTypeId(): String
    
    def get_showForViewerUsers(): Boolean
    
    def get_showInEditModeOnly(): Boolean
    
    def get_stackTrace(): String
    
    def get_type(): String
  }
  object ControlMessage {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Callback,
      get_code: CallbackTo[Double],
      get_correlationID: CallbackTo[String],
      get_encodeDetails: CallbackTo[Boolean],
      get_header: CallbackTo[String],
      get_level: CallbackTo[MessageLevel],
      get_messageDetails: CallbackTo[String],
      get_messageDetailsForViewers: CallbackTo[String],
      get_serverTypeId: CallbackTo[String],
      get_showForViewerUsers: CallbackTo[Boolean],
      get_showInEditModeOnly: CallbackTo[Boolean],
      get_stackTrace: CallbackTo[String],
      get_type: CallbackTo[String],
      get_typeId: CallbackTo[String],
      writeToXml: (XmlWriter, SerializationContext) => Callback
    ): ControlMessage = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_code = get_code.toJsFn, get_correlationID = get_correlationID.toJsFn, get_encodeDetails = get_encodeDetails.toJsFn, get_header = get_header.toJsFn, get_level = get_level.toJsFn, get_messageDetails = get_messageDetails.toJsFn, get_messageDetailsForViewers = get_messageDetailsForViewers.toJsFn, get_serverTypeId = get_serverTypeId.toJsFn, get_showForViewerUsers = get_showForViewerUsers.toJsFn, get_showInEditModeOnly = get_showInEditModeOnly.toJsFn, get_stackTrace = get_stackTrace.toJsFn, get_type = get_type.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
      __obj.asInstanceOf[ControlMessage]
    }
    
    extension [Self <: ControlMessage](x: Self) {
      
      inline def setGet_code(value: CallbackTo[Double]): Self = StObject.set(x, "get_code", value.toJsFn)
      
      inline def setGet_correlationID(value: CallbackTo[String]): Self = StObject.set(x, "get_correlationID", value.toJsFn)
      
      inline def setGet_encodeDetails(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_encodeDetails", value.toJsFn)
      
      inline def setGet_header(value: CallbackTo[String]): Self = StObject.set(x, "get_header", value.toJsFn)
      
      inline def setGet_level(value: CallbackTo[MessageLevel]): Self = StObject.set(x, "get_level", value.toJsFn)
      
      inline def setGet_messageDetails(value: CallbackTo[String]): Self = StObject.set(x, "get_messageDetails", value.toJsFn)
      
      inline def setGet_messageDetailsForViewers(value: CallbackTo[String]): Self = StObject.set(x, "get_messageDetailsForViewers", value.toJsFn)
      
      inline def setGet_serverTypeId(value: CallbackTo[String]): Self = StObject.set(x, "get_serverTypeId", value.toJsFn)
      
      inline def setGet_showForViewerUsers(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showForViewerUsers", value.toJsFn)
      
      inline def setGet_showInEditModeOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showInEditModeOnly", value.toJsFn)
      
      inline def setGet_stackTrace(value: CallbackTo[String]): Self = StObject.set(x, "get_stackTrace", value.toJsFn)
      
      inline def setGet_type(value: CallbackTo[String]): Self = StObject.set(x, "get_type", value.toJsFn)
    }
  }
}
