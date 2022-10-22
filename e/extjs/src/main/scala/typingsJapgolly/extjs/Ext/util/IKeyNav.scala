package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyNav
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var defaultEventAction: js.UndefOr[String] = js.undefined
  
  /** [Method] Destroy this KeyNav
    * @param removeEl Boolean Pass true to remove the element associated with this KeyNav.
    */
  var destroy: js.UndefOr[js.Function1[/* removeEl */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Disables this KeyNav  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Enables this KeyNav  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var eventName: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var forceKeyDown: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.util.KeyMap) */
  var keyMap: js.UndefOr[IKeyMap] = js.undefined
  
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[Any] = js.undefined
  
  /** [Method] Convenience function for setting disabled enabled by boolean
    * @param disabled Boolean
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[Any] = js.undefined
}
object IKeyNav {
  
  inline def apply(): IKeyNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeyNav]
  }
  
  extension [Self <: IKeyNav](x: Self) {
    
    inline def setDefaultEventAction(value: String): Self = StObject.set(x, "defaultEventAction", value.asInstanceOf[js.Any])
    
    inline def setDefaultEventActionUndefined: Self = StObject.set(x, "defaultEventAction", js.undefined)
    
    inline def setDestroy(value: /* removeEl */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: /* removeEl */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setForceKeyDown(value: Boolean): Self = StObject.set(x, "forceKeyDown", value.asInstanceOf[js.Any])
    
    inline def setForceKeyDownUndefined: Self = StObject.set(x, "forceKeyDown", js.undefined)
    
    inline def setIgnoreInputFields(value: Boolean): Self = StObject.set(x, "ignoreInputFields", value.asInstanceOf[js.Any])
    
    inline def setIgnoreInputFieldsUndefined: Self = StObject.set(x, "ignoreInputFields", js.undefined)
    
    inline def setKeyMap(value: IKeyMap): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
    
    inline def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
    
    inline def setProcessEvent(value: Any): Self = StObject.set(x, "processEvent", value.asInstanceOf[js.Any])
    
    inline def setProcessEventScope(value: Any): Self = StObject.set(x, "processEventScope", value.asInstanceOf[js.Any])
    
    inline def setProcessEventScopeUndefined: Self = StObject.set(x, "processEventScope", js.undefined)
    
    inline def setProcessEventUndefined: Self = StObject.set(x, "processEvent", js.undefined)
    
    inline def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1((t0: /* disabled */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
