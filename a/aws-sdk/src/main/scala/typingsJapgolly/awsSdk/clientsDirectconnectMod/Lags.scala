package typingsJapgolly.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lags extends StObject {
  
  /**
    * The LAGs.
    */
  var lags: js.UndefOr[LagList] = js.undefined
}
object Lags {
  
  inline def apply(): Lags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lags]
  }
  
  extension [Self <: Lags](x: Self) {
    
    inline def setLags(value: LagList): Self = StObject.set(x, "lags", value.asInstanceOf[js.Any])
    
    inline def setLagsUndefined: Self = StObject.set(x, "lags", js.undefined)
    
    inline def setLagsVarargs(value: Lag*): Self = StObject.set(x, "lags", js.Array(value*))
  }
}
