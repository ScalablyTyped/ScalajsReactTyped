package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `next` request. */
trait NextArguments extends StObject {
  
  /** Stepping granularity. If no granularity is specified, a granularity of `statement` is assumed. */
  var granularity: js.UndefOr[SteppingGranularity] = js.undefined
  
  /** If this flag is true, all other suspended threads are not resumed. */
  var singleThread: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies the thread for which to resume execution for one step (of the given granularity). */
  var threadId: Double
}
object NextArguments {
  
  inline def apply(threadId: Double): NextArguments = {
    val __obj = js.Dynamic.literal(threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextArguments]
  }
  
  extension [Self <: NextArguments](x: Self) {
    
    inline def setGranularity(value: SteppingGranularity): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setSingleThread(value: Boolean): Self = StObject.set(x, "singleThread", value.asInstanceOf[js.Any])
    
    inline def setSingleThreadUndefined: Self = StObject.set(x, "singleThread", js.undefined)
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
