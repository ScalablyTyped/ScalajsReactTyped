package typingsJapgolly.naja.anon

import org.scalajs.dom.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortController extends StObject {
  
  var abortController: org.scalajs.dom.AbortController
  
  var options: typingsJapgolly.naja.distNajaMod.Options
  
  var promise: js.Promise[Response]
  
  var request: org.scalajs.dom.Request
}
object AbortController {
  
  inline def apply(
    abortController: org.scalajs.dom.AbortController,
    options: typingsJapgolly.naja.distNajaMod.Options,
    promise: js.Promise[Response],
    request: org.scalajs.dom.Request
  ): AbortController = {
    val __obj = js.Dynamic.literal(abortController = abortController.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortController]
  }
  
  extension [Self <: AbortController](x: Self) {
    
    inline def setAbortController(value: org.scalajs.dom.AbortController): Self = StObject.set(x, "abortController", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: js.Promise[Response]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: org.scalajs.dom.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
