package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToolbar
  extends StObject
     with IContainer {
  
  /** [Method] Returns the value of layout
    * @returns Object/String
    */
  var getLayout: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns an Ext Title component
    * @returns Ext.Title
    */
  var getTitle: js.UndefOr[js.Function0[ITitle]] = js.undefined
  
  /** [Method] Hides the title if it exists  */
  var hideTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_IToolbar: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the value of minHeight
    * @param minHeight String The new value.
    */
  @JSName("setMinHeight")
  var setMinHeight_IToolbar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Use this to update the title configuration
    * @param title String/Ext.Title You can either pass a String, or a config/instance of Ext.Title.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Shows the title if it exists  */
  var showTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String/Ext.Title) */
  var title: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var titleCls: js.UndefOr[Boolean] = js.undefined
}
object IToolbar {
  
  inline def apply(): IToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToolbar]
  }
  
  extension [Self <: IToolbar](x: Self) {
    
    inline def setGetLayout(value: CallbackTo[Any]): Self = StObject.set(x, "getLayout", value.toJsFn)
    
    inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
    
    inline def setGetTitle(value: CallbackTo[ITitle]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    inline def setHideTitle(value: Callback): Self = StObject.set(x, "hideTitle", value.toJsFn)
    
    inline def setHideTitleUndefined: Self = StObject.set(x, "hideTitle", js.undefined)
    
    inline def setMinHeight(value: java.lang.String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setSetMinHeight(value: /* minHeight */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1((t0: /* minHeight */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetMinHeightUndefined: Self = StObject.set(x, "setMinHeight", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: /* title */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setShowTitle(value: Callback): Self = StObject.set(x, "showTitle", value.toJsFn)
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleCls(value: Boolean): Self = StObject.set(x, "titleCls", value.asInstanceOf[js.Any])
    
    inline def setTitleClsUndefined: Self = StObject.set(x, "titleCls", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
