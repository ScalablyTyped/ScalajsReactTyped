package typingsJapgolly.reactNativeWindows.rntypesMod.Animated

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyRef[C] extends StObject {
  
  def getNode(): C
}
object LegacyRef {
  
  inline def apply[C](getNode: CallbackTo[C]): LegacyRef[C] = {
    val __obj = js.Dynamic.literal(getNode = getNode.toJsFn)
    __obj.asInstanceOf[LegacyRef[C]]
  }
  
  extension [Self <: LegacyRef[?], C](x: Self & LegacyRef[C]) {
    
    inline def setGetNode(value: CallbackTo[C]): Self = StObject.set(x, "getNode", value.toJsFn)
  }
}
