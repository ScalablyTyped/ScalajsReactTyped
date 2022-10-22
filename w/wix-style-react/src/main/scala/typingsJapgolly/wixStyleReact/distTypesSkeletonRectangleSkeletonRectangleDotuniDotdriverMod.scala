package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesSkeletonGroupMod.SkeletonGroupSkin
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonRectangleSkeletonRectangleDotuniDotdriverMod {
  
  trait SkeletonRectangleUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getHeight(): js.Promise[String]
    
    def getSkin(): js.Promise[SkeletonGroupSkin]
    
    def getWidth(): js.Promise[String]
  }
  object SkeletonRectangleUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getHeight: CallbackTo[js.Promise[String]],
      getSkin: CallbackTo[js.Promise[SkeletonGroupSkin]],
      getWidth: CallbackTo[js.Promise[String]]
    ): SkeletonRectangleUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getHeight = getHeight.toJsFn, getSkin = getSkin.toJsFn, getWidth = getWidth.toJsFn)
      __obj.asInstanceOf[SkeletonRectangleUniDriver]
    }
    
    extension [Self <: SkeletonRectangleUniDriver](x: Self) {
      
      inline def setGetHeight(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getHeight", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[SkeletonGroupSkin]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWidth", value.toJsFn)
    }
  }
}
