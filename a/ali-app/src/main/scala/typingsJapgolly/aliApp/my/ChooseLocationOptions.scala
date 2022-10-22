package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseLocationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MChooseLocationOptions(res: ChooseLocationData): Unit
}
object ChooseLocationOptions {
  
  inline def apply(success: ChooseLocationData => Callback): ChooseLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: ChooseLocationData) => success(t0).runNow()))
    __obj.asInstanceOf[ChooseLocationOptions]
  }
  
  extension [Self <: ChooseLocationOptions](x: Self) {
    
    inline def setSuccess(value: ChooseLocationData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ChooseLocationData) => value(t0).runNow()))
  }
}
