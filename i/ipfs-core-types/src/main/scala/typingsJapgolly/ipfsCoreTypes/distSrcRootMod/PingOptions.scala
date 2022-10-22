package typingsJapgolly.ipfsCoreTypes.distSrcRootMod

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PingOptions
  extends StObject
     with AbortOptions {
  
  var count: js.UndefOr[Double] = js.undefined
}
object PingOptions {
  
  inline def apply(): PingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PingOptions]
  }
  
  extension [Self <: PingOptions](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
