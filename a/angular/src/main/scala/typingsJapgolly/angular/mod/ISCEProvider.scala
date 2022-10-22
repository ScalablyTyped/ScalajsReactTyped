package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// SCEProvider
// see http://docs.angularjs.org/api/ng/provider/$sceProvider
///////////////////////////////////////////////////////////////////////////
trait ISCEProvider
  extends StObject
     with IServiceProvider {
  
  def enabled(value: Boolean): Unit
}
object ISCEProvider {
  
  inline def apply($get: Any, enabled: Boolean => Callback): ISCEProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], enabled = js.Any.fromFunction1((t0: Boolean) => enabled(t0).runNow()))
    __obj.asInstanceOf[ISCEProvider]
  }
  
  extension [Self <: ISCEProvider](x: Self) {
    
    inline def setEnabled(value: Boolean => Callback): Self = StObject.set(x, "enabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
