package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageBoxMarketerialLayoutMessageBoxMarketerialLayoutDotuniDotdriverMod {
  
  trait MessageBoxMarketerialLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnPrimaryButton(): Unit
    
    def clickOnSecondaryButton(): Unit
    
    def closeMessageBox(): Unit
    
    def getContentBySelector(selector: String): js.Promise[UniDriver[Any] | Null]
    
    def getHeaderCloseButton(): js.Promise[UniDriver[Any] | Null]
    
    def getImageSrc(): js.Promise[String | Null]
    
    def getPrimaryButton(): js.Promise[UniDriver[Any] | Null]
    
    def getPrimaryButtonNode(): js.Promise[UniDriver[Any] | Null]
    
    def getPrimaryButtonText(): js.Promise[String]
    
    def getSecondaryButton(): js.Promise[UniDriver[Any] | Null]
    
    def getSecondaryButtonText(): js.Promise[String]
    
    def getTitle(): js.Promise[String]
  }
  object MessageBoxMarketerialLayoutUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickOnPrimaryButton: Callback,
      clickOnSecondaryButton: Callback,
      closeMessageBox: Callback,
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getContentBySelector: String => js.Promise[UniDriver[Any] | Null],
      getHeaderCloseButton: CallbackTo[js.Promise[UniDriver[Any] | Null]],
      getImageSrc: CallbackTo[js.Promise[String | Null]],
      getPrimaryButton: CallbackTo[js.Promise[UniDriver[Any] | Null]],
      getPrimaryButtonNode: CallbackTo[js.Promise[UniDriver[Any] | Null]],
      getPrimaryButtonText: CallbackTo[js.Promise[String]],
      getSecondaryButton: CallbackTo[js.Promise[UniDriver[Any] | Null]],
      getSecondaryButtonText: CallbackTo[js.Promise[String]],
      getTitle: CallbackTo[js.Promise[String]]
    ): MessageBoxMarketerialLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickOnPrimaryButton = clickOnPrimaryButton.toJsFn, clickOnSecondaryButton = clickOnSecondaryButton.toJsFn, closeMessageBox = closeMessageBox.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getContentBySelector = js.Any.fromFunction1(getContentBySelector), getHeaderCloseButton = getHeaderCloseButton.toJsFn, getImageSrc = getImageSrc.toJsFn, getPrimaryButton = getPrimaryButton.toJsFn, getPrimaryButtonNode = getPrimaryButtonNode.toJsFn, getPrimaryButtonText = getPrimaryButtonText.toJsFn, getSecondaryButton = getSecondaryButton.toJsFn, getSecondaryButtonText = getSecondaryButtonText.toJsFn, getTitle = getTitle.toJsFn)
      __obj.asInstanceOf[MessageBoxMarketerialLayoutUniDriver]
    }
    
    extension [Self <: MessageBoxMarketerialLayoutUniDriver](x: Self) {
      
      inline def setClickOnPrimaryButton(value: Callback): Self = StObject.set(x, "clickOnPrimaryButton", value.toJsFn)
      
      inline def setClickOnSecondaryButton(value: Callback): Self = StObject.set(x, "clickOnSecondaryButton", value.toJsFn)
      
      inline def setCloseMessageBox(value: Callback): Self = StObject.set(x, "closeMessageBox", value.toJsFn)
      
      inline def setGetContentBySelector(value: String => js.Promise[UniDriver[Any] | Null]): Self = StObject.set(x, "getContentBySelector", js.Any.fromFunction1(value))
      
      inline def setGetHeaderCloseButton(value: CallbackTo[js.Promise[UniDriver[Any] | Null]]): Self = StObject.set(x, "getHeaderCloseButton", value.toJsFn)
      
      inline def setGetImageSrc(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getImageSrc", value.toJsFn)
      
      inline def setGetPrimaryButton(value: CallbackTo[js.Promise[UniDriver[Any] | Null]]): Self = StObject.set(x, "getPrimaryButton", value.toJsFn)
      
      inline def setGetPrimaryButtonNode(value: CallbackTo[js.Promise[UniDriver[Any] | Null]]): Self = StObject.set(x, "getPrimaryButtonNode", value.toJsFn)
      
      inline def setGetPrimaryButtonText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPrimaryButtonText", value.toJsFn)
      
      inline def setGetSecondaryButton(value: CallbackTo[js.Promise[UniDriver[Any] | Null]]): Self = StObject.set(x, "getSecondaryButton", value.toJsFn)
      
      inline def setGetSecondaryButtonText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSecondaryButtonText", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
    }
  }
}
