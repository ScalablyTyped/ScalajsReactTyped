package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesStatusIndicatorMod.StatusIndicatorState
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStatusIndicatorStatusIndicatorDotuniDotdriverMod {
  
  trait StatusIndicatorUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getMessage(): js.Promise[String]
    
    def getStatus(): js.Promise[StatusIndicatorState]
    
    def hasMessage(): js.Promise[Boolean]
  }
  object StatusIndicatorUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getMessage: CallbackTo[js.Promise[String]],
      getStatus: CallbackTo[js.Promise[StatusIndicatorState]],
      hasMessage: CallbackTo[js.Promise[Boolean]]
    ): StatusIndicatorUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getMessage = getMessage.toJsFn, getStatus = getStatus.toJsFn, hasMessage = hasMessage.toJsFn)
      __obj.asInstanceOf[StatusIndicatorUniDriver]
    }
    
    extension [Self <: StatusIndicatorUniDriver](x: Self) {
      
      inline def setGetMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMessage", value.toJsFn)
      
      inline def setGetStatus(value: CallbackTo[js.Promise[StatusIndicatorState]]): Self = StObject.set(x, "getStatus", value.toJsFn)
      
      inline def setHasMessage(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasMessage", value.toJsFn)
    }
  }
}
