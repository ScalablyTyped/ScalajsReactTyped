package typingsJapgolly.ionicCore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterInit extends StObject {
  
  def afterInit(swiper: Any): Unit
}
object AfterInit {
  
  inline def apply(afterInit: Any => Callback): AfterInit = {
    val __obj = js.Dynamic.literal(afterInit = js.Any.fromFunction1((t0: Any) => afterInit(t0).runNow()))
    __obj.asInstanceOf[AfterInit]
  }
  
  extension [Self <: AfterInit](x: Self) {
    
    inline def setAfterInit(value: Any => Callback): Self = StObject.set(x, "afterInit", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
