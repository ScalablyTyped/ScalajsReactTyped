package typingsJapgolly.minappEnv.DB

import typingsJapgolly.minappEnv.IAPISuccessParam
import typingsJapgolly.minappEnv.anon.Updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpdateResult
  extends StObject
     with IAPISuccessParam {
  
  var stats: Updated
}
object IUpdateResult {
  
  inline def apply(errMsg: String, stats: Updated): IUpdateResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateResult]
  }
  
  extension [Self <: IUpdateResult](x: Self) {
    
    inline def setStats(value: Updated): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
