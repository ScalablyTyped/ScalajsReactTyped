package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemSectionListItemSectionDotuniDotdriverMod {
  
  trait ListItemSectionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSuffix(): js.Promise[BaseUniDriver]
    
    def getTitle(): js.Promise[String]
  }
  object ListItemSectionUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSuffix: CallbackTo[js.Promise[BaseUniDriver]],
      getTitle: CallbackTo[js.Promise[String]]
    ): ListItemSectionUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSuffix = getSuffix.toJsFn, getTitle = getTitle.toJsFn)
      __obj.asInstanceOf[ListItemSectionUniDriver]
    }
    
    extension [Self <: ListItemSectionUniDriver](x: Self) {
      
      inline def setGetSuffix(value: CallbackTo[js.Promise[BaseUniDriver]]): Self = StObject.set(x, "getSuffix", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
    }
  }
}
