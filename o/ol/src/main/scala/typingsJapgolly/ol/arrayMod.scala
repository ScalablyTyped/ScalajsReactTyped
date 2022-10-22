package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("ol/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def binarySearch(haystack: js.Array[Any], needle: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def binarySearch(haystack: js.Array[Any], needle: Any, opt_comparator: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], opt_comparator.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def equals_(arr1: js.Array[Any], arr2: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(arr1: js.Array[Any], arr2: js.typedarray.Uint8ClampedArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(arr1: js.typedarray.Uint8ClampedArray, arr2: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(arr1: js.typedarray.Uint8ClampedArray, arr2: js.typedarray.Uint8ClampedArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extend[VALUE](arr: js.Array[VALUE], data: VALUE): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(arr.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def extend[VALUE](arr: js.Array[VALUE], data: js.Array[VALUE]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(arr.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def find[VALUE](arr: js.Array[VALUE], func: js.Function3[/* p0 */ VALUE, /* p1 */ Double, /* p2 */ Any, Boolean]): VALUE | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[VALUE | Null]
  
  inline def findIndex(arr: js.Array[Any], func: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def includes(arr: js.Array[Any], obj: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSorted(arr: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSorted")(arr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSorted(arr: js.Array[Any], opt_func: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSorted")(arr.asInstanceOf[js.Any], opt_func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSorted(arr: js.Array[Any], opt_func: js.Function0[Unit], opt_strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSorted")(arr.asInstanceOf[js.Any], opt_func.asInstanceOf[js.Any], opt_strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSorted(arr: js.Array[Any], opt_func: Unit, opt_strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSorted")(arr.asInstanceOf[js.Any], opt_func.asInstanceOf[js.Any], opt_strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def linearFindNearest(arr: js.Array[Double], target: Double, direction: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearFindNearest")(arr.asInstanceOf[js.Any], target.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def numberSafeCompareFunction(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("numberSafeCompareFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove[VALUE](arr: js.Array[VALUE], obj: VALUE): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def reverseSubArray(arr: js.Array[Any], begin: Double, end: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseSubArray")(arr.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stableSort(arr: js.Array[Any], compareFnc: js.Function2[/* p0 */ Any, /* p1 */ Any, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(arr.asInstanceOf[js.Any], compareFnc.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
