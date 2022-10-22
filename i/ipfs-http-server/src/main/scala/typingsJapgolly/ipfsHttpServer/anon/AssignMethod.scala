package typingsJapgolly.ipfsHttpServer.anon

import typingsJapgolly.hapiHapi.mod.Request
import typingsJapgolly.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignMethod extends StObject {
  
  var assign: String
  
  /**
    * @param {import('../../types').Request} request
    * @param {import('@hapi/hapi').ResponseToolkit} _h
    */
  def method(request: Request, _h: ResponseToolkit): js.Promise[Config]
}
object AssignMethod {
  
  inline def apply(assign: String, method: (Request, ResponseToolkit) => js.Promise[Config]): AssignMethod = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[AssignMethod]
  }
  
  extension [Self <: AssignMethod](x: Self) {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (Request, ResponseToolkit) => js.Promise[Config]): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
