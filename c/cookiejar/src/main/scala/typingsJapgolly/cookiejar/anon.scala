package typingsJapgolly.cookiejar

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.cookiejar.mod.Cookie
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.ReadonlyArray<cookiejar.cookiejar.Cookie> & {toValueString (): string} */
  @js.native
  trait ReadonlyArrayCookietoValu
    extends StObject
       with /* standard es5 */
  /* n */ NumberDictionary[Cookie] {
    
    /**
      * Returns the item located at the specified index.
      * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
      */
    /* standard es2022.array */
    def at(index: Double): js.UndefOr[Cookie] = js.native
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    /* standard es5 */
    def concat(items: (js.Array[Cookie] | Cookie)*): js.Array[Cookie] = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    /* standard es2015.iterable */
    def entries(): IterableIterator[js.Tuple2[Double, Cookie]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def every(predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], Any]): Boolean = js.native
    def every(
      predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], Any],
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
    def every_S[S /* <: Cookie */](
      predicate: js.Function3[
          /* value */ Cookie, 
          /* index */ Double, 
          /* array */ js.Array[Cookie], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    def every_S[S /* <: Cookie */](
      predicate: js.Function3[
          /* value */ Cookie, 
          /* index */ Double, 
          /* array */ js.Array[Cookie], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def filter(predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], Any]): js.Array[Cookie] = js.native
    def filter(
      predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], Any],
      thisArg: Any
    ): js.Array[Cookie] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("filter")
    def filter_S[S /* <: Cookie */](
      predicate: js.Function3[
          /* value */ Cookie, 
          /* index */ Double, 
          /* array */ js.Array[Cookie], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSName("filter")
    def filter_S[S /* <: Cookie */](
      predicate: js.Function3[
          /* value */ Cookie, 
          /* index */ Double, 
          /* array */ js.Array[Cookie], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.Array[S] = js.native
    
    /* standard es2015.core */
    def find(predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* obj */ js.Array[Cookie], Any]): js.UndefOr[Cookie] = js.native
    def find(
      predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* obj */ js.Array[Cookie], Any],
      thisArg: Any
    ): js.UndefOr[Cookie] = js.native
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
    def find[S /* <: Cookie */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Cookie, 
          /* index */ Double, 
          /* obj */ js.Array[Cookie], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    def find[S /* <: Cookie */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Cookie, 
          /* index */ Double, 
          /* obj */ js.Array[Cookie], 
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
    def findIndex(predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* obj */ js.Array[Cookie], Any]): Double = js.native
    def findIndex(
      predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* obj */ js.Array[Cookie], Any],
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
          /* value */ Cookie, 
          /* index */ Double, 
          /* array */ js.Array[Cookie], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Cookie, 
          /* index */ Double, 
          /* array */ js.Array[Cookie], 
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
      callbackfn: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    /* standard es2016.array.include */
    def includes(searchElement: Cookie): Boolean = js.native
    def includes(searchElement: Cookie, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    /* standard es5 */
    def indexOf(searchElement: Cookie): Double = js.native
    def indexOf(searchElement: Cookie, fromIndex: Double): Double = js.native
    
    /** Iterator of values in the array. */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[Cookie]] = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
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
      * Returns the index of the last occurrence of a specified value in an array.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
      */
    /* standard es5 */
    def lastIndexOf(searchElement: Cookie): Double = js.native
    def lastIndexOf(searchElement: Cookie, fromIndex: Double): Double = js.native
    
    /**
      * Gets the length of the array. This is a number one higher than the highest element defined in an array.
      */
    /* standard es5 */
    val length: Double = js.native
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def map[U](callbackfn: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], U]): js.Array[U] = js.native
    def map[U](
      callbackfn: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], U],
      thisArg: Any
    ): js.Array[U] = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Cookie, 
          /* currentValue */ Cookie, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Cookie], 
          Cookie
        ]
    ): Cookie = js.native
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Cookie, 
          /* currentValue */ Cookie, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Cookie], 
          Cookie
        ],
      initialValue: Cookie
    ): Cookie = js.native
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Cookie, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Cookie], 
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
          /* previousValue */ Cookie, 
          /* currentValue */ Cookie, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Cookie], 
          Cookie
        ]
    ): Cookie = js.native
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Cookie, 
          /* currentValue */ Cookie, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Cookie], 
          Cookie
        ],
      initialValue: Cookie
    ): Cookie = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Cookie, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Cookie], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Returns a section of an array.
      * @param start The beginning of the specified portion of the array.
      * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
      */
    /* standard es5 */
    def slice(): js.Array[Cookie] = js.native
    def slice(start: Double): js.Array[Cookie] = js.native
    def slice(start: Double, end: Double): js.Array[Cookie] = js.native
    def slice(start: Unit, end: Double): js.Array[Cookie] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def some(predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], Any]): Boolean = js.native
    def some(
      predicate: js.Function3[/* value */ Cookie, /* index */ Double, /* array */ js.Array[Cookie], Any],
      thisArg: Any
    ): Boolean = js.native
    
    def toValueString(): String = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[Cookie] = js.native
  }
}
