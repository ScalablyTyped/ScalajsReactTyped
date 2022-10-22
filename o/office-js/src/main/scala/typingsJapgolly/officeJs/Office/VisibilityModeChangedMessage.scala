package typingsJapgolly.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message used in the `onVisibilityModeChanged` invocation.
  */
trait VisibilityModeChangedMessage extends StObject {
  
  /**
    * Visibility changed state.
    */
  var visibilityMode: VisibilityMode
}
object VisibilityModeChangedMessage {
  
  inline def apply(visibilityMode: VisibilityMode): VisibilityModeChangedMessage = {
    val __obj = js.Dynamic.literal(visibilityMode = visibilityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityModeChangedMessage]
  }
  
  extension [Self <: VisibilityModeChangedMessage](x: Self) {
    
    inline def setVisibilityMode(value: VisibilityMode): Self = StObject.set(x, "visibilityMode", value.asInstanceOf[js.Any])
  }
}
