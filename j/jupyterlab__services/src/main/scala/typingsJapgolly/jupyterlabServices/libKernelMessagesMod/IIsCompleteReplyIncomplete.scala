package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.incomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIsCompleteReplyIncomplete extends StObject {
  
  var indent: String
  
  var status: incomplete
}
object IIsCompleteReplyIncomplete {
  
  inline def apply(indent: String): IIsCompleteReplyIncomplete = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], status = "incomplete")
    __obj.asInstanceOf[IIsCompleteReplyIncomplete]
  }
  
  extension [Self <: IIsCompleteReplyIncomplete](x: Self) {
    
    inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: incomplete): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
