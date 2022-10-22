package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardSubheaderSubheaderDotuniDotdriverMod {
  
  trait CardSubheaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def suffixNode(): UniDriver[Any]
    
    def title(): js.Promise[String]
    
    def titleNode(): UniDriver[Any]
  }
  object CardSubheaderUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      suffixNode: CallbackTo[UniDriver[Any]],
      title: CallbackTo[js.Promise[String]],
      titleNode: CallbackTo[UniDriver[Any]]
    ): CardSubheaderUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, suffixNode = suffixNode.toJsFn, title = title.toJsFn, titleNode = titleNode.toJsFn)
      __obj.asInstanceOf[CardSubheaderUniDriver]
    }
    
    extension [Self <: CardSubheaderUniDriver](x: Self) {
      
      inline def setSuffixNode(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "suffixNode", value.toJsFn)
      
      inline def setTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "title", value.toJsFn)
      
      inline def setTitleNode(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "titleNode", value.toJsFn)
    }
  }
}
