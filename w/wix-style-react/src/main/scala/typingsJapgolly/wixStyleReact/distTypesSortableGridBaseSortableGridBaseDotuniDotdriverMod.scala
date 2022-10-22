package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSortableGridBaseSortableGridBaseDotuniDotdriverMod {
  
  trait SortableGridBaseUniDriver
    extends StObject
       with BaseUniDriver {
    
    def endFixedElementExists(): js.Promise[Boolean]
    
    def startFixedElementExists(): js.Promise[Boolean]
  }
  object SortableGridBaseUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      endFixedElementExists: CallbackTo[js.Promise[Boolean]],
      exists: CallbackTo[js.Promise[Boolean]],
      startFixedElementExists: CallbackTo[js.Promise[Boolean]]
    ): SortableGridBaseUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, endFixedElementExists = endFixedElementExists.toJsFn, exists = exists.toJsFn, startFixedElementExists = startFixedElementExists.toJsFn)
      __obj.asInstanceOf[SortableGridBaseUniDriver]
    }
    
    extension [Self <: SortableGridBaseUniDriver](x: Self) {
      
      inline def setEndFixedElementExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "endFixedElementExists", value.toJsFn)
      
      inline def setStartFixedElementExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "startFixedElementExists", value.toJsFn)
    }
  }
}
