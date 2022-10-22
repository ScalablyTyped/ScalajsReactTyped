package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCloseButtonCloseButtonDotuniDotdriverMod {
  
  trait CloseButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    var isButtonDisabled: js.Function0[js.Promise[Boolean]]
  }
  object CloseButtonUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      isButtonDisabled: CallbackTo[js.Promise[Boolean]]
    ): CloseButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, isButtonDisabled = isButtonDisabled.toJsFn)
      __obj.asInstanceOf[CloseButtonUniDriver]
    }
    
    extension [Self <: CloseButtonUniDriver](x: Self) {
      
      inline def setIsButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isButtonDisabled", value.toJsFn)
    }
  }
}
