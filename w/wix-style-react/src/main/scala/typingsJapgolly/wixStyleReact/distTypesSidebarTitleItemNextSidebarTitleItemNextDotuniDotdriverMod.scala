package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarTitleItemNextSidebarTitleItemNextDotuniDotdriverMod {
  
  trait SidebarTitleItemNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[String]
    
    def getText(): js.Promise[String]
  }
  object SidebarTitleItemNextUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSkin: CallbackTo[js.Promise[String]],
      getText: CallbackTo[js.Promise[String]]
    ): SidebarTitleItemNextUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSkin = getSkin.toJsFn, getText = getText.toJsFn)
      __obj.asInstanceOf[SidebarTitleItemNextUniDriver]
    }
    
    extension [Self <: SidebarTitleItemNextUniDriver](x: Self) {
      
      inline def setGetSkin(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
    }
  }
}
