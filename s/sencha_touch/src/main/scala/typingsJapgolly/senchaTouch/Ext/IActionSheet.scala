package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionSheet
  extends StObject
     with ISheet {
  
  /** [Method] Returns the value of bottom
    * @returns Number
    */
  @JSName("getBottom")
  var getBottom_IActionSheet: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of height
    * @returns String
    */
  @JSName("getHeight")
  var getHeight_IActionSheet: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of left
    * @returns Number
    */
  @JSName("getLeft")
  var getLeft_IActionSheet: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of right
    * @returns Number
    */
  @JSName("getRight")
  var getRight_IActionSheet: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Sets the value of bottom
    * @param bottom Number The new value.
    */
  @JSName("setBottom")
  var setBottom_IActionSheet: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of height
    * @param height String The new value.
    */
  @JSName("setHeight")
  var setHeight_IActionSheet: js.UndefOr[js.Function1[/* height */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of left
    * @param left Number The new value.
    */
  @JSName("setLeft")
  var setLeft_IActionSheet: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of right
    * @param right Number The new value.
    */
  @JSName("setRight")
  var setRight_IActionSheet: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.undefined
}
object IActionSheet {
  
  inline def apply(): IActionSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActionSheet]
  }
  
  extension [Self <: IActionSheet](x: Self) {
    
    inline def setGetBottom(value: CallbackTo[Double]): Self = StObject.set(x, "getBottom", value.toJsFn)
    
    inline def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
    
    inline def setGetHeight(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
    
    inline def setGetLeft(value: CallbackTo[Double]): Self = StObject.set(x, "getLeft", value.toJsFn)
    
    inline def setGetLeftUndefined: Self = StObject.set(x, "getLeft", js.undefined)
    
    inline def setGetRight(value: CallbackTo[Double]): Self = StObject.set(x, "getRight", value.toJsFn)
    
    inline def setGetRightUndefined: Self = StObject.set(x, "getRight", js.undefined)
    
    inline def setSetBottom(value: /* bottom */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setBottom", js.Any.fromFunction1((t0: /* bottom */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
    
    inline def setSetHeight(value: /* height */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setHeight", js.Any.fromFunction1((t0: /* height */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetLeft(value: /* left */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setLeft", js.Any.fromFunction1((t0: /* left */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
    
    inline def setSetRight(value: /* right */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setRight", js.Any.fromFunction1((t0: /* right */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
  }
}
