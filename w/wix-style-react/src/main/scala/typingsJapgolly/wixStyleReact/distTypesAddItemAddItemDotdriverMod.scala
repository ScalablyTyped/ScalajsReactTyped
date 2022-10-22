package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddItemAddItemDotdriverMod {
  
  trait AddItemDriver[T]
    extends StObject
       with BaseDriver {
    
    def blur(): Unit
    
    def click(): Unit
    
    def element(): T
    
    def focus(): Unit
    
    def getSubtitle(): String
    
    def getText(): String
    
    def getTooltipContent(): String
    
    def isFocused(): Boolean
    
    def textExists(): Boolean
  }
  object AddItemDriver {
    
    inline def apply[T](
      blur: Callback,
      click: Callback,
      element: CallbackTo[T],
      exists: CallbackTo[Boolean],
      focus: Callback,
      getSubtitle: CallbackTo[String],
      getText: CallbackTo[String],
      getTooltipContent: CallbackTo[String],
      isFocused: CallbackTo[Boolean],
      textExists: CallbackTo[Boolean]
    ): AddItemDriver[T] = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, getSubtitle = getSubtitle.toJsFn, getText = getText.toJsFn, getTooltipContent = getTooltipContent.toJsFn, isFocused = isFocused.toJsFn, textExists = textExists.toJsFn)
      __obj.asInstanceOf[AddItemDriver[T]]
    }
    
    extension [Self <: AddItemDriver[?], T](x: Self & AddItemDriver[T]) {
      
      inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setElement(value: CallbackTo[T]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetSubtitle(value: CallbackTo[String]): Self = StObject.set(x, "getSubtitle", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetTooltipContent(value: CallbackTo[String]): Self = StObject.set(x, "getTooltipContent", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setTextExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "textExists", value.toJsFn)
    }
  }
}
