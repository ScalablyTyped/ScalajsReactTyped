package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITitleBar
  extends StObject
     with IContainer {
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ITitleBar: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of maxButtonWidth
    * @returns String
    */
  var getMaxButtonWidth: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of titleAlign
    * @returns String
    */
  var getTitleAlign: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Config Option] (String) */
  var maxButtonWidth: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_ITitleBar: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ITitleBar: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxButtonWidth
    * @param maxButtonWidth String The new value.
    */
  var setMaxButtonWidth: js.UndefOr[js.Function1[/* maxButtonWidth */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of minHeight
    * @param minHeight String The new value.
    */
  @JSName("setMinHeight")
  var setMinHeight_ITitleBar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of titleAlign
    * @param titleAlign String The new value.
    */
  var setTitleAlign: js.UndefOr[js.Function1[/* titleAlign */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.undefined
}
object ITitleBar {
  
  inline def apply(): ITitleBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITitleBar]
  }
  
  extension [Self <: ITitleBar](x: Self) {
    
    inline def setGetCls(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getCls", value.toJsFn)
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetMaxButtonWidth(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getMaxButtonWidth", value.toJsFn)
    
    inline def setGetMaxButtonWidthUndefined: Self = StObject.set(x, "getMaxButtonWidth", js.undefined)
    
    inline def setGetTitle(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetTitleAlign(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getTitleAlign", value.toJsFn)
    
    inline def setGetTitleAlignUndefined: Self = StObject.set(x, "getTitleAlign", js.undefined)
    
    inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    inline def setMaxButtonWidth(value: java.lang.String): Self = StObject.set(x, "maxButtonWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxButtonWidthUndefined: Self = StObject.set(x, "maxButtonWidth", js.undefined)
    
    inline def setMinHeight(value: java.lang.String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setCls", js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetMaxButtonWidth(value: /* maxButtonWidth */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setMaxButtonWidth", js.Any.fromFunction1((t0: /* maxButtonWidth */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetMaxButtonWidthUndefined: Self = StObject.set(x, "setMaxButtonWidth", js.undefined)
    
    inline def setSetMinHeight(value: /* minHeight */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1((t0: /* minHeight */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetMinHeightUndefined: Self = StObject.set(x, "setMinHeight", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetTitleAlign(value: /* titleAlign */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setTitleAlign", js.Any.fromFunction1((t0: /* titleAlign */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetTitleAlignUndefined: Self = StObject.set(x, "setTitleAlign", js.undefined)
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAlign(value: java.lang.String): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
