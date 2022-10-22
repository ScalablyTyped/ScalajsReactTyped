package typingsJapgolly.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalCity extends StObject {
  
  def get(callback: js.Function1[/* result */ LocalCityResult, Unit]): Unit
}
object LocalCity {
  
  inline def apply(get: js.Function1[/* result */ LocalCityResult, Unit] => japgolly.scalajs.react.Callback): LocalCity = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1((t0: js.Function1[/* result */ LocalCityResult, Unit]) => get(t0).runNow()))
    __obj.asInstanceOf[LocalCity]
  }
  
  extension [Self <: LocalCity](x: Self) {
    
    inline def setGet(value: js.Function1[/* result */ LocalCityResult, Unit] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction1((t0: js.Function1[/* result */ LocalCityResult, Unit]) => value(t0).runNow()))
  }
}
