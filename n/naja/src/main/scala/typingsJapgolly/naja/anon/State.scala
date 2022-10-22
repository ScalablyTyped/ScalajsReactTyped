package typingsJapgolly.naja.anon

import typingsJapgolly.naja.distCoreHistoryHandlerMod.HistoryState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var options: typingsJapgolly.naja.distNajaMod.Options
  
  var state: HistoryState
}
object State {
  
  inline def apply(options: typingsJapgolly.naja.distNajaMod.Options, state: HistoryState): State = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setState(value: HistoryState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
