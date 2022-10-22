package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ionicReact.distTypesComponentsIonOverlayManagerMod.IonOverlayManagerProps
import typingsJapgolly.ionicReact.distTypesModelsReactComponentOrElementMod.ReactComponentOrElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonOverlayManager {
  
  inline def apply(
    onAddOverlay: js.Function3[
      /* id */ String, 
      /* component */ ReactComponentOrElement, 
      /* containerElement */ HTMLDivElement, 
      Unit
    ] => Callback,
    onRemoveOverlay: js.Function1[/* id */ String, Unit] => Callback
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(onAddOverlay = js.Any.fromFunction1((t0: js.Function3[
      /* id */ String, 
      /* component */ ReactComponentOrElement, 
      /* containerElement */ HTMLDivElement, 
      Unit
    ]) => onAddOverlay(t0).runNow()), onRemoveOverlay = js.Any.fromFunction1((t0: js.Function1[/* id */ String, Unit]) => onRemoveOverlay(t0).runNow()))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[IonOverlayManagerProps]))
  }
  
  @JSImport("@ionic/react/dist/types/components/IonOverlayManager", "IonOverlayManager")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IonOverlayManagerProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
