package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbstractPlugin
  extends StObject
     with IBase {
  
  /** [Method] Creates clone of the plugin
    * @param overrideCfg Object Additional config for the derived plugin.
    */
  var clonePlugin: js.UndefOr[js.Function1[/* overrideCfg */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] The destroy method is invoked by the owning Component at the time the Component is being destroyed  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] The base implementation just sets the plugin s disabled flag to true Plugin subclasses which need more complex proce  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] The base implementation just sets the plugin s disabled flag to false Plugin subclasses which need more complex proc  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the component to which this plugin is attached
    * @returns Ext.Component Owner component.
    */
  var getCmp: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
    * @param client Ext.Component The client Component which owns this plugin.
    */
  var init: js.UndefOr[js.Function1[/* client */ js.UndefOr[IComponent], Unit]] = js.undefined
  
  /** [Property] (Boolean) */
  var isPlugin: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var pluginId: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the component to which this plugin is attached
    * @param cmp Ext.Component Owner component.
    */
  var setCmp: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[IComponent], Unit]] = js.undefined
}
object IAbstractPlugin {
  
  inline def apply(): IAbstractPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractPlugin]
  }
  
  extension [Self <: IAbstractPlugin](x: Self) {
    
    inline def setClonePlugin(value: /* overrideCfg */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "clonePlugin", js.Any.fromFunction1((t0: /* overrideCfg */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setClonePluginUndefined: Self = StObject.set(x, "clonePlugin", js.undefined)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setGetCmp(value: CallbackTo[IComponent]): Self = StObject.set(x, "getCmp", value.toJsFn)
    
    inline def setGetCmpUndefined: Self = StObject.set(x, "getCmp", js.undefined)
    
    inline def setInit(value: /* client */ js.UndefOr[IComponent] => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* client */ js.UndefOr[IComponent]) => value(t0).runNow()))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setIsPlugin(value: Boolean): Self = StObject.set(x, "isPlugin", value.asInstanceOf[js.Any])
    
    inline def setIsPluginUndefined: Self = StObject.set(x, "isPlugin", js.undefined)
    
    inline def setPluginId(value: java.lang.String): Self = StObject.set(x, "pluginId", value.asInstanceOf[js.Any])
    
    inline def setPluginIdUndefined: Self = StObject.set(x, "pluginId", js.undefined)
    
    inline def setSetCmp(value: /* cmp */ js.UndefOr[IComponent] => Callback): Self = StObject.set(x, "setCmp", js.Any.fromFunction1((t0: /* cmp */ js.UndefOr[IComponent]) => value(t0).runNow()))
    
    inline def setSetCmpUndefined: Self = StObject.set(x, "setCmp", js.undefined)
  }
}
