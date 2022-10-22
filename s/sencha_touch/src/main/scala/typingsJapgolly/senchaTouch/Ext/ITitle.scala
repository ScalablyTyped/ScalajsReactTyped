package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITitle
  extends StObject
     with IComponent {
  
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
}
object ITitle {
  
  inline def apply(): ITitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITitle]
  }
  
  extension [Self <: ITitle](x: Self) {
    
    inline def setGetTitle(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
