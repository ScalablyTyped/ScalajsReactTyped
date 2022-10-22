package typingsJapgolly.activexMsxml2.MSXML2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXDTDHandler interface */
trait IVBSAXDTDHandler extends StObject {
  
  /* private */ @JSName("MSXML2.IVBSAXDTDHandler_typekey")
  var MSXML2DotIVBSAXDTDHandler_typekey: IVBSAXDTDHandler
  
  /** Receive notification of a notation declaration event. */
  def notationDecl(strName: String, strPublicId: String, strSystemId: String): Unit
  
  /** Receive notification of an unparsed entity declaration event. */
  def unparsedEntityDecl(strName: String, strPublicId: String, strSystemId: String, strNotationName: String): Unit
}
object IVBSAXDTDHandler {
  
  inline def apply(
    MSXML2DotIVBSAXDTDHandler_typekey: IVBSAXDTDHandler,
    notationDecl: (String, String, String) => Callback,
    unparsedEntityDecl: (String, String, String, String) => Callback
  ): IVBSAXDTDHandler = {
    val __obj = js.Dynamic.literal(notationDecl = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (notationDecl(t0, t1, t2)).runNow()), unparsedEntityDecl = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (unparsedEntityDecl(t0, t1, t2, t3)).runNow()))
    __obj.updateDynamic("MSXML2.IVBSAXDTDHandler_typekey")(MSXML2DotIVBSAXDTDHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXDTDHandler]
  }
  
  extension [Self <: IVBSAXDTDHandler](x: Self) {
    
    inline def setMSXML2DotIVBSAXDTDHandler_typekey(value: IVBSAXDTDHandler): Self = StObject.set(x, "MSXML2.IVBSAXDTDHandler_typekey", value.asInstanceOf[js.Any])
    
    inline def setNotationDecl(value: (String, String, String) => Callback): Self = StObject.set(x, "notationDecl", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setUnparsedEntityDecl(value: (String, String, String, String) => Callback): Self = StObject.set(x, "unparsedEntityDecl", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
  }
}
