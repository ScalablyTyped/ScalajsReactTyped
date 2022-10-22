package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.ionicReact.anon.`8`
import typingsJapgolly.ionicReact.anon.`9`
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReactComponentLibCreateOverlayComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/react-component-lib/createOverlayComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOverlayComponent[OverlayComponent /* <: js.Object */, OverlayType /* <: OverlayElement */](tagName: String, controller: `8`[OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `9`[OverlayType]]) & RefAttributes[OverlayType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOverlayComponent")(tagName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `9`[OverlayType]]) & RefAttributes[OverlayType]
  ]]
  inline def createOverlayComponent[OverlayComponent /* <: js.Object */, OverlayType /* <: OverlayElement */](tagName: String, controller: `8`[OverlayType], customElement: Any): ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `9`[OverlayType]]) & RefAttributes[OverlayType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOverlayComponent")(tagName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any], customElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `9`[OverlayType]]) & RefAttributes[OverlayType]
  ]]
  
  @js.native
  trait OverlayElement
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
  
  trait ReactOverlayProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var isOpen: Boolean
    
    var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
    
    var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
    
    var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
    
    var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  }
  object ReactOverlayProps {
    
    inline def apply(isOpen: Boolean): ReactOverlayProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactOverlayProps]
    }
    
    extension [Self <: ReactOverlayProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
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
