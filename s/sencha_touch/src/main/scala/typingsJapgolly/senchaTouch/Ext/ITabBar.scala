package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITabBar
  extends StObject
     with IToolbar {
  
  /** [Config Option] (Number/String/Ext.Component) */
  var activeTab: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the value of activeTab
    * @returns Number/String/Ext.Component
    */
  var getActiveTab: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Sets the value of activeTab
    * @param activeTab Number/String/Ext.Component The new value.
    */
  var setActiveTab: js.UndefOr[js.Function1[/* activeTab */ js.UndefOr[Any], Unit]] = js.undefined
}
object ITabBar {
  
  inline def apply(): ITabBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabBar]
  }
  
  extension [Self <: ITabBar](x: Self) {
    
    inline def setActiveTab(value: Any): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
    
    inline def setGetActiveTab(value: CallbackTo[Any]): Self = StObject.set(x, "getActiveTab", value.toJsFn)
    
    inline def setGetActiveTabUndefined: Self = StObject.set(x, "getActiveTab", js.undefined)
    
    inline def setSetActiveTab(value: /* activeTab */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setActiveTab", js.Any.fromFunction1((t0: /* activeTab */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetActiveTabUndefined: Self = StObject.set(x, "setActiveTab", js.undefined)
  }
}
