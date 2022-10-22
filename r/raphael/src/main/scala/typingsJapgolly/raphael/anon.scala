package typingsJapgolly.raphael

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.raphael.mod.RaphaelDashArrayType
import typingsJapgolly.raphael.mod.RaphaelLineCapType
import typingsJapgolly.raphael.mod.RaphaelLineJoinType
import typingsJapgolly.raphael.mod.RaphaelTextAnchorType
import typingsJapgolly.raphael.mod.RaphaelTransformSegment
import typingsJapgolly.raphael.raphaelStrings.`arrow-end`
import typingsJapgolly.raphael.raphaelStrings.transform
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.anon.CopyWithin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Array<keyof raphael.raphael.RaphaelReadAttributes> & {  0 :keyof raphael.raphael.RaphaelReadAttributes | undefined} */
  @js.native
  trait ArraykeyofRaphaelReadAttr
    extends StObject
       with /* standard es5 */
  /* n */ NumberDictionary[transform] {
    
    var `0`: js.UndefOr[transform] = js.native
    
    /**
      * Returns the item located at the specified index.
      * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
      */
    /* standard es2022.array */
    def at(index: Double): js.UndefOr[transform] = js.native
    
    /**
      * Combines two or more arrays.
      * This method returns a new array without modifying any existing arrays.
      * @param items Additional arrays and/or items to add to the end of the array.
      */
    /* standard es5 */
    @JSName("concat")
    def concat_transform(items: (js.Array[transform] | transform)*): js.Array[transform] = js.native
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    /* standard es2015.core */
    def copyWithin(target: Double, start: Double): this.type = js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    /* standard es2015.iterable */
    def entries(): IterableIterator[js.Tuple2[Double, transform]] = js.native
    
    def every(predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Boolean]): /* is std.Array<'arrow-end'> */ Boolean = js.native
    def every(
      predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Boolean],
      thisArg: Any
    ): /* is std.Array<'arrow-end'> */ Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("every")
    def every_transform(
      predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Any | Boolean]
    ): /* is std.Array<'transform'> */ Boolean = js.native
    @JSName("every")
    def every_transform(
      predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Any | Boolean],
      thisArg: Any
    ): /* is std.Array<'transform'> */ Boolean = js.native
    
    /**
      * Changes all array elements from `start` to `end` index to a static `value` and returns the modified array
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    /* standard es2015.core */
    @JSName("fill")
    def fill_transform(value: transform): this.type = js.native
    @JSName("fill")
    def fill_transform(value: transform, start: Double): this.type = js.native
    @JSName("fill")
    def fill_transform(value: transform, start: Double, end: Double): this.type = js.native
    @JSName("fill")
    def fill_transform(value: transform, start: Unit, end: Double): this.type = js.native
    
    def filter(predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Boolean]): js.Array[`arrow-end`] = js.native
    def filter(
      predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Boolean],
      thisArg: Any
    ): js.Array[`arrow-end`] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("filter")
    def filter_transform(
      predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Any | Boolean]
    ): js.Array[transform] = js.native
    @JSName("filter")
    def filter_transform(
      predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Any | Boolean],
      thisArg: Any
    ): js.Array[transform] = js.native
    
    def find(
      predicate: js.ThisFunction3[/* this */ Unit, transform, /* index */ Double, /* obj */ js.Array[transform], Boolean]
    ): js.UndefOr[`arrow-end`] = js.native
    def find(
      predicate: js.ThisFunction3[/* this */ Unit, transform, /* index */ Double, /* obj */ js.Array[transform], Boolean],
      thisArg: Any
    ): js.UndefOr[`arrow-end`] = js.native
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    @JSName("findIndex")
    def findIndex_transform(predicate: js.Function3[transform, /* index */ Double, /* obj */ js.Array[transform], Any]): Double = js.native
    @JSName("findIndex")
    def findIndex_transform(
      predicate: js.Function3[transform, /* index */ Double, /* obj */ js.Array[transform], Any],
      thisArg: Any
    ): Double = js.native
    
    /* standard es2015.core */
    @JSName("find")
    def find_transform(predicate: js.Function3[transform, /* index */ Double, /* obj */ js.Array[transform], Any]): js.UndefOr[transform] = js.native
    @JSName("find")
    def find_transform(
      predicate: js.Function3[transform, /* index */ Double, /* obj */ js.Array[transform], Any],
      thisArg: Any
    ): js.UndefOr[transform] = js.native
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    @JSName("find")
    def find_transform(
      predicate: js.ThisFunction3[/* this */ Unit, transform, /* index */ Double, /* obj */ js.Array[transform], Boolean]
    ): js.UndefOr[transform] = js.native
    @JSName("find")
    def find_transform(
      predicate: js.ThisFunction3[/* this */ Unit, transform, /* index */ Double, /* obj */ js.Array[transform], Boolean],
      thisArg: Any
    ): js.UndefOr[transform] = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    /* standard es2019.array */
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
    /**
      * Calls a defined callback function on each element of an array. Then, flattens the result into
      * a new array.
      * This is identical to a map followed by flat with depth 1.
      *
      * @param callback A function that accepts up to three arguments. The flatMap method calls the
      * callback function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callback function. If
      * thisArg is omitted, undefined is used as the this value.
      */
    /* standard es2019.array */
    @JSName("flatMap")
    def flatMap_transform[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          transform, 
          /* index */ Double, 
          /* array */ js.Array[transform], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSName("flatMap")
    def flatMap_transform[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          transform, 
          /* index */ Double, 
          /* array */ js.Array[transform], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = js.native
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("forEach")
    def forEach_transform(callbackfn: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Unit]): Unit = js.native
    @JSName("forEach")
    def forEach_transform(
      callbackfn: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    /* standard es2016.array.include */
    @JSName("includes")
    def includes_transform(searchElement: transform): Boolean = js.native
    @JSName("includes")
    def includes_transform(searchElement: transform, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    /* standard es5 */
    @JSName("indexOf")
    def indexOf_transform(searchElement: transform): Double = js.native
    @JSName("indexOf")
    def indexOf_transform(searchElement: transform, fromIndex: Double): Double = js.native
    
    /** Iterator */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[transform]] = js.native
    
    /**
      * Adds all the elements of an array into a string, separated by the specified separator string.
      * @param separator A string used to separate one element of the array from the next in the resulting string. If omitted, the array elements are separated with a comma.
      */
    /* standard es5 */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    /* standard es2015.iterable */
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin searching backward. If fromIndex is omitted, the search starts at the last index in the array.
      */
    /* standard es5 */
    @JSName("lastIndexOf")
    def lastIndexOf_transform(searchElement: transform): Double = js.native
    @JSName("lastIndexOf")
    def lastIndexOf_transform(searchElement: transform, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest index in the array.
      */
    /* standard es5 */
    var length: Double = js.native
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("map")
    def map_transform[U](callbackfn: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], U]): js.Array[U] = js.native
    @JSName("map")
    def map_transform[U](
      callbackfn: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], U],
      thisArg: Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def pop(): js.UndefOr[transform] = js.native
    
    /**
      * Appends new elements to the end of an array, and returns the new length of the array.
      * @param items New elements to add to the array.
      */
    /* standard es5 */
    @JSName("push")
    def push_transform(items: transform*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    @JSName("reduceRight")
    def reduceRight_transform(
      callbackfn: js.Function4[
          transform, 
          transform, 
          /* currentIndex */ Double, 
          /* array */ js.Array[transform], 
          transform
        ]
    ): transform = js.native
    /* standard es5 */
    @JSName("reduceRight")
    def reduceRight_transform(
      callbackfn: js.Function4[
          transform, 
          transform, 
          /* currentIndex */ Double, 
          /* array */ js.Array[transform], 
          transform
        ],
      initialValue: transform
    ): transform = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    @JSName("reduceRight")
    def reduceRight_transform[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          transform, 
          /* currentIndex */ Double, 
          /* array */ js.Array[transform], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    @JSName("reduce")
    def reduce_transform(
      callbackfn: js.Function4[
          transform, 
          transform, 
          /* currentIndex */ Double, 
          /* array */ js.Array[transform], 
          transform
        ]
    ): transform = js.native
    /* standard es5 */
    @JSName("reduce")
    def reduce_transform(
      callbackfn: js.Function4[
          transform, 
          transform, 
          /* currentIndex */ Double, 
          /* array */ js.Array[transform], 
          transform
        ],
      initialValue: transform
    ): transform = js.native
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    @JSName("reduce")
    def reduce_transform[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          transform, 
          /* currentIndex */ Double, 
          /* array */ js.Array[transform], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an array in place.
      * This method mutates the array and returns a reference to the same array.
      */
    /* standard es5 */
    def reverse(): js.Array[transform] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def shift(): js.UndefOr[transform] = js.native
    
    /**
      * Returns a copy of a section of an array.
      * For both start and end, a negative index can be used to indicate an offset from the end of the array.
      * For example, -2 refers to the second to last element of the array.
      * @param start The beginning index of the specified portion of the array.
      * If start is undefined, then the slice begins at index 0.
      * @param end The end index of the specified portion of the array. This is exclusive of the element at the index 'end'.
      * If end is undefined, then the slice extends to the end of the array.
      */
    /* standard es5 */
    def slice(): js.Array[transform] = js.native
    def slice(start: Double): js.Array[transform] = js.native
    def slice(start: Double, end: Double): js.Array[transform] = js.native
    def slice(start: Unit, end: Double): js.Array[transform] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("some")
    def some_transform(predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Any]): Boolean = js.native
    @JSName("some")
    def some_transform(
      predicate: js.Function3[transform, /* index */ Double, /* array */ js.Array[transform], Any],
      thisArg: Any
    ): Boolean = js.native
    
    /**
      * Sorts an array in place.
      * This method mutates the array and returns a reference to the same array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if the first argument is less than the second argument, zero if they're equal, and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    /* standard es5 */
    def sort(): this.type = js.native
    @JSName("sort")
    def sort_transform(compareFn: js.Function2[transform, transform, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double): js.Array[transform] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[transform] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    @JSName("splice")
    def splice_transform(start: Double, deleteCount: Double, items: transform*): js.Array[transform] = js.native
    
    /**
      * Returns an object whose properties have the value 'true'
      * when they will be absent when used in a 'with' statement.
      */
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.unscopables)
    var unscopables: js.Function0[CopyWithin] = js.native
    
    /**
      * Inserts new elements at the start of an array, and returns the new length of the array.
      * @param items Elements to insert at the start of the array.
      */
    /* standard es5 */
    @JSName("unshift")
    def unshift_transform(items: transform*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[transform] = js.native
  }
  
  trait Error extends StObject {
    
    /**
      * If present and set to `1`, indicates that the operation that produced this result failed. Other fields
      * properties in this object may not be valid.
      */
    var error: js.UndefOr[Double] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  /* Inlined std.Partial<raphael.raphael.RaphaelAttributes> */
  trait PartialRaphaelAttributes extends StObject {
    
    var `arrow-end`: js.UndefOr[String] = js.undefined
    
    var `clip-rect`: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var cx: js.UndefOr[Double] = js.undefined
    
    var cy: js.UndefOr[Double] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var `fill-opacity`: js.UndefOr[Double] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var `font-family`: js.UndefOr[String] = js.undefined
    
    var `font-size`: js.UndefOr[Double | String] = js.undefined
    
    var `font-weight`: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var r: js.UndefOr[Double] = js.undefined
    
    var rx: js.UndefOr[Double] = js.undefined
    
    var ry: js.UndefOr[Double] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var `stroke-dasharray`: js.UndefOr[RaphaelDashArrayType] = js.undefined
    
    var `stroke-linecap`: js.UndefOr[RaphaelLineCapType] = js.undefined
    
    var `stroke-linejoin`: js.UndefOr[RaphaelLineJoinType] = js.undefined
    
    var `stroke-miterlimit`: js.UndefOr[Double] = js.undefined
    
    var `stroke-opacity`: js.UndefOr[Double] = js.undefined
    
    var `stroke-width`: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var `text-anchor`: js.UndefOr[RaphaelTextAnchorType] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PartialRaphaelAttributes {
    
    inline def apply(): PartialRaphaelAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRaphaelAttributes]
    }
    
    extension [Self <: PartialRaphaelAttributes](x: Self) {
      
      inline def `setArrow-end`(value: String): Self = StObject.set(x, "arrow-end", value.asInstanceOf[js.Any])
      
      inline def `setArrow-endUndefined`: Self = StObject.set(x, "arrow-end", js.undefined)
      
      inline def `setClip-rect`(value: String): Self = StObject.set(x, "clip-rect", value.asInstanceOf[js.Any])
      
      inline def `setClip-rectUndefined`: Self = StObject.set(x, "clip-rect", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def `setFill-opacity`(value: Double): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
      
      inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
      
      inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
      
      inline def `setFont-size`(value: Double | String): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
      
      inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
      
      inline def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
      
      inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def `setStroke-dasharray`(value: RaphaelDashArrayType): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
      
      inline def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
      
      inline def `setStroke-linecap`(value: RaphaelLineCapType): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
      
      inline def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
      
      inline def `setStroke-linejoin`(value: RaphaelLineJoinType): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
      
      inline def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
      
      inline def `setStroke-miterlimit`(value: Double): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
      
      inline def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
      
      inline def `setStroke-opacity`(value: Double): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
      
      inline def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
      
      inline def `setStroke-width`(value: Double): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
      
      inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def `setText-anchor`(value: RaphaelTextAnchorType): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
      
      inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransform(value: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransformVarargs(value: RaphaelTransformSegment*): Self = StObject.set(x, "transform", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined std.Partial<raphael.raphael.RaphaelFontFace> */
  trait PartialRaphaelFontFace extends StObject {
    
    var ascent: js.UndefOr[Double | String] = js.undefined
    
    var bbox: js.UndefOr[String] = js.undefined
    
    var descent: js.UndefOr[Double | String] = js.undefined
    
    var `font-family`: js.UndefOr[String] = js.undefined
    
    var `font-stretch`: js.UndefOr[String] = js.undefined
    
    var `font-style`: js.UndefOr[String] = js.undefined
    
    var `font-weight`: js.UndefOr[Double | String] = js.undefined
    
    var `panose-1`: js.UndefOr[String] = js.undefined
    
    var `underline-position`: js.UndefOr[Double | String] = js.undefined
    
    var `underline-thickness`: js.UndefOr[Double | String] = js.undefined
    
    var `unicode-range`: js.UndefOr[String] = js.undefined
    
    var `units-per-em`: js.UndefOr[Double | String] = js.undefined
    
    var `x-height`: js.UndefOr[Double | String] = js.undefined
  }
  object PartialRaphaelFontFace {
    
    inline def apply(): PartialRaphaelFontFace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRaphaelFontFace]
    }
    
    extension [Self <: PartialRaphaelFontFace](x: Self) {
      
      inline def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
      
      inline def setBbox(value: String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
      
      inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
      
      inline def `setFont-stretch`(value: String): Self = StObject.set(x, "font-stretch", value.asInstanceOf[js.Any])
      
      inline def `setFont-stretchUndefined`: Self = StObject.set(x, "font-stretch", js.undefined)
      
      inline def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
      
      inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
      
      inline def `setFont-weight`(value: Double | String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
      
      inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
      
      inline def `setPanose-1`(value: String): Self = StObject.set(x, "panose-1", value.asInstanceOf[js.Any])
      
      inline def `setPanose-1Undefined`: Self = StObject.set(x, "panose-1", js.undefined)
      
      inline def `setUnderline-position`(value: Double | String): Self = StObject.set(x, "underline-position", value.asInstanceOf[js.Any])
      
      inline def `setUnderline-positionUndefined`: Self = StObject.set(x, "underline-position", js.undefined)
      
      inline def `setUnderline-thickness`(value: Double | String): Self = StObject.set(x, "underline-thickness", value.asInstanceOf[js.Any])
      
      inline def `setUnderline-thicknessUndefined`: Self = StObject.set(x, "underline-thickness", js.undefined)
      
      inline def `setUnicode-range`(value: String): Self = StObject.set(x, "unicode-range", value.asInstanceOf[js.Any])
      
      inline def `setUnicode-rangeUndefined`: Self = StObject.set(x, "unicode-range", js.undefined)
      
      inline def `setUnits-per-em`(value: Double | String): Self = StObject.set(x, "units-per-em", value.asInstanceOf[js.Any])
      
      inline def `setUnits-per-emUndefined`: Self = StObject.set(x, "units-per-em", js.undefined)
      
      inline def `setX-height`(value: Double | String): Self = StObject.set(x, "x-height", value.asInstanceOf[js.Any])
      
      inline def `setX-heightUndefined`: Self = StObject.set(x, "x-height", js.undefined)
    }
  }
  
  /* Inlined std.Partial<raphael.raphael.RaphaelFontGlyph> */
  trait PartialRaphaelFontGlyph extends StObject {
    
    var d: js.UndefOr[String] = js.undefined
    
    var w: js.UndefOr[Double] = js.undefined
  }
  object PartialRaphaelFontGlyph {
    
    inline def apply(): PartialRaphaelFontGlyph = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRaphaelFontGlyph]
    }
    
    extension [Self <: PartialRaphaelFontGlyph](x: Self) {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    }
  }
  
  /* Inlined std.Partial<raphael.raphael.RaphaelGlowSettings> */
  trait PartialRaphaelGlowSetting extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var offsetx: js.UndefOr[Double] = js.undefined
    
    var offsety: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PartialRaphaelGlowSetting {
    
    inline def apply(): PartialRaphaelGlowSetting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRaphaelGlowSetting]
    }
    
    extension [Self <: PartialRaphaelGlowSetting](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOffsetx(value: Double): Self = StObject.set(x, "offsetx", value.asInstanceOf[js.Any])
      
      inline def setOffsetxUndefined: Self = StObject.set(x, "offsetx", js.undefined)
      
      inline def setOffsety(value: Double): Self = StObject.set(x, "offsety", value.asInstanceOf[js.Any])
      
      inline def setOffsetyUndefined: Self = StObject.set(x, "offsety", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined raphael.raphael.RaphaelPotentialFailure<raphael.raphael.RaphaelFullComponentInfo> */
  trait RaphaelPotentialFailureRa extends StObject {
    
    /** The RGB blue channel */
    /**
      * The HSB brightness channel.
      */
    var b: Double
    
    /**
      * If present and set to `1`, indicates that the operation that produced this result failed. Other fields
      * properties in this object may not be valid.
      */
    var error: js.UndefOr[Double] = js.undefined
    
    /** The RGB green channel */
    var g: Double
    
    /**
      * The HSB or HSL hue channel.
      */
    var h: Double
    
    /** Hex string of the color, in the format `#XXXXXX`. */
    var hex: String
    
    /**
      * The HSL luminosity channel.
      */
    var l: Double
    
    /** The RGB red channel */
    var r: Double
    
    /**
      * The HSB or HSL saturation channel.
      */
    var s: Double
  }
  object RaphaelPotentialFailureRa {
    
    inline def apply(b: Double, g: Double, h: Double, hex: String, l: Double, r: Double, s: Double): RaphaelPotentialFailureRa = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[RaphaelPotentialFailureRa]
    }
    
    extension [Self <: RaphaelPotentialFailureRa](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined raphael.raphael.RaphaelPotentialFailure<raphael.raphael.RaphaelRgbComponentInfo> */
  trait RaphaelPotentialFailureRaB extends StObject {
    
    /** The RGB blue channel */
    var b: Double
    
    /**
      * If present and set to `1`, indicates that the operation that produced this result failed. Other fields
      * properties in this object may not be valid.
      */
    var error: js.UndefOr[Double] = js.undefined
    
    /** The RGB green channel */
    var g: Double
    
    /** Hex string of the color, in the format `#XXXXXX`. */
    var hex: String
    
    /** The RGB red channel */
    var r: Double
  }
  object RaphaelPotentialFailureRaB {
    
    inline def apply(b: Double, g: Double, hex: String, r: Double): RaphaelPotentialFailureRaB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RaphaelPotentialFailureRaB]
    }
    
    extension [Self <: RaphaelPotentialFailureRaB](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
