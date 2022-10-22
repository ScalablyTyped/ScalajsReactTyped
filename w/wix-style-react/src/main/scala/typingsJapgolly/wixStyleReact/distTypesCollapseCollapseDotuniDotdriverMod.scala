package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCollapseCollapseDotuniDotdriverMod {
  
  trait CollapseUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isOpen(): js.Promise[Boolean]
  }
  object CollapseUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      isOpen: CallbackTo[js.Promise[Boolean]]
    ): CollapseUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, isOpen = isOpen.toJsFn)
      __obj.asInstanceOf[CollapseUniDriver]
    }
    
    extension [Self <: CollapseUniDriver](x: Self) {
      
      inline def setIsOpen(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isOpen", value.toJsFn)
    }
  }
}
