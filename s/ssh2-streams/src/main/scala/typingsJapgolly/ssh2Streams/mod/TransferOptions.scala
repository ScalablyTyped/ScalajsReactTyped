package typingsJapgolly.ssh2Streams.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferOptions extends StObject {
  
  /**
    * Size of each read in bytes
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of concurrent reads
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  
  /**
    * Integer or string representing the file mode to set for the uploaded file.
    */
  var mode: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Called every time a part of a file was transferred
    */
  var step: js.UndefOr[
    js.Function3[/* total_transferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.undefined
}
object TransferOptions {
  
  inline def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  
  extension [Self <: TransferOptions](x: Self) {
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setStep(value: (/* total_transferred */ Double, /* chunk */ Double, /* total */ Double) => Callback): Self = StObject.set(x, "step", js.Any.fromFunction3((t0: /* total_transferred */ Double, t1: /* chunk */ Double, t2: /* total */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
