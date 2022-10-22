package typingsJapgolly.senchaTouch.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Array")
@js.native
open class Array ()
  extends StObject
     with typingsJapgolly.senchaTouch.Ext.Array
/* static members */
object Array {
  
  @JSGlobal("Ext.Array")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Filter through an array and remove empty item as defined in Ext isEmpty
    * @param array Array
    * @returns Array results
    */
  inline def clean(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def clean(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  inline def clone(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Checks whether or not the given array contains the specified item
    * @param array Array The array to check.
    * @param item Object The item to look for.
    * @returns Boolean true if the array contains the item, false otherwise.
    */
  inline def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
  inline def contains(array: Unit, item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains(array: typingsJapgolly.senchaTouch.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def contains(array: typingsJapgolly.senchaTouch.Ext.Array, item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Perform a set difference A B by subtracting all items in array B from array A
    * @param arrayA Array
    * @param arrayB Array
    * @returns Array difference
    */
  inline def difference(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def difference(arrayA: Unit, arrayB: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arrayA.asInstanceOf[js.Any], arrayB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def difference(arrayA: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arrayA.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def difference(arrayA: typingsJapgolly.senchaTouch.Ext.Array, arrayB: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arrayA.asInstanceOf[js.Any], arrayB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Iterates an array or an iterable value and invoke the given callback function for each item
    * @param iterable Array/NodeList/Object The value to be iterated. If this argument is not iterable, the callback function is called once.
    * @param fn Function The callback function. If it returns false, the iteration stops and this method returns the current index.
    * @param scope Object The scope (this reference) in which the specified function is executed.
    * @param reverse Boolean Reverse the iteration order (loop from the end to the beginning).
    * @returns Boolean See description for the fn parameter.
    */
  inline def each(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Boolean]
  inline def each(iterable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Any, scope: Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Any, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Unit, scope: Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Unit, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Any, scope: Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Any, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Unit, scope: Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Unit, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Removes items from an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index.
    * @returns Array The array passed.
    */
  inline def erase(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def erase(array: Unit, index: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def erase(array: Unit, index: Double, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def erase(array: Unit, index: Unit, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def erase(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def erase(array: typingsJapgolly.senchaTouch.Ext.Array, index: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def erase(array: typingsJapgolly.senchaTouch.Ext.Array, index: Double, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def erase(array: typingsJapgolly.senchaTouch.Ext.Array, index: Unit, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Executes the specified function for each array element until the function returns a falsy value
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Boolean true if no false value is returned by the callback function.
    */
  inline def every(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")().asInstanceOf[Boolean]
  inline def every(array: Unit, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: Unit, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: Unit, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: typingsJapgolly.senchaTouch.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def every(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Creates a new array with all of the elements of this array for which the provided filtering function returns true
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Array results
    */
  inline def filter(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def filter(array: Unit, fn: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def filter(array: Unit, fn: Any, scope: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def filter(array: Unit, fn: Unit, scope: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def filter(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def filter(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def filter(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any, scope: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def filter(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Unit, scope: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Recursively flattens into 1 d Array
    * @param array Array The array to flatten
    * @returns Array The 1-d array.
    */
  inline def flatten(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def flatten(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Iterates an array and invoke the given callback function for each item
    * @param array Array The array to iterate.
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) in which the specified function is executed.
    */
  inline def forEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")().asInstanceOf[Unit]
  inline def forEach(array: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: typingsJapgolly.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def forEach(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Converts a value to an array if it s not already an array returns An empty array if given value is undefined or n
    * @param value Object The value to convert to an array if it's not already is an array.
    * @param newReference Boolean true to clone the given array and return a new reference if necessary.
    * @returns Array array
    */
  inline def from(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def from(value: Any): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def from(value: Any, newReference: Boolean): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], newReference.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def from(value: Unit, newReference: Boolean): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], newReference.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Push an item into the array only if the array doesn t contain it yet
    * @param array Array The array.
    * @param item Object The item to include.
    */
  inline def include(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("include")().asInstanceOf[Unit]
  inline def include(array: Unit, item: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def include(array: typingsJapgolly.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("include")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def include(array: typingsJapgolly.senchaTouch.Ext.Array, item: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Get the index of the provided item in the given array a supplement for the missing arrayPrototype indexOf in Interne
    * @param array Array The array to check.
    * @param item Object The item to look for.
    * @param from Number The index at which to begin the search.
    * @returns Number The index of item in the array (or -1 if it is not found).
    */
  inline def indexOf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")().asInstanceOf[Double]
  inline def indexOf(array: Unit, item: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: Unit, item: Any, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: Unit, item: Unit, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: typingsJapgolly.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def indexOf(array: typingsJapgolly.senchaTouch.Ext.Array, item: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: typingsJapgolly.senchaTouch.Ext.Array, item: Any, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: typingsJapgolly.senchaTouch.Ext.Array, item: Unit, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Inserts items in to an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param items Array The array of items to insert at index.
    * @returns Array The array passed.
    */
  inline def insert(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def insert(array: Unit, index: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def insert(array: Unit, index: Double, items: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def insert(array: Unit, index: Unit, items: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def insert(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def insert(array: typingsJapgolly.senchaTouch.Ext.Array, index: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def insert(
    array: typingsJapgolly.senchaTouch.Ext.Array,
    index: Double,
    items: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def insert(
    array: typingsJapgolly.senchaTouch.Ext.Array,
    index: Unit,
    items: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Merge multiple arrays into one with unique items that exist in all of the arrays
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array intersect
    */
  inline def intersect(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def intersect(array1: Unit, array2: Unit, etc: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def intersect(array1: Unit, array2: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def intersect(
    array1: Unit,
    array2: typingsJapgolly.senchaTouch.Ext.Array,
    etc: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def intersect(array1: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def intersect(
    array1: typingsJapgolly.senchaTouch.Ext.Array,
    array2: Unit,
    etc: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def intersect(array1: typingsJapgolly.senchaTouch.Ext.Array, array2: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def intersect(
    array1: typingsJapgolly.senchaTouch.Ext.Array,
    array2: typingsJapgolly.senchaTouch.Ext.Array,
    etc: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Creates a new array with the results of calling a provided function on every element in this array
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Array results
    */
  inline def map(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def map(array: Unit, fn: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def map(array: Unit, fn: Any, scope: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def map(array: Unit, fn: Unit, scope: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def map(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def map(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def map(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any, scope: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def map(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Unit, scope: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Returns the maximum value in the Array
    * @param array Array/NodeList The Array from which to select the maximum value.
    * @param comparisonFn Function a function to perform the comparison which determines maximization. If omitted the ">" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object maxValue The maximum value
    */
  inline def max(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[Any]
  inline def max(array: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def max(array: Any, comparisonFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def max(array: Unit, comparisonFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Calculates the mean of all items in the array
    * @param array Array The Array to calculate the mean value of.
    * @returns Number The mean.
    */
  inline def mean(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")().asInstanceOf[Double]
  inline def mean(array: typingsJapgolly.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  inline def merge(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def merge(array1: Unit, array2: Unit, etc: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def merge(array1: Unit, array2: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def merge(
    array1: Unit,
    array2: typingsJapgolly.senchaTouch.Ext.Array,
    etc: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def merge(array1: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def merge(
    array1: typingsJapgolly.senchaTouch.Ext.Array,
    array2: Unit,
    etc: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def merge(array1: typingsJapgolly.senchaTouch.Ext.Array, array2: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def merge(
    array1: typingsJapgolly.senchaTouch.Ext.Array,
    array2: typingsJapgolly.senchaTouch.Ext.Array,
    etc: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Returns the minimum value in the Array
    * @param array Array/NodeList The Array from which to select the minimum value.
    * @param comparisonFn Function a function to perform the comparison which determines minimization. If omitted the "&lt;" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object minValue The minimum value.
    */
  inline def min(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[Any]
  inline def min(array: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def min(array: Any, comparisonFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def min(array: Unit, comparisonFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Plucks the value of a property from each item in the Array
    * @param array Array/NodeList The Array of items to pluck the value from.
    * @param propertyName String The property name to pluck from each element.
    * @returns Array The value from each item in the Array.
    */
  inline def pluck(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def pluck(array: Any): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def pluck(array: Any, propertyName: java.lang.String): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(array.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def pluck(array: Unit, propertyName: java.lang.String): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(array.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Removes the specified item from the array if it exists
    * @param array Array The array.
    * @param item Object The item to remove.
    * @returns Array The passed array itself.
    */
  inline def remove(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def remove(array: Unit, item: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def remove(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def remove(array: typingsJapgolly.senchaTouch.Ext.Array, item: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @param insert Array An array of items to insert at index.
    * @returns Array The array passed.
    */
  inline def replace(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: Unit, index: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: Unit, index: Double, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: Unit, index: Double, removeCount: Double, insert: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: Unit, index: Double, removeCount: Unit, insert: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: Unit, index: Unit, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: Unit, index: Unit, removeCount: Double, insert: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: Unit, index: Unit, removeCount: Unit, insert: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: typingsJapgolly.senchaTouch.Ext.Array, index: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: typingsJapgolly.senchaTouch.Ext.Array, index: Double, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(
    array: typingsJapgolly.senchaTouch.Ext.Array,
    index: Double,
    removeCount: Double,
    insert: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(
    array: typingsJapgolly.senchaTouch.Ext.Array,
    index: Double,
    removeCount: Unit,
    insert: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(array: typingsJapgolly.senchaTouch.Ext.Array, index: Unit, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(
    array: typingsJapgolly.senchaTouch.Ext.Array,
    index: Unit,
    removeCount: Double,
    insert: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def replace(
    array: typingsJapgolly.senchaTouch.Ext.Array,
    index: Unit,
    removeCount: Unit,
    insert: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Returns a shallow copy of a part of an array
    * @param array Array The array (or arguments object).
    * @param begin Number The index at which to begin. Negative values are offsets from the end of the array.
    * @param end Number The index at which to end. The copied items do not include end. Negative values are offsets from the end of the array. If end is omitted, all items up to the end of the array are copied.
    * @returns Array The copied piece of the array.
    */
  inline def slice(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def slice(array: Unit, begin: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def slice(array: Unit, begin: Double, end: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def slice(array: Unit, begin: Unit, end: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def slice(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def slice(array: typingsJapgolly.senchaTouch.Ext.Array, begin: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def slice(array: typingsJapgolly.senchaTouch.Ext.Array, begin: Double, end: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def slice(array: typingsJapgolly.senchaTouch.Ext.Array, begin: Unit, end: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Executes the specified function for each array element until the function returns a truthy value
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Boolean true if the callback function returns a truthy value.
    */
  inline def some(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")().asInstanceOf[Boolean]
  inline def some(array: Unit, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: Unit, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: Unit, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: typingsJapgolly.senchaTouch.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def some(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: typingsJapgolly.senchaTouch.Ext.Array, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Sorts the elements of an Array
    * @param array Array The array to sort.
    * @param sortFn Function The comparison function.
    * @returns Array The sorted array.
    */
  inline def sort(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def sort(array: Unit, sortFn: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], sortFn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def sort(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def sort(array: typingsJapgolly.senchaTouch.Ext.Array, sortFn: Any): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], sortFn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @returns Array An array containing the removed items.
    */
  inline def splice(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def splice(array: Unit, index: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def splice(array: Unit, index: Double, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def splice(array: Unit, index: Unit, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def splice(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def splice(array: typingsJapgolly.senchaTouch.Ext.Array, index: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def splice(array: typingsJapgolly.senchaTouch.Ext.Array, index: Double, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def splice(array: typingsJapgolly.senchaTouch.Ext.Array, index: Unit, removeCount: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Calculates the sum of all items in the given array
    * @param array Array The Array to calculate the sum value of.
    * @returns Number The sum.
    */
  inline def sum(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")().asInstanceOf[Double]
  inline def sum(array: typingsJapgolly.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Converts any iterable numeric indices and a length property into a true array
    * @param iterable Object the iterable object to be turned into a true Array.
    * @param start Number a zero-based index that specifies the start of extraction.
    * @param end Number a zero-based index that specifies the end of extraction.
    * @returns Array
    */
  inline def toArray(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def toArray(iterable: Any): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def toArray(iterable: Any, start: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def toArray(iterable: Any, start: Double, end: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def toArray(iterable: Any, start: Unit, end: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def toArray(iterable: Unit, start: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def toArray(iterable: Unit, start: Double, end: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def toArray(iterable: Unit, start: Unit, end: Double): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  inline def union(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("union")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def union(array1: Unit, array2: Unit, etc: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def union(array1: Unit, array2: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def union(
    array1: Unit,
    array2: typingsJapgolly.senchaTouch.Ext.Array,
    etc: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def union(array1: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def union(
    array1: typingsJapgolly.senchaTouch.Ext.Array,
    array2: Unit,
    etc: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def union(array1: typingsJapgolly.senchaTouch.Ext.Array, array2: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def union(
    array1: typingsJapgolly.senchaTouch.Ext.Array,
    array2: typingsJapgolly.senchaTouch.Ext.Array,
    etc: typingsJapgolly.senchaTouch.Ext.Array
  ): typingsJapgolly.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  
  /** [Method] Returns a new array with unique items
    * @param array Array
    * @returns Array results
    */
  inline def unique(): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
  inline def unique(array: typingsJapgolly.senchaTouch.Ext.Array): typingsJapgolly.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.senchaTouch.Ext.Array]
}
