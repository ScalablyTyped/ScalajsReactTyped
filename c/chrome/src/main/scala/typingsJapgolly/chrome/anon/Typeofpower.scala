package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpower extends StObject {
  
  def releaseKeepAwake(): Unit
  
  def requestKeepAwake(level: String): Unit
}
object Typeofpower {
  
  inline def apply(releaseKeepAwake: Callback, requestKeepAwake: String => Callback): Typeofpower = {
    val __obj = js.Dynamic.literal(releaseKeepAwake = releaseKeepAwake.toJsFn, requestKeepAwake = js.Any.fromFunction1((t0: String) => requestKeepAwake(t0).runNow()))
    __obj.asInstanceOf[Typeofpower]
  }
  
  extension [Self <: Typeofpower](x: Self) {
    
    inline def setReleaseKeepAwake(value: Callback): Self = StObject.set(x, "releaseKeepAwake", value.toJsFn)
    
    inline def setRequestKeepAwake(value: String => Callback): Self = StObject.set(x, "requestKeepAwake", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
