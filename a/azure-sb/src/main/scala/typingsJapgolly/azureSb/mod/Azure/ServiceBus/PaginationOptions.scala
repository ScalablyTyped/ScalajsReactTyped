package typingsJapgolly.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationOptions extends StObject {
  
  var skip: Double
  
  var top: Double
}
object PaginationOptions {
  
  inline def apply(skip: Double, top: Double): PaginationOptions = {
    val __obj = js.Dynamic.literal(skip = skip.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
  
  extension [Self <: PaginationOptions](x: Self) {
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
