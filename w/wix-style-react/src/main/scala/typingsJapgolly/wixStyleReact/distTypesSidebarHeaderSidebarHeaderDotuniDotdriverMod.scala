package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarHeaderSidebarHeaderDotuniDotdriverMod {
  
  trait SidebarHeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getChildren(): UniDriver[Any]
    
    def getSubtitle(): js.Promise[String]
    
    def getTitle(): js.Promise[String]
  }
  object SidebarHeaderUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getChildren: CallbackTo[UniDriver[Any]],
      getSubtitle: CallbackTo[js.Promise[String]],
      getTitle: CallbackTo[js.Promise[String]]
    ): SidebarHeaderUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getChildren = getChildren.toJsFn, getSubtitle = getSubtitle.toJsFn, getTitle = getTitle.toJsFn)
      __obj.asInstanceOf[SidebarHeaderUniDriver]
    }
    
    extension [Self <: SidebarHeaderUniDriver](x: Self) {
      
      inline def setGetChildren(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getChildren", value.toJsFn)
      
      inline def setGetSubtitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitle", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
    }
  }
}
