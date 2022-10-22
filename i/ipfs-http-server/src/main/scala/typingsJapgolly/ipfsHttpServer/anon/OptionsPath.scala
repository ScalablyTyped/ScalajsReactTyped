package typingsJapgolly.ipfsHttpServer.anon

import typingsJapgolly.hapiHapi.mod.Request
import typingsJapgolly.hapiHapi.mod.ResponseObject
import typingsJapgolly.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPath extends StObject {
  
  /**
    * @param {import('../../types').Request} _request
    * @param {import('@hapi/hapi').ResponseToolkit} h
    */
  def handler(_request: Request, h: ResponseToolkit): ResponseObject
  
  var method: String
  
  var options: Unit
  
  var path: String
}
object OptionsPath {
  
  inline def apply(handler: (Request, ResponseToolkit) => ResponseObject, method: String, options: Unit, path: String): OptionsPath = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPath]
  }
  
  extension [Self <: OptionsPath](x: Self) {
    
    inline def setHandler(value: (Request, ResponseToolkit) => ResponseObject): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Unit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
