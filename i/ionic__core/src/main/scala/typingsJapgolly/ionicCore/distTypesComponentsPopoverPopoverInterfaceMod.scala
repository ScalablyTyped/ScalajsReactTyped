package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayInterface
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import typingsJapgolly.ionicCore.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPopoverPopoverInterfaceMod {
  
  type PopoverAttributes = StringDictionary[Any]
  
  @js.native
  trait PopoverInterface
    extends StObject
       with OverlayInterface {
    
    def present(event: MouseEvent): js.Promise[Unit] = js.native
    def present(event: PointerEvent): js.Promise[Unit] = js.native
    def present(event: TouchEvent): js.Promise[Unit] = js.native
  }
  
  trait PopoverOptions[T /* <: ComponentRef */] extends StObject {
    
    var alignment: js.UndefOr[PositionAlign] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var arrow: js.UndefOr[Boolean] = js.undefined
    
    var backdropDismiss: js.UndefOr[Boolean] = js.undefined
    
    var component: T
    
    var componentProps: js.UndefOr[ComponentProps[T]] = js.undefined
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
    
    var dismissOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var event: js.UndefOr[Event] = js.undefined
    
    var htmlAttributes: js.UndefOr[PopoverAttributes] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyboardClose: js.UndefOr[Boolean] = js.undefined
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var reference: js.UndefOr[PositionReference] = js.undefined
    
    var showBackdrop: js.UndefOr[Boolean] = js.undefined
    
    var side: js.UndefOr[PositionSide] = js.undefined
    
    var size: js.UndefOr[PopoverSize] = js.undefined
    
    var translucent: js.UndefOr[Boolean] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var triggerAction: js.UndefOr[String] = js.undefined
  }
  object PopoverOptions {
    
    inline def apply[T /* <: ComponentRef */](component: T): PopoverOptions[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverOptions[T]]
    }
    
    extension [Self <: PopoverOptions[?], T /* <: ComponentRef */](x: Self & PopoverOptions[T]) {
      
      inline def setAlignment(value: PositionAlign): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
      
      inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentProps(value: ComponentProps[T]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
      
      inline def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
      
      inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
      
      inline def setDelegate(value: FrameworkDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setDismissOnSelect(value: Boolean): Self = StObject.set(x, "dismissOnSelect", value.asInstanceOf[js.Any])
      
      inline def setDismissOnSelectUndefined: Self = StObject.set(x, "dismissOnSelect", js.undefined)
      
      inline def setEnterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
      
      inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setHtmlAttributes(value: PopoverAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
      
      inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
      
      inline def setLeaveAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
      
      inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setReference(value: PositionReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
      
      inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
      
      inline def setSide(value: PositionSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setSize(value: PopoverSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
      
      inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerAction(value: String): Self = StObject.set(x, "triggerAction", value.asInstanceOf[js.Any])
      
      inline def setTriggerActionUndefined: Self = StObject.set(x, "triggerAction", js.undefined)
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.cover
    - typingsJapgolly.ionicCore.ionicCoreStrings.auto
  */
  trait PopoverSize extends StObject
  object PopoverSize {
    
    inline def auto: typingsJapgolly.ionicCore.ionicCoreStrings.auto = "auto".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.auto]
    
    inline def cover: typingsJapgolly.ionicCore.ionicCoreStrings.cover = "cover".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.cover]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.start
    - typingsJapgolly.ionicCore.ionicCoreStrings.center
    - typingsJapgolly.ionicCore.ionicCoreStrings.end
  */
  trait PositionAlign extends StObject
  object PositionAlign {
    
    inline def center: typingsJapgolly.ionicCore.ionicCoreStrings.center = "center".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.center]
    
    inline def end: typingsJapgolly.ionicCore.ionicCoreStrings.end = "end".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.end]
    
    inline def start: typingsJapgolly.ionicCore.ionicCoreStrings.start = "start".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.trigger
    - typingsJapgolly.ionicCore.ionicCoreStrings.event
  */
  trait PositionReference extends StObject
  object PositionReference {
    
    inline def event: typingsJapgolly.ionicCore.ionicCoreStrings.event = "event".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.event]
    
    inline def trigger: typingsJapgolly.ionicCore.ionicCoreStrings.trigger = "trigger".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.trigger]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.top
    - typingsJapgolly.ionicCore.ionicCoreStrings.right
    - typingsJapgolly.ionicCore.ionicCoreStrings.bottom
    - typingsJapgolly.ionicCore.ionicCoreStrings.left
    - typingsJapgolly.ionicCore.ionicCoreStrings.start
    - typingsJapgolly.ionicCore.ionicCoreStrings.end
  */
  trait PositionSide extends StObject
  object PositionSide {
    
    inline def bottom: typingsJapgolly.ionicCore.ionicCoreStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.bottom]
    
    inline def end: typingsJapgolly.ionicCore.ionicCoreStrings.end = "end".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.end]
    
    inline def left: typingsJapgolly.ionicCore.ionicCoreStrings.left = "left".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.left]
    
    inline def right: typingsJapgolly.ionicCore.ionicCoreStrings.right = "right".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.right]
    
    inline def start: typingsJapgolly.ionicCore.ionicCoreStrings.start = "start".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.start]
    
    inline def top: typingsJapgolly.ionicCore.ionicCoreStrings.top = "top".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.click
    - typingsJapgolly.ionicCore.ionicCoreStrings.hover
    - typingsJapgolly.ionicCore.ionicCoreStrings.`context-menu`
  */
  trait TriggerAction extends StObject
  object TriggerAction {
    
    inline def click: typingsJapgolly.ionicCore.ionicCoreStrings.click = "click".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.click]
    
    inline def `context-menu`: typingsJapgolly.ionicCore.ionicCoreStrings.`context-menu` = "context-menu".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`context-menu`]
    
    inline def hover: typingsJapgolly.ionicCore.ionicCoreStrings.hover = "hover".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.hover]
  }
}
