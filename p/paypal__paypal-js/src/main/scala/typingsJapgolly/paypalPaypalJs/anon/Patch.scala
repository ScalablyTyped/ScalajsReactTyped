package typingsJapgolly.paypalPaypalJs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.paypalPaypalJs.typesApisOrdersMod.OrderResponseBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patch extends StObject {
  
  def patch(): js.Promise[OrderResponseBody]
}
object Patch {
  
  inline def apply(patch: CallbackTo[js.Promise[OrderResponseBody]]): Patch = {
    val __obj = js.Dynamic.literal(patch = patch.toJsFn)
    __obj.asInstanceOf[Patch]
  }
  
  extension [Self <: Patch](x: Self) {
    
    inline def setPatch(value: CallbackTo[js.Promise[OrderResponseBody]]): Self = StObject.set(x, "patch", value.toJsFn)
  }
}
