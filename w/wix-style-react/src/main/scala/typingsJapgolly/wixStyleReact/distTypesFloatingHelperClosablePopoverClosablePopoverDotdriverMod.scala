package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperClosablePopoverClosablePopoverDotdriverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (hasElementEventTrigger : wix-style-react.anon.EventTrigger): wix-style-react.anon.GetArrowElement extends (args : any): infer R ? R : any */ trait ClosablePopoverDriver extends StObject {
    
    def isOpened(): Boolean
  }
  object ClosablePopoverDriver {
    
    inline def apply(isOpened: CallbackTo[Boolean]): ClosablePopoverDriver = {
      val __obj = js.Dynamic.literal(isOpened = isOpened.toJsFn)
      __obj.asInstanceOf[ClosablePopoverDriver]
    }
    
    extension [Self <: ClosablePopoverDriver](x: Self) {
      
      inline def setIsOpened(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpened", value.toJsFn)
    }
  }
}
