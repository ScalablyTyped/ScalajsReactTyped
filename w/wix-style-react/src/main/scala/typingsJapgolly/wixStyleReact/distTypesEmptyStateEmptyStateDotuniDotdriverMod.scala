package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesEmptyStateMod.EmptyStateAlign
import typingsJapgolly.wixStyleReact.distTypesEmptyStateMod.EmptyStateTheme
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEmptyStateEmptyStateDotuniDotdriverMod {
  
  trait EmptyStateUniDriver
    extends StObject
       with BaseUniDriver {
    
    def childrenContentExists(): js.Promise[Boolean]
    
    def getImageContainerClassName(): js.Promise[Any]
    
    def getImageUrl(): js.Function1[/* name */ String, js.Promise[String]]
    
    def getSubtitleText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def hasAlign(align: EmptyStateAlign): js.Promise[Boolean]
    
    def hasTheme(themeName: EmptyStateTheme): js.Promise[Boolean]
    
    def imageNodeExists(): js.Promise[Boolean]
  }
  object EmptyStateUniDriver {
    
    inline def apply(
      childrenContentExists: CallbackTo[js.Promise[Boolean]],
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getImageContainerClassName: CallbackTo[js.Promise[Any]],
      getImageUrl: CallbackTo[js.Function1[/* name */ String, js.Promise[String]]],
      getSubtitleText: CallbackTo[js.Promise[String]],
      getTitleText: CallbackTo[js.Promise[String]],
      hasAlign: EmptyStateAlign => js.Promise[Boolean],
      hasTheme: EmptyStateTheme => js.Promise[Boolean],
      imageNodeExists: CallbackTo[js.Promise[Boolean]]
    ): EmptyStateUniDriver = {
      val __obj = js.Dynamic.literal(childrenContentExists = childrenContentExists.toJsFn, click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getImageContainerClassName = getImageContainerClassName.toJsFn, getImageUrl = getImageUrl.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getTitleText = getTitleText.toJsFn, hasAlign = js.Any.fromFunction1(hasAlign), hasTheme = js.Any.fromFunction1(hasTheme), imageNodeExists = imageNodeExists.toJsFn)
      __obj.asInstanceOf[EmptyStateUniDriver]
    }
    
    extension [Self <: EmptyStateUniDriver](x: Self) {
      
      inline def setChildrenContentExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "childrenContentExists", value.toJsFn)
      
      inline def setGetImageContainerClassName(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getImageContainerClassName", value.toJsFn)
      
      inline def setGetImageUrl(value: CallbackTo[js.Function1[/* name */ String, js.Promise[String]]]): Self = StObject.set(x, "getImageUrl", value.toJsFn)
      
      inline def setGetSubtitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitleText", value.toJsFn)
      
      inline def setGetTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleText", value.toJsFn)
      
      inline def setHasAlign(value: EmptyStateAlign => js.Promise[Boolean]): Self = StObject.set(x, "hasAlign", js.Any.fromFunction1(value))
      
      inline def setHasTheme(value: EmptyStateTheme => js.Promise[Boolean]): Self = StObject.set(x, "hasTheme", js.Any.fromFunction1(value))
      
      inline def setImageNodeExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "imageNodeExists", value.toJsFn)
    }
  }
}
