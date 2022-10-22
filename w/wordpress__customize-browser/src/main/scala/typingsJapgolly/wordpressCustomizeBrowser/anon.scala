package typingsJapgolly.wordpressCustomizeBrowser

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.anon.CopyWithin
import typingsJapgolly.wordpressCustomizeBrowser.previewerMod.Previewer
import typingsJapgolly.wordpressCustomizeBrowser.settingMod.Setting
import typingsJapgolly.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Array<@wordpress/customize-browser.@wordpress/customize-browser/Setting.Setting<any> | @wordpress/customize-browser.@wordpress/customize-browser/Value.Value<any>> & {  default :string | @wordpress/customize-browser.@wordpress/customize-browser/Setting.Setting<any> | undefined} */
  @js.native
  trait ArraySettinganyValueanyde
    extends StObject
       with /* standard es5 */
  /* n */ NumberDictionary[Setting[Any] | Value[Any]] {
    
    var default: js.UndefOr[String | Setting[Any]] = js.native
    
    /**
      * Returns the item located at the specified index.
      * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
      */
    /* standard es2022.array */
    def at(index: Double): js.UndefOr[Setting[Any] | Value[Any]] = js.native
    
    /**
      * Combines two or more arrays.
      * This method returns a new array without modifying any existing arrays.
      * @param items Additional arrays and/or items to add to the end of the array.
      */
    /* standard es5 */
    def concat(items: ((js.Array[Setting[Any] | Value[Any]]) | Setting[Any] | Value[Any])*): js.Array[Setting[Any] | Value[Any]] = js.native
    
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
    def entries(): IterableIterator[js.Tuple2[Double, Setting[Any] | Value[Any]]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def every(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ]
    ): Boolean = js.native
    def every(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ],
      thisArg: Any
    ): Boolean = js.native
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
    def every_S[S /* <: Setting[Any] | Value[Any] */](
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    def every_S[S /* <: Setting[Any] | Value[Any] */](
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Changes all array elements from `start` to `end` index to a static `value` and returns the modified array
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    /* standard es2015.core */
    def fill(value: Setting[Any]): this.type = js.native
    def fill(value: Setting[Any], start: Double): this.type = js.native
    def fill(value: Setting[Any], start: Double, end: Double): this.type = js.native
    def fill(value: Setting[Any], start: Unit, end: Double): this.type = js.native
    def fill(value: Value[Any]): this.type = js.native
    def fill(value: Value[Any], start: Double): this.type = js.native
    def fill(value: Value[Any], start: Double, end: Double): this.type = js.native
    def fill(value: Value[Any], start: Unit, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def filter(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ]
    ): js.Array[Setting[Any] | Value[Any]] = js.native
    def filter(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ],
      thisArg: Any
    ): js.Array[Setting[Any] | Value[Any]] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("filter")
    def filter_S[S /* <: Setting[Any] | Value[Any] */](
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSName("filter")
    def filter_S[S /* <: Setting[Any] | Value[Any] */](
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.Array[S] = js.native
    
    /* standard es2015.core */
    def find(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* obj */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ]
    ): js.UndefOr[Setting[Any] | Value[Any]] = js.native
    def find(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* obj */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ],
      thisArg: Any
    ): js.UndefOr[Setting[Any] | Value[Any]] = js.native
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
    def find[S /* <: Setting[Any] | Value[Any] */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* obj */ js.Array[Setting[Any] | Value[Any]], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    def find[S /* <: Setting[Any] | Value[Any] */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* obj */ js.Array[Setting[Any] | Value[Any]], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
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
    def findIndex(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* obj */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ]
    ): Double = js.native
    def findIndex(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* obj */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ],
      thisArg: Any
    ): Double = js.native
    
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
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
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
    def forEach(
      callbackfn: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Unit
        ]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Unit
        ],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    /* standard es2016.array.include */
    def includes(searchElement: Setting[Any]): Boolean = js.native
    def includes(searchElement: Setting[Any], fromIndex: Double): Boolean = js.native
    def includes(searchElement: Value[Any]): Boolean = js.native
    def includes(searchElement: Value[Any], fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    /* standard es5 */
    def indexOf(searchElement: Setting[Any]): Double = js.native
    def indexOf(searchElement: Setting[Any], fromIndex: Double): Double = js.native
    def indexOf(searchElement: Value[Any]): Double = js.native
    def indexOf(searchElement: Value[Any], fromIndex: Double): Double = js.native
    
    /** Iterator */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[Setting[Any] | Value[Any]]] = js.native
    
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
    def lastIndexOf(searchElement: Setting[Any]): Double = js.native
    def lastIndexOf(searchElement: Setting[Any], fromIndex: Double): Double = js.native
    def lastIndexOf(searchElement: Value[Any]): Double = js.native
    def lastIndexOf(searchElement: Value[Any], fromIndex: Double): Double = js.native
    
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
    def map[U](
      callbackfn: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          U
        ]
    ): js.Array[U] = js.native
    def map[U](
      callbackfn: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          U
        ],
      thisArg: Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def pop(): js.UndefOr[Setting[Any] | Value[Any]] = js.native
    
    /**
      * Appends new elements to the end of an array, and returns the new length of the array.
      * @param items New elements to add to the array.
      */
    /* standard es5 */
    def push(items: (Setting[Any] | Value[Any])*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Setting[Any] | Value[Any], 
          /* currentValue */ Setting[Any] | Value[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Setting[Any] | Value[Any]
        ]
    ): Setting[Any] | Value[Any] = js.native
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Setting[Any] | Value[Any], 
          /* currentValue */ Setting[Any] | Value[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Setting[Any] | Value[Any]
        ],
      initialValue: Setting[Any]
    ): Setting[Any] | Value[Any] = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Setting[Any] | Value[Any], 
          /* currentValue */ Setting[Any] | Value[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Setting[Any] | Value[Any]
        ],
      initialValue: Value[Any]
    ): Setting[Any] | Value[Any] = js.native
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Setting[Any] | Value[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Setting[Any] | Value[Any], 
          /* currentValue */ Setting[Any] | Value[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Setting[Any] | Value[Any]
        ]
    ): Setting[Any] | Value[Any] = js.native
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Setting[Any] | Value[Any], 
          /* currentValue */ Setting[Any] | Value[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Setting[Any] | Value[Any]
        ],
      initialValue: Setting[Any]
    ): Setting[Any] | Value[Any] = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Setting[Any] | Value[Any], 
          /* currentValue */ Setting[Any] | Value[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Setting[Any] | Value[Any]
        ],
      initialValue: Value[Any]
    ): Setting[Any] | Value[Any] = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Setting[Any] | Value[Any], 
          /* currentIndex */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an array in place.
      * This method mutates the array and returns a reference to the same array.
      */
    /* standard es5 */
    def reverse(): js.Array[Setting[Any] | Value[Any]] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def shift(): js.UndefOr[Setting[Any] | Value[Any]] = js.native
    
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
    def slice(): js.Array[Setting[Any] | Value[Any]] = js.native
    def slice(start: Double): js.Array[Setting[Any] | Value[Any]] = js.native
    def slice(start: Double, end: Double): js.Array[Setting[Any] | Value[Any]] = js.native
    def slice(start: Unit, end: Double): js.Array[Setting[Any] | Value[Any]] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def some(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ]
    ): Boolean = js.native
    def some(
      predicate: js.Function3[
          /* value */ Setting[Any] | Value[Any], 
          /* index */ Double, 
          /* array */ js.Array[Setting[Any] | Value[Any]], 
          Any
        ],
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
    def sort(
      compareFn: js.Function2[/* a */ Setting[Any] | Value[Any], /* b */ Setting[Any] | Value[Any], Double]
    ): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double): js.Array[Setting[Any] | Value[Any]] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[Setting[Any] | Value[Any]] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double, deleteCount: Double, items: (Setting[Any] | Value[Any])*): js.Array[Setting[Any] | Value[Any]] = js.native
    
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
    def unshift(items: (Setting[Any] | Value[Any])*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[Setting[Any] | Value[Any]] = js.native
  }
  
  trait Choice extends StObject {
    
    var choice: Any
    
    var header: Any
  }
  object Choice {
    
    inline def apply(choice: Any, header: Any): Choice = {
      val __obj = js.Dynamic.literal(choice = choice.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice]
    }
    
    extension [Self <: Choice](x: Self) {
      
      inline def setChoice(value: Any): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait Default extends StObject {
    
    var default: js.UndefOr[String | Setting[Any]] = js.undefined
  }
  object Default {
    
    inline def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: String | Setting[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@wordpress/customize-browser.@wordpress/customize-browser/Setting.Setting_Options> */
  trait PartialSettingOptions extends StObject {
    
    var dirty: js.UndefOr[Boolean] = js.undefined
    
    var previewer: js.UndefOr[Previewer[String]] = js.undefined
    
    var transport: js.UndefOr[String] = js.undefined
  }
  object PartialSettingOptions {
    
    inline def apply(): PartialSettingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSettingOptions]
    }
    
    extension [Self <: PartialSettingOptions](x: Self) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      inline def setPreviewer(value: Previewer[String]): Self = StObject.set(x, "previewer", value.asInstanceOf[js.Any])
      
      inline def setPreviewerUndefined: Self = StObject.set(x, "previewer", js.undefined)
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
