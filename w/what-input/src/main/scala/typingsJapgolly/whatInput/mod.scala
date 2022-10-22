package typingsJapgolly.whatInput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("what-input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def ask(): InputMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[InputMethod]
    inline def ask(strategy: Strategy): InputMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")(strategy.asInstanceOf[js.Any]).asInstanceOf[InputMethod]
    
    inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
    
    inline def element(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("element")().asInstanceOf[String | Null]
    
    inline def ignoreKeys(keyCodes: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreKeys")(keyCodes.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit], strategy: Strategy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOnChange")(callback.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def specificKeys(keyCodes: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("specificKeys")(keyCodes.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unRegisterOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unRegisterOnChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.whatInput.whatInputStrings.initial
    - typingsJapgolly.whatInput.whatInputStrings.pointer
    - typingsJapgolly.whatInput.whatInputStrings.keyboard
    - typingsJapgolly.whatInput.whatInputStrings.mouse
    - typingsJapgolly.whatInput.whatInputStrings.touch
  */
  trait InputMethod extends StObject
  object InputMethod {
    
    inline def initial: typingsJapgolly.whatInput.whatInputStrings.initial = "initial".asInstanceOf[typingsJapgolly.whatInput.whatInputStrings.initial]
    
    inline def keyboard: typingsJapgolly.whatInput.whatInputStrings.keyboard = "keyboard".asInstanceOf[typingsJapgolly.whatInput.whatInputStrings.keyboard]
    
    inline def mouse: typingsJapgolly.whatInput.whatInputStrings.mouse = "mouse".asInstanceOf[typingsJapgolly.whatInput.whatInputStrings.mouse]
    
    inline def pointer: typingsJapgolly.whatInput.whatInputStrings.pointer = "pointer".asInstanceOf[typingsJapgolly.whatInput.whatInputStrings.pointer]
    
    inline def touch: typingsJapgolly.whatInput.whatInputStrings.touch = "touch".asInstanceOf[typingsJapgolly.whatInput.whatInputStrings.touch]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.whatInput.whatInputStrings.input
    - typingsJapgolly.whatInput.whatInputStrings.intent
  */
  trait Strategy extends StObject
  object Strategy {
    
    inline def input: typingsJapgolly.whatInput.whatInputStrings.input = "input".asInstanceOf[typingsJapgolly.whatInput.whatInputStrings.input]
    
    inline def intent: typingsJapgolly.whatInput.whatInputStrings.intent = "intent".asInstanceOf[typingsJapgolly.whatInput.whatInputStrings.intent]
  }
}
