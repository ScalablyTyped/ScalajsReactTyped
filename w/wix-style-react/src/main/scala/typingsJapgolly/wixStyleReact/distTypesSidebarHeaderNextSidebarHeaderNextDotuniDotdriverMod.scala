package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarHeaderNextSidebarHeaderNextDotuniDotdriverMod {
  
  trait SidebarHeaderNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[String]
    
    def getSubtitle(): js.Promise[String]
    
    def getTitle(): js.Promise[String]
  }
  object SidebarHeaderNextUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSkin: CallbackTo[js.Promise[String]],
      getSubtitle: CallbackTo[js.Promise[String]],
      getTitle: CallbackTo[js.Promise[String]]
    ): SidebarHeaderNextUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSkin = getSkin.toJsFn, getSubtitle = getSubtitle.toJsFn, getTitle = getTitle.toJsFn)
      __obj.asInstanceOf[SidebarHeaderNextUniDriver]
    }
    
    extension [Self <: SidebarHeaderNextUniDriver](x: Self) {
      
      inline def setGetSkin(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetSubtitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitle", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
    }
  }
}
