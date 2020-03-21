package typingsJapgolly.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Register extends js.Object {
  /*Registers a callback to be called when a particular file is completely loaded and processed. (The callback is
    * called when the file makes its MathJax.Ajax.loadComplete() call.) The file should be the complete file name,
    * e.g., "[MathJax]/config/default.js".
    */
  def LoadHook(file: String, callBack: js.Function): Unit
  /*Registers a listener for a particular message being sent to the hub processing signal (where PreProcessing,
    * Processing, and New Math messages are sent). When the message equals the type, the callback will be called
    * with the message as its parameter.
    */
  def MessageHook(`type`: String, callBack: js.Any): Unit
  /*Used by preprocessors to register themselves with MathJax so that they will be called during the
    * MathJax.Hub.PreProcess() action.
    */
  def PreProcessor(callBack: js.Any): Unit
  /*Registers a listener for a particular message being sent to the startup signal (where initialization and
    * component startup messages are sent). When the message equals the type, the callback will be called with the
    * message as its parameter. See the Using Signals documentation for more details.
    */
  def StartupHook(`type`: String, callBack: js.Any): Unit
}

object Register {
  @scala.inline
  def apply(
    LoadHook: (String, js.Function) => japgolly.scalajs.react.Callback,
    MessageHook: (String, js.Any) => japgolly.scalajs.react.Callback,
    PreProcessor: js.Any => japgolly.scalajs.react.Callback,
    StartupHook: (String, js.Any) => japgolly.scalajs.react.Callback
  ): Register = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LoadHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => LoadHook(t0, t1).runNow()))
    __obj.updateDynamic("MessageHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => MessageHook(t0, t1).runNow()))
    __obj.updateDynamic("PreProcessor")(js.Any.fromFunction1((t0: js.Any) => PreProcessor(t0).runNow()))
    __obj.updateDynamic("StartupHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => StartupHook(t0, t1).runNow()))
    __obj.asInstanceOf[Register]
  }
}

