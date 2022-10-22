package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardHeaderHeaderDotuniDotdriverMod {
  
  trait HeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def subtitle(): js.Promise[String]
    
    def title(): js.Promise[String]
  }
  object HeaderUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      subtitle: CallbackTo[js.Promise[String]],
      title: CallbackTo[js.Promise[String]]
    ): HeaderUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, subtitle = subtitle.toJsFn, title = title.toJsFn)
      __obj.asInstanceOf[HeaderUniDriver]
    }
    
    extension [Self <: HeaderUniDriver](x: Self) {
      
      inline def setSubtitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "subtitle", value.toJsFn)
      
      inline def setTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "title", value.toJsFn)
    }
  }
}
