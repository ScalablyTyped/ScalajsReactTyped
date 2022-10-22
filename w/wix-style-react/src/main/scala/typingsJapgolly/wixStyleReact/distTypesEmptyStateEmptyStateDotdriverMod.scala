package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesEmptyStateMod.EmptyStateAlign
import typingsJapgolly.wixStyleReact.distTypesEmptyStateMod.EmptyStateTheme
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEmptyStateEmptyStateDotdriverMod {
  
  trait EmptyStateDriver
    extends StObject
       with BaseDriver {
    
    def childrenContentExists(): Boolean
    
    def element(): HTMLElement
    
    def getImageContainerClassName(): String
    
    def getImageUrl(): String
    
    def getSubtitleText(): String
    
    def getTitleText(): String
    
    def hasAlign(align: EmptyStateAlign): Boolean
    
    def hasTheme(themeName: EmptyStateTheme): Boolean
    
    def imageNodeExists(): Boolean
  }
  object EmptyStateDriver {
    
    inline def apply(
      childrenContentExists: CallbackTo[Boolean],
      element: CallbackTo[HTMLElement],
      exists: CallbackTo[Boolean],
      getImageContainerClassName: CallbackTo[String],
      getImageUrl: CallbackTo[String],
      getSubtitleText: CallbackTo[String],
      getTitleText: CallbackTo[String],
      hasAlign: EmptyStateAlign => Boolean,
      hasTheme: EmptyStateTheme => Boolean,
      imageNodeExists: CallbackTo[Boolean]
    ): EmptyStateDriver = {
      val __obj = js.Dynamic.literal(childrenContentExists = childrenContentExists.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getImageContainerClassName = getImageContainerClassName.toJsFn, getImageUrl = getImageUrl.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getTitleText = getTitleText.toJsFn, hasAlign = js.Any.fromFunction1(hasAlign), hasTheme = js.Any.fromFunction1(hasTheme), imageNodeExists = imageNodeExists.toJsFn)
      __obj.asInstanceOf[EmptyStateDriver]
    }
    
    extension [Self <: EmptyStateDriver](x: Self) {
      
      inline def setChildrenContentExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "childrenContentExists", value.toJsFn)
      
      inline def setElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setGetImageContainerClassName(value: CallbackTo[String]): Self = StObject.set(x, "getImageContainerClassName", value.toJsFn)
      
      inline def setGetImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "getImageUrl", value.toJsFn)
      
      inline def setGetSubtitleText(value: CallbackTo[String]): Self = StObject.set(x, "getSubtitleText", value.toJsFn)
      
      inline def setGetTitleText(value: CallbackTo[String]): Self = StObject.set(x, "getTitleText", value.toJsFn)
      
      inline def setHasAlign(value: EmptyStateAlign => Boolean): Self = StObject.set(x, "hasAlign", js.Any.fromFunction1(value))
      
      inline def setHasTheme(value: EmptyStateTheme => Boolean): Self = StObject.set(x, "hasTheme", js.Any.fromFunction1(value))
      
      inline def setImageNodeExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "imageNodeExists", value.toJsFn)
    }
  }
}
