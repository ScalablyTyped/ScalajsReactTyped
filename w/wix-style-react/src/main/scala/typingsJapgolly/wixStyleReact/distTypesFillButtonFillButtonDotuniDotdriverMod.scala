package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFillButtonFillButtonDotuniDotdriverMod {
  
  trait FillButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getTooltipText(): js.Promise[String]
  }
  object FillButtonUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getTooltipText: CallbackTo[js.Promise[String]]
    ): FillButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getTooltipText = getTooltipText.toJsFn)
      __obj.asInstanceOf[FillButtonUniDriver]
    }
    
    extension [Self <: FillButtonUniDriver](x: Self) {
      
      inline def setGetTooltipText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTooltipText", value.toJsFn)
    }
  }
}
