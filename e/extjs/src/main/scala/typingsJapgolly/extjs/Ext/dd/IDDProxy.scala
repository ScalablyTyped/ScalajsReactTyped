package typingsJapgolly.extjs.Ext.dd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDDProxy
  extends StObject
     with IDD {
  
  /** [Property] (Boolean) */
  var centerFrame: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Creates the proxy element if it does not yet exist */
  var createFrame: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (String) */
  var dragElId: js.UndefOr[String] = js.undefined
  
  /** [Method] overrides Ext dd DragDrop By default we try to move the element to the last location of the frame
    * @param e Object
    */
  @JSName("endDrag")
  var endDrag_IDDProxy: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Initialization for the drag frame element  */
  var initFrame: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Boolean) */
  var resizeFrame: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] toString method
    * @returns String string representation of the dd obj
    */
  @JSName("toString")
  var toString_FIDDProxy: js.UndefOr[js.Function0[String]] = js.undefined
}
object IDDProxy {
  
  inline def apply(): IDDProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDDProxy]
  }
  
  extension [Self <: IDDProxy](x: Self) {
    
    inline def setCenterFrame(value: Boolean): Self = StObject.set(x, "centerFrame", value.asInstanceOf[js.Any])
    
    inline def setCenterFrameUndefined: Self = StObject.set(x, "centerFrame", js.undefined)
    
    inline def setCreateFrame(value: Callback): Self = StObject.set(x, "createFrame", value.toJsFn)
    
    inline def setCreateFrameUndefined: Self = StObject.set(x, "createFrame", js.undefined)
    
    inline def setDragElId(value: String): Self = StObject.set(x, "dragElId", value.asInstanceOf[js.Any])
    
    inline def setDragElIdUndefined: Self = StObject.set(x, "dragElId", js.undefined)
    
    inline def setEndDrag(value: /* e */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "endDrag", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setEndDragUndefined: Self = StObject.set(x, "endDrag", js.undefined)
    
    inline def setInitFrame(value: Callback): Self = StObject.set(x, "initFrame", value.toJsFn)
    
    inline def setInitFrameUndefined: Self = StObject.set(x, "initFrame", js.undefined)
    
    inline def setResizeFrame(value: Boolean): Self = StObject.set(x, "resizeFrame", value.asInstanceOf[js.Any])
    
    inline def setResizeFrameUndefined: Self = StObject.set(x, "resizeFrame", js.undefined)
    
    inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
  }
}
