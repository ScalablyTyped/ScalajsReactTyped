package typingsJapgolly.rangesMerge

import japgolly.scalajs.react.Callback
import typingsJapgolly.rangesMerge.mod.ProgressFn
import typingsJapgolly.rangesMerge.rangesMergeInts.`1`
import typingsJapgolly.rangesMerge.rangesMergeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ranges-merge.ranges-merge.Opts> */
  trait PartialOpts extends StObject {
    
    var joinRangesThatTouchEdges: js.UndefOr[Boolean] = js.undefined
    
    var mergeType: js.UndefOr[
        `1` | `2` | typingsJapgolly.rangesMerge.rangesMergeStrings.`1` | typingsJapgolly.rangesMerge.rangesMergeStrings.`2`
      ] = js.undefined
    
    var progressFn: js.UndefOr[Null | ProgressFn] = js.undefined
  }
  object PartialOpts {
    
    inline def apply(): PartialOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOpts]
    }
    
    extension [Self <: PartialOpts](x: Self) {
      
      inline def setJoinRangesThatTouchEdges(value: Boolean): Self = StObject.set(x, "joinRangesThatTouchEdges", value.asInstanceOf[js.Any])
      
      inline def setJoinRangesThatTouchEdgesUndefined: Self = StObject.set(x, "joinRangesThatTouchEdges", js.undefined)
      
      inline def setMergeType(
        value: `1` | `2` | typingsJapgolly.rangesMerge.rangesMergeStrings.`1` | typingsJapgolly.rangesMerge.rangesMergeStrings.`2`
      ): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
      
      inline def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
      
      inline def setProgressFn(value: /* percentageDone */ Double => Callback): Self = StObject.set(x, "progressFn", js.Any.fromFunction1((t0: /* percentageDone */ Double) => value(t0).runNow()))
      
      inline def setProgressFnNull: Self = StObject.set(x, "progressFn", null)
      
      inline def setProgressFnUndefined: Self = StObject.set(x, "progressFn", js.undefined)
    }
  }
}
