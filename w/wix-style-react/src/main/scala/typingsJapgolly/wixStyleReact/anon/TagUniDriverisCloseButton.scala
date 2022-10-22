package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesTextMod.TextSize
import typingsJapgolly.wixStyleReact.distTypesTextMod.TextWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wix-style-react.wix-style-react/dist/types/Tag/Tag.uni.driver.TagUniDriver & {isCloseButtonSmall (): std.Promise<boolean>, isCloseButtonLarge (): std.Promise<boolean>, getTextSize (): wix-style-react.wix-style-react/dist/types/Text.TextSize, getTextWeight (): wix-style-react.wix-style-react/dist/types/Text.TextWeight, isClickable (): std.Promise<boolean>} */
trait TagUniDriverisCloseButton extends StObject {
  
  /** click on the element */
  def click(): js.Promise[Unit]
  
  /** returns the component element */
  def element(): js.Promise[Any]
  
  /** returns true if component exists */
  def exists(): js.Promise[Boolean]
  
  def getLabel(): js.Promise[String]
  
  def getTextSize(): TextSize
  
  def getTextWeight(): TextWeight
  
  def isClickable(): js.Promise[Boolean]
  
  def isCloseButtonLarge(): js.Promise[Boolean]
  
  def isCloseButtonSmall(): js.Promise[Boolean]
  
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
object TagUniDriverisCloseButton {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    getLabel: CallbackTo[js.Promise[String]],
    getTextSize: CallbackTo[TextSize],
    getTextWeight: CallbackTo[TextWeight],
    isClickable: CallbackTo[js.Promise[Boolean]],
    isCloseButtonLarge: CallbackTo[js.Promise[Boolean]],
    isCloseButtonSmall: CallbackTo[js.Promise[Boolean]],
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
  ): TagUniDriverisCloseButton = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getLabel = getLabel.toJsFn, getTextSize = getTextSize.toJsFn, getTextWeight = getTextWeight.toJsFn, isClickable = isClickable.toJsFn, isCloseButtonLarge = isCloseButtonLarge.toJsFn, isCloseButtonSmall = isCloseButtonSmall.toJsFn, isDarkTheme = isDarkTheme.toJsFn, isDisabled = isDisabled.toJsFn, isErrorTheme = isErrorTheme.toJsFn, isLarge = isLarge.toJsFn, isMedium = isMedium.toJsFn, isRemovable = isRemovable.toJsFn, isSmall = isSmall.toJsFn, isStandardTheme = isStandardTheme.toJsFn, isSuccessTheme = isSuccessTheme.toJsFn, isThumbExists = isThumbExists.toJsFn, isTiny = isTiny.toJsFn, isWarningTheme = isWarningTheme.toJsFn, removeTag = removeTag.toJsFn)
    __obj.asInstanceOf[TagUniDriverisCloseButton]
  }
  
  extension [Self <: TagUniDriverisCloseButton](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setGetTextSize(value: CallbackTo[TextSize]): Self = StObject.set(x, "getTextSize", value.toJsFn)
    
    inline def setGetTextWeight(value: CallbackTo[TextWeight]): Self = StObject.set(x, "getTextWeight", value.toJsFn)
    
    inline def setIsClickable(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isClickable", value.toJsFn)
    
    inline def setIsCloseButtonLarge(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCloseButtonLarge", value.toJsFn)
    
    inline def setIsCloseButtonSmall(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCloseButtonSmall", value.toJsFn)
    
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
