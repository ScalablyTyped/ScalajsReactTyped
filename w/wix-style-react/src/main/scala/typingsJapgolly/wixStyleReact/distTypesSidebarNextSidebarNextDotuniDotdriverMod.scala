package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarNextSidebarNextDotuniDotdriverMod {
  
  trait SidebarNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def footerExists(): js.Promise[Boolean]
    
    def getSelectedKey(): js.Promise[String]
    
    def getSkin(): js.Promise[String]
    
    def headerExists(): js.Promise[Boolean]
    
    def isHidden(): js.Promise[Boolean]
    
    def isLoading(): js.Promise[Boolean]
  }
  object SidebarNextUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      footerExists: CallbackTo[js.Promise[Boolean]],
      getSelectedKey: CallbackTo[js.Promise[String]],
      getSkin: CallbackTo[js.Promise[String]],
      headerExists: CallbackTo[js.Promise[Boolean]],
      isHidden: CallbackTo[js.Promise[Boolean]],
      isLoading: CallbackTo[js.Promise[Boolean]]
    ): SidebarNextUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, footerExists = footerExists.toJsFn, getSelectedKey = getSelectedKey.toJsFn, getSkin = getSkin.toJsFn, headerExists = headerExists.toJsFn, isHidden = isHidden.toJsFn, isLoading = isLoading.toJsFn)
      __obj.asInstanceOf[SidebarNextUniDriver]
    }
    
    extension [Self <: SidebarNextUniDriver](x: Self) {
      
      inline def setFooterExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "footerExists", value.toJsFn)
      
      inline def setGetSelectedKey(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSelectedKey", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setHeaderExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "headerExists", value.toJsFn)
      
      inline def setIsHidden(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isHidden", value.toJsFn)
      
      inline def setIsLoading(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLoading", value.toJsFn)
    }
  }
}
