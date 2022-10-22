package typingsJapgolly.powerbiVisualsTools.mod.extensibility

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// These are the base interfaces. These should remain empty
// All visual versions should extend these for type compatability
trait IVisual extends StObject {
  
  /** Notifies the visual that it is being destroyed, and to do any cleanup necessary (such as unsubscribing event handlers). */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IVisual {
  
  inline def apply(): IVisual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVisual]
  }
  
  extension [Self <: IVisual](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
  }
}
