package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarDividerSidebarDividerDotuniDotdriverMod {
  
  trait SidebarDividerUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isFullWidth(): js.Promise[Boolean]
  }
  object SidebarDividerUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      isFullWidth: CallbackTo[js.Promise[Boolean]]
    ): SidebarDividerUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, isFullWidth = isFullWidth.toJsFn)
      __obj.asInstanceOf[SidebarDividerUniDriver]
    }
    
    extension [Self <: SidebarDividerUniDriver](x: Self) {
      
      inline def setIsFullWidth(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFullWidth", value.toJsFn)
    }
  }
}
