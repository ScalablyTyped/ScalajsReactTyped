package typingsJapgolly.rangesSort

import japgolly.scalajs.react.Callback
import typingsJapgolly.rangesSort.anon.PartialOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ranges-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ranges-sort", "defaults")
  @js.native
  val defaults: Opts = js.native
  
  inline def rSort(arrOfRanges: Ranges): Ranges = ^.asInstanceOf[js.Dynamic].applyDynamic("rSort")(arrOfRanges.asInstanceOf[js.Any]).asInstanceOf[Ranges]
  inline def rSort(arrOfRanges: Ranges, originalOptions: PartialOpts): Ranges = (^.asInstanceOf[js.Dynamic].applyDynamic("rSort")(arrOfRanges.asInstanceOf[js.Any], originalOptions.asInstanceOf[js.Any])).asInstanceOf[Ranges]
  
  @JSImport("ranges-sort", "version")
  @js.native
  val version: String = js.native
  
  trait Opts extends StObject {
    
    var progressFn: js.UndefOr[Null | ProgressFn] = js.undefined
    
    var strictlyTwoElementsInRangeArrays: Boolean
  }
  object Opts {
    
    inline def apply(strictlyTwoElementsInRangeArrays: Boolean): Opts = {
      val __obj = js.Dynamic.literal(strictlyTwoElementsInRangeArrays = strictlyTwoElementsInRangeArrays.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setProgressFn(value: /* percentageDone */ Double => Callback): Self = StObject.set(x, "progressFn", js.Any.fromFunction1((t0: /* percentageDone */ Double) => value(t0).runNow()))
      
      inline def setProgressFnNull: Self = StObject.set(x, "progressFn", null)
      
      inline def setProgressFnUndefined: Self = StObject.set(x, "progressFn", js.undefined)
      
      inline def setStrictlyTwoElementsInRangeArrays(value: Boolean): Self = StObject.set(x, "strictlyTwoElementsInRangeArrays", value.asInstanceOf[js.Any])
    }
  }
  
  type ProgressFn = js.Function1[/* percentageDone */ Double, Unit]
  
  type Range = (js.Tuple2[/* from */ Double, /* to */ Double]) | (js.Tuple3[/* from */ Double, /* to */ Double, /* whatToInsert */ js.UndefOr[String | Null]])
  
  type Ranges = js.Array[Range] | Null
}
