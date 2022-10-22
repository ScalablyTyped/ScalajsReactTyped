package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarBackButtonSidebarBackButtonDotuniDotdriverMod {
  
  trait SidebarBackButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickButton(): js.Promise[Unit]
    
    def getButtonText(): js.Promise[String]
  }
  object SidebarBackButtonUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getButtonText: CallbackTo[js.Promise[String]]
    ): SidebarBackButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickButton = clickButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getButtonText = getButtonText.toJsFn)
      __obj.asInstanceOf[SidebarBackButtonUniDriver]
    }
    
    extension [Self <: SidebarBackButtonUniDriver](x: Self) {
      
      inline def setClickButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickButton", value.toJsFn)
      
      inline def setGetButtonText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getButtonText", value.toJsFn)
    }
  }
}
