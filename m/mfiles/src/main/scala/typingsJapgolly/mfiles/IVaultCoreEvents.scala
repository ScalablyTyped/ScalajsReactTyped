package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultCoreEvents
  extends StObject
     with IEvents {
  
  var OnNewVaultEntry: js.UndefOr[js.Function1[/* vaultEntry */ IVaultEntry, Unit | IVaultEntryEvents]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IVaultCoreEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Callback): IVaultCoreEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1((t0: Double) => Unregister(t0).runNow()))
    __obj.asInstanceOf[IVaultCoreEvents]
  }
  
  extension [Self <: IVaultCoreEvents](x: Self) {
    
    inline def setOnNewVaultEntry(value: /* vaultEntry */ IVaultEntry => Unit | IVaultEntryEvents): Self = StObject.set(x, "OnNewVaultEntry", js.Any.fromFunction1(value))
    
    inline def setOnNewVaultEntryUndefined: Self = StObject.set(x, "OnNewVaultEntry", js.undefined)
    
    inline def setOnStarted(value: Callback): Self = StObject.set(x, "OnStarted", value.toJsFn)
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: Callback): Self = StObject.set(x, "OnStop", value.toJsFn)
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
