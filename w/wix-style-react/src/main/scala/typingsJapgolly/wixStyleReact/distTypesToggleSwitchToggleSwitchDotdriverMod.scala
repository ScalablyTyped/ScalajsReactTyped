package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleSwitchToggleSwitchDotdriverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (hasElementEventTrigger : wix-style-react.anon.Element): wix-style-react.anon.GetId extends (args : any): infer R ? R : any */ trait ToggleSwitchDriver extends StObject {
    
    def getSize(): String
    
    def getSkin(): String
  }
  object ToggleSwitchDriver {
    
    inline def apply(getSize: CallbackTo[String], getSkin: CallbackTo[String]): ToggleSwitchDriver = {
      val __obj = js.Dynamic.literal(getSize = getSize.toJsFn, getSkin = getSkin.toJsFn)
      __obj.asInstanceOf[ToggleSwitchDriver]
    }
    
    extension [Self <: ToggleSwitchDriver](x: Self) {
      
      inline def setGetSize(value: CallbackTo[String]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[String]): Self = StObject.set(x, "getSkin", value.toJsFn)
    }
  }
}
