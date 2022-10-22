package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagTagDotdriverMod {
  
  trait TagDriver
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def getLabel(): String
    
    def isDarkTheme(): Boolean
    
    def isDisabled(): Boolean
    
    def isErrorTheme(): Boolean
    
    def isLarge(): Boolean
    
    def isMedium(): Boolean
    
    def isRemovable(): Boolean
    
    def isSmall(): Boolean
    
    def isStandardTheme(): Boolean
    
    def isSuccessTheme(): Boolean
    
    def isThumbExists(): Boolean
    
    def isTiny(): Boolean
    
    def isWarningTheme(): Boolean
    
    def removeTag(): Unit
  }
  object TagDriver {
    
    inline def apply(
      click: Callback,
      exists: CallbackTo[Boolean],
      getLabel: CallbackTo[String],
      isDarkTheme: CallbackTo[Boolean],
      isDisabled: CallbackTo[Boolean],
      isErrorTheme: CallbackTo[Boolean],
      isLarge: CallbackTo[Boolean],
      isMedium: CallbackTo[Boolean],
      isRemovable: CallbackTo[Boolean],
      isSmall: CallbackTo[Boolean],
      isStandardTheme: CallbackTo[Boolean],
      isSuccessTheme: CallbackTo[Boolean],
      isThumbExists: CallbackTo[Boolean],
      isTiny: CallbackTo[Boolean],
      isWarningTheme: CallbackTo[Boolean],
      removeTag: Callback
    ): TagDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, exists = exists.toJsFn, getLabel = getLabel.toJsFn, isDarkTheme = isDarkTheme.toJsFn, isDisabled = isDisabled.toJsFn, isErrorTheme = isErrorTheme.toJsFn, isLarge = isLarge.toJsFn, isMedium = isMedium.toJsFn, isRemovable = isRemovable.toJsFn, isSmall = isSmall.toJsFn, isStandardTheme = isStandardTheme.toJsFn, isSuccessTheme = isSuccessTheme.toJsFn, isThumbExists = isThumbExists.toJsFn, isTiny = isTiny.toJsFn, isWarningTheme = isWarningTheme.toJsFn, removeTag = removeTag.toJsFn)
      __obj.asInstanceOf[TagDriver]
    }
    
    extension [Self <: TagDriver](x: Self) {
      
      inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setIsDarkTheme(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDarkTheme", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsErrorTheme(value: CallbackTo[Boolean]): Self = StObject.set(x, "isErrorTheme", value.toJsFn)
      
      inline def setIsLarge(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLarge", value.toJsFn)
      
      inline def setIsMedium(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMedium", value.toJsFn)
      
      inline def setIsRemovable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRemovable", value.toJsFn)
      
      inline def setIsSmall(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSmall", value.toJsFn)
      
      inline def setIsStandardTheme(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStandardTheme", value.toJsFn)
      
      inline def setIsSuccessTheme(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuccessTheme", value.toJsFn)
      
      inline def setIsThumbExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isThumbExists", value.toJsFn)
      
      inline def setIsTiny(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTiny", value.toJsFn)
      
      inline def setIsWarningTheme(value: CallbackTo[Boolean]): Self = StObject.set(x, "isWarningTheme", value.toJsFn)
      
      inline def setRemoveTag(value: Callback): Self = StObject.set(x, "removeTag", value.toJsFn)
    }
  }
}
