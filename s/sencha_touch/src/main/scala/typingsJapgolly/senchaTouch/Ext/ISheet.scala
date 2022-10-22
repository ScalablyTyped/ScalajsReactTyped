package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISheet
  extends StObject
     with IPanel {
  
  /** [Config Option] (String) */
  var enter: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var exit: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns the value of enter
    * @returns String
    */
  var getEnter: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of exit
    * @returns String
    */
  var getExit: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of stretchX
    * @returns Boolean
    */
  var getStretchX: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of stretchY
    * @returns Boolean
    */
  var getStretchY: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Sets the value of enter
    * @param enter String The new value.
    */
  var setEnter: js.UndefOr[js.Function1[/* enter */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of exit
    * @param exit String The new value.
    */
  var setExit: js.UndefOr[js.Function1[/* exit */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of stretchX
    * @param stretchX Boolean The new value.
    */
  var setStretchX: js.UndefOr[js.Function1[/* stretchX */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of stretchY
    * @param stretchY Boolean The new value.
    */
  var setStretchY: js.UndefOr[js.Function1[/* stretchY */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var stretchX: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var stretchY: js.UndefOr[Boolean] = js.undefined
}
object ISheet {
  
  inline def apply(): ISheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISheet]
  }
  
  extension [Self <: ISheet](x: Self) {
    
    inline def setEnter(value: java.lang.String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: java.lang.String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setGetEnter(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getEnter", value.toJsFn)
    
    inline def setGetEnterUndefined: Self = StObject.set(x, "getEnter", js.undefined)
    
    inline def setGetExit(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getExit", value.toJsFn)
    
    inline def setGetExitUndefined: Self = StObject.set(x, "getExit", js.undefined)
    
    inline def setGetStretchX(value: CallbackTo[Boolean]): Self = StObject.set(x, "getStretchX", value.toJsFn)
    
    inline def setGetStretchXUndefined: Self = StObject.set(x, "getStretchX", js.undefined)
    
    inline def setGetStretchY(value: CallbackTo[Boolean]): Self = StObject.set(x, "getStretchY", value.toJsFn)
    
    inline def setGetStretchYUndefined: Self = StObject.set(x, "getStretchY", js.undefined)
    
    inline def setSetEnter(value: /* enter */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setEnter", js.Any.fromFunction1((t0: /* enter */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetEnterUndefined: Self = StObject.set(x, "setEnter", js.undefined)
    
    inline def setSetExit(value: /* exit */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setExit", js.Any.fromFunction1((t0: /* exit */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetExitUndefined: Self = StObject.set(x, "setExit", js.undefined)
    
    inline def setSetStretchX(value: /* stretchX */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setStretchX", js.Any.fromFunction1((t0: /* stretchX */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetStretchXUndefined: Self = StObject.set(x, "setStretchX", js.undefined)
    
    inline def setSetStretchY(value: /* stretchY */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setStretchY", js.Any.fromFunction1((t0: /* stretchY */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetStretchYUndefined: Self = StObject.set(x, "setStretchY", js.undefined)
    
    inline def setStretchX(value: Boolean): Self = StObject.set(x, "stretchX", value.asInstanceOf[js.Any])
    
    inline def setStretchXUndefined: Self = StObject.set(x, "stretchX", js.undefined)
    
    inline def setStretchY(value: Boolean): Self = StObject.set(x, "stretchY", value.asInstanceOf[js.Any])
    
    inline def setStretchYUndefined: Self = StObject.set(x, "stretchY", js.undefined)
  }
}
