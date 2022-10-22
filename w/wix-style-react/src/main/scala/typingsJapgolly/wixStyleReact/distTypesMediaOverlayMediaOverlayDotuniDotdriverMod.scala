package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMediaOverlayMediaOverlayDotuniDotdriverMod {
  
  trait MediaOverlayUniDriver[T]
    extends StObject
       with BaseUniDriver {
    
    def getHoverSkin(): js.Promise[String | Null]
    
    def getMediaNode(): js.Promise[T]
    
    def getMediaUrl(): js.Promise[String | Null]
    
    def getSkin(): js.Promise[String | Null]
    
    def hover(): js.Promise[Unit]
  }
  object MediaOverlayUniDriver {
    
    inline def apply[T](
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getHoverSkin: CallbackTo[js.Promise[String | Null]],
      getMediaNode: CallbackTo[js.Promise[T]],
      getMediaUrl: CallbackTo[js.Promise[String | Null]],
      getSkin: CallbackTo[js.Promise[String | Null]],
      hover: CallbackTo[js.Promise[Unit]]
    ): MediaOverlayUniDriver[T] = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getHoverSkin = getHoverSkin.toJsFn, getMediaNode = getMediaNode.toJsFn, getMediaUrl = getMediaUrl.toJsFn, getSkin = getSkin.toJsFn, hover = hover.toJsFn)
      __obj.asInstanceOf[MediaOverlayUniDriver[T]]
    }
    
    extension [Self <: MediaOverlayUniDriver[?], T](x: Self & MediaOverlayUniDriver[T]) {
      
      inline def setGetHoverSkin(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getHoverSkin", value.toJsFn)
      
      inline def setGetMediaNode(value: CallbackTo[js.Promise[T]]): Self = StObject.set(x, "getMediaNode", value.toJsFn)
      
      inline def setGetMediaUrl(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getMediaUrl", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setHover(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "hover", value.toJsFn)
    }
  }
}
