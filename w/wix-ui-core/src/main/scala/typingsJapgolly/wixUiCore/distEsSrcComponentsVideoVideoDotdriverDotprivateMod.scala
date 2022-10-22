package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsVideoVideoDotuniDotdriverMod.IVideoDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsVideoVideoDotdriverDotprivateMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/video/Video.driver.private", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def videoPrivateDriverFactory(base: UniDriver[Any]): IVideoPrivateDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("videoPrivateDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[IVideoPrivateDriver]
  
  trait IVideoPrivateDriver
    extends StObject
       with IVideoDriver {
    
    def getHeightDataAttr(): js.Promise[String]
    
    def getLogoSrc(): js.Promise[String]
    
    def getNative(): js.Promise[Any]
    
    def getTitle(): js.Promise[String]
    
    def getWidthDataAttr(): js.Promise[String]
    
    def hasCover(): js.Promise[Boolean]
    
    def hasPlayButton(): js.Promise[Boolean]
    
    def hasTitle(): js.Promise[Boolean]
  }
  object IVideoPrivateDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getHeightDataAttr: CallbackTo[js.Promise[String]],
      getLogoSrc: CallbackTo[js.Promise[String]],
      getNative: CallbackTo[js.Promise[Any]],
      getPlayerName: CallbackTo[js.Promise[String]],
      getTitle: CallbackTo[js.Promise[String]],
      getWidthDataAttr: CallbackTo[js.Promise[String]],
      hasCover: CallbackTo[js.Promise[Boolean]],
      hasPlayButton: CallbackTo[js.Promise[Boolean]],
      hasTitle: CallbackTo[js.Promise[Boolean]]
    ): IVideoPrivateDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getHeightDataAttr = getHeightDataAttr.toJsFn, getLogoSrc = getLogoSrc.toJsFn, getNative = getNative.toJsFn, getPlayerName = getPlayerName.toJsFn, getTitle = getTitle.toJsFn, getWidthDataAttr = getWidthDataAttr.toJsFn, hasCover = hasCover.toJsFn, hasPlayButton = hasPlayButton.toJsFn, hasTitle = hasTitle.toJsFn)
      __obj.asInstanceOf[IVideoPrivateDriver]
    }
    
    extension [Self <: IVideoPrivateDriver](x: Self) {
      
      inline def setGetHeightDataAttr(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getHeightDataAttr", value.toJsFn)
      
      inline def setGetLogoSrc(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLogoSrc", value.toJsFn)
      
      inline def setGetNative(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getNative", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setGetWidthDataAttr(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWidthDataAttr", value.toJsFn)
      
      inline def setHasCover(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasCover", value.toJsFn)
      
      inline def setHasPlayButton(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasPlayButton", value.toJsFn)
      
      inline def setHasTitle(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasTitle", value.toJsFn)
    }
  }
}
