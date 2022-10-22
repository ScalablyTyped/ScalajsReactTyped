package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemSelectListItemSelectDotuniDotdriverMod {
  
  trait ListItemSelectUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getPrefix(): js.Promise[BaseUniDriver]
    
    def getSubtitle(): js.Promise[String]
    
    def getSuffix(): js.Promise[BaseUniDriver]
    
    def getTitle(): js.Promise[String]
    
    def hasCheckbox(): js.Promise[Boolean]
  }
  object ListItemSelectUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getPrefix: CallbackTo[js.Promise[BaseUniDriver]],
      getSubtitle: CallbackTo[js.Promise[String]],
      getSuffix: CallbackTo[js.Promise[BaseUniDriver]],
      getTitle: CallbackTo[js.Promise[String]],
      hasCheckbox: CallbackTo[js.Promise[Boolean]]
    ): ListItemSelectUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getPrefix = getPrefix.toJsFn, getSubtitle = getSubtitle.toJsFn, getSuffix = getSuffix.toJsFn, getTitle = getTitle.toJsFn, hasCheckbox = hasCheckbox.toJsFn)
      __obj.asInstanceOf[ListItemSelectUniDriver]
    }
    
    extension [Self <: ListItemSelectUniDriver](x: Self) {
      
      inline def setGetPrefix(value: CallbackTo[js.Promise[BaseUniDriver]]): Self = StObject.set(x, "getPrefix", value.toJsFn)
      
      inline def setGetSubtitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitle", value.toJsFn)
      
      inline def setGetSuffix(value: CallbackTo[js.Promise[BaseUniDriver]]): Self = StObject.set(x, "getSuffix", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setHasCheckbox(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasCheckbox", value.toJsFn)
    }
  }
}
