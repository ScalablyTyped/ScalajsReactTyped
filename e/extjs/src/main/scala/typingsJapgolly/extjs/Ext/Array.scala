package typingsJapgolly.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Array")
@js.native
class Array () extends js.Object

/* static members */
@JSGlobal("Ext.Array")
@js.native
object Array extends js.Object {
  /** [Method] Filter through an array and remove empty item as defined in Ext isEmpty See filter
  		* @param array Array
  		* @returns Array results
  		*/
  def clean(): Array = js.native
  def clean(array: Array): Array = js.native
  def clone(array: Array): Array = js.native
  /** [Method] Checks whether or not the given array contains the specified item
  		* @param array Array The array to check
  		* @param item Object The item to look for
  		* @returns Boolean True if the array contains the item, false otherwise
  		*/
  def contains(): Boolean = js.native
  def contains(array: Array): Boolean = js.native
  def contains(array: Array, item: js.Any): Boolean = js.native
  /** [Method] Perform a set difference A B by subtracting all items in array B from array A
  		* @param arrayA Array
  		* @param arrayB Array
  		* @returns Array difference
  		*/
  def difference(): Array = js.native
  def difference(arrayA: Array): Array = js.native
  def difference(arrayA: Array, arrayB: Array): Array = js.native
  /** [Method] Iterates an array or an iterable value and invoke the given callback function for each item
  		* @param iterable Array/NodeList/Object The value to be iterated. If this argument is not iterable, the callback function is called once.
  		* @param fn Function The callback function. If it returns false, the iteration stops and this method returns the current index.
  		* @param scope Object The scope (this reference) in which the specified function is executed.
  		* @param reverse Boolean Reverse the iteration order (loop from the end to the beginning) Defaults false
  		* @returns Boolean See description for the fn parameter.
  		*/
  def each(): Boolean = js.native
  def each(iterable: js.Any): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.Any): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.Any, reverse: Boolean): Boolean = js.native
  /** [Method] Shallow compares the contents of 2 arrays using strict equality
  		* @param array1 Array
  		* @param array2 Array
  		* @returns Boolean true if the arrays are equal.
  		*/
  def equals(): Boolean = js.native
  def equals(array1: Array): Boolean = js.native
  def equals(array1: Array, array2: Array): Boolean = js.native
  /** [Method] Removes items from an array
  		* @param array Array The Array on which to replace.
  		* @param index Number The index in the array at which to operate.
  		* @param removeCount Number The number of items to remove at index.
  		* @returns Array The array passed.
  		*/
  def erase(): Array = js.native
  def erase(array: Array): Array = js.native
  def erase(array: Array, index: Double): Array = js.native
  def erase(array: Array, index: Double, removeCount: Double): Array = js.native
  /** [Method] Executes the specified function for each array element until the function returns a falsy value
  		* @param array Array
  		* @param fn Function Callback function for each item
  		* @param scope Object Callback function scope
  		* @returns Boolean True if no false value is returned by the callback function.
  		*/
  def every(): Boolean = js.native
  def every(array: Array): Boolean = js.native
  def every(array: Array, fn: js.Any): Boolean = js.native
  def every(array: Array, fn: js.Any, scope: js.Any): Boolean = js.native
  /** [Method] Creates a new array with all of the elements of this array for which the provided filtering function returns true
  		* @param array Array
  		* @param fn Function Callback function for each item
  		* @param scope Object Callback function scope
  		* @returns Array results
  		*/
  def filter(): Array = js.native
  def filter(array: Array): Array = js.native
  def filter(array: Array, fn: js.Any): Array = js.native
  def filter(array: Array, fn: js.Any, scope: js.Any): Array = js.native
  /** [Method] Returns the first item in the array which elicits a true return value from the passed selection function
  		* @param array Array The array to search
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the array
  		* @returns Object The first item in the array which returned true from the selection function, or null if none was found.
  		*/
  def findBy(): js.Any = js.native
  def findBy(array: Array): js.Any = js.native
  def findBy(array: Array, fn: js.Any): js.Any = js.native
  def findBy(array: Array, fn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Recursively flattens into 1 d Array
  		* @param array Array The array to flatten
  		* @returns Array The 1-d array.
  		*/
  def flatten(): Array = js.native
  def flatten(array: Array): Array = js.native
  /** [Method] Iterates an array and invoke the given callback function for each item
  		* @param array Array The array to iterate
  		* @param fn Function The callback function.
  		* @param scope Object The execution scope (this) in which the specified function is executed.
  		*/
  def forEach(): Unit = js.native
  def forEach(array: Array): Unit = js.native
  def forEach(array: Array, fn: js.Any): Unit = js.native
  def forEach(array: Array, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Converts a value to an array if it s not already an array returns An empty array if given value is undefined or n
  		* @param value Object The value to convert to an array if it's not already is an array
  		* @param newReference Boolean True to clone the given array and return a new reference if necessary, defaults to false
  		* @returns Array array
  		*/
  def from(): Array = js.native
  def from(value: js.Any): Array = js.native
  def from(value: js.Any, newReference: Boolean): Array = js.native
  /** [Method] Push an item into the array only if the array doesn t contain it yet
  		* @param array Array The array
  		* @param item Object The item to include
  		*/
  def include(): Unit = js.native
  def include(array: Array): Unit = js.native
  def include(array: Array, item: js.Any): Unit = js.native
  /** [Method] Get the index of the provided item in the given array a supplement for the missing arrayPrototype indexOf in Interne
  		* @param array Array The array to check
  		* @param item Object The item to look for
  		* @param from Number The index at which to begin the search
  		* @returns Number The index of item in the array (or -1 if it is not found)
  		*/
  def indexOf(): Double = js.native
  def indexOf(array: Array): Double = js.native
  def indexOf(array: Array, item: js.Any): Double = js.native
  def indexOf(array: Array, item: js.Any, from: Double): Double = js.native
  /** [Method] Inserts items in to an array
  		* @param array Array The Array in which to insert.
  		* @param index Number The index in the array at which to operate.
  		* @param items Array The array of items to insert at index.
  		* @returns Array The array passed.
  		*/
  def insert(): Array = js.native
  def insert(array: Array): Array = js.native
  def insert(array: Array, index: Double): Array = js.native
  def insert(array: Array, index: Double, items: Array): Array = js.native
  /** [Method] Merge multiple arrays into one with unique items that exist in all of the arrays
  		* @param array1 Array
  		* @param array2 Array
  		* @param etc Array
  		* @returns Array intersect
  		*/
  def intersect(): Array = js.native
  def intersect(array1: Array): Array = js.native
  def intersect(array1: Array, array2: Array): Array = js.native
  def intersect(array1: Array, array2: Array, etc: Array): Array = js.native
  /** [Method] Creates a new array with the results of calling a provided function on every element in this array
  		* @param array Array
  		* @param fn Function Callback function for each item
  		* @param scope Object Callback function scope
  		* @returns Array results
  		*/
  def map(): Array = js.native
  def map(array: Array): Array = js.native
  def map(array: Array, fn: js.Any): Array = js.native
  def map(array: Array, fn: js.Any, scope: js.Any): Array = js.native
  /** [Method] Returns the maximum value in the Array
  		* @param array Array/NodeList The Array from which to select the maximum value.
  		* @param comparisonFn Function a function to perform the comparision which determines maximization. If omitted the ">" operator will be used. Note: gt = 1; eq = 0; lt = -1
  		* @returns Object maxValue The maximum value
  		*/
  def max(): js.Any = js.native
  def max(array: js.Any): js.Any = js.native
  def max(array: js.Any, comparisonFn: js.Any): js.Any = js.native
  /** [Method] Calculates the mean of all items in the array
  		* @param array Array The Array to calculate the mean value of.
  		* @returns Number The mean.
  		*/
  def mean(): Double = js.native
  def mean(array: Array): Double = js.native
  /** [Method] Merge multiple arrays into one with unique items
  		* @param array1 Array
  		* @param array2 Array
  		* @param etc Array
  		* @returns Array merged
  		*/
  def merge(): Array = js.native
  def merge(array1: Array): Array = js.native
  def merge(array1: Array, array2: Array): Array = js.native
  def merge(array1: Array, array2: Array, etc: Array): Array = js.native
  /** [Method] Returns the minimum value in the Array
  		* @param array Array/NodeList The Array from which to select the minimum value.
  		* @param comparisonFn Function a function to perform the comparision which determines minimization. If omitted the "&lt;" operator will be used. Note: gt = 1; eq = 0; lt = -1
  		* @returns Object minValue The minimum value
  		*/
  def min(): js.Any = js.native
  def min(array: js.Any): js.Any = js.native
  def min(array: js.Any, comparisonFn: js.Any): js.Any = js.native
  /** [Method] Plucks the value of a property from each item in the Array
  		* @param array Array/NodeList The Array of items to pluck the value from.
  		* @param propertyName String The property name to pluck from each element.
  		* @returns Array The value from each item in the Array.
  		*/
  def pluck(): Array = js.native
  def pluck(array: js.Any): Array = js.native
  def pluck(array: js.Any, propertyName: java.lang.String): Array = js.native
  /** [Method] Pushes new items onto the end of an Array
  		* @param target Array The Array onto which to push new items
  		* @param elements Object... The elements to add to the array. Each parameter may be an Array, in which case all the elements of that Array will be pushed into the end of the destination Array.
  		* @returns Array An array containing all the new items push onto the end.
  		*/
  def push(target: Array, elements: js.Any*): Array = js.native
  /** [Method] Removes the specified item from the array if it exists
  		* @param array Array The array
  		* @param item Object The item to remove
  		* @returns Array The passed array itself
  		*/
  def remove(): Array = js.native
  def remove(array: Array): Array = js.native
  def remove(array: Array, item: js.Any): Array = js.native
  /** [Method] Replaces items in an array
  		* @param array Array The Array on which to replace.
  		* @param index Number The index in the array at which to operate.
  		* @param removeCount Number The number of items to remove at index (can be 0).
  		* @param insert Array An array of items to insert at index.
  		* @returns Array The array passed.
  		*/
  def replace(): Array = js.native
  def replace(array: Array): Array = js.native
  def replace(array: Array, index: Double): Array = js.native
  def replace(array: Array, index: Double, removeCount: Double): Array = js.native
  def replace(array: Array, index: Double, removeCount: Double, insert: Array): Array = js.native
  /** [Method] Returns a shallow copy of a part of an array
  		* @param array Array The array (or arguments object).
  		* @param begin Number The index at which to begin. Negative values are offsets from the end of the array.
  		* @param end Number The index at which to end. The copied items do not include end. Negative values are offsets from the end of the array. If end is omitted, all items up to the end of the array are copied.
  		* @returns Array The copied piece of the array.
  		*/
  def slice(): Array = js.native
  def slice(array: Array): Array = js.native
  def slice(array: Array, begin: Double): Array = js.native
  def slice(array: Array, begin: Double, end: Double): Array = js.native
  /** [Method] Executes the specified function for each array element until the function returns a truthy value
  		* @param array Array
  		* @param fn Function Callback function for each item
  		* @param scope Object Callback function scope
  		* @returns Boolean True if the callback function returns a truthy value.
  		*/
  def some(): Boolean = js.native
  def some(array: Array): Boolean = js.native
  def some(array: Array, fn: js.Any): Boolean = js.native
  def some(array: Array, fn: js.Any, scope: js.Any): Boolean = js.native
  /** [Method] Sorts the elements of an Array
  		* @param array Array The array to sort.
  		* @param sortFn Function The comparison function.
  		* @returns Array The sorted array.
  		*/
  def sort(): Array = js.native
  def sort(array: Array): Array = js.native
  def sort(array: Array, sortFn: js.Any): Array = js.native
  /** [Method] Replaces items in an array
  		* @param array Array The Array on which to replace.
  		* @param index Number The index in the array at which to operate.
  		* @param removeCount Number The number of items to remove at index (can be 0).
  		* @param elements Object... The elements to add to the array. If you don't specify any elements, splice simply removes elements from the array.
  		* @returns Array An array containing the removed items.
  		*/
  def splice(array: Array, index: Double, removeCount: Double, elements: js.Any*): Array = js.native
  /** [Method] Calculates the sum of all items in the given array
  		* @param array Array The Array to calculate the sum value of.
  		* @returns Number The sum.
  		*/
  def sum(): Double = js.native
  def sum(array: Array): Double = js.native
  /** [Method] Converts any iterable numeric indices and a length property into a true array
  		* @param iterable Object the iterable object to be turned into a true Array.
  		* @param start Number a zero-based index that specifies the start of extraction. Defaults to 0
  		* @param end Number a 1-based index that specifies the end of extraction. Defaults to the last index of the iterable value
  		* @returns Array array
  		*/
  def toArray(): Array = js.native
  def toArray(iterable: js.Any): Array = js.native
  def toArray(iterable: js.Any, start: Double): Array = js.native
  def toArray(iterable: js.Any, start: Double, end: Double): Array = js.native
  /** [Method] Creates a map object keyed by the elements of the given array
  		* @param array Array The Array to create the map from.
  		* @param getKey String/Function Name of the object property to use as a key or a function to extract the key.
  		* @param scope Object Value of this inside callback.
  		* @returns Object The resulting map.
  		*/
  def toMap(): js.Any = js.native
  def toMap(array: Array): js.Any = js.native
  def toMap(array: Array, getKey: js.Any): js.Any = js.native
  def toMap(array: Array, getKey: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Creates a map object keyed by a property of elements of the given array
  		* @param array Array The Array to create the map from.
  		* @param getKey String/Function Name of the object property to use as a key or a function to extract the key.
  		* @param scope Object Value of this inside callback.
  		* @returns Object The resulting map.
  		*/
  def toValueMap(): js.Any = js.native
  def toValueMap(array: Array): js.Any = js.native
  def toValueMap(array: Array, getKey: js.Any): js.Any = js.native
  def toValueMap(array: Array, getKey: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Merge multiple arrays into one with unique items
  		* @param array1 Array
  		* @param array2 Array
  		* @param etc Array
  		* @returns Array merged
  		*/
  def union(): Array = js.native
  def union(array1: Array): Array = js.native
  def union(array1: Array, array2: Array): Array = js.native
  def union(array1: Array, array2: Array, etc: Array): Array = js.native
  /** [Method] Returns a new array with unique items
  		* @param array Array
  		* @returns Array results
  		*/
  def unique(): Array = js.native
  def unique(array: Array): Array = js.native
}

