package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalMod {
  
  @JSImport("wix-style-react/dist/types/Modal", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[ModalProps, js.Object, Any]
  
  type Modal = PureComponent[ModalProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.end
  */
  trait ModalHorizontalPostion extends StObject
  object ModalHorizontalPostion {
    
    inline def center: typingsJapgolly.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.center]
    
    inline def end: typingsJapgolly.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.end]
    
    inline def start: typingsJapgolly.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.static
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.relative
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.absolute
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.fixed
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.sticky
  */
  trait ModalOverlayPosition extends StObject
  object ModalOverlayPosition {
    
    inline def absolute: typingsJapgolly.wixStyleReact.wixStyleReactStrings.absolute = "absolute".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.absolute]
    
    inline def fixed: typingsJapgolly.wixStyleReact.wixStyleReactStrings.fixed = "fixed".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.fixed]
    
    inline def relative: typingsJapgolly.wixStyleReact.wixStyleReactStrings.relative = "relative".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.relative]
    
    inline def static: typingsJapgolly.wixStyleReact.wixStyleReactStrings.static = "static".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.static]
    
    inline def sticky: typingsJapgolly.wixStyleReact.wixStyleReactStrings.sticky = "sticky".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.sticky]
  }
  
  trait ModalProps extends StObject {
    
    var appElement: js.UndefOr[String] = js.undefined
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var closeTimeoutMS: js.UndefOr[Double] = js.undefined
    
    var contentLabel: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var horizontalPosition: js.UndefOr[ModalHorizontalPostion] = js.undefined
    
    var isOpen: Boolean
    
    var maxHeight: js.UndefOr[String] = js.undefined
    
    var navigationNextLabel: js.UndefOr[String] = js.undefined
    
    var navigationPreviousLabel: js.UndefOr[String] = js.undefined
    
    var onAfterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAfterOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onNavigationClickNext: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onNavigationClickPrevious: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRequestClose: js.UndefOr[
        js.Function1[
          /* event */ js.UndefOr[ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]], 
          Unit
        ]
      ] = js.undefined
    
    var overlayPosition: js.UndefOr[ModalOverlayPosition] = js.undefined
    
    var parentSelector: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var screen: js.UndefOr[ModalScreen] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var scrollableContent: js.UndefOr[Boolean] = js.undefined
    
    var shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.undefined
    
    var shouldDisplayCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var showNavigationNextButton: js.UndefOr[Boolean] = js.undefined
    
    var showNavigationPreviousButton: js.UndefOr[Boolean] = js.undefined
    
    var verticalPosition: js.UndefOr[ModalVerticalPosition] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ModalProps {
    
    inline def apply(isOpen: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setAppElement(value: String): Self = StObject.set(x, "appElement", value.asInstanceOf[js.Any])
      
      inline def setAppElementUndefined: Self = StObject.set(x, "appElement", js.undefined)
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setCloseTimeoutMS(value: Double): Self = StObject.set(x, "closeTimeoutMS", value.asInstanceOf[js.Any])
      
      inline def setCloseTimeoutMSUndefined: Self = StObject.set(x, "closeTimeoutMS", js.undefined)
      
      inline def setContentLabel(value: String): Self = StObject.set(x, "contentLabel", value.asInstanceOf[js.Any])
      
      inline def setContentLabelUndefined: Self = StObject.set(x, "contentLabel", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontalPosition(value: ModalHorizontalPostion): Self = StObject.set(x, "horizontalPosition", value.asInstanceOf[js.Any])
      
      inline def setHorizontalPositionUndefined: Self = StObject.set(x, "horizontalPosition", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setNavigationNextLabel(value: String): Self = StObject.set(x, "navigationNextLabel", value.asInstanceOf[js.Any])
      
      inline def setNavigationNextLabelUndefined: Self = StObject.set(x, "navigationNextLabel", js.undefined)
      
      inline def setNavigationPreviousLabel(value: String): Self = StObject.set(x, "navigationPreviousLabel", value.asInstanceOf[js.Any])
      
      inline def setNavigationPreviousLabelUndefined: Self = StObject.set(x, "navigationPreviousLabel", js.undefined)
      
      inline def setOnAfterClose(value: Callback): Self = StObject.set(x, "onAfterClose", value.toJsFn)
      
      inline def setOnAfterCloseUndefined: Self = StObject.set(x, "onAfterClose", js.undefined)
      
      inline def setOnAfterOpen(value: Callback): Self = StObject.set(x, "onAfterOpen", value.toJsFn)
      
      inline def setOnAfterOpenUndefined: Self = StObject.set(x, "onAfterOpen", js.undefined)
      
      inline def setOnNavigationClickNext(value: Callback): Self = StObject.set(x, "onNavigationClickNext", value.toJsFn)
      
      inline def setOnNavigationClickNextUndefined: Self = StObject.set(x, "onNavigationClickNext", js.undefined)
      
      inline def setOnNavigationClickPrevious(value: Callback): Self = StObject.set(x, "onNavigationClickPrevious", value.toJsFn)
      
      inline def setOnNavigationClickPreviousUndefined: Self = StObject.set(x, "onNavigationClickPrevious", js.undefined)
      
      inline def setOnOk(value: Callback): Self = StObject.set(x, "onOk", value.toJsFn)
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnRequestClose(
        value: /* event */ js.UndefOr[ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]] => Callback
      ): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]]) => value(t0).runNow()))
      
      inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
      
      inline def setOverlayPosition(value: ModalOverlayPosition): Self = StObject.set(x, "overlayPosition", value.asInstanceOf[js.Any])
      
      inline def setOverlayPositionUndefined: Self = StObject.set(x, "overlayPosition", js.undefined)
      
      inline def setParentSelector(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "parentSelector", value.toJsFn)
      
      inline def setParentSelectorUndefined: Self = StObject.set(x, "parentSelector", js.undefined)
      
      inline def setScreen(value: ModalScreen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableContent(value: Boolean): Self = StObject.set(x, "scrollableContent", value.asInstanceOf[js.Any])
      
      inline def setScrollableContentUndefined: Self = StObject.set(x, "scrollableContent", js.undefined)
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      inline def setShouldCloseOnOverlayClick(value: Boolean): Self = StObject.set(x, "shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
      
      inline def setShouldCloseOnOverlayClickUndefined: Self = StObject.set(x, "shouldCloseOnOverlayClick", js.undefined)
      
      inline def setShouldDisplayCloseButton(value: Boolean): Self = StObject.set(x, "shouldDisplayCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShouldDisplayCloseButtonUndefined: Self = StObject.set(x, "shouldDisplayCloseButton", js.undefined)
      
      inline def setShowNavigationNextButton(value: Boolean): Self = StObject.set(x, "showNavigationNextButton", value.asInstanceOf[js.Any])
      
      inline def setShowNavigationNextButtonUndefined: Self = StObject.set(x, "showNavigationNextButton", js.undefined)
      
      inline def setShowNavigationPreviousButton(value: Boolean): Self = StObject.set(x, "showNavigationPreviousButton", value.asInstanceOf[js.Any])
      
      inline def setShowNavigationPreviousButtonUndefined: Self = StObject.set(x, "showNavigationPreviousButton", js.undefined)
      
      inline def setVerticalPosition(value: ModalVerticalPosition): Self = StObject.set(x, "verticalPosition", value.asInstanceOf[js.Any])
      
      inline def setVerticalPositionUndefined: Self = StObject.set(x, "verticalPosition", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.full
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.desktop
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.mobile
  */
  trait ModalScreen extends StObject
  object ModalScreen {
    
    inline def desktop: typingsJapgolly.wixStyleReact.wixStyleReactStrings.desktop = "desktop".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.desktop]
    
    inline def full: typingsJapgolly.wixStyleReact.wixStyleReactStrings.full = "full".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.full]
    
    inline def mobile: typingsJapgolly.wixStyleReact.wixStyleReactStrings.mobile = "mobile".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.mobile]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.end
  */
  trait ModalVerticalPosition extends StObject
  object ModalVerticalPosition {
    
    inline def center: typingsJapgolly.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.center]
    
    inline def end: typingsJapgolly.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.end]
    
    inline def start: typingsJapgolly.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.start]
  }
}
