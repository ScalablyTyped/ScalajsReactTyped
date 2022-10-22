package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonAlignment
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonContentSize
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonSpacing
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonSkeletonDotuniDotdriverMod {
  
  trait SkeletonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getNumLines(): js.Promise[Double]
    
    def hasAlignment(alignment: SkeletonAlignment): js.Promise[Boolean]
    
    def hasSizes(sizes: SkeletonContentSize): js.Promise[Boolean]
    
    def hasSpacing(spacing: SkeletonSpacing): js.Promise[Boolean]
  }
  object SkeletonUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getNumLines: CallbackTo[js.Promise[Double]],
      hasAlignment: SkeletonAlignment => js.Promise[Boolean],
      hasSizes: SkeletonContentSize => js.Promise[Boolean],
      hasSpacing: SkeletonSpacing => js.Promise[Boolean]
    ): SkeletonUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getNumLines = getNumLines.toJsFn, hasAlignment = js.Any.fromFunction1(hasAlignment), hasSizes = js.Any.fromFunction1(hasSizes), hasSpacing = js.Any.fromFunction1(hasSpacing))
      __obj.asInstanceOf[SkeletonUniDriver]
    }
    
    extension [Self <: SkeletonUniDriver](x: Self) {
      
      inline def setGetNumLines(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getNumLines", value.toJsFn)
      
      inline def setHasAlignment(value: SkeletonAlignment => js.Promise[Boolean]): Self = StObject.set(x, "hasAlignment", js.Any.fromFunction1(value))
      
      inline def setHasSizes(value: SkeletonContentSize => js.Promise[Boolean]): Self = StObject.set(x, "hasSizes", js.Any.fromFunction1(value))
      
      inline def setHasSpacing(value: SkeletonSpacing => js.Promise[Boolean]): Self = StObject.set(x, "hasSpacing", js.Any.fromFunction1(value))
    }
  }
}
