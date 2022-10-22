package typingsJapgolly.ssh2.mod

import typingsJapgolly.ssh2.ssh2Strings.`keyboard-interactive`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardInteractiveAuthMethod
  extends StObject
     with AuthMethod
     with AnyAuthMethod {
  
  /**
    * This works exactly the same way as a 'keyboard-interactive' client event handler
    */
  def prompt(
    name: String,
    instructions: String,
    lang: String,
    prompts: js.Array[Prompt],
    finish: KeyboardInteractiveCallback
  ): Unit
  
  @JSName("type")
  var type_KeyboardInteractiveAuthMethod: `keyboard-interactive`
}
object KeyboardInteractiveAuthMethod {
  
  inline def apply(
    prompt: (String, String, String, js.Array[Prompt], KeyboardInteractiveCallback) => japgolly.scalajs.react.Callback,
    username: String
  ): KeyboardInteractiveAuthMethod = {
    val __obj = js.Dynamic.literal(prompt = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: js.Array[Prompt], t4: KeyboardInteractiveCallback) => (prompt(t0, t1, t2, t3, t4)).runNow()), username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("keyboard-interactive")
    __obj.asInstanceOf[KeyboardInteractiveAuthMethod]
  }
  
  extension [Self <: KeyboardInteractiveAuthMethod](x: Self) {
    
    inline def setPrompt(
      value: (String, String, String, js.Array[Prompt], KeyboardInteractiveCallback) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "prompt", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: js.Array[Prompt], t4: KeyboardInteractiveCallback) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setType(value: `keyboard-interactive`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
