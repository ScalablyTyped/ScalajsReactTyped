package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.complete
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.invalid
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIsCompleteReplyOther extends StObject {
  
  var status: complete | invalid | unknown
}
object IIsCompleteReplyOther {
  
  inline def apply(status: complete | invalid | unknown): IIsCompleteReplyOther = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyOther]
  }
  
  extension [Self <: IIsCompleteReplyOther](x: Self) {
    
    inline def setStatus(value: complete | invalid | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
