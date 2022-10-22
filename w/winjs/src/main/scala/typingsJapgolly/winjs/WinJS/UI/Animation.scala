package typingsJapgolly.winjs.WinJS.UI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the Windows animations. These functions provide developers with the ability to use animations in their custom controls that are consistent with animations used by Windows controls.
**/
object Animation {
  
  //#endregion Functions
  //#region Interfaces
  trait IAnimationMethodResponse extends StObject {
    
    def execute(): Promise[Any]
  }
  object IAnimationMethodResponse {
    
    inline def apply(execute: CallbackTo[Promise[Any]]): IAnimationMethodResponse = {
      val __obj = js.Dynamic.literal(execute = execute.toJsFn)
      __obj.asInstanceOf[IAnimationMethodResponse]
    }
    
    extension [Self <: IAnimationMethodResponse](x: Self) {
      
      inline def setExecute(value: CallbackTo[Promise[Any]]): Self = StObject.set(x, "execute", value.toJsFn)
    }
  }
}
