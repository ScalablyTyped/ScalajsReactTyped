package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemActionListItemActionDotuniDotdriverMod {
  
  trait ListItemActionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[String | Null]
    
    def getSubtitleText(): js.Promise[String]
    
    def getSuffixText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isPrefixIconExists(): js.Promise[Boolean]
    
    def isSubtitleExists(): js.Promise[Boolean]
    
    def isSuffixExists(): js.Promise[Boolean]
    
    def isTitleExists(): js.Promise[Boolean]
  }
  object ListItemActionUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSkin: CallbackTo[js.Promise[String | Null]],
      getSubtitleText: CallbackTo[js.Promise[String]],
      getSuffixText: CallbackTo[js.Promise[String]],
      getTitleText: CallbackTo[js.Promise[String]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isPrefixIconExists: CallbackTo[js.Promise[Boolean]],
      isSubtitleExists: CallbackTo[js.Promise[Boolean]],
      isSuffixExists: CallbackTo[js.Promise[Boolean]],
      isTitleExists: CallbackTo[js.Promise[Boolean]]
    ): ListItemActionUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSkin = getSkin.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getSuffixText = getSuffixText.toJsFn, getTitleText = getTitleText.toJsFn, isDisabled = isDisabled.toJsFn, isPrefixIconExists = isPrefixIconExists.toJsFn, isSubtitleExists = isSubtitleExists.toJsFn, isSuffixExists = isSuffixExists.toJsFn, isTitleExists = isTitleExists.toJsFn)
      __obj.asInstanceOf[ListItemActionUniDriver]
    }
    
    extension [Self <: ListItemActionUniDriver](x: Self) {
      
      inline def setGetSkin(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetSubtitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitleText", value.toJsFn)
      
      inline def setGetSuffixText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSuffixText", value.toJsFn)
      
      inline def setGetTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleText", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsPrefixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPrefixIconExists", value.toJsFn)
      
      inline def setIsSubtitleExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSubtitleExists", value.toJsFn)
      
      inline def setIsSuffixExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuffixExists", value.toJsFn)
      
      inline def setIsTitleExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTitleExists", value.toJsFn)
    }
  }
}
