package typingsJapgolly.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Console extends StObject {
  
  /**
    * Only console logging is currently supported
    */
  var console: js.UndefOr[Audit] = js.undefined
}
object Console {
  
  inline def apply(): Console = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Console]
  }
  
  extension [Self <: Console](x: Self) {
    
    inline def setConsole(value: Audit): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
  }
}
