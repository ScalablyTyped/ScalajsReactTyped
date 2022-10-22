package typingsJapgolly.esbuild.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchMode extends StObject {
  
  var onRebuild: js.UndefOr[
    js.Function2[/* error */ BuildFailure | Null, /* result */ BuildResult | Null, Unit]
  ] = js.undefined
}
object WatchMode {
  
  inline def apply(): WatchMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchMode]
  }
  
  extension [Self <: WatchMode](x: Self) {
    
    inline def setOnRebuild(value: (/* error */ BuildFailure | Null, /* result */ BuildResult | Null) => Callback): Self = StObject.set(x, "onRebuild", js.Any.fromFunction2((t0: /* error */ BuildFailure | Null, t1: /* result */ BuildResult | Null) => (value(t0, t1)).runNow()))
    
    inline def setOnRebuildUndefined: Self = StObject.set(x, "onRebuild", js.undefined)
  }
}
