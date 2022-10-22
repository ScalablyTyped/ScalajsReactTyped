package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalModalDotdriverMod {
  
  trait ModalDriver[T]
    extends StObject
       with BaseDriver {
    
    def clickOnCloseButton(): Boolean
    
    def clickOnNavigationNext(): Unit
    
    def clickOnNavigationPrevious(): Unit
    
    def clickOnOverlay(): Boolean
    
    def closeButtonExists(): Boolean
    
    def element(): T
    
    def getChildBySelector(selector: String): HTMLElement | Null
    
    def getContent(): Element
    
    def getContentLabel(): String | Null
    
    def getContentStyle(): CSSStyleDeclaration
    
    def getNavigationNextLabel(): String
    
    def getNavigationPreviousLabel(): String
    
    def getZIndex(): String | Null
    
    def isOpen(): Boolean
    
    def isScrollable(): Boolean
    
    def navigationNextExists(): Boolean
    
    def navigationPreviousExists(): Boolean
  }
  object ModalDriver {
    
    inline def apply[T](
      clickOnCloseButton: CallbackTo[Boolean],
      clickOnNavigationNext: Callback,
      clickOnNavigationPrevious: Callback,
      clickOnOverlay: CallbackTo[Boolean],
      closeButtonExists: CallbackTo[Boolean],
      element: CallbackTo[T],
      exists: CallbackTo[Boolean],
      getChildBySelector: String => HTMLElement | Null,
      getContent: CallbackTo[Element],
      getContentLabel: CallbackTo[String | Null],
      getContentStyle: CallbackTo[CSSStyleDeclaration],
      getNavigationNextLabel: CallbackTo[String],
      getNavigationPreviousLabel: CallbackTo[String],
      getZIndex: CallbackTo[String | Null],
      isOpen: CallbackTo[Boolean],
      isScrollable: CallbackTo[Boolean],
      navigationNextExists: CallbackTo[Boolean],
      navigationPreviousExists: CallbackTo[Boolean]
    ): ModalDriver[T] = {
      val __obj = js.Dynamic.literal(clickOnCloseButton = clickOnCloseButton.toJsFn, clickOnNavigationNext = clickOnNavigationNext.toJsFn, clickOnNavigationPrevious = clickOnNavigationPrevious.toJsFn, clickOnOverlay = clickOnOverlay.toJsFn, closeButtonExists = closeButtonExists.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getChildBySelector = js.Any.fromFunction1(getChildBySelector), getContent = getContent.toJsFn, getContentLabel = getContentLabel.toJsFn, getContentStyle = getContentStyle.toJsFn, getNavigationNextLabel = getNavigationNextLabel.toJsFn, getNavigationPreviousLabel = getNavigationPreviousLabel.toJsFn, getZIndex = getZIndex.toJsFn, isOpen = isOpen.toJsFn, isScrollable = isScrollable.toJsFn, navigationNextExists = navigationNextExists.toJsFn, navigationPreviousExists = navigationPreviousExists.toJsFn)
      __obj.asInstanceOf[ModalDriver[T]]
    }
    
    extension [Self <: ModalDriver[?], T](x: Self & ModalDriver[T]) {
      
      inline def setClickOnCloseButton(value: CallbackTo[Boolean]): Self = StObject.set(x, "clickOnCloseButton", value.toJsFn)
      
      inline def setClickOnNavigationNext(value: Callback): Self = StObject.set(x, "clickOnNavigationNext", value.toJsFn)
      
      inline def setClickOnNavigationPrevious(value: Callback): Self = StObject.set(x, "clickOnNavigationPrevious", value.toJsFn)
      
      inline def setClickOnOverlay(value: CallbackTo[Boolean]): Self = StObject.set(x, "clickOnOverlay", value.toJsFn)
      
      inline def setCloseButtonExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "closeButtonExists", value.toJsFn)
      
      inline def setElement(value: CallbackTo[T]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setGetChildBySelector(value: String => HTMLElement | Null): Self = StObject.set(x, "getChildBySelector", js.Any.fromFunction1(value))
      
      inline def setGetContent(value: CallbackTo[Element]): Self = StObject.set(x, "getContent", value.toJsFn)
      
      inline def setGetContentLabel(value: CallbackTo[String | Null]): Self = StObject.set(x, "getContentLabel", value.toJsFn)
      
      inline def setGetContentStyle(value: CallbackTo[CSSStyleDeclaration]): Self = StObject.set(x, "getContentStyle", value.toJsFn)
      
      inline def setGetNavigationNextLabel(value: CallbackTo[String]): Self = StObject.set(x, "getNavigationNextLabel", value.toJsFn)
      
      inline def setGetNavigationPreviousLabel(value: CallbackTo[String]): Self = StObject.set(x, "getNavigationPreviousLabel", value.toJsFn)
      
      inline def setGetZIndex(value: CallbackTo[String | Null]): Self = StObject.set(x, "getZIndex", value.toJsFn)
      
      inline def setIsOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpen", value.toJsFn)
      
      inline def setIsScrollable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isScrollable", value.toJsFn)
      
      inline def setNavigationNextExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "navigationNextExists", value.toJsFn)
      
      inline def setNavigationPreviousExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "navigationPreviousExists", value.toJsFn)
    }
  }
}
