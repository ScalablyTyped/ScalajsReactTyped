package typingsJapgolly.ionicReact

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReactComponentLibInterfacesMod {
  
  @js.native
  trait EventEmitter[T] extends StObject {
    
    def emit(): CustomEvent = js.native
    def emit(data: T): CustomEvent = js.native
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
    
    var didPresent: EventEmitter[Unit] = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: Any): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
    
    var el: HTMLElement = js.native
    
    var enterAnimation: js.UndefOr[Any] = js.native
    
    var keyboardClose: Boolean = js.native
    
    var leaveAnimation: js.UndefOr[Any] = js.native
    
    var overlayIndex: Double = js.native
    
    def present(): js.Promise[Unit] = js.native
    
    var presented: Boolean = js.native
    
    var willDismiss: EventEmitter[OverlayEventDetail[Any]] = js.native
    
    var willPresent: EventEmitter[Unit] = js.native
  }
  
  trait StyleReactProps extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object StyleReactProps {
    
    inline def apply(): StyleReactProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleReactProps]
    }
    
    extension [Self <: StyleReactProps](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setStyle(value: StringDictionary[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
