package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebRequestExecutorFactory extends StObject {
  
  def createWebRequestExecutor(): WebRequestExecutor
}
object IWebRequestExecutorFactory {
  
  inline def apply(createWebRequestExecutor: CallbackTo[WebRequestExecutor]): IWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal(createWebRequestExecutor = createWebRequestExecutor.toJsFn)
    __obj.asInstanceOf[IWebRequestExecutorFactory]
  }
  
  extension [Self <: IWebRequestExecutorFactory](x: Self) {
    
    inline def setCreateWebRequestExecutor(value: CallbackTo[WebRequestExecutor]): Self = StObject.set(x, "createWebRequestExecutor", value.toJsFn)
  }
}
