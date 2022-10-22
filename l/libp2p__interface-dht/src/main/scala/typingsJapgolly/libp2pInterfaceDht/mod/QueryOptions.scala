package typingsJapgolly.libp2pInterfaceDht.mod

import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions
  extends StObject
     with AbortOptions {
  
  var queryFuncTimeout: js.UndefOr[Double] = js.undefined
}
object QueryOptions {
  
  inline def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  extension [Self <: QueryOptions](x: Self) {
    
    inline def setQueryFuncTimeout(value: Double): Self = StObject.set(x, "queryFuncTimeout", value.asInstanceOf[js.Any])
    
    inline def setQueryFuncTimeoutUndefined: Self = StObject.set(x, "queryFuncTimeout", js.undefined)
  }
}
