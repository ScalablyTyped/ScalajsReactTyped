package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFillPreviewFillPreviewDotuniDotdriverMod {
  
  trait FillPreviewUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isSelected(): js.Promise[Boolean]
  }
  object FillPreviewUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      isSelected: CallbackTo[js.Promise[Boolean]]
    ): FillPreviewUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, isSelected = isSelected.toJsFn)
      __obj.asInstanceOf[FillPreviewUniDriver]
    }
    
    extension [Self <: FillPreviewUniDriver](x: Self) {
      
      inline def setIsSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSelected", value.toJsFn)
    }
  }
}
