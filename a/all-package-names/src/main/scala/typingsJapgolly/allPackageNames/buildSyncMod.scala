package typingsJapgolly.allPackageNames

import japgolly.scalajs.react.Callback
import typingsJapgolly.allPackageNames.buildLoadMod.LoadOptions
import typingsJapgolly.allPackageNames.buildLoadMod.Save_
import typingsJapgolly.commander.mod.Command
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSyncMod {
  
  @JSImport("all-package-names/build/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("all-package-names/build/sync", JSImport.Default)
  @js.native
  val default: Command = js.native
  
  inline def sync(): js.Promise[Save_] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Promise[Save_]]
  inline def sync(hasOnDataOnStartOnEndMaxAge: SyncOptions): js.Promise[Save_] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(hasOnDataOnStartOnEndMaxAge.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Save_]]
  
  inline def syncAction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncAction")().asInstanceOf[Unit]
  inline def syncAction(options: LoadOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncAction")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait State extends StObject {
    
    /**
      * Milliseconds since sync began
      */
    var elapsed: Double
    
    /**
      * Ending package sync index
      */
    var end: Double
    
    /**
      * Current package sync index
      */
    var index: Double
    
    /**
      * Set of package names that have been added
      */
    var packageNames: Set[String]
    
    /**
      * Percentage of sync completed
      */
    var progress: Double
    
    /**
      * Starting package sync index
      */
    var start: Double
  }
  object State {
    
    inline def apply(
      elapsed: Double,
      end: Double,
      index: Double,
      packageNames: Set[String],
      progress: Double,
      start: Double
    ): State = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], packageNames = packageNames.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPackageNames(value: Set[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  type StateHook = js.Function1[/* state */ State, Unit]
  
  trait SyncOptions
    extends StObject
       with LoadOptions {
    
    var onData: js.UndefOr[StateHook] = js.undefined
    
    var onEnd: js.UndefOr[StateHook] = js.undefined
    
    var onStart: js.UndefOr[StateHook] = js.undefined
  }
  object SyncOptions {
    
    inline def apply(): SyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncOptions]
    }
    
    extension [Self <: SyncOptions](x: Self) {
      
      inline def setOnData(value: /* state */ State => Callback): Self = StObject.set(x, "onData", js.Any.fromFunction1((t0: /* state */ State) => value(t0).runNow()))
      
      inline def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
      
      inline def setOnEnd(value: /* state */ State => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction1((t0: /* state */ State) => value(t0).runNow()))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: /* state */ State => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: /* state */ State) => value(t0).runNow()))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
