package typingsJapgolly.weappApi.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  /**
    * getCurrentPage() 函数用户获取当前页面的实例。
    */
  def getCurrentPage(): Page
}
object App {
  
  @JSImport("weapp-api", "App")
  @js.native
  val ^ : AppConstructor = js.native
  
  extension [Self <: App](x: Self) {
    
    inline def setGetCurrentPage(value: CallbackTo[Page]): Self = StObject.set(x, "getCurrentPage", value.toJsFn)
  }
}
