package typingsJapgolly.xstate.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.xstate.libTypesMod.AnyInterpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<xstate.xstate/lib/types.InterpreterOptions> */
trait ReadonlyInterpreterOption extends StObject {
  
  val clock: js.UndefOr[typingsJapgolly.xstate.libInterpreterMod.Clock] = js.undefined
  
  val deferEvents: js.UndefOr[Boolean] = js.undefined
  
  val devTools: js.UndefOr[Boolean | js.Object] = js.undefined
  
  val execute: js.UndefOr[Boolean] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  val logger: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  val parent: js.UndefOr[AnyInterpreter] = js.undefined
}
object ReadonlyInterpreterOption {
  
  inline def apply(): ReadonlyInterpreterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyInterpreterOption]
  }
  
  extension [Self <: ReadonlyInterpreterOption](x: Self) {
    
    inline def setClock(value: typingsJapgolly.xstate.libInterpreterMod.Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
    
    inline def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    
    inline def setDeferEventsUndefined: Self = StObject.set(x, "deferEvents", js.undefined)
    
    inline def setDevTools(value: Boolean | js.Object): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    inline def setDevToolsUndefined: Self = StObject.set(x, "devTools", js.undefined)
    
    inline def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogger(value: /* repeated */ Any => Callback): Self = StObject.set(x, "logger", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setParent(value: AnyInterpreter): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
