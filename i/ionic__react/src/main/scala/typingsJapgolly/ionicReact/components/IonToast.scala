package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToastElement
import typingsJapgolly.ionicReact.anon.`3`
import typingsJapgolly.ionicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps
import typingsJapgolly.ionicReact.distTypesComponentsIonToastMod.ToastButton
import typingsJapgolly.ionicReact.distTypesComponentsIonToastMod.ToastOptions
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonToast {
  
  inline def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToastOptions & ReactControllerProps & `3` & RefAttributes[HTMLIonToastElement]]))
  }
  
  @JSImport("@ionic/react", "IonToast")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLIonToastElement] {
    
    inline def buttons(value: js.Array[ToastButton | String]): this.type = set("buttons", value.asInstanceOf[js.Any])
    
    inline def buttonsVarargs(value: (ToastButton | String)*): this.type = set("buttons", js.Array(value*))
    
    inline def forwardedRef(
      value: (MutableRefObject[HTMLIonToastElement | Null]) | (js.Function1[/* instance */ HTMLIonToastElement | Null, Unit])
    ): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ HTMLIonToastElement | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLIonToastElement | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def onDidDismiss(value: /* event */ CustomEvent => Callback): this.type = set("onDidDismiss", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onDidPresent(value: /* event */ CustomEvent => Callback): this.type = set("onDidPresent", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onWillDismiss(value: /* event */ CustomEvent => Callback): this.type = set("onWillDismiss", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onWillPresent(value: /* event */ CustomEvent => Callback): this.type = set("onWillPresent", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
  }
  
  def withProps(p: ToastOptions & ReactControllerProps & `3` & RefAttributes[HTMLIonToastElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
