package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.facebook
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.instagram
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialPostPreviewSocialPostPreviewDotuniDotdriverMod {
  
  trait SocialPostPreviewUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getCaption(): js.Promise[String]
    
    def getProfileImageSrc(): js.Promise[String]
    
    def getProfileName(): js.Promise[String]
    
    def getSkin(): js.Promise[instagram | facebook]
  }
  object SocialPostPreviewUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getCaption: CallbackTo[js.Promise[String]],
      getProfileImageSrc: CallbackTo[js.Promise[String]],
      getProfileName: CallbackTo[js.Promise[String]],
      getSkin: CallbackTo[js.Promise[instagram | facebook]]
    ): SocialPostPreviewUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getCaption = getCaption.toJsFn, getProfileImageSrc = getProfileImageSrc.toJsFn, getProfileName = getProfileName.toJsFn, getSkin = getSkin.toJsFn)
      __obj.asInstanceOf[SocialPostPreviewUniDriver]
    }
    
    extension [Self <: SocialPostPreviewUniDriver](x: Self) {
      
      inline def setGetCaption(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCaption", value.toJsFn)
      
      inline def setGetProfileImageSrc(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getProfileImageSrc", value.toJsFn)
      
      inline def setGetProfileName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getProfileName", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[instagram | facebook]]): Self = StObject.set(x, "getSkin", value.toJsFn)
    }
  }
}
