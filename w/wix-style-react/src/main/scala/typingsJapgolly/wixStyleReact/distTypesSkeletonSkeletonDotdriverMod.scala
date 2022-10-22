package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonAlignment
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonContentSize
import typingsJapgolly.wixStyleReact.distTypesSkeletonMod.SkeletonSpacing
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonSkeletonDotdriverMod {
  
  trait SkeletonDriver
    extends StObject
       with BaseDriver {
    
    def getNumLines(): Double
    
    def hasAlignment(alignment: SkeletonAlignment): Boolean
    
    def hasSizes(sizes: SkeletonContentSize): Boolean
    
    def hasSpacing(spacing: SkeletonSpacing): Boolean
  }
  object SkeletonDriver {
    
    inline def apply(
      exists: CallbackTo[Boolean],
      getNumLines: CallbackTo[Double],
      hasAlignment: SkeletonAlignment => Boolean,
      hasSizes: SkeletonContentSize => Boolean,
      hasSpacing: SkeletonSpacing => Boolean
    ): SkeletonDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, getNumLines = getNumLines.toJsFn, hasAlignment = js.Any.fromFunction1(hasAlignment), hasSizes = js.Any.fromFunction1(hasSizes), hasSpacing = js.Any.fromFunction1(hasSpacing))
      __obj.asInstanceOf[SkeletonDriver]
    }
    
    extension [Self <: SkeletonDriver](x: Self) {
      
      inline def setGetNumLines(value: CallbackTo[Double]): Self = StObject.set(x, "getNumLines", value.toJsFn)
      
      inline def setHasAlignment(value: SkeletonAlignment => Boolean): Self = StObject.set(x, "hasAlignment", js.Any.fromFunction1(value))
      
      inline def setHasSizes(value: SkeletonContentSize => Boolean): Self = StObject.set(x, "hasSizes", js.Any.fromFunction1(value))
      
      inline def setHasSpacing(value: SkeletonSpacing => Boolean): Self = StObject.set(x, "hasSpacing", js.Any.fromFunction1(value))
    }
  }
}
