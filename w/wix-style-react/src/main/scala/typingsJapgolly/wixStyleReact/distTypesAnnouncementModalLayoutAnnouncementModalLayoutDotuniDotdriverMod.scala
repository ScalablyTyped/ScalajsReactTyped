package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutBaseModalLayoutDotuniDotdriverMod.BaseModalLayoutUniDriver
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDotuniDotdriverMod.ButtonUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnnouncementModalLayoutAnnouncementModalLayoutDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/AnnouncementModalLayout/AnnouncementModalLayout.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def announcementModalLayoutDriverFactory(base: BaseUniDriver): AnnouncementModalLayoutUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("announcementModalLayoutDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[AnnouncementModalLayoutUniDriver]
  
  trait AnnouncementModalLayoutUniDriver
    extends StObject
       with BaseModalLayoutUniDriver
       with LinkBlockUniDriver {
    
    /** returns true if component exists */
    /* InferMemberOverrides */
    override def exists(): js.Promise[Boolean]
  }
  object AnnouncementModalLayoutUniDriver {
    
    inline def apply(
      childExists: String => js.Promise[Boolean],
      click: CallbackTo[js.Promise[Unit]],
      clickCloseButton: CallbackTo[js.Promise[Unit]],
      clickHelpButton: CallbackTo[js.Promise[Unit]],
      clickLink: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getIllustrationSrc: CallbackTo[js.Promise[String]],
      getLinkText: CallbackTo[js.Promise[String]],
      getPrimaryButtonDriver: CallbackTo[js.Promise[ButtonUniDriver]],
      getPrimaryButtonTooltipContent: CallbackTo[js.Promise[String]],
      getSecondaryButtonDriver: CallbackTo[js.Promise[ButtonUniDriver]],
      getSubtitleText: CallbackTo[js.Promise[String]],
      getTheme: CallbackTo[js.Promise[String]],
      getTitleText: CallbackTo[js.Promise[String]]
    ): AnnouncementModalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = click.toJsFn, clickCloseButton = clickCloseButton.toJsFn, clickHelpButton = clickHelpButton.toJsFn, clickLink = clickLink.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getIllustrationSrc = getIllustrationSrc.toJsFn, getLinkText = getLinkText.toJsFn, getPrimaryButtonDriver = getPrimaryButtonDriver.toJsFn, getPrimaryButtonTooltipContent = getPrimaryButtonTooltipContent.toJsFn, getSecondaryButtonDriver = getSecondaryButtonDriver.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getTheme = getTheme.toJsFn, getTitleText = getTitleText.toJsFn)
      __obj.asInstanceOf[AnnouncementModalLayoutUniDriver]
    }
    
    extension [Self <: AnnouncementModalLayoutUniDriver](x: Self) {
      
      inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    }
  }
  
  trait LinkBlockUniDriver extends StObject {
    
    def clickLink(): js.Promise[Unit]
    
    def exists(): js.Promise[Boolean]
    
    def getLinkText(): js.Promise[String]
  }
  object LinkBlockUniDriver {
    
    inline def apply(
      clickLink: CallbackTo[js.Promise[Unit]],
      exists: CallbackTo[js.Promise[Boolean]],
      getLinkText: CallbackTo[js.Promise[String]]
    ): LinkBlockUniDriver = {
      val __obj = js.Dynamic.literal(clickLink = clickLink.toJsFn, exists = exists.toJsFn, getLinkText = getLinkText.toJsFn)
      __obj.asInstanceOf[LinkBlockUniDriver]
    }
    
    extension [Self <: LinkBlockUniDriver](x: Self) {
      
      inline def setClickLink(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickLink", value.toJsFn)
      
      inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
      
      inline def setGetLinkText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLinkText", value.toJsFn)
    }
  }
}
