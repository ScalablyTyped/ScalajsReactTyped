package typingsJapgolly.devexpressUtils

import typingsJapgolly.devexpressUtils.libIntervalsMutableMod.MutableInterval
import typingsJapgolly.devexpressUtils.libIntervalsReproducibleMod.IReproducibleInterval
import typingsJapgolly.devexpressUtils.libIntervalsSparseIntervalsMod.SparseIntervals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsSparseCollectorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/collector", "SparseIntervalsCollector")
  @js.native
  open class SparseIntervalsCollector[IntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[IntervalT] */] protected () extends StObject {
    def this(template: TemplateT) = this()
    
    def add(index: Double): Unit = js.native
    
    /* private */ var curr: Any = js.native
    
    def getIntervals(): SparseIntervals[IntervalT] = js.native
    
    /* private */ var intervals: Any = js.native
    
    /* private */ var template: Any = js.native
  }
}
