package typingsJapgolly.algoliaTransporter.mod

import typingsJapgolly.algoliaRequesterCommon.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackFrame extends StObject {
  
  /**
    * The host associated with the `request` and the `response`.
    */
  val host: StatelessHost
  
  /**
    * The request made.
    */
  val request: typingsJapgolly.algoliaRequesterCommon.mod.Request
  
  /**
    * The received response.
    */
  val response: Response
  
  /**
    * The number of tries left.
    */
  val triesLeft: Double
}
object StackFrame {
  
  inline def apply(
    host: StatelessHost,
    request: typingsJapgolly.algoliaRequesterCommon.mod.Request,
    response: Response,
    triesLeft: Double
  ): StackFrame = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triesLeft = triesLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
  
  extension [Self <: StackFrame](x: Self) {
    
    inline def setHost(value: StatelessHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: typingsJapgolly.algoliaRequesterCommon.mod.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setTriesLeft(value: Double): Self = StObject.set(x, "triesLeft", value.asInstanceOf[js.Any])
  }
}
