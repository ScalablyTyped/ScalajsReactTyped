package typingsJapgolly.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnteredEnteringExitedExiting extends StObject {
  
  var entered: HeightLeft
  
  var entering: LeftWidth
  
  var exited: HeightLeft
  
  var exiting: BottomHeight
}
object EnteredEnteringExitedExiting {
  
  inline def apply(entered: HeightLeft, entering: LeftWidth, exited: HeightLeft, exiting: BottomHeight): EnteredEnteringExitedExiting = {
    val __obj = js.Dynamic.literal(entered = entered.asInstanceOf[js.Any], entering = entering.asInstanceOf[js.Any], exited = exited.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnteredEnteringExitedExiting]
  }
  
  extension [Self <: EnteredEnteringExitedExiting](x: Self) {
    
    inline def setEntered(value: HeightLeft): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
    
    inline def setEntering(value: LeftWidth): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
    
    inline def setExited(value: HeightLeft): Self = StObject.set(x, "exited", value.asInstanceOf[js.Any])
    
    inline def setExiting(value: BottomHeight): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
  }
}
