package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHighlighterHighlighterDotuniDotdriverMod {
  
  trait HighlighterUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getElement(): js.Promise[Any]
    
    def html(): js.Promise[String]
  }
  object HighlighterUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getElement: CallbackTo[js.Promise[Any]],
      html: CallbackTo[js.Promise[String]]
    ): HighlighterUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getElement = getElement.toJsFn, html = html.toJsFn)
      __obj.asInstanceOf[HighlighterUniDriver]
    }
    
    extension [Self <: HighlighterUniDriver](x: Self) {
      
      inline def setGetElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHtml(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "html", value.toJsFn)
    }
  }
}
