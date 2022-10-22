package typingsJapgolly.extjs.Ext.dd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStatusProxy
  extends StObject
     with IComponent {
  
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the ghost element
    * @returns Ext.Element el
    */
  var getGhost: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Causes the proxy to return to its position of origin via an animation
    * @param xy Number[] The XY position of the element ([x, y])
    * @param callback Function The function to call after the repair is complete.
    * @param scope Object The scope (this reference) in which the callback function is executed. Defaults to the browser window.
    */
  var repair: js.UndefOr[
    js.Function3[
      /* xy */ js.UndefOr[Array], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Resets the status indicator to the default dropNotAllowed value
    * @param clearGhost Boolean True to also remove all content from the ghost, false to preserve it
    */
  var reset: js.UndefOr[js.Function1[/* clearGhost */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Updates the proxy s visual element to indicate the status of whether or not drop is allowed over the current target e
    * @param cssClass String The css class for the new drop status indicator image
    */
  var setStatus: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Stops the repair animation if it s currently running */
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Force the Layer to sync its shadow and shim positions to the element */
  var sync: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Updates the contents of the ghost element
    * @param html String/HTMLElement The html that will replace the current innerHTML of the ghost element, or a DOM node to append as the child of the ghost element (in which case the innerHTML will be cleared first).
    */
  @JSName("update")
  var update_IStatusProxy: js.UndefOr[js.Function1[/* html */ js.UndefOr[Any], Unit]] = js.undefined
}
object IStatusProxy {
  
  inline def apply(): IStatusProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatusProxy]
  }
  
  extension [Self <: IStatusProxy](x: Self) {
    
    inline def setDropAllowed(value: String): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
    
    inline def setDropAllowedUndefined: Self = StObject.set(x, "dropAllowed", js.undefined)
    
    inline def setDropNotAllowed(value: String): Self = StObject.set(x, "dropNotAllowed", value.asInstanceOf[js.Any])
    
    inline def setDropNotAllowedUndefined: Self = StObject.set(x, "dropNotAllowed", js.undefined)
    
    inline def setGetGhost(value: CallbackTo[IElement]): Self = StObject.set(x, "getGhost", value.toJsFn)
    
    inline def setGetGhostUndefined: Self = StObject.set(x, "getGhost", js.undefined)
    
    inline def setRepair(
      value: (/* xy */ js.UndefOr[Array], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "repair", js.Any.fromFunction3((t0: /* xy */ js.UndefOr[Array], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRepairUndefined: Self = StObject.set(x, "repair", js.undefined)
    
    inline def setReset(value: /* clearGhost */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction1((t0: /* clearGhost */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetStatus(value: /* cssClass */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setStatus", js.Any.fromFunction1((t0: /* cssClass */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetStatusUndefined: Self = StObject.set(x, "setStatus", js.undefined)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setSync(value: Callback): Self = StObject.set(x, "sync", value.toJsFn)
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setUpdate(value: /* html */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* html */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
