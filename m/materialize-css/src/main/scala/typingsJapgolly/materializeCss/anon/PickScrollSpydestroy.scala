package typingsJapgolly.materializeCss.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.ScrollSpy, 'destroy'> */
trait PickScrollSpydestroy extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
}
object PickScrollSpydestroy {
  
  inline def apply(destroy: Callback): PickScrollSpydestroy = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[PickScrollSpydestroy]
  }
  
  extension [Self <: PickScrollSpydestroy](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
