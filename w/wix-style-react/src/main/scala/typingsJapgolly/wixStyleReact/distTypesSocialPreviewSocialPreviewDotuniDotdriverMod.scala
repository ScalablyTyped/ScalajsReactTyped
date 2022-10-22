package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesSocialPreviewMod.SocialPreviewSize
import typingsJapgolly.wixStyleReact.distTypesSocialPreviewMod.SocialPreviewSkin
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialPreviewSocialPreviewDotuniDotdriverMod {
  
  trait SocialPreviewUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDescription(): js.Promise[String]
    
    def getPreviewUrl(): js.Promise[String]
    
    def getSize(): js.Promise[SocialPreviewSize]
    
    def getSkin(): js.Promise[SocialPreviewSkin]
    
    def getTitle(): js.Promise[String]
  }
  object SocialPreviewUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getDescription: CallbackTo[js.Promise[String]],
      getPreviewUrl: CallbackTo[js.Promise[String]],
      getSize: CallbackTo[js.Promise[SocialPreviewSize]],
      getSkin: CallbackTo[js.Promise[SocialPreviewSkin]],
      getTitle: CallbackTo[js.Promise[String]]
    ): SocialPreviewUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getDescription = getDescription.toJsFn, getPreviewUrl = getPreviewUrl.toJsFn, getSize = getSize.toJsFn, getSkin = getSkin.toJsFn, getTitle = getTitle.toJsFn)
      __obj.asInstanceOf[SocialPreviewUniDriver]
    }
    
    extension [Self <: SocialPreviewUniDriver](x: Self) {
      
      inline def setGetDescription(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDescription", value.toJsFn)
      
      inline def setGetPreviewUrl(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPreviewUrl", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[js.Promise[SocialPreviewSize]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[SocialPreviewSkin]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
    }
  }
}
