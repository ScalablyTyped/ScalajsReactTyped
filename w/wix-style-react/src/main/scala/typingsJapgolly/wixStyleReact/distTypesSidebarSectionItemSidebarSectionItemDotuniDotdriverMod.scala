package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSectionItemSidebarSectionItemDotuniDotdriverMod {
  
  trait SidebarSectionItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getPrefix(): UniDriver[Any]
    
    def getSuffix(): UniDriver[Any]
    
    def getText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def hover(): js.Promise[Unit]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isSelected(): js.Promise[Boolean]
  }
  object SidebarSectionItemUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getPrefix: CallbackTo[UniDriver[Any]],
      getSuffix: CallbackTo[UniDriver[Any]],
      getText: CallbackTo[js.Promise[String]],
      getTitleText: CallbackTo[js.Promise[String]],
      hover: CallbackTo[js.Promise[Unit]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isSelected: CallbackTo[js.Promise[Boolean]]
    ): SidebarSectionItemUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getPrefix = getPrefix.toJsFn, getSuffix = getSuffix.toJsFn, getText = getText.toJsFn, getTitleText = getTitleText.toJsFn, hover = hover.toJsFn, isDisabled = isDisabled.toJsFn, isSelected = isSelected.toJsFn)
      __obj.asInstanceOf[SidebarSectionItemUniDriver]
    }
    
    extension [Self <: SidebarSectionItemUniDriver](x: Self) {
      
      inline def setGetPrefix(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getPrefix", value.toJsFn)
      
      inline def setGetSuffix(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getSuffix", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleText", value.toJsFn)
      
      inline def setHover(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "hover", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSelected", value.toJsFn)
    }
  }
}
