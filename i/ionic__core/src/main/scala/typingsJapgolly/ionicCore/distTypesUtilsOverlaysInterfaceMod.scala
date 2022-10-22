package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.HTMLStencilElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsOverlaysInterfaceMod {
  
  @js.native
  trait HTMLIonOverlayElement
    extends StObject
       with HTMLStencilElement {
    
    var backdropDismiss: js.UndefOr[Boolean] = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: Any): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
    
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    
    var overlayIndex: Double = js.native
  }
  
  @js.native
  trait OverlayController extends StObject {
    
    def create(): js.Promise[HTMLElement] = js.native
    def create(opts: Any): js.Promise[HTMLElement] = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: Any): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: String, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: Unit, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = js.native
    
    def getTop(): js.Promise[js.UndefOr[HTMLIonOverlayElement]] = js.native
  }
  
  trait OverlayEventDetail[T] extends StObject {
    
    var data: js.UndefOr[T] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
  }
  object OverlayEventDetail {
    
    inline def apply[T](): OverlayEventDetail[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayEventDetail[T]]
    }
    
    extension [Self <: OverlayEventDetail[?], T](x: Self & OverlayEventDetail[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  @js.native
  trait OverlayInterface extends StObject {
    
    var animated: Boolean = js.native
    
    var didDismiss: EventEmitter[OverlayEventDetail[Any]] = js.native
    
    var didDismissShorthand: js.UndefOr[EventEmitter[OverlayEventDetail[Any]]] = js.native
    
    var didPresent: EventEmitter[Unit] = js.native
    
    var didPresentShorthand: js.UndefOr[EventEmitter[Unit]] = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: Any): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
    
    var el: HTMLElement = js.native
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var keyboardClose: Boolean = js.native
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var overlayIndex: Double = js.native
    
    def present(): js.Promise[Unit] = js.native
    
    var presented: Boolean = js.native
    
    var willDismiss: EventEmitter[OverlayEventDetail[Any]] = js.native
    
    var willDismissShorthand: js.UndefOr[EventEmitter[OverlayEventDetail[Any]]] = js.native
    
    var willPresent: EventEmitter[Unit] = js.native
    
    var willPresentShorthand: js.UndefOr[EventEmitter[Unit]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonActionSheetElement
    - typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAlertElement
    - typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPopoverElement
  */
  trait OverlaySelect extends StObject
}
