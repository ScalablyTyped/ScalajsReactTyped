package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesFillPreviewFillPreviewDotuniDotdriverMod.FillPreviewUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSwatchesSwatchesDotuniDotdriverMod {
  
  trait SwatchesUniDriver
    extends StObject
       with BaseUniDriver {
    
    def addButtonExists(): js.Promise[Boolean]
    
    def clickEmptySwatch(): js.Promise[Unit]
    
    def getSwatch(index: Double): js.Promise[FillPreviewUniDriver]
    
    def getSwatchCount(): js.Promise[Double]
    
    def isEmptySwatchSelected(): js.Promise[Boolean]
    
    def isSwatchSelectedAt(index: Double): js.Promise[Boolean]
  }
  object SwatchesUniDriver {
    
    inline def apply(
      addButtonExists: CallbackTo[js.Promise[Boolean]],
      click: CallbackTo[js.Promise[Unit]],
      clickEmptySwatch: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSwatch: Double => js.Promise[FillPreviewUniDriver],
      getSwatchCount: CallbackTo[js.Promise[Double]],
      isEmptySwatchSelected: CallbackTo[js.Promise[Boolean]],
      isSwatchSelectedAt: Double => js.Promise[Boolean]
    ): SwatchesUniDriver = {
      val __obj = js.Dynamic.literal(addButtonExists = addButtonExists.toJsFn, click = click.toJsFn, clickEmptySwatch = clickEmptySwatch.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSwatch = js.Any.fromFunction1(getSwatch), getSwatchCount = getSwatchCount.toJsFn, isEmptySwatchSelected = isEmptySwatchSelected.toJsFn, isSwatchSelectedAt = js.Any.fromFunction1(isSwatchSelectedAt))
      __obj.asInstanceOf[SwatchesUniDriver]
    }
    
    extension [Self <: SwatchesUniDriver](x: Self) {
      
      inline def setAddButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "addButtonExists", value.toJsFn)
      
      inline def setClickEmptySwatch(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickEmptySwatch", value.toJsFn)
      
      inline def setGetSwatch(value: Double => js.Promise[FillPreviewUniDriver]): Self = StObject.set(x, "getSwatch", js.Any.fromFunction1(value))
      
      inline def setGetSwatchCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getSwatchCount", value.toJsFn)
      
      inline def setIsEmptySwatchSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isEmptySwatchSelected", value.toJsFn)
      
      inline def setIsSwatchSelectedAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isSwatchSelectedAt", js.Any.fromFunction1(value))
    }
  }
}
