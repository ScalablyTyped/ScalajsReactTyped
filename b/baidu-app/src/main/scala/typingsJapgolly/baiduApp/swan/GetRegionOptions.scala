package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.Northeast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegionOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetRegionOptions(res: Northeast): Unit
}
object GetRegionOptions {
  
  inline def apply(success: Northeast => Callback): GetRegionOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: Northeast) => success(t0).runNow()))
    __obj.asInstanceOf[GetRegionOptions]
  }
  
  extension [Self <: GetRegionOptions](x: Self) {
    
    inline def setSuccess(value: Northeast => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Northeast) => value(t0).runNow()))
  }
}
