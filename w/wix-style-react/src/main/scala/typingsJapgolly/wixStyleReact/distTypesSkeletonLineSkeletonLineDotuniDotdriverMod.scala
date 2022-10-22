package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesSkeletonGroupMod.SkeletonGroupSkin
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonLineSkeletonLineDotuniDotdriverMod {
  
  trait SkeletonLineUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[SkeletonGroupSkin]
    
    def getWidth(): js.Promise[String]
  }
  object SkeletonLineUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSkin: CallbackTo[js.Promise[SkeletonGroupSkin]],
      getWidth: CallbackTo[js.Promise[String]]
    ): SkeletonLineUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSkin = getSkin.toJsFn, getWidth = getWidth.toJsFn)
      __obj.asInstanceOf[SkeletonLineUniDriver]
    }
    
    extension [Self <: SkeletonLineUniDriver](x: Self) {
      
      inline def setGetSkin(value: CallbackTo[js.Promise[SkeletonGroupSkin]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWidth", value.toJsFn)
    }
  }
}
