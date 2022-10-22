package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the text of a progress monitor.
  * @deprecated Deprecated
  */
trait XProgressMonitor
  extends StObject
     with XProgressBar {
  
  /** adds a new text line to the control. */
  def addText(Topic: String, Text: String, beforeProgress: Boolean): Unit
  
  /** removes a text line from the control. */
  def removeText(Topic: String, beforeProgress: Boolean): Unit
  
  /** updates an existing text line at the control. */
  def updateText(Topic: String, Text: String, beforeProgress: Boolean): Unit
}
object XProgressMonitor {
  
  inline def apply(
    Value: Double,
    acquire: Callback,
    addText: (String, String, Boolean) => Callback,
    getValue: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    removeText: (String, Boolean) => Callback,
    setBackgroundColor: Color => Callback,
    setForegroundColor: Color => Callback,
    setRange: (Double, Double) => Callback,
    setValue: Double => Callback,
    updateText: (String, String, Boolean) => Callback
  ): XProgressMonitor = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any], acquire = acquire.toJsFn, addText = js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (addText(t0, t1, t2)).runNow()), getValue = getValue.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeText = js.Any.fromFunction2((t0: String, t1: Boolean) => (removeText(t0, t1)).runNow()), setBackgroundColor = js.Any.fromFunction1((t0: Color) => setBackgroundColor(t0).runNow()), setForegroundColor = js.Any.fromFunction1((t0: Color) => setForegroundColor(t0).runNow()), setRange = js.Any.fromFunction2((t0: Double, t1: Double) => (setRange(t0, t1)).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()), updateText = js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (updateText(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XProgressMonitor]
  }
  
  extension [Self <: XProgressMonitor](x: Self) {
    
    inline def setAddText(value: (String, String, Boolean) => Callback): Self = StObject.set(x, "addText", js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveText(value: (String, Boolean) => Callback): Self = StObject.set(x, "removeText", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setUpdateText(value: (String, String, Boolean) => Callback): Self = StObject.set(x, "updateText", js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
