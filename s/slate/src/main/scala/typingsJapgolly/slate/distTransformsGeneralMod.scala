package typingsJapgolly.slate

import japgolly.scalajs.react.Callback
import typingsJapgolly.slate.distInterfacesEditorMod.Editor
import typingsJapgolly.slate.distInterfacesOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsGeneralMod {
  
  trait GeneralTransforms extends StObject {
    
    def transform(editor: Editor, op: Operation): Unit
  }
  object GeneralTransforms {
    
    @JSImport("slate/dist/transforms/general", "GeneralTransforms")
    @js.native
    val ^ : GeneralTransforms = js.native
    
    extension [Self <: GeneralTransforms](x: Self) {
      
      inline def setTransform(value: (Editor, Operation) => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction2((t0: Editor, t1: Operation) => (value(t0, t1)).runNow()))
    }
  }
}
