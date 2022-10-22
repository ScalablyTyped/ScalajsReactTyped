package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCounterBadgeCounterBadgeDotuniDotdriverMod {
  
  trait CounterBadgeUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getContentText(): js.Promise[String]
  }
  object CounterBadgeUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getContentText: CallbackTo[js.Promise[String]]
    ): CounterBadgeUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getContentText = getContentText.toJsFn)
      __obj.asInstanceOf[CounterBadgeUniDriver]
    }
    
    extension [Self <: CounterBadgeUniDriver](x: Self) {
      
      inline def setGetContentText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getContentText", value.toJsFn)
    }
  }
}
