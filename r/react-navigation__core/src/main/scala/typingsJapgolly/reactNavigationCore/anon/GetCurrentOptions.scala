package typingsJapgolly.reactNavigationCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCurrentOptions extends StObject {
  
  def addOptionsGetter(key: String, getter: js.Function0[js.UndefOr[js.Object | Null]]): js.Function0[Unit]
  
  def getCurrentOptions(): js.UndefOr[js.Object | Null]
}
object GetCurrentOptions {
  
  inline def apply(
    addOptionsGetter: (String, js.Function0[js.UndefOr[js.Object | Null]]) => js.Function0[Unit],
    getCurrentOptions: CallbackTo[js.UndefOr[js.Object | Null]]
  ): GetCurrentOptions = {
    val __obj = js.Dynamic.literal(addOptionsGetter = js.Any.fromFunction2(addOptionsGetter), getCurrentOptions = getCurrentOptions.toJsFn)
    __obj.asInstanceOf[GetCurrentOptions]
  }
  
  extension [Self <: GetCurrentOptions](x: Self) {
    
    inline def setAddOptionsGetter(value: (String, js.Function0[js.UndefOr[js.Object | Null]]) => js.Function0[Unit]): Self = StObject.set(x, "addOptionsGetter", js.Any.fromFunction2(value))
    
    inline def setGetCurrentOptions(value: CallbackTo[js.UndefOr[js.Object | Null]]): Self = StObject.set(x, "getCurrentOptions", value.toJsFn)
  }
}
