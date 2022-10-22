package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoBootstrap extends StObject {
  
  def ngDoBootstrap(appRef: ApplicationRef): Unit
}
object DoBootstrap {
  
  inline def apply(ngDoBootstrap: ApplicationRef => Callback): DoBootstrap = {
    val __obj = js.Dynamic.literal(ngDoBootstrap = js.Any.fromFunction1((t0: ApplicationRef) => ngDoBootstrap(t0).runNow()))
    __obj.asInstanceOf[DoBootstrap]
  }
  
  extension [Self <: DoBootstrap](x: Self) {
    
    inline def setNgDoBootstrap(value: ApplicationRef => Callback): Self = StObject.set(x, "ngDoBootstrap", js.Any.fromFunction1((t0: ApplicationRef) => value(t0).runNow()))
  }
}
