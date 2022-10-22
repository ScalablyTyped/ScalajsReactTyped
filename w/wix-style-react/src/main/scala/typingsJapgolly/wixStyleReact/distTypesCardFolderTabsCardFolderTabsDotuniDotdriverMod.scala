package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardFolderTabsCardFolderTabsDotuniDotdriverMod {
  
  trait CardFolderTabsUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSize(tabId: String): js.Promise[String]
    
    def isTabDisabledById(tabId: String): js.Promise[Boolean]
    
    def selectTabById(tabId: String): js.Promise[Unit]
  }
  object CardFolderTabsUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSize: String => js.Promise[String],
      isTabDisabledById: String => js.Promise[Boolean],
      selectTabById: String => js.Promise[Unit]
    ): CardFolderTabsUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSize = js.Any.fromFunction1(getSize), isTabDisabledById = js.Any.fromFunction1(isTabDisabledById), selectTabById = js.Any.fromFunction1(selectTabById))
      __obj.asInstanceOf[CardFolderTabsUniDriver]
    }
    
    extension [Self <: CardFolderTabsUniDriver](x: Self) {
      
      inline def setGetSize(value: String => js.Promise[String]): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
      
      inline def setIsTabDisabledById(value: String => js.Promise[Boolean]): Self = StObject.set(x, "isTabDisabledById", js.Any.fromFunction1(value))
      
      inline def setSelectTabById(value: String => js.Promise[Unit]): Self = StObject.set(x, "selectTabById", js.Any.fromFunction1(value))
    }
  }
}
