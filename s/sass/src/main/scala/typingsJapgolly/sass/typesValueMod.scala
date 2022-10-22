package typingsJapgolly.sass

import typingsJapgolly.immutable.mod.OrderedMap
import typingsJapgolly.immutable.mod.ValueObject
import typingsJapgolly.sass.anon.Alpha
import typingsJapgolly.sass.anon.Blackness
import typingsJapgolly.sass.anon.Brackets
import typingsJapgolly.sass.anon.DenominatorUnits
import typingsJapgolly.sass.anon.Hue
import typingsJapgolly.sass.anon.Quotes
import typingsJapgolly.sass.typesValueListMod.ListSeparator
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValueMod {
  
  @JSImport("sass/types/value", "SassArgumentList")
  @js.native
  open class SassArgumentList protected ()
    extends typingsJapgolly.sass.typesValueArgumentListMod.SassArgumentList {
    def this(contents: js.Array[Value], keywords: OrderedMap[String, Value]) = this()
    /**
      * Creates a new argument list.
      *
      * @param contents - The positional arguments that make up the primary
      * contents of the list. This may be either a plain JavaScript array or an
      * immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      *
      * @param keywords - The keyword arguments attached to this argument list,
      * whose names should exclude `$`. This can be either a plain JavaScript
      * object with argument names as fields, or an immutable [[OrderedMap]] from
      * the [`immutable` package](https://immutable-js.com/)
      *
      * @param separator - The separator for this list. Defaults to `','`.
      */
    def this(contents: js.Array[Value], keywords: Record[String, Value]) = this()
    def this(contents: typingsJapgolly.immutable.mod.List[Value], keywords: OrderedMap[String, Value]) = this()
    def this(contents: typingsJapgolly.immutable.mod.List[Value], keywords: Record[String, Value]) = this()
    def this(contents: js.Array[Value], keywords: OrderedMap[String, Value], separator: ListSeparator) = this()
    def this(contents: js.Array[Value], keywords: Record[String, Value], separator: ListSeparator) = this()
    def this(
      contents: typingsJapgolly.immutable.mod.List[Value],
      keywords: OrderedMap[String, Value],
      separator: ListSeparator
    ) = this()
    def this(
      contents: typingsJapgolly.immutable.mod.List[Value],
      keywords: Record[String, Value],
      separator: ListSeparator
    ) = this()
  }
  
  @JSImport("sass/types/value", "SassBoolean")
  @js.native
  /* private */ open class SassBoolean ()
    extends typingsJapgolly.sass.typesValueBooleanMod.SassBoolean
  
  @JSImport("sass/types/value", "SassColor")
  @js.native
  open class SassColor protected ()
    extends typingsJapgolly.sass.typesValueColorMod.SassColor {
    /**
      * Creates an RGB color.
      *
      * @throws `Error` if `red`, `green`, and `blue` aren't between `0` and
      * `255`, or if `alpha` isn't between `0` and `1`.
      */
    def this(options: Alpha) = this()
    /**
      * Creates an HWB color.
      *
      * @throws `Error` if `whiteness` or `blackness` aren't between `0` and `100`,
      * or if `alpha` isn't between `0` and `1`.
      */
    def this(options: Blackness) = this()
    /**
      * Creates an HSL color.
      *
      * @throws `Error` if `saturation` or `lightness` aren't between `0` and
      * `100`, or if `alpha` isn't between `0` and `1`.
      */
    def this(options: Hue) = this()
  }
  
  @JSImport("sass/types/value", "SassFunction")
  @js.native
  open class SassFunction protected ()
    extends typingsJapgolly.sass.typesValueFunctionMod.SassFunction {
    /**
      * Creates a new first-class function that can be invoked using
      * [`meta.call()`](https://sass-lang.com/documentation/modules/meta#call).
      *
      * @param signature - The function signature, like you'd write for the
      * [`@function rule`](https://sass-lang.com/documentation/at-rules/function).
      * @param callback - The callback that's invoked when this function is called,
      * just like for a [[CustomFunction]].
      */
    def this(signature: String, callback: js.Function1[/* args */ js.Array[Value], Value]) = this()
  }
  
  @JSImport("sass/types/value", "SassList")
  @js.native
  /**
    * Creates an empty list.
    *
    * @param options.separator - The separator to use between elements of this
    * list. Defaults to `','`.
    *
    * @param options.brackets - Whether the list has square brackets. Defaults to
    * `false`.
    */
  open class SassList ()
    extends typingsJapgolly.sass.typesValueListMod.SassList {
    /**
      * Creates a new list.
      *
      * @param contents - The contents of the list. This may be either a plain
      * JavaScript array or an immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      *
      * @param options.separator - The separator to use between elements of this
      * list. Defaults to `','`.
      *
      * @param options.brackets - Whether the list has square brackets. Defaults to
      * `false`.
      */
    def this(contents: js.Array[Value]) = this()
    def this(contents: typingsJapgolly.immutable.mod.List[Value]) = this()
    def this(options: Brackets) = this()
    def this(contents: js.Array[Value], options: Brackets) = this()
    def this(contents: typingsJapgolly.immutable.mod.List[Value], options: Brackets) = this()
  }
  
  @JSImport("sass/types/value", "SassMap")
  @js.native
  /**
    * Creates a new map.
    *
    * @param contents - The contents of the map. This is an immutable
    * [[OrderedMap]] from the [`immutable` package](https://immutable-js.com/).
    * Defaults to an empty map.
    */
  open class SassMap ()
    extends typingsJapgolly.sass.typesValueMapMod.SassMap {
    def this(contents: OrderedMap[Value, Value]) = this()
  }
  
  @JSImport("sass/types/value", "SassNumber")
  @js.native
  open class SassNumber protected ()
    extends typingsJapgolly.sass.typesValueNumberMod.SassNumber {
    /**
      * Creates a new number with more complex units than just a single numerator.
      *
      * Upon construction, any compatible numerator and denominator units are
      * simplified away according to the conversion factor between them.
      *
      * @param value - The number's numeric value.
      *
      * @param unit - If this is a string, it's used as the single numerator unit
      * for the number.
      *
      * @param unit.numeratorUnits - If passed, these are the numerator units to
      * use for the number. This may be either a plain JavaScript array or an
      * immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      *
      * @param unit.denominatorUnits - If passed, these are the denominator units
      * to use for the number. This may be either a plain JavaScript array or an
      * immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      */
    def this(value: Double) = this()
    def this(value: Double, unit: String) = this()
    def this(value: Double, unit: DenominatorUnits) = this()
  }
  
  @JSImport("sass/types/value", "SassString")
  @js.native
  /**
    * Creates an empty string.
    *
    * @param options.quotes - Whether the string is quoted. Defaults to `true`.
    */
  open class SassString ()
    extends typingsJapgolly.sass.typesValueStringMod.SassString {
    def this(options: Quotes) = this()
    /**
      * Creates a new string.
      *
      * @param text - The contents of the string. For quoted strings, this is the
      * semantic content—any escape sequences that were been written in the source
      * text are resolved to their Unicode values. For unquoted strings, though,
      * escape sequences are preserved as literal backslashes.
      *
      * @param options.quotes - Whether the string is quoted. Defaults to `true`.
      */
    def this(text: String) = this()
    def this(text: String, options: Quotes) = this()
  }
  
  /* note: abstract class */ @JSImport("sass/types/value", "Value")
  @js.native
  /* protected */ open class Value ()
    extends StObject
       with ValueObject {
    
    /**
      * This value as a list.
      *
      * All SassScript values can be used as lists. Maps count as lists of pairs,
      * and all other values count as single-value lists.
      *
      * @returns An immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      */
    def asList: typingsJapgolly.immutable.mod.List[Value] = js.native
    
    /**
      * Throws if `this` isn't a [[SassBoolean]].
      *
      * **Heads up!** Functions should generally use [[isTruthy]] rather than
      * requiring a literal boolean.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertBoolean(): typingsJapgolly.sass.typesValueBooleanMod.SassBoolean = js.native
    def assertBoolean(name: String): typingsJapgolly.sass.typesValueBooleanMod.SassBoolean = js.native
    
    /**
      * Throws if `this` isn't a [[SassColor]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertColor(): typingsJapgolly.sass.typesValueColorMod.SassColor = js.native
    def assertColor(name: String): typingsJapgolly.sass.typesValueColorMod.SassColor = js.native
    
    /**
      * Throws if `this` isn't a [[SassFunction]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertFunction(): typingsJapgolly.sass.typesValueFunctionMod.SassFunction = js.native
    def assertFunction(name: String): typingsJapgolly.sass.typesValueFunctionMod.SassFunction = js.native
    
    /**
      * Throws if `this` isn't a [[SassMap]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertMap(): typingsJapgolly.sass.typesValueMapMod.SassMap = js.native
    def assertMap(name: String): typingsJapgolly.sass.typesValueMapMod.SassMap = js.native
    
    /**
      * Throws if `this` isn't a [[SassNumber]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertNumber(): typingsJapgolly.sass.typesValueNumberMod.SassNumber = js.native
    def assertNumber(name: String): typingsJapgolly.sass.typesValueNumberMod.SassNumber = js.native
    
    /**
      * Throws if `this` isn't a [[SassString]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertString(): typingsJapgolly.sass.typesValueStringMod.SassString = js.native
    def assertString(name: String): typingsJapgolly.sass.typesValueStringMod.SassString = js.native
    
    /** Returns whether `this` represents the same value as `other`. */
    def equals(other: Value): Boolean = js.native
    
    /**
      * Returns the value at index `index` in this value as a list, or `undefined`
      * if `index` isn't valid for this list.
      *
      * All SassScript values can be used as lists. Maps count as lists of pairs,
      * and all other values count as single-value lists.
      *
      * This is a shorthand for `this.asList.get(index)`, although it may be more
      * efficient in some cases.
      *
      * **Heads up!** This method uses the same indexing conventions as the
      * `immutable` package: unlike Sass the index of the first element is 0, but
      * like Sass negative numbers index from the end of the list.
      */
    def get(index: Double): js.UndefOr[Value] = js.native
    
    /**
      * Whether this value as a list has brackets.
      *
      * All SassScript values can be used as lists. Maps count as lists of pairs,
      * and all other values count as single-value lists.
      */
    def hasBrackets: Boolean = js.native
    
    /**
      * Whether the value counts as `true` in an `@if` statement and other
      * contexts.
      */
    def isTruthy: Boolean = js.native
    
    /**
      * Returns JavaScript's `null` value if this is [[sassNull]], and returns
      * `this` otherwise.
      */
    def realNull: Null | Value = js.native
    
    /**
      * Converts `sassIndex` into a JavaScript-style index into the list returned
      * by [[asList]].
      *
      * Sass indexes are one-based, while JavaScript indexes are zero-based. Sass
      * indexes may also be negative in order to index from the end of the list.
      *
      * @param sassIndex - The Sass-style index into this as a list.
      * @param name - The name of the function argument `sassIndex` came from
      * (without the `$`) if it came from an argument. Used for error reporting.
      * @throws `Error` If `sassIndex` isn't a number, if that number isn't an
      * integer, or if that integer isn't a valid index for [[asList]].
      */
    def sassIndexToListIndex(sassIndex: Value): Double = js.native
    def sassIndexToListIndex(sassIndex: Value, name: String): Double = js.native
    
    /**
      * The separator for this value as a list.
      *
      * All SassScript values can be used as lists. Maps count as lists of pairs,
      * and all other values count as single-value lists.
      */
    def separator: ListSeparator = js.native
    
    /**
      * Returns `this` as a map if it counts as one (empty lists count as empty
      * maps) or `null` if it doesn't.
      */
    def tryMap(): typingsJapgolly.sass.typesValueMapMod.SassMap | Null = js.native
  }
  
  @JSImport("sass/types/value", "sassFalse")
  @js.native
  val sassFalse: typingsJapgolly.sass.typesValueBooleanMod.SassBoolean = js.native
  
  @JSImport("sass/types/value", "sassNull")
  @js.native
  val sassNull: Value = js.native
  
  @JSImport("sass/types/value", "sassTrue")
  @js.native
  val sassTrue: typingsJapgolly.sass.typesValueBooleanMod.SassBoolean = js.native
}
