package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDotuniDotdriverMod.ButtonUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutBaseModalLayoutDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseModalLayoutDriverFactory(base: BaseUniDriver): BaseModalLayoutUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseModalLayoutDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseModalLayoutUniDriver]
  
  trait BaseModalLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def childExists(dataHook: String): js.Promise[Boolean]
    
    def clickCloseButton(): js.Promise[Unit]
    
    def clickHelpButton(): js.Promise[Unit]
    
    def getIllustrationSrc(): js.Promise[String]
    
    def getPrimaryButtonDriver(): js.Promise[ButtonUniDriver]
    
    def getPrimaryButtonTooltipContent(): js.Promise[String]
    
    def getSecondaryButtonDriver(): js.Promise[ButtonUniDriver]
    
    def getSubtitleText(): js.Promise[String]
    
    def getTheme(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
  }
  object BaseModalLayoutUniDriver {
    
    inline def apply(
      childExists: String => js.Promise[Boolean],
      click: CallbackTo[js.Promise[Unit]],
      clickCloseButton: CallbackTo[js.Promise[Unit]],
      clickHelpButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getIllustrationSrc: CallbackTo[js.Promise[String]],
      getPrimaryButtonDriver: CallbackTo[js.Promise[ButtonUniDriver]],
      getPrimaryButtonTooltipContent: CallbackTo[js.Promise[String]],
      getSecondaryButtonDriver: CallbackTo[js.Promise[ButtonUniDriver]],
      getSubtitleText: CallbackTo[js.Promise[String]],
      getTheme: CallbackTo[js.Promise[String]],
      getTitleText: CallbackTo[js.Promise[String]]
    ): BaseModalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = click.toJsFn, clickCloseButton = clickCloseButton.toJsFn, clickHelpButton = clickHelpButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getIllustrationSrc = getIllustrationSrc.toJsFn, getPrimaryButtonDriver = getPrimaryButtonDriver.toJsFn, getPrimaryButtonTooltipContent = getPrimaryButtonTooltipContent.toJsFn, getSecondaryButtonDriver = getSecondaryButtonDriver.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getTheme = getTheme.toJsFn, getTitleText = getTitleText.toJsFn)
      __obj.asInstanceOf[BaseModalLayoutUniDriver]
    }
    
    extension [Self <: BaseModalLayoutUniDriver](x: Self) {
      
      inline def setChildExists(value: String => js.Promise[Boolean]): Self = StObject.set(x, "childExists", js.Any.fromFunction1(value))
      
      inline def setClickCloseButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickCloseButton", value.toJsFn)
      
      inline def setClickHelpButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickHelpButton", value.toJsFn)
      
      inline def setGetIllustrationSrc(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getIllustrationSrc", value.toJsFn)
      
      inline def setGetPrimaryButtonDriver(value: CallbackTo[js.Promise[ButtonUniDriver]]): Self = StObject.set(x, "getPrimaryButtonDriver", value.toJsFn)
      
      inline def setGetPrimaryButtonTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPrimaryButtonTooltipContent", value.toJsFn)
      
      inline def setGetSecondaryButtonDriver(value: CallbackTo[js.Promise[ButtonUniDriver]]): Self = StObject.set(x, "getSecondaryButtonDriver", value.toJsFn)
      
      inline def setGetSubtitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitleText", value.toJsFn)
      
      inline def setGetTheme(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTheme", value.toJsFn)
      
      inline def setGetTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleText", value.toJsFn)
    }
  }
}
