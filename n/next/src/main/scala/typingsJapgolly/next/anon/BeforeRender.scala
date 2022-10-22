package typingsJapgolly.next.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeRender extends StObject {
  
  var beforeRender: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}
object BeforeRender {
  
  inline def apply(): BeforeRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeRender]
  }
  
  extension [Self <: BeforeRender](x: Self) {
    
    inline def setBeforeRender(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "beforeRender", value.toJsFn)
    
    inline def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
  }
}
