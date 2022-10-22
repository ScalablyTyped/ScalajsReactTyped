package typingsJapgolly.devexpressUtils

import typingsJapgolly.devexpressUtils.libIntervalsConstMod.ConstInterval
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsSparseMapIteratorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/map-iterator", "SparseIntervalsMapIterator")
  @js.native
  open class SparseIntervalsMapIterator[T /* <: ConstInterval */, ObjT] protected () extends StObject {
    def this(intervals: js.Array[T], valMap: Record[Double, ObjT]) = this()
    
    var interval: T = js.native
    
    var intervalIndex: Double = js.native
    
    def moveToNextInterval(): Boolean = js.native
    
    def moveToNextPosition(): Boolean = js.native
    
    def numIntervals: Double = js.native
    
    var `object`: ObjT = js.native
    
    var posInInterval: Double = js.native
    
    var position: Double = js.native
    
    /* private */ var sparseIntervals: Any = js.native
    
    /* private */ var valMap: Any = js.native
  }
}
