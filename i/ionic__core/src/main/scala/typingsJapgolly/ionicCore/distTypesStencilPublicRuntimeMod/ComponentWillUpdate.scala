package typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentWillUpdate extends StObject {
  
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  def componentWillUpdate(): js.Promise[Unit] | Unit
}
object ComponentWillUpdate {
  
  inline def apply(componentWillUpdate: CallbackTo[js.Promise[Unit] | Unit]): ComponentWillUpdate = {
    val __obj = js.Dynamic.literal(componentWillUpdate = componentWillUpdate.toJsFn)
    __obj.asInstanceOf[ComponentWillUpdate]
  }
  
  extension [Self <: ComponentWillUpdate](x: Self) {
    
    inline def setComponentWillUpdate(value: CallbackTo[js.Promise[Unit] | Unit]): Self = StObject.set(x, "componentWillUpdate", value.toJsFn)
  }
}
