package typingsJapgolly.reduxDevtoolsInstrument.mod

import typingsJapgolly.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstrumentExt[S, A /* <: Action[Any] */, MonitorState] extends StObject {
  
  var liftedStore: LiftedStore[S, A, MonitorState]
}
object InstrumentExt {
  
  inline def apply[S, A /* <: Action[Any] */, MonitorState](liftedStore: LiftedStore[S, A, MonitorState]): InstrumentExt[S, A, MonitorState] = {
    val __obj = js.Dynamic.literal(liftedStore = liftedStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentExt[S, A, MonitorState]]
  }
  
  extension [Self <: InstrumentExt[?, ?, ?], S, A /* <: Action[Any] */, MonitorState](x: Self & (InstrumentExt[S, A, MonitorState])) {
    
    inline def setLiftedStore(value: LiftedStore[S, A, MonitorState]): Self = StObject.set(x, "liftedStore", value.asInstanceOf[js.Any])
  }
}
