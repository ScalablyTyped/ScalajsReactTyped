package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixStyleReact.distTypesMessageBoxFunctionalLayoutMod.MessageBoxFunctionalLayoutTheme
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageBoxFunctionalLayoutMessageBoxFunctionalLayoutDotuniDotdriverMod {
  
  trait MessageBoxFunctionalLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnCancellationButton(): js.Promise[Unit]
    
    def clickOnConfirmationButton(): js.Promise[Unit]
    
    def clickOnHeaderCloseButton(): js.Promise[Unit]
    
    def getCancellationButton(): js.Promise[UniDriver[Any] | Null]
    
    def getCancellationButtonText(): js.Promise[String]
    
    def getChildBySelector(selector: String): js.Promise[UniDriver[Any] | Null]
    
    def getConfirmationButton(): js.Promise[UniDriver[Any] | Null]
    
    def getConfirmationButtonText(): js.Promise[String]
    
    def getFooter(): js.Promise[UniDriver[Any] | Null]
    
    def getHeaderCloseButton(): js.Promise[UniDriver[Any] | Null]
    
    def getTitle(): js.Promise[String]
    
    def isCancelEnable(): js.Promise[Boolean]
    
    def isCancellationButtonPrefixIconExists(): js.Promise[Boolean]
    
    def isCancellationButtonSuffixIconExists(): js.Promise[Boolean]
    
    def isConfirmationButtonPrefixIconExists(): js.Promise[Boolean]
    
    def isConfirmationButtonSuffixIconExists(): js.Promise[Boolean]
    
    def isConfirmationEnable(): js.Promise[Boolean]
    
    def isThemeExist(theme: MessageBoxFunctionalLayoutTheme): js.Promise[Boolean]
    
    def toHaveBodyPadding(): js.Promise[Boolean]
  }
  object MessageBoxFunctionalLayoutUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickOnCancellationButton: CallbackTo[js.Promise[Unit]],
      clickOnConfirmationButton: CallbackTo[js.Promise[Unit]],
      clickOnHeaderCloseButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getCancellationButton: CallbackTo[js.Promise[UniDriver[Any] | Null]],
      getCancellationButtonText: CallbackTo[js.Promise[String]],
      getChildBySelector: String => js.Promise[UniDriver[Any] | Null],
      getConfirmationButton: CallbackTo[js.Promise[UniDriver[Any] | Null]],
      getConfirmationButtonText: CallbackTo[js.Promise[String]],
      getFooter: CallbackTo[js.Promise[UniDriver[Any] | Null]],
      getHeaderCloseButton: CallbackTo[js.Promise[UniDriver[Any] | Null]],
      getTitle: CallbackTo[js.Promise[String]],
      isCancelEnable: CallbackTo[js.Promise[Boolean]],
      isCancellationButtonPrefixIconExists: CallbackTo[js.Promise[Boolean]],
      isCancellationButtonSuffixIconExists: CallbackTo[js.Promise[Boolean]],
      isConfirmationButtonPrefixIconExists: CallbackTo[js.Promise[Boolean]],
      isConfirmationButtonSuffixIconExists: CallbackTo[js.Promise[Boolean]],
      isConfirmationEnable: CallbackTo[js.Promise[Boolean]],
      isThemeExist: MessageBoxFunctionalLayoutTheme => js.Promise[Boolean],
      toHaveBodyPadding: CallbackTo[js.Promise[Boolean]]
    ): MessageBoxFunctionalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickOnCancellationButton = clickOnCancellationButton.toJsFn, clickOnConfirmationButton = clickOnConfirmationButton.toJsFn, clickOnHeaderCloseButton = clickOnHeaderCloseButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getCancellationButton = getCancellationButton.toJsFn, getCancellationButtonText = getCancellationButtonText.toJsFn, getChildBySelector = js.Any.fromFunction1(getChildBySelector), getConfirmationButton = getConfirmationButton.toJsFn, getConfirmationButtonText = getConfirmationButtonText.toJsFn, getFooter = getFooter.toJsFn, getHeaderCloseButton = getHeaderCloseButton.toJsFn, getTitle = getTitle.toJsFn, isCancelEnable = isCancelEnable.toJsFn, isCancellationButtonPrefixIconExists = isCancellationButtonPrefixIconExists.toJsFn, isCancellationButtonSuffixIconExists = isCancellationButtonSuffixIconExists.toJsFn, isConfirmationButtonPrefixIconExists = isConfirmationButtonPrefixIconExists.toJsFn, isConfirmationButtonSuffixIconExists = isConfirmationButtonSuffixIconExists.toJsFn, isConfirmationEnable = isConfirmationEnable.toJsFn, isThemeExist = js.Any.fromFunction1(isThemeExist), toHaveBodyPadding = toHaveBodyPadding.toJsFn)
      __obj.asInstanceOf[MessageBoxFunctionalLayoutUniDriver]
    }
    
    extension [Self <: MessageBoxFunctionalLayoutUniDriver](x: Self) {
      
      inline def setClickOnCancellationButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnCancellationButton", value.toJsFn)
      
      inline def setClickOnConfirmationButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnConfirmationButton", value.toJsFn)
      
      inline def setClickOnHeaderCloseButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnHeaderCloseButton", value.toJsFn)
      
      inline def setGetCancellationButton(value: CallbackTo[js.Promise[UniDriver[Any] | Null]]): Self = StObject.set(x, "getCancellationButton", value.toJsFn)
      
      inline def setGetCancellationButtonText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCancellationButtonText", value.toJsFn)
      
      inline def setGetChildBySelector(value: String => js.Promise[UniDriver[Any] | Null]): Self = StObject.set(x, "getChildBySelector", js.Any.fromFunction1(value))
      
      inline def setGetConfirmationButton(value: CallbackTo[js.Promise[UniDriver[Any] | Null]]): Self = StObject.set(x, "getConfirmationButton", value.toJsFn)
      
      inline def setGetConfirmationButtonText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getConfirmationButtonText", value.toJsFn)
      
      inline def setGetFooter(value: CallbackTo[js.Promise[UniDriver[Any] | Null]]): Self = StObject.set(x, "getFooter", value.toJsFn)
      
      inline def setGetHeaderCloseButton(value: CallbackTo[js.Promise[UniDriver[Any] | Null]]): Self = StObject.set(x, "getHeaderCloseButton", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setIsCancelEnable(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCancelEnable", value.toJsFn)
      
      inline def setIsCancellationButtonPrefixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCancellationButtonPrefixIconExists", value.toJsFn)
      
      inline def setIsCancellationButtonSuffixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCancellationButtonSuffixIconExists", value.toJsFn)
      
      inline def setIsConfirmationButtonPrefixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isConfirmationButtonPrefixIconExists", value.toJsFn)
      
      inline def setIsConfirmationButtonSuffixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isConfirmationButtonSuffixIconExists", value.toJsFn)
      
      inline def setIsConfirmationEnable(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isConfirmationEnable", value.toJsFn)
      
      inline def setIsThemeExist(value: MessageBoxFunctionalLayoutTheme => js.Promise[Boolean]): Self = StObject.set(x, "isThemeExist", js.Any.fromFunction1(value))
      
      inline def setToHaveBodyPadding(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "toHaveBodyPadding", value.toJsFn)
    }
  }
}
