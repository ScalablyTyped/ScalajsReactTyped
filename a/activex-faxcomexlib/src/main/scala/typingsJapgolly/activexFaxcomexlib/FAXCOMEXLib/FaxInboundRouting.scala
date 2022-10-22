package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxInboundRouting Class */
trait FaxInboundRouting extends StObject {
  
  /* private */ @JSName("FAXCOMEXLib.FaxInboundRouting_typekey")
  var FAXCOMEXLibDotFaxInboundRouting_typekey: FaxInboundRouting
  
  /** Registered inbound routing extensions collection */
  def GetExtensions(): FaxInboundRoutingExtensions
  
  /** Ordered collection of all the registered methods */
  def GetMethods(): FaxInboundRoutingMethods
}
object FaxInboundRouting {
  
  inline def apply(
    FAXCOMEXLibDotFaxInboundRouting_typekey: FaxInboundRouting,
    GetExtensions: CallbackTo[FaxInboundRoutingExtensions],
    GetMethods: CallbackTo[FaxInboundRoutingMethods]
  ): FaxInboundRouting = {
    val __obj = js.Dynamic.literal(GetExtensions = GetExtensions.toJsFn, GetMethods = GetMethods.toJsFn)
    __obj.updateDynamic("FAXCOMEXLib.FaxInboundRouting_typekey")(FAXCOMEXLibDotFaxInboundRouting_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxInboundRouting]
  }
  
  extension [Self <: FaxInboundRouting](x: Self) {
    
    inline def setFAXCOMEXLibDotFaxInboundRouting_typekey(value: FaxInboundRouting): Self = StObject.set(x, "FAXCOMEXLib.FaxInboundRouting_typekey", value.asInstanceOf[js.Any])
    
    inline def setGetExtensions(value: CallbackTo[FaxInboundRoutingExtensions]): Self = StObject.set(x, "GetExtensions", value.toJsFn)
    
    inline def setGetMethods(value: CallbackTo[FaxInboundRoutingMethods]): Self = StObject.set(x, "GetMethods", value.toJsFn)
  }
}
