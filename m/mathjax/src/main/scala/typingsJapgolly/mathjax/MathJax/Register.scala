package typingsJapgolly.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Register extends StObject {
  
  /*Registers a callback to be called when a particular file is completely loaded and processed. (The callback is
    * called when the file makes its MathJax.Ajax.loadComplete() call.) The file should be the complete file name,
    * e.g., "[MathJax]/config/default.js".
    */
  def LoadHook(file: String, callBack: js.Function): Unit
  
  /*Registers a listener for a particular message being sent to the hub processing signal (where PreProcessing,
    * Processing, and New Math messages are sent). When the message equals the type, the callback will be called
    * with the message as its parameter.
    */
  def MessageHook(`type`: String, callBack: Any): Unit
  
  /*Used by preprocessors to register themselves with MathJax so that they will be called during the
    * MathJax.Hub.PreProcess() action.
    */
  def PreProcessor(callBack: Any): Unit
  
  /*Registers a listener for a particular message being sent to the startup signal (where initialization and
    * component startup messages are sent). When the message equals the type, the callback will be called with the
    * message as its parameter. See the Using Signals documentation for more details.
    */
  def StartupHook(`type`: String, callBack: Any): Unit
}
object Register {
  
  inline def apply(
    LoadHook: (String, js.Function) => japgolly.scalajs.react.Callback,
    MessageHook: (String, Any) => japgolly.scalajs.react.Callback,
    PreProcessor: Any => japgolly.scalajs.react.Callback,
    StartupHook: (String, Any) => japgolly.scalajs.react.Callback
  ): Register = {
    val __obj = js.Dynamic.literal(LoadHook = js.Any.fromFunction2((t0: String, t1: js.Function) => (LoadHook(t0, t1)).runNow()), MessageHook = js.Any.fromFunction2((t0: String, t1: Any) => (MessageHook(t0, t1)).runNow()), PreProcessor = js.Any.fromFunction1((t0: Any) => PreProcessor(t0).runNow()), StartupHook = js.Any.fromFunction2((t0: String, t1: Any) => (StartupHook(t0, t1)).runNow()))
    __obj.asInstanceOf[Register]
  }
  
  extension [Self <: Register](x: Self) {
    
    inline def setLoadHook(value: (String, js.Function) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "LoadHook", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setMessageHook(value: (String, Any) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "MessageHook", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setPreProcessor(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "PreProcessor", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setStartupHook(value: (String, Any) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "StartupHook", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
