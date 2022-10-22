package typingsJapgolly.materializeCss.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Collapsible, 'destroy'> */
trait PickCollapsibledestroy extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
}
object PickCollapsibledestroy {
  
  inline def apply(destroy: Callback): PickCollapsibledestroy = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[PickCollapsibledestroy]
  }
  
  extension [Self <: PickCollapsibledestroy](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
