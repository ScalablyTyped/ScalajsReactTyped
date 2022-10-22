package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesSkeletonGroupMod.SkeletonGroupSkin
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonCircleSkeletonCircleDotuniDotdriverMod {
  
  trait SkeletonCircleUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDiameter(): js.Promise[String]
    
    def getSkin(): js.Promise[SkeletonGroupSkin]
  }
  object SkeletonCircleUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getDiameter: CallbackTo[js.Promise[String]],
      getSkin: CallbackTo[js.Promise[SkeletonGroupSkin]]
    ): SkeletonCircleUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getDiameter = getDiameter.toJsFn, getSkin = getSkin.toJsFn)
      __obj.asInstanceOf[SkeletonCircleUniDriver]
    }
    
    extension [Self <: SkeletonCircleUniDriver](x: Self) {
      
      inline def setGetDiameter(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDiameter", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[SkeletonGroupSkin]]): Self = StObject.set(x, "getSkin", value.toJsFn)
    }
  }
}
