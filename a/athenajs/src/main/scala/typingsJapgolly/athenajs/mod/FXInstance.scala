package typingsJapgolly.athenajs.mod

import typingsJapgolly.athenajs.anon.InstantiableEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FXInstance extends StObject {
  
  def addFX(fxName: String, FxClass: InstantiableEffect): Unit
}
object FXInstance {
  
  inline def apply(addFX: (String, InstantiableEffect) => japgolly.scalajs.react.Callback): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = js.Any.fromFunction2((t0: String, t1: InstantiableEffect) => (addFX(t0, t1)).runNow()))
    __obj.asInstanceOf[FXInstance]
  }
  
  extension [Self <: FXInstance](x: Self) {
    
    inline def setAddFX(value: (String, InstantiableEffect) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addFX", js.Any.fromFunction2((t0: String, t1: InstantiableEffect) => (value(t0, t1)).runNow()))
  }
}
