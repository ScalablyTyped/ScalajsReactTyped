package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.ionicReact.distTypesModelsReactComponentOrElementMod.ReactComponentOrElement
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsIonOverlayManagerMod {
  
  @JSImport("@ionic/react/dist/types/components/IonOverlayManager", "IonOverlayManager")
  @js.native
  val IonOverlayManager: FC[IonOverlayManagerProps] = js.native
  
  trait IonOverlayManagerProps extends StObject {
    
    def onAddOverlay(
      callback: js.Function3[
          /* id */ String, 
          /* component */ ReactComponentOrElement, 
          /* containerElement */ HTMLDivElement, 
          Unit
        ]
    ): Unit
    
    def onRemoveOverlay(callback: js.Function1[/* id */ String, Unit]): Unit
  }
  object IonOverlayManagerProps {
    
    inline def apply(
      onAddOverlay: js.Function3[
          /* id */ String, 
          /* component */ ReactComponentOrElement, 
          /* containerElement */ HTMLDivElement, 
          Unit
        ] => Callback,
      onRemoveOverlay: js.Function1[/* id */ String, Unit] => Callback
    ): IonOverlayManagerProps = {
      val __obj = js.Dynamic.literal(onAddOverlay = js.Any.fromFunction1((t0: js.Function3[
          /* id */ String, 
          /* component */ ReactComponentOrElement, 
          /* containerElement */ HTMLDivElement, 
          Unit
        ]) => onAddOverlay(t0).runNow()), onRemoveOverlay = js.Any.fromFunction1((t0: js.Function1[/* id */ String, Unit]) => onRemoveOverlay(t0).runNow()))
      __obj.asInstanceOf[IonOverlayManagerProps]
    }
    
    extension [Self <: IonOverlayManagerProps](x: Self) {
      
      inline def setOnAddOverlay(
        value: js.Function3[
              /* id */ String, 
              /* component */ ReactComponentOrElement, 
              /* containerElement */ HTMLDivElement, 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "onAddOverlay", js.Any.fromFunction1((t0: js.Function3[
              /* id */ String, 
              /* component */ ReactComponentOrElement, 
              /* containerElement */ HTMLDivElement, 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setOnRemoveOverlay(value: js.Function1[/* id */ String, Unit] => Callback): Self = StObject.set(x, "onRemoveOverlay", js.Any.fromFunction1((t0: js.Function1[/* id */ String, Unit]) => value(t0).runNow()))
    }
  }
}
