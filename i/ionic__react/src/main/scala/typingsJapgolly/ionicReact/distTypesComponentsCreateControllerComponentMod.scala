package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.ionicReact.anon.Create
import typingsJapgolly.ionicReact.anon.`4`
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsCreateControllerComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createControllerComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createControllerComponent[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](tagName: String, controller: Create[OptionsType, OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType & ReactControllerProps & `4`[OverlayType]]) & RefAttributes[OverlayType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControllerComponent")(tagName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType & ReactControllerProps & `4`[OverlayType]]) & RefAttributes[OverlayType]
  ]]
  inline def createControllerComponent[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](
    tagName: String,
    controller: Create[OptionsType, OverlayType],
    defineCustomElement: js.Function0[Unit]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType & ReactControllerProps & `4`[OverlayType]]) & RefAttributes[OverlayType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControllerComponent")(tagName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any], defineCustomElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType & ReactControllerProps & `4`[OverlayType]]) & RefAttributes[OverlayType]
  ]]
  
  @js.native
  trait OverlayBase
    extends StObject
       with HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: Any): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
    
    def present(): js.Promise[Unit] = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  
  trait ReactControllerProps extends StObject {
    
    var isOpen: Boolean
    
    var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
    
    var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
    
    var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
    
    var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  }
  object ReactControllerProps {
    
    inline def apply(isOpen: Boolean): ReactControllerProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactControllerProps]
    }
    
    extension [Self <: ReactControllerProps](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnDidDismiss(value: /* event */ CustomEvent => Callback): Self = StObject.set(x, "onDidDismiss", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
      
      inline def setOnDidDismissUndefined: Self = StObject.set(x, "onDidDismiss", js.undefined)
      
      inline def setOnDidPresent(value: /* event */ CustomEvent => Callback): Self = StObject.set(x, "onDidPresent", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
      
      inline def setOnDidPresentUndefined: Self = StObject.set(x, "onDidPresent", js.undefined)
      
      inline def setOnWillDismiss(value: /* event */ CustomEvent => Callback): Self = StObject.set(x, "onWillDismiss", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
      
      inline def setOnWillDismissUndefined: Self = StObject.set(x, "onWillDismiss", js.undefined)
      
      inline def setOnWillPresent(value: /* event */ CustomEvent => Callback): Self = StObject.set(x, "onWillPresent", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
      
      inline def setOnWillPresentUndefined: Self = StObject.set(x, "onWillPresent", js.undefined)
    }
  }
}
