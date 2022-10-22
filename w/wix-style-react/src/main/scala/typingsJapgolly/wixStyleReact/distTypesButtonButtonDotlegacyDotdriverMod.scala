package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonDotlegacyDotdriverMod {
  
  trait buttonDriverFactory
    extends StObject
       with BaseDriver {
    
    def blur(): Unit
    
    def click(): Unit
    
    def focus(): Unit
    
    def getButtonTextContent(): String
    
    def isButtonDisabled(): Boolean
    
    def isPrefixIconExists(): Boolean
    
    def isSuffixIconExists(): Boolean
    
    def mouseEnter(): Unit
    
    def mouseLeave(): Unit
  }
  object buttonDriverFactory {
    
    inline def apply(
      blur: Callback,
      click: Callback,
      exists: CallbackTo[Boolean],
      focus: Callback,
      getButtonTextContent: CallbackTo[String],
      isButtonDisabled: CallbackTo[Boolean],
      isPrefixIconExists: CallbackTo[Boolean],
      isSuffixIconExists: CallbackTo[Boolean],
      mouseEnter: Callback,
      mouseLeave: Callback
    ): buttonDriverFactory = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, getButtonTextContent = getButtonTextContent.toJsFn, isButtonDisabled = isButtonDisabled.toJsFn, isPrefixIconExists = isPrefixIconExists.toJsFn, isSuffixIconExists = isSuffixIconExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
      __obj.asInstanceOf[buttonDriverFactory]
    }
    
    extension [Self <: buttonDriverFactory](x: Self) {
      
      inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetButtonTextContent(value: CallbackTo[String]): Self = StObject.set(x, "getButtonTextContent", value.toJsFn)
      
      inline def setIsButtonDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isButtonDisabled", value.toJsFn)
      
      inline def setIsPrefixIconExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPrefixIconExists", value.toJsFn)
      
      inline def setIsSuffixIconExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuffixIconExists", value.toJsFn)
      
      inline def setMouseEnter(value: Callback): Self = StObject.set(x, "mouseEnter", value.toJsFn)
      
      inline def setMouseLeave(value: Callback): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    }
  }
}
