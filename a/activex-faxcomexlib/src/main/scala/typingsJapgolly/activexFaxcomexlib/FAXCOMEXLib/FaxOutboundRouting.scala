package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRouting Class */
trait FaxOutboundRouting extends StObject {
  
  /* private */ @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  var FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting
  
  /** Configuration of the outbound routing groups */
  def GetGroups(): FaxOutboundRoutingGroups
  
  /** Configuration of the outbound routing rules */
  def GetRules(): FaxOutboundRoutingRules
}
object FaxOutboundRouting {
  
  inline def apply(
    FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting,
    GetGroups: CallbackTo[FaxOutboundRoutingGroups],
    GetRules: CallbackTo[FaxOutboundRoutingRules]
  ): FaxOutboundRouting = {
    val __obj = js.Dynamic.literal(GetGroups = GetGroups.toJsFn, GetRules = GetRules.toJsFn)
    __obj.updateDynamic("FAXCOMEXLib.FaxOutboundRouting_typekey")(FAXCOMEXLibDotFaxOutboundRouting_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutboundRouting]
  }
  
  extension [Self <: FaxOutboundRouting](x: Self) {
    
    inline def setFAXCOMEXLibDotFaxOutboundRouting_typekey(value: FaxOutboundRouting): Self = StObject.set(x, "FAXCOMEXLib.FaxOutboundRouting_typekey", value.asInstanceOf[js.Any])
    
    inline def setGetGroups(value: CallbackTo[FaxOutboundRoutingGroups]): Self = StObject.set(x, "GetGroups", value.toJsFn)
    
    inline def setGetRules(value: CallbackTo[FaxOutboundRoutingRules]): Self = StObject.set(x, "GetRules", value.toJsFn)
  }
}
