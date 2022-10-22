package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageBoxMarketerialLayoutMessageBoxMarketerialLayoutDotdriverMod {
  
  trait MessageBoxMarketerialLayoutDriver
    extends StObject
       with BaseDriver {
    
    def clickOnPrimaryButton(): Unit
    
    def clickOnSecondaryButton(): Unit
    
    def closeMessageBox(): Unit
    
    def getContentBySelector(selector: String): HTMLElement | Null
    
    def getHeaderCloseButton(): HTMLButtonElement
    
    def getImageSrc(): String
    
    def getPrimaryButton(): HTMLButtonElement
    
    def getPrimaryButtonNode(): HTMLElement | Null
    
    def getPrimaryButtonText(): String
    
    def getSecondaryButton(): HTMLElement
    
    def getSecondaryButtonText(): String
    
    def getTitle(): String
  }
  object MessageBoxMarketerialLayoutDriver {
    
    inline def apply(
      clickOnPrimaryButton: Callback,
      clickOnSecondaryButton: Callback,
      closeMessageBox: Callback,
      exists: CallbackTo[Boolean],
      getContentBySelector: String => HTMLElement | Null,
      getHeaderCloseButton: CallbackTo[HTMLButtonElement],
      getImageSrc: CallbackTo[String],
      getPrimaryButton: CallbackTo[HTMLButtonElement],
      getPrimaryButtonNode: CallbackTo[HTMLElement | Null],
      getPrimaryButtonText: CallbackTo[String],
      getSecondaryButton: CallbackTo[HTMLElement],
      getSecondaryButtonText: CallbackTo[String],
      getTitle: CallbackTo[String]
    ): MessageBoxMarketerialLayoutDriver = {
      val __obj = js.Dynamic.literal(clickOnPrimaryButton = clickOnPrimaryButton.toJsFn, clickOnSecondaryButton = clickOnSecondaryButton.toJsFn, closeMessageBox = closeMessageBox.toJsFn, exists = exists.toJsFn, getContentBySelector = js.Any.fromFunction1(getContentBySelector), getHeaderCloseButton = getHeaderCloseButton.toJsFn, getImageSrc = getImageSrc.toJsFn, getPrimaryButton = getPrimaryButton.toJsFn, getPrimaryButtonNode = getPrimaryButtonNode.toJsFn, getPrimaryButtonText = getPrimaryButtonText.toJsFn, getSecondaryButton = getSecondaryButton.toJsFn, getSecondaryButtonText = getSecondaryButtonText.toJsFn, getTitle = getTitle.toJsFn)
      __obj.asInstanceOf[MessageBoxMarketerialLayoutDriver]
    }
    
    extension [Self <: MessageBoxMarketerialLayoutDriver](x: Self) {
      
      inline def setClickOnPrimaryButton(value: Callback): Self = StObject.set(x, "clickOnPrimaryButton", value.toJsFn)
      
      inline def setClickOnSecondaryButton(value: Callback): Self = StObject.set(x, "clickOnSecondaryButton", value.toJsFn)
      
      inline def setCloseMessageBox(value: Callback): Self = StObject.set(x, "closeMessageBox", value.toJsFn)
      
      inline def setGetContentBySelector(value: String => HTMLElement | Null): Self = StObject.set(x, "getContentBySelector", js.Any.fromFunction1(value))
      
      inline def setGetHeaderCloseButton(value: CallbackTo[HTMLButtonElement]): Self = StObject.set(x, "getHeaderCloseButton", value.toJsFn)
      
      inline def setGetImageSrc(value: CallbackTo[String]): Self = StObject.set(x, "getImageSrc", value.toJsFn)
      
      inline def setGetPrimaryButton(value: CallbackTo[HTMLButtonElement]): Self = StObject.set(x, "getPrimaryButton", value.toJsFn)
      
      inline def setGetPrimaryButtonNode(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "getPrimaryButtonNode", value.toJsFn)
      
      inline def setGetPrimaryButtonText(value: CallbackTo[String]): Self = StObject.set(x, "getPrimaryButtonText", value.toJsFn)
      
      inline def setGetSecondaryButton(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getSecondaryButton", value.toJsFn)
      
      inline def setGetSecondaryButtonText(value: CallbackTo[String]): Self = StObject.set(x, "getSecondaryButtonText", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    }
  }
}
