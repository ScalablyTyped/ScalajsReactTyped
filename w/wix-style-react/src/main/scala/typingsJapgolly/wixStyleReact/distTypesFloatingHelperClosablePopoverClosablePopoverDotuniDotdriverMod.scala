package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperClosablePopoverClosablePopoverDotuniDotdriverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (base : @unidriver/core.@unidriver/core.UniDriver<any>, body : @unidriver/core.@unidriver/core.UniDriver<any>): wix-style-react.anon.GetArrowOffset extends (args : any): infer R ? R : any */ trait ClosablePopoverUniDriver extends StObject {
    
    def isOpened(): js.Promise[Boolean]
  }
  object ClosablePopoverUniDriver {
    
    inline def apply(isOpened: CallbackTo[js.Promise[Boolean]]): ClosablePopoverUniDriver = {
      val __obj = js.Dynamic.literal(isOpened = isOpened.toJsFn)
      __obj.asInstanceOf[ClosablePopoverUniDriver]
    }
    
    extension [Self <: ClosablePopoverUniDriver](x: Self) {
      
      inline def setIsOpened(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isOpened", value.toJsFn)
    }
  }
}
