package typingsJapgolly.devexpressUtils

import typingsJapgolly.devexpressUtils.libIntervalsConstMod.ConstInterval
import typingsJapgolly.devexpressUtils.libIntervalsSparseIntervalsMod.SparseIntervals
import typingsJapgolly.devexpressUtils.libIntervalsSparseIteratorMod.SparseIntervalsIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsSparseObjectsIteratorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/objects-iterator", "SparseObjectsIterator")
  @js.native
  open class SparseObjectsIterator[T /* <: ConstInterval */, ObjT] protected () extends SparseIntervalsIterator[T] {
    def this(sparseIntervals: SparseIntervals[T], objects: js.Array[ObjT]) = this()
    
    var obj: ObjT = js.native
    
    var objects: js.Array[ObjT] = js.native
  }
}
