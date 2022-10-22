package typingsJapgolly.flashpointLauncher.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZipExtractOptions extends StObject {
  
  var onData: js.UndefOr[js.Function1[/* data */ ZipData, Unit]] = js.undefined
  
  var onProgress: js.UndefOr[js.Function1[/* progress */ ZipProgress, Unit]] = js.undefined
}
object ZipExtractOptions {
  
  inline def apply(): ZipExtractOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipExtractOptions]
  }
  
  extension [Self <: ZipExtractOptions](x: Self) {
    
    inline def setOnData(value: /* data */ ZipData => Callback): Self = StObject.set(x, "onData", js.Any.fromFunction1((t0: /* data */ ZipData) => value(t0).runNow()))
    
    inline def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
    
    inline def setOnProgress(value: /* progress */ ZipProgress => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: /* progress */ ZipProgress) => value(t0).runNow()))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
  }
}
