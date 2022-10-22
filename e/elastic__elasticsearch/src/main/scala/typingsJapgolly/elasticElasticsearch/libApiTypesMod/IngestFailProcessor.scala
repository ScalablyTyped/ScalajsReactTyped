package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestFailProcessor
  extends StObject
     with IngestProcessorBase {
  
  var message: String
}
object IngestFailProcessor {
  
  inline def apply(message: String): IngestFailProcessor = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestFailProcessor]
  }
  
  extension [Self <: IngestFailProcessor](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
