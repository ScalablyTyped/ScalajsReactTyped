package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSubMenuNextSidebarSubMenuNextDotuniDotdriverMod {
  
  trait SidebarSubMenuNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getTitleText(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isExpanded(): js.Promise[Boolean]
  }
  object SidebarSubMenuNextUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getTitleText: CallbackTo[js.Promise[String]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isExpanded: CallbackTo[js.Promise[Boolean]]
    ): SidebarSubMenuNextUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getTitleText = getTitleText.toJsFn, isDisabled = isDisabled.toJsFn, isExpanded = isExpanded.toJsFn)
      __obj.asInstanceOf[SidebarSubMenuNextUniDriver]
    }
    
    extension [Self <: SidebarSubMenuNextUniDriver](x: Self) {
      
      inline def setGetTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleText", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsExpanded(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isExpanded", value.toJsFn)
    }
  }
}
