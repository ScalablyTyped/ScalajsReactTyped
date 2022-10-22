package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanel
  extends StObject
     with IContainer {
  
  /** [Config Option] (Number/Boolean/String) */
  var bodyBorder: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/Boolean/String) */
  var bodyMargin: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/Boolean/String) */
  var bodyPadding: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the value of bodyBorder
    * @returns Number/Boolean/String
    */
  var getBodyBorder: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of bodyMargin
    * @returns Number/Boolean/String
    */
  var getBodyMargin: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of bodyPadding
    * @returns Number/Boolean/String
    */
  var getBodyPadding: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Sets the value of bodyBorder
    * @param bodyBorder Number/Boolean/String The new value.
    */
  var setBodyBorder: js.UndefOr[js.Function1[/* bodyBorder */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of bodyMargin
    * @param bodyMargin Number/Boolean/String The new value.
    */
  var setBodyMargin: js.UndefOr[js.Function1[/* bodyMargin */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of bodyPadding
    * @param bodyPadding Number/Boolean/String The new value.
    */
  var setBodyPadding: js.UndefOr[js.Function1[/* bodyPadding */ js.UndefOr[Any], Unit]] = js.undefined
}
object IPanel {
  
  inline def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  
  extension [Self <: IPanel](x: Self) {
    
    inline def setBodyBorder(value: Any): Self = StObject.set(x, "bodyBorder", value.asInstanceOf[js.Any])
    
    inline def setBodyBorderUndefined: Self = StObject.set(x, "bodyBorder", js.undefined)
    
    inline def setBodyMargin(value: Any): Self = StObject.set(x, "bodyMargin", value.asInstanceOf[js.Any])
    
    inline def setBodyMarginUndefined: Self = StObject.set(x, "bodyMargin", js.undefined)
    
    inline def setBodyPadding(value: Any): Self = StObject.set(x, "bodyPadding", value.asInstanceOf[js.Any])
    
    inline def setBodyPaddingUndefined: Self = StObject.set(x, "bodyPadding", js.undefined)
    
    inline def setGetBodyBorder(value: CallbackTo[Any]): Self = StObject.set(x, "getBodyBorder", value.toJsFn)
    
    inline def setGetBodyBorderUndefined: Self = StObject.set(x, "getBodyBorder", js.undefined)
    
    inline def setGetBodyMargin(value: CallbackTo[Any]): Self = StObject.set(x, "getBodyMargin", value.toJsFn)
    
    inline def setGetBodyMarginUndefined: Self = StObject.set(x, "getBodyMargin", js.undefined)
    
    inline def setGetBodyPadding(value: CallbackTo[Any]): Self = StObject.set(x, "getBodyPadding", value.toJsFn)
    
    inline def setGetBodyPaddingUndefined: Self = StObject.set(x, "getBodyPadding", js.undefined)
    
    inline def setSetBodyBorder(value: /* bodyBorder */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setBodyBorder", js.Any.fromFunction1((t0: /* bodyBorder */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetBodyBorderUndefined: Self = StObject.set(x, "setBodyBorder", js.undefined)
    
    inline def setSetBodyMargin(value: /* bodyMargin */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setBodyMargin", js.Any.fromFunction1((t0: /* bodyMargin */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetBodyMarginUndefined: Self = StObject.set(x, "setBodyMargin", js.undefined)
    
    inline def setSetBodyPadding(value: /* bodyPadding */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setBodyPadding", js.Any.fromFunction1((t0: /* bodyPadding */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetBodyPaddingUndefined: Self = StObject.set(x, "setBodyPadding", js.undefined)
  }
}
