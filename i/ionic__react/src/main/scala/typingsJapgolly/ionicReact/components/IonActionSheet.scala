package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonActionSheetElement
import typingsJapgolly.ionicReact.anon.ForwardedRef
import typingsJapgolly.ionicReact.distTypesComponentsCreateOverlayComponentMod.ReactOverlayProps
import typingsJapgolly.ionicReact.distTypesComponentsIonActionSheetMod.ActionSheetButton
import typingsJapgolly.ionicReact.distTypesComponentsIonActionSheetMod.ActionSheetOptions
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonActionSheet {
  
  inline def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionSheetOptions & ReactOverlayProps & ForwardedRef & RefAttributes[HTMLIonActionSheetElement]]))
  }
  
  @JSImport("@ionic/react", "IonActionSheet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLIonActionSheetElement] {
    
    inline def buttons(value: js.Array[ActionSheetButton | String]): this.type = set("buttons", value.asInstanceOf[js.Any])
    
    inline def buttonsVarargs(value: (ActionSheetButton | String)*): this.type = set("buttons", js.Array(value*))
    
    inline def forwardedRef(
      value: (MutableRefObject[HTMLIonActionSheetElement | Null]) | (js.Function1[/* instance */ HTMLIonActionSheetElement | Null, Unit])
    ): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ HTMLIonActionSheetElement | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLIonActionSheetElement | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def onDidDismiss(value: /* event */ CustomEvent => Callback): this.type = set("onDidDismiss", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onDidPresent(value: /* event */ CustomEvent => Callback): this.type = set("onDidPresent", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onWillDismiss(value: /* event */ CustomEvent => Callback): this.type = set("onWillDismiss", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onWillPresent(value: /* event */ CustomEvent => Callback): this.type = set("onWillPresent", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
  }
  
  def withProps(
    p: ActionSheetOptions & ReactOverlayProps & ForwardedRef & RefAttributes[HTMLIonActionSheetElement]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
