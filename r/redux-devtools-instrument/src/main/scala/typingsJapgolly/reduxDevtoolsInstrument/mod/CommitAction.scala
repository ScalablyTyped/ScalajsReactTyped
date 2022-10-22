package typingsJapgolly.reduxDevtoolsInstrument.mod

import typingsJapgolly.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.COMMIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var timestamp: Double
  
  var `type`: COMMIT
}
object CommitAction {
  
  inline def apply(timestamp: Double): CommitAction = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("COMMIT")
    __obj.asInstanceOf[CommitAction]
  }
  
  extension [Self <: CommitAction](x: Self) {
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: COMMIT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
