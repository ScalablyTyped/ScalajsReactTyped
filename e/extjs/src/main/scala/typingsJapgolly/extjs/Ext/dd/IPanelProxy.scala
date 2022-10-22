package typingsJapgolly.extjs.Ext.dd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.panel.IPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanelProxy
  extends StObject
     with IBase {
  
  /** [Method] Gets the proxy s element
    * @returns Ext.Element The proxy's element
    */
  var getEl: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Gets the proxy s ghost Panel
    * @returns Ext.panel.Panel The proxy's ghost Panel
    */
  var getGhost: js.UndefOr[js.Function0[IPanel]] = js.undefined
  
  /** [Method] Gets the proxy element
    * @returns Ext.Element The proxy's element
    */
  var getProxy: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Hides the proxy */
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var insertProxy: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var moveOnDrag: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Moves the proxy to a different position in the DOM
    * @param parentNode HTMLElement The proxy's parent DOM node
    * @param before HTMLElement The sibling node before which the proxy should be inserted. Defaults to the parent's last child if not specified.
    */
  var moveProxy: js.UndefOr[
    js.Function2[/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement], Unit]
  ] = js.undefined
  
  /** [Property] (Ext.panel.Panel) */
  var panel: js.UndefOr[IPanel] = js.undefined
  
  /** [Method] Shows the proxy */
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IPanelProxy {
  
  inline def apply(): IPanelProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanelProxy]
  }
  
  extension [Self <: IPanelProxy](x: Self) {
    
    inline def setGetEl(value: CallbackTo[IElement]): Self = StObject.set(x, "getEl", value.toJsFn)
    
    inline def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    inline def setGetGhost(value: CallbackTo[IPanel]): Self = StObject.set(x, "getGhost", value.toJsFn)
    
    inline def setGetGhostUndefined: Self = StObject.set(x, "getGhost", js.undefined)
    
    inline def setGetProxy(value: CallbackTo[IElement]): Self = StObject.set(x, "getProxy", value.toJsFn)
    
    inline def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setInsertProxy(value: Boolean): Self = StObject.set(x, "insertProxy", value.asInstanceOf[js.Any])
    
    inline def setInsertProxyUndefined: Self = StObject.set(x, "insertProxy", js.undefined)
    
    inline def setMoveOnDrag(value: Boolean): Self = StObject.set(x, "moveOnDrag", value.asInstanceOf[js.Any])
    
    inline def setMoveOnDragUndefined: Self = StObject.set(x, "moveOnDrag", js.undefined)
    
    inline def setMoveProxy(
      value: (/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement]) => Callback
    ): Self = StObject.set(x, "moveProxy", js.Any.fromFunction2((t0: /* parentNode */ js.UndefOr[HTMLElement], t1: /* before */ js.UndefOr[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def setMoveProxyUndefined: Self = StObject.set(x, "moveProxy", js.undefined)
    
    inline def setPanel(value: IPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
