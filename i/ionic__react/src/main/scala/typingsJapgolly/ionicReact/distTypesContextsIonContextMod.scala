package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.ionicReact.distTypesModelsReactComponentOrElementMod.ReactComponentOrElement
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesContextsIonContextMod {
  
  @JSImport("@ionic/react/dist/types/contexts/IonContext", "IonContext")
  @js.native
  val IonContext: Context[IonContextInterface] = js.native
  
  trait IonContextInterface extends StObject {
    
    def addOverlay(id: String, overlay: ReactComponentOrElement, containerElement: HTMLDivElement): Unit
    
    def removeOverlay(id: String): Unit
  }
  object IonContextInterface {
    
    inline def apply(
      addOverlay: (String, ReactComponentOrElement, HTMLDivElement) => Callback,
      removeOverlay: String => Callback
    ): IonContextInterface = {
      val __obj = js.Dynamic.literal(addOverlay = js.Any.fromFunction3((t0: String, t1: ReactComponentOrElement, t2: HTMLDivElement) => (addOverlay(t0, t1, t2)).runNow()), removeOverlay = js.Any.fromFunction1((t0: String) => removeOverlay(t0).runNow()))
      __obj.asInstanceOf[IonContextInterface]
    }
    
    extension [Self <: IonContextInterface](x: Self) {
      
      inline def setAddOverlay(value: (String, ReactComponentOrElement, HTMLDivElement) => Callback): Self = StObject.set(x, "addOverlay", js.Any.fromFunction3((t0: String, t1: ReactComponentOrElement, t2: HTMLDivElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setRemoveOverlay(value: String => Callback): Self = StObject.set(x, "removeOverlay", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
