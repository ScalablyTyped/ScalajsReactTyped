package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagTagDotuniDotdriverMod {
  
  trait TagUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getLabel(): js.Promise[String]
    
    def isDarkTheme(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isErrorTheme(): js.Promise[Boolean]
    
    def isLarge(): js.Promise[Boolean]
    
    def isMedium(): js.Promise[Boolean]
    
    def isRemovable(): js.Promise[Boolean]
    
    def isSmall(): js.Promise[Boolean]
    
    def isStandardTheme(): js.Promise[Boolean]
    
    def isSuccessTheme(): js.Promise[Boolean]
    
    def isThumbExists(): js.Promise[Boolean]
    
    def isTiny(): js.Promise[Boolean]
    
    def isWarningTheme(): js.Promise[Boolean]
    
    def removeTag(): js.Promise[Unit]
  }
  object TagUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getLabel: CallbackTo[js.Promise[String]],
      isDarkTheme: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isErrorTheme: CallbackTo[js.Promise[Boolean]],
      isLarge: CallbackTo[js.Promise[Boolean]],
      isMedium: CallbackTo[js.Promise[Boolean]],
      isRemovable: CallbackTo[js.Promise[Boolean]],
      isSmall: CallbackTo[js.Promise[Boolean]],
      isStandardTheme: CallbackTo[js.Promise[Boolean]],
      isSuccessTheme: CallbackTo[js.Promise[Boolean]],
      isThumbExists: CallbackTo[js.Promise[Boolean]],
      isTiny: CallbackTo[js.Promise[Boolean]],
      isWarningTheme: CallbackTo[js.Promise[Boolean]],
      removeTag: CallbackTo[js.Promise[Unit]]
    ): TagUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getLabel = getLabel.toJsFn, isDarkTheme = isDarkTheme.toJsFn, isDisabled = isDisabled.toJsFn, isErrorTheme = isErrorTheme.toJsFn, isLarge = isLarge.toJsFn, isMedium = isMedium.toJsFn, isRemovable = isRemovable.toJsFn, isSmall = isSmall.toJsFn, isStandardTheme = isStandardTheme.toJsFn, isSuccessTheme = isSuccessTheme.toJsFn, isThumbExists = isThumbExists.toJsFn, isTiny = isTiny.toJsFn, isWarningTheme = isWarningTheme.toJsFn, removeTag = removeTag.toJsFn)
      __obj.asInstanceOf[TagUniDriver]
    }
    
    extension [Self <: TagUniDriver](x: Self) {
      
      inline def setGetLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setIsDarkTheme(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDarkTheme", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsErrorTheme(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isErrorTheme", value.toJsFn)
      
      inline def setIsLarge(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLarge", value.toJsFn)
      
      inline def setIsMedium(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isMedium", value.toJsFn)
      
      inline def setIsRemovable(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isRemovable", value.toJsFn)
      
      inline def setIsSmall(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSmall", value.toJsFn)
      
      inline def setIsStandardTheme(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isStandardTheme", value.toJsFn)
      
      inline def setIsSuccessTheme(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccessTheme", value.toJsFn)
      
      inline def setIsThumbExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isThumbExists", value.toJsFn)
      
      inline def setIsTiny(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTiny", value.toJsFn)
      
      inline def setIsWarningTheme(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isWarningTheme", value.toJsFn)
      
      inline def setRemoveTag(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "removeTag", value.toJsFn)
    }
  }
}
