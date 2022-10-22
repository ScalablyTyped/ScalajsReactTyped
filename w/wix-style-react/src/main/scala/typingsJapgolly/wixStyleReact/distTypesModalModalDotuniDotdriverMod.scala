package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalModalDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Modal/Modal.uni.driver", "modalUniDriverFactory")
  @js.native
  val modalUniDriverFactory: UniDriverFactory[ModalUniDriver] = js.native
  
  trait ModalUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnCloseButton(): js.Promise[Unit]
    
    def clickOnNavigationNext(): js.Promise[Unit]
    
    def clickOnNavigationPrevious(): js.Promise[Unit]
    
    def clickOnOverlay(): js.Promise[Unit]
    
    def closeButtonExists(): js.Promise[Boolean]
    
    def getChildBySelector(selector: String): js.Promise[UniDriver[Any] | Null]
    
    def getContent(): js.Promise[Element]
    
    def getContentLabel(): js.Promise[String | Null]
    
    def getContentStyle(): js.Promise[Any]
    
    def getNavigationNextLabel(): js.Promise[String]
    
    def getNavigationPreviousLabel(): js.Promise[String]
    
    def getZIndex(): js.Promise[Any]
    
    def isOpen(): js.Promise[Boolean]
    
    def isScrollable(): js.Promise[Boolean]
    
    def navigationNextExists(): js.Promise[Boolean]
    
    def navigationPreviousExists(): js.Promise[Boolean]
  }
  object ModalUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickOnCloseButton: CallbackTo[js.Promise[Unit]],
      clickOnNavigationNext: CallbackTo[js.Promise[Unit]],
      clickOnNavigationPrevious: CallbackTo[js.Promise[Unit]],
      clickOnOverlay: CallbackTo[js.Promise[Unit]],
      closeButtonExists: CallbackTo[js.Promise[Boolean]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getChildBySelector: String => js.Promise[UniDriver[Any] | Null],
      getContent: CallbackTo[js.Promise[Element]],
      getContentLabel: CallbackTo[js.Promise[String | Null]],
      getContentStyle: CallbackTo[js.Promise[Any]],
      getNavigationNextLabel: CallbackTo[js.Promise[String]],
      getNavigationPreviousLabel: CallbackTo[js.Promise[String]],
      getZIndex: CallbackTo[js.Promise[Any]],
      isOpen: CallbackTo[js.Promise[Boolean]],
      isScrollable: CallbackTo[js.Promise[Boolean]],
      navigationNextExists: CallbackTo[js.Promise[Boolean]],
      navigationPreviousExists: CallbackTo[js.Promise[Boolean]]
    ): ModalUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickOnCloseButton = clickOnCloseButton.toJsFn, clickOnNavigationNext = clickOnNavigationNext.toJsFn, clickOnNavigationPrevious = clickOnNavigationPrevious.toJsFn, clickOnOverlay = clickOnOverlay.toJsFn, closeButtonExists = closeButtonExists.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getChildBySelector = js.Any.fromFunction1(getChildBySelector), getContent = getContent.toJsFn, getContentLabel = getContentLabel.toJsFn, getContentStyle = getContentStyle.toJsFn, getNavigationNextLabel = getNavigationNextLabel.toJsFn, getNavigationPreviousLabel = getNavigationPreviousLabel.toJsFn, getZIndex = getZIndex.toJsFn, isOpen = isOpen.toJsFn, isScrollable = isScrollable.toJsFn, navigationNextExists = navigationNextExists.toJsFn, navigationPreviousExists = navigationPreviousExists.toJsFn)
      __obj.asInstanceOf[ModalUniDriver]
    }
    
    extension [Self <: ModalUniDriver](x: Self) {
      
      inline def setClickOnCloseButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnCloseButton", value.toJsFn)
      
      inline def setClickOnNavigationNext(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnNavigationNext", value.toJsFn)
      
      inline def setClickOnNavigationPrevious(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnNavigationPrevious", value.toJsFn)
      
      inline def setClickOnOverlay(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnOverlay", value.toJsFn)
      
      inline def setCloseButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "closeButtonExists", value.toJsFn)
      
      inline def setGetChildBySelector(value: String => js.Promise[UniDriver[Any] | Null]): Self = StObject.set(x, "getChildBySelector", js.Any.fromFunction1(value))
      
      inline def setGetContent(value: CallbackTo[js.Promise[Element]]): Self = StObject.set(x, "getContent", value.toJsFn)
      
      inline def setGetContentLabel(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getContentLabel", value.toJsFn)
      
      inline def setGetContentStyle(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getContentStyle", value.toJsFn)
      
      inline def setGetNavigationNextLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getNavigationNextLabel", value.toJsFn)
      
      inline def setGetNavigationPreviousLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getNavigationPreviousLabel", value.toJsFn)
      
      inline def setGetZIndex(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getZIndex", value.toJsFn)
      
      inline def setIsOpen(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isOpen", value.toJsFn)
      
      inline def setIsScrollable(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isScrollable", value.toJsFn)
      
      inline def setNavigationNextExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "navigationNextExists", value.toJsFn)
      
      inline def setNavigationPreviousExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "navigationPreviousExists", value.toJsFn)
    }
  }
}
