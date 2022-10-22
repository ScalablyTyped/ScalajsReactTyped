package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCheckToggleCheckToggleDotuniDotdriverMod {
  
  trait CheckToggleUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getTooltipContent(): js.Promise[String]
    
    def isChecked(): js.Promise[Boolean]
  }
  object CheckToggleUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getTooltipContent: CallbackTo[js.Promise[String]],
      isChecked: CallbackTo[js.Promise[Boolean]]
    ): CheckToggleUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getTooltipContent = getTooltipContent.toJsFn, isChecked = isChecked.toJsFn)
      __obj.asInstanceOf[CheckToggleUniDriver]
    }
    
    extension [Self <: CheckToggleUniDriver](x: Self) {
      
      inline def setGetTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTooltipContent", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isChecked", value.toJsFn)
    }
  }
}
