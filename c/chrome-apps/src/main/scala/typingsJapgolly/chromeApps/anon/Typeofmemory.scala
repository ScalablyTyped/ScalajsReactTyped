package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.system.memory.MemoryInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofmemory extends StObject {
  
  /** Get physical memory information. */
  def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit
}
object Typeofmemory {
  
  inline def apply(getInfo: js.Function1[/* info */ MemoryInfo, Unit] => Callback): Typeofmemory = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1((t0: js.Function1[/* info */ MemoryInfo, Unit]) => getInfo(t0).runNow()))
    __obj.asInstanceOf[Typeofmemory]
  }
  
  extension [Self <: Typeofmemory](x: Self) {
    
    inline def setGetInfo(value: js.Function1[/* info */ MemoryInfo, Unit] => Callback): Self = StObject.set(x, "getInfo", js.Any.fromFunction1((t0: js.Function1[/* info */ MemoryInfo, Unit]) => value(t0).runNow()))
  }
}
