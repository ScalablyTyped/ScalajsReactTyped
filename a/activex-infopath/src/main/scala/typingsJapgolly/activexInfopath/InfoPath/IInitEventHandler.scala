package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInitEventHandler extends StObject {
  
  /* private */ @JSName("InfoPath.IInitEventHandler_typekey")
  var InfoPathDotIInitEventHandler_typekey: IInitEventHandler
  
  def InitEventHandler(punkSender: Any, pDocument: _XDocument, pROMode: XdReadOnlyViewMode): Unit
}
object IInitEventHandler {
  
  inline def apply(
    InfoPathDotIInitEventHandler_typekey: IInitEventHandler,
    InitEventHandler: (Any, _XDocument, XdReadOnlyViewMode) => Callback
  ): IInitEventHandler = {
    val __obj = js.Dynamic.literal(InitEventHandler = js.Any.fromFunction3((t0: Any, t1: _XDocument, t2: XdReadOnlyViewMode) => (InitEventHandler(t0, t1, t2)).runNow()))
    __obj.updateDynamic("InfoPath.IInitEventHandler_typekey")(InfoPathDotIInitEventHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInitEventHandler]
  }
  
  extension [Self <: IInitEventHandler](x: Self) {
    
    inline def setInfoPathDotIInitEventHandler_typekey(value: IInitEventHandler): Self = StObject.set(x, "InfoPath.IInitEventHandler_typekey", value.asInstanceOf[js.Any])
    
    inline def setInitEventHandler(value: (Any, _XDocument, XdReadOnlyViewMode) => Callback): Self = StObject.set(x, "InitEventHandler", js.Any.fromFunction3((t0: Any, t1: _XDocument, t2: XdReadOnlyViewMode) => (value(t0, t1, t2)).runNow()))
  }
}
