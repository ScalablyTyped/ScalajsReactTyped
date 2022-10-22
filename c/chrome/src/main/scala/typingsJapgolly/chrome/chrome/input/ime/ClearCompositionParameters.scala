package typingsJapgolly.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearCompositionParameters extends StObject {
  
  /** ID of the context where the composition will be cleared */
  var contextID: Double
}
object ClearCompositionParameters {
  
  inline def apply(contextID: Double): ClearCompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearCompositionParameters]
  }
  
  extension [Self <: ClearCompositionParameters](x: Self) {
    
    inline def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
  }
}
