package typingsJapgolly.ibmMobilefirst.WL

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  def setEnabled(isEnable: String): Unit
  
  def setImagePath(imagePath: String): Unit
  
  def setTitle(title: String): Unit
}
object Item {
  
  inline def apply(setEnabled: String => Callback, setImagePath: String => Callback, setTitle: String => Callback): Item = {
    val __obj = js.Dynamic.literal(setEnabled = js.Any.fromFunction1((t0: String) => setEnabled(t0).runNow()), setImagePath = js.Any.fromFunction1((t0: String) => setImagePath(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setSetEnabled(value: String => Callback): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetImagePath(value: String => Callback): Self = StObject.set(x, "setImagePath", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetTitle(value: String => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
