package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Logger * / any */ trait ILogger extends StObject {
  
  def ok(msg: String): Unit
  @JSName("ok")
  var ok_Original: LogFn
  
  def rawmsg(msg: String): Unit
  @JSName("rawmsg")
  var rawmsg_Original: LogFn
}
object ILogger {
  
  inline def apply(ok: /* msg */ String => Callback, rawmsg: /* msg */ String => Callback): ILogger = {
    val __obj = js.Dynamic.literal(ok = js.Any.fromFunction1((t0: /* msg */ String) => ok(t0).runNow()), rawmsg = js.Any.fromFunction1((t0: /* msg */ String) => rawmsg(t0).runNow()))
    __obj.asInstanceOf[ILogger]
  }
  
  extension [Self <: ILogger](x: Self) {
    
    inline def setOk(value: /* msg */ String => Callback): Self = StObject.set(x, "ok", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
    
    inline def setRawmsg(value: /* msg */ String => Callback): Self = StObject.set(x, "rawmsg", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
  }
}
