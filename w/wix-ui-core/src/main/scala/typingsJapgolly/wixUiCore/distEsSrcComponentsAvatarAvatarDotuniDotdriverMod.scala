package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsAvatarTypesMod.ContentType
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsAvatarAvatarDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avatarDriverFactory(base: UniDriver[Any]): AvatarDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("avatarDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[AvatarDriver]
  
  trait AvatarDriver
    extends StObject
       with BaseUniDriver {
    
    /** Get the currently displayed type. Types are: 'text', 'icon', 'image'. It could be that the resolved type is 'image' but the currently displayed one is `text`. */
    def getContentType(): js.Promise[ContentType]
    
    /** Get the text content (generated initials) */
    def getTextContent(): js.Promise[String]
    
    /** Wether the image wass loaded */
    def isImageLoaded(): js.Promise[Boolean]
  }
  object AvatarDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getContentType: CallbackTo[js.Promise[ContentType]],
      getTextContent: CallbackTo[js.Promise[String]],
      isImageLoaded: CallbackTo[js.Promise[Boolean]]
    ): AvatarDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getContentType = getContentType.toJsFn, getTextContent = getTextContent.toJsFn, isImageLoaded = isImageLoaded.toJsFn)
      __obj.asInstanceOf[AvatarDriver]
    }
    
    extension [Self <: AvatarDriver](x: Self) {
      
      inline def setGetContentType(value: CallbackTo[js.Promise[ContentType]]): Self = StObject.set(x, "getContentType", value.toJsFn)
      
      inline def setGetTextContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTextContent", value.toJsFn)
      
      inline def setIsImageLoaded(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isImageLoaded", value.toJsFn)
    }
  }
}
