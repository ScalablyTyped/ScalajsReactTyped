package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseListenOptions extends StObject {
  
  /**
    * Listen backlog. Defaults to 10.
    */
  var backlog: js.UndefOr[Double] = js.undefined
}
object BaseListenOptions {
  
  inline def apply(): BaseListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseListenOptions]
  }
  
  extension [Self <: BaseListenOptions](x: Self) {
    
    inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
    
    inline def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
  }
}
