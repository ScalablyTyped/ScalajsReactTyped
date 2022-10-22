package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarItemNextSidebarItemNextDotuniDotdriverMod {
  
  trait SidebarItemNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[dark | light]
    
    def getText(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isSelected(): js.Promise[Boolean]
    
    def suffixExists(): js.Promise[Boolean]
  }
  object SidebarItemNextUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSkin: CallbackTo[js.Promise[dark | light]],
      getText: CallbackTo[js.Promise[String]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isSelected: CallbackTo[js.Promise[Boolean]],
      suffixExists: CallbackTo[js.Promise[Boolean]]
    ): SidebarItemNextUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSkin = getSkin.toJsFn, getText = getText.toJsFn, isDisabled = isDisabled.toJsFn, isSelected = isSelected.toJsFn, suffixExists = suffixExists.toJsFn)
      __obj.asInstanceOf[SidebarItemNextUniDriver]
    }
    
    extension [Self <: SidebarItemNextUniDriver](x: Self) {
      
      inline def setGetSkin(value: CallbackTo[js.Promise[dark | light]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSelected", value.toJsFn)
      
      inline def setSuffixExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "suffixExists", value.toJsFn)
    }
  }
}
