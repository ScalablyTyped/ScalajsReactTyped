package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  /**
    * 获取当前页面
    */
  def getCurrentPage(): Page[js.Object, js.Object]
}
object App {
  
  inline def apply(getCurrentPage: CallbackTo[Page[js.Object, js.Object]]): App = {
    val __obj = js.Dynamic.literal(getCurrentPage = getCurrentPage.toJsFn)
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setGetCurrentPage(value: CallbackTo[Page[js.Object, js.Object]]): Self = StObject.set(x, "getCurrentPage", value.toJsFn)
  }
}
