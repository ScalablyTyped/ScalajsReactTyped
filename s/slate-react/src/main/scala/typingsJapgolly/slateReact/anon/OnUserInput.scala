package typingsJapgolly.slateReact.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnUserInput extends StObject {
  
  def onUserInput(): Unit
  
  var receivedUserInput: MutableRefObject[Boolean]
}
object OnUserInput {
  
  inline def apply(onUserInput: Callback, receivedUserInput: MutableRefObject[Boolean]): OnUserInput = {
    val __obj = js.Dynamic.literal(onUserInput = onUserInput.toJsFn, receivedUserInput = receivedUserInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUserInput]
  }
  
  extension [Self <: OnUserInput](x: Self) {
    
    inline def setOnUserInput(value: Callback): Self = StObject.set(x, "onUserInput", value.toJsFn)
    
    inline def setReceivedUserInput(value: MutableRefObject[Boolean]): Self = StObject.set(x, "receivedUserInput", value.asInstanceOf[js.Any])
  }
}
