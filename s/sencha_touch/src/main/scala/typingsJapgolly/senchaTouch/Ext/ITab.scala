package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITab
  extends StObject
     with IButton {
  
  /** [Config Option] (Boolean) */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns the value of active
    * @returns Boolean
    */
  var getActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of activeCls
    * @returns String
    */
  var getActiveCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Sets the value of active
    * @param active Boolean The new value.
    */
  var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of activeCls
    * @param activeCls String The new value.
    */
  var setActiveCls: js.UndefOr[js.Function1[/* activeCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
}
object ITab {
  
  inline def apply(): ITab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITab]
  }
  
  extension [Self <: ITab](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveCls(value: java.lang.String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
    
    inline def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setGetActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "getActive", value.toJsFn)
    
    inline def setGetActiveCls(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getActiveCls", value.toJsFn)
    
    inline def setGetActiveClsUndefined: Self = StObject.set(x, "getActiveCls", js.undefined)
    
    inline def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
    
    inline def setGetTitle(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    inline def setSetActive(value: /* active */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setActive", js.Any.fromFunction1((t0: /* active */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetActiveCls(value: /* activeCls */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setActiveCls", js.Any.fromFunction1((t0: /* activeCls */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetActiveClsUndefined: Self = StObject.set(x, "setActiveCls", js.undefined)
    
    inline def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
