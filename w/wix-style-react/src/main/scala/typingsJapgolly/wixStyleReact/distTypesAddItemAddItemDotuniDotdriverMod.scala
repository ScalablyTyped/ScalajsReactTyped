package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddItemAddItemDotuniDotdriverMod {
  
  trait AddItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def blur(): js.Promise[Unit]
    
    def focus(): js.Promise[Unit]
    
    def getSubtitle(): js.Promise[String]
    
    def getText(): js.Promise[String]
    
    def getTooltipContent(): js.Promise[String]
    
    def isFocused(): js.Promise[Boolean]
    
    def textExists(): js.Promise[Boolean]
  }
  object AddItemUniDriver {
    
    inline def apply(
      blur: CallbackTo[js.Promise[Unit]],
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      focus: CallbackTo[js.Promise[Unit]],
      getSubtitle: CallbackTo[js.Promise[String]],
      getText: CallbackTo[js.Promise[String]],
      getTooltipContent: CallbackTo[js.Promise[String]],
      isFocused: CallbackTo[js.Promise[Boolean]],
      textExists: CallbackTo[js.Promise[Boolean]]
    ): AddItemUniDriver = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, getSubtitle = getSubtitle.toJsFn, getText = getText.toJsFn, getTooltipContent = getTooltipContent.toJsFn, isFocused = isFocused.toJsFn, textExists = textExists.toJsFn)
      __obj.asInstanceOf[AddItemUniDriver]
    }
    
    extension [Self <: AddItemUniDriver](x: Self) {
      
      inline def setBlur(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetSubtitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitle", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTooltipContent", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setTextExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "textExists", value.toJsFn)
    }
  }
}
