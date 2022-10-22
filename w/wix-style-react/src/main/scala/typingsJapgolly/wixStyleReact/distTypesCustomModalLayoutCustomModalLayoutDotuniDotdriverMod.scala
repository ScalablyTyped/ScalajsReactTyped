package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutBaseModalLayoutDotuniDotdriverMod.BaseModalLayoutUniDriver
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDotuniDotdriverMod.ButtonUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCustomModalLayoutCustomModalLayoutDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/CustomModalLayout/CustomModalLayout.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def customModalLayoutDriverFactory(base: BaseUniDriver): CustomModalLayoutUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("customModalLayoutDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CustomModalLayoutUniDriver]
  
  trait CustomModalLayoutUniDriver
    extends StObject
       with BaseModalLayoutUniDriver {
    
    def hasContentPadding(): js.Promise[Boolean]
  }
  object CustomModalLayoutUniDriver {
    
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
      getTitleText: CallbackTo[js.Promise[String]],
      hasContentPadding: CallbackTo[js.Promise[Boolean]]
    ): CustomModalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = click.toJsFn, clickCloseButton = clickCloseButton.toJsFn, clickHelpButton = clickHelpButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getIllustrationSrc = getIllustrationSrc.toJsFn, getPrimaryButtonDriver = getPrimaryButtonDriver.toJsFn, getPrimaryButtonTooltipContent = getPrimaryButtonTooltipContent.toJsFn, getSecondaryButtonDriver = getSecondaryButtonDriver.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getTheme = getTheme.toJsFn, getTitleText = getTitleText.toJsFn, hasContentPadding = hasContentPadding.toJsFn)
      __obj.asInstanceOf[CustomModalLayoutUniDriver]
    }
    
    extension [Self <: CustomModalLayoutUniDriver](x: Self) {
      
      inline def setHasContentPadding(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasContentPadding", value.toJsFn)
    }
  }
}
