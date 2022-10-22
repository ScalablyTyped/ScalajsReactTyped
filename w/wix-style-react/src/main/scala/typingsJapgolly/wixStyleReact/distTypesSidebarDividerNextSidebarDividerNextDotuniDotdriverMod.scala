package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarDividerNextSidebarDividerNextDotuniDotdriverMod {
  
  trait SidebarDividerNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[String]
    
    def isFullWidth(): js.Promise[Boolean]
  }
  object SidebarDividerNextUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSkin: CallbackTo[js.Promise[String]],
      isFullWidth: CallbackTo[js.Promise[Boolean]]
    ): SidebarDividerNextUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSkin = getSkin.toJsFn, isFullWidth = isFullWidth.toJsFn)
      __obj.asInstanceOf[SidebarDividerNextUniDriver]
    }
    
    extension [Self <: SidebarDividerNextUniDriver](x: Self) {
      
      inline def setGetSkin(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setIsFullWidth(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFullWidth", value.toJsFn)
    }
  }
}
