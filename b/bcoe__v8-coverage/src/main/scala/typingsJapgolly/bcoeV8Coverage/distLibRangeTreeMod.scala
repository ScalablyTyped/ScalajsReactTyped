package typingsJapgolly.bcoeV8Coverage

import typingsJapgolly.bcoeV8Coverage.distLibTypesMod.RangeCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRangeTreeMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/range-tree", "RangeTree")
  @js.native
  open class RangeTree protected () extends StObject {
    def this(start: Double, end: Double, delta: Double, children: js.Array[RangeTree]) = this()
    
    var children: js.Array[RangeTree] = js.native
    
    var delta: Double = js.native
    
    var end: Double = js.native
    
    def normalize(): Unit = js.native
    
    /**
      * @precondition `tree.start < value && value < tree.end`
      * @return RangeTree Right part
      */
    def split(value: Double): RangeTree = js.native
    
    var start: Double = js.native
    
    /**
      * Get the range coverages corresponding to the tree.
      *
      * The ranges are pre-order sorted.
      */
    def toRanges(): js.Array[RangeCov] = js.native
  }
  /* static members */
  object RangeTree {
    
    @JSImport("@bcoe/v8-coverage/dist/lib/range-tree", "RangeTree")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @precodition `ranges` are well-formed and pre-order sorted
      */
    inline def fromSortedRanges(ranges: js.Array[RangeCov]): js.UndefOr[RangeTree] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSortedRanges")(ranges.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RangeTree]]
  }
}
