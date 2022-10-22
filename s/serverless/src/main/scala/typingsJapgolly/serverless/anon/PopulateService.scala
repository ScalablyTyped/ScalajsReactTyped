package typingsJapgolly.serverless.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopulateService extends StObject {
  
  def populateService(): js.Promise[Any]
}
object PopulateService {
  
  inline def apply(populateService: CallbackTo[js.Promise[Any]]): PopulateService = {
    val __obj = js.Dynamic.literal(populateService = populateService.toJsFn)
    __obj.asInstanceOf[PopulateService]
  }
  
  extension [Self <: PopulateService](x: Self) {
    
    inline def setPopulateService(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "populateService", value.toJsFn)
  }
}
