package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxEventLogging Class */
trait FaxEventLogging extends StObject {
  
  /* private */ @JSName("FAXCOMEXLib.FaxEventLogging_typekey")
  var FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging
  
  /** Detail level of event logs for general (other) events */
  var GeneralEventsLevel: FAX_LOG_LEVEL_ENUM
  
  /** Detail level of event logs for inbound fax events */
  var InboundEventsLevel: FAX_LOG_LEVEL_ENUM
  
  /** Detail level of event logs for initialization events */
  var InitEventsLevel: FAX_LOG_LEVEL_ENUM
  
  /** Detail level of event logs for outbound fax events */
  var OutboundEventsLevel: FAX_LOG_LEVEL_ENUM
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Save the object */
  def Save(): Unit
}
object FaxEventLogging {
  
  inline def apply(
    FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging,
    GeneralEventsLevel: FAX_LOG_LEVEL_ENUM,
    InboundEventsLevel: FAX_LOG_LEVEL_ENUM,
    InitEventsLevel: FAX_LOG_LEVEL_ENUM,
    OutboundEventsLevel: FAX_LOG_LEVEL_ENUM,
    Refresh: Callback,
    Save: Callback
  ): FaxEventLogging = {
    val __obj = js.Dynamic.literal(GeneralEventsLevel = GeneralEventsLevel.asInstanceOf[js.Any], InboundEventsLevel = InboundEventsLevel.asInstanceOf[js.Any], InitEventsLevel = InitEventsLevel.asInstanceOf[js.Any], OutboundEventsLevel = OutboundEventsLevel.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, Save = Save.toJsFn)
    __obj.updateDynamic("FAXCOMEXLib.FaxEventLogging_typekey")(FAXCOMEXLibDotFaxEventLogging_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxEventLogging]
  }
  
  extension [Self <: FaxEventLogging](x: Self) {
    
    inline def setFAXCOMEXLibDotFaxEventLogging_typekey(value: FaxEventLogging): Self = StObject.set(x, "FAXCOMEXLib.FaxEventLogging_typekey", value.asInstanceOf[js.Any])
    
    inline def setGeneralEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "GeneralEventsLevel", value.asInstanceOf[js.Any])
    
    inline def setInboundEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "InboundEventsLevel", value.asInstanceOf[js.Any])
    
    inline def setInitEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "InitEventsLevel", value.asInstanceOf[js.Any])
    
    inline def setOutboundEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "OutboundEventsLevel", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
  }
}
