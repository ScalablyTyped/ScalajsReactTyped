package typingsJapgolly.sass

import typingsJapgolly.immutable.mod.OrderedMap
import typingsJapgolly.sass.anon.Alpha
import typingsJapgolly.sass.anon.Blackness
import typingsJapgolly.sass.anon.Brackets
import typingsJapgolly.sass.anon.DenominatorUnits
import typingsJapgolly.sass.anon.Hue
import typingsJapgolly.sass.anon.Quotes
import typingsJapgolly.sass.sassBooleans.`false`
import typingsJapgolly.sass.sassBooleans.`true`
import typingsJapgolly.sass.sassStrings.async
import typingsJapgolly.sass.sassStrings.sync
import typingsJapgolly.sass.typesCompileMod.CompileResult
import typingsJapgolly.sass.typesLegacyExceptionMod.LegacyException
import typingsJapgolly.sass.typesLegacyFunctionMod.types.Boolean
import typingsJapgolly.sass.typesLegacyFunctionMod.types.Null
import typingsJapgolly.sass.typesLegacyOptionsMod.LegacyOptions
import typingsJapgolly.sass.typesLegacyRenderMod.LegacyResult
import typingsJapgolly.sass.typesOptionsMod.Options
import typingsJapgolly.sass.typesOptionsMod.StringOptions
import typingsJapgolly.sass.typesValueListMod.ListSeparator
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sass", "Exception")
  @js.native
  /* private */ open class Exception ()
    extends typingsJapgolly.sass.typesExceptionMod.Exception
  
  @JSImport("sass", "FALSE")
  @js.native
  val FALSE: Boolean[`false`] = js.native
  
  object Logger {
    
    @JSImport("sass", "Logger.silent")
    @js.native
    val silent: typingsJapgolly.sass.typesLoggerMod.Logger = js.native
  }
  
  @JSImport("sass", "NULL")
  @js.native
  val NULL: Null = js.native
  
  @JSImport("sass", "SassArgumentList")
  @js.native
  open class SassArgumentList protected ()
    extends typingsJapgolly.sass.typesValueMod.SassArgumentList {
    def this(
      contents: js.Array[typingsJapgolly.sass.typesValueMod.Value],
      keywords: OrderedMap[String, typingsJapgolly.sass.typesValueMod.Value]
    ) = this()
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
    def this(
      contents: js.Array[typingsJapgolly.sass.typesValueMod.Value],
      keywords: Record[String, typingsJapgolly.sass.typesValueMod.Value]
    ) = this()
    def this(
      contents: typingsJapgolly.immutable.mod.List[typingsJapgolly.sass.typesValueMod.Value],
      keywords: OrderedMap[String, typingsJapgolly.sass.typesValueMod.Value]
    ) = this()
    def this(
      contents: typingsJapgolly.immutable.mod.List[typingsJapgolly.sass.typesValueMod.Value],
      keywords: Record[String, typingsJapgolly.sass.typesValueMod.Value]
    ) = this()
    def this(
      contents: js.Array[typingsJapgolly.sass.typesValueMod.Value],
      keywords: OrderedMap[String, typingsJapgolly.sass.typesValueMod.Value],
      separator: ListSeparator
    ) = this()
    def this(
      contents: js.Array[typingsJapgolly.sass.typesValueMod.Value],
      keywords: Record[String, typingsJapgolly.sass.typesValueMod.Value],
      separator: ListSeparator
    ) = this()
    def this(
      contents: typingsJapgolly.immutable.mod.List[typingsJapgolly.sass.typesValueMod.Value],
      keywords: OrderedMap[String, typingsJapgolly.sass.typesValueMod.Value],
      separator: ListSeparator
    ) = this()
    def this(
      contents: typingsJapgolly.immutable.mod.List[typingsJapgolly.sass.typesValueMod.Value],
      keywords: Record[String, typingsJapgolly.sass.typesValueMod.Value],
      separator: ListSeparator
    ) = this()
  }
  
  @JSImport("sass", "SassBoolean")
  @js.native
  /* private */ open class SassBoolean ()
    extends typingsJapgolly.sass.typesValueBooleanMod.SassBoolean
  
  @JSImport("sass", "SassColor")
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
  
  @JSImport("sass", "SassFunction")
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
    def this(
      signature: String,
      callback: js.Function1[
            /* args */ js.Array[typingsJapgolly.sass.typesValueMod.Value], 
            typingsJapgolly.sass.typesValueMod.Value
          ]
    ) = this()
  }
  
  @JSImport("sass", "SassList")
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
    extends typingsJapgolly.sass.typesValueMod.SassList {
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
    def this(contents: js.Array[typingsJapgolly.sass.typesValueMod.Value]) = this()
    def this(contents: typingsJapgolly.immutable.mod.List[typingsJapgolly.sass.typesValueMod.Value]) = this()
    def this(options: Brackets) = this()
    def this(contents: js.Array[typingsJapgolly.sass.typesValueMod.Value], options: Brackets) = this()
    def this(
      contents: typingsJapgolly.immutable.mod.List[typingsJapgolly.sass.typesValueMod.Value],
      options: Brackets
    ) = this()
  }
  
  @JSImport("sass", "SassMap")
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
    def this(contents: OrderedMap[typingsJapgolly.sass.typesValueMod.Value, typingsJapgolly.sass.typesValueMod.Value]) = this()
  }
  
  @JSImport("sass", "SassNumber")
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
  
  @JSImport("sass", "SassString")
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
  
  @JSImport("sass", "TRUE")
  @js.native
  val TRUE: Boolean[`true`] = js.native
  
  /* note: abstract class */ @JSImport("sass", "Value")
  @js.native
  /* protected */ open class Value ()
    extends typingsJapgolly.sass.typesValueMod.Value
  
  inline def compile(path: String): CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(path.asInstanceOf[js.Any]).asInstanceOf[CompileResult]
  
  inline def compileAsync(path: String): js.Promise[CompileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CompileResult]]
  
  inline def compileAsync_async(path: String, options: Options[async]): js.Promise[CompileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileAsync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompileResult]]
  
  inline def compileString(source: String): CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compileString")(source.asInstanceOf[js.Any]).asInstanceOf[CompileResult]
  
  inline def compileStringAsync(source: String): js.Promise[CompileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStringAsync")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CompileResult]]
  
  inline def compileStringAsync_async(source: String, options: StringOptions[async]): js.Promise[CompileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileStringAsync")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompileResult]]
  
  inline def compileString_sync(source: String, options: StringOptions[sync]): CompileResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compileString")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompileResult]
  
  inline def compile_sync(path: String, options: Options[sync]): CompileResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompileResult]
  
  @JSImport("sass", "info")
  @js.native
  val info: String = js.native
  
  inline def renderSync_sync(options: LegacyOptions[sync]): LegacyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSync")(options.asInstanceOf[js.Any]).asInstanceOf[LegacyResult]
  
  inline def render_async(
    options: LegacyOptions[async],
    callback: js.Function2[
      /* exception */ js.UndefOr[LegacyException], 
      /* result */ js.UndefOr[LegacyResult], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sass", "sassFalse")
  @js.native
  val sassFalse: typingsJapgolly.sass.typesValueBooleanMod.SassBoolean = js.native
  
  @JSImport("sass", "sassNull")
  @js.native
  val sassNull: typingsJapgolly.sass.typesValueMod.Value = js.native
  
  @JSImport("sass", "sassTrue")
  @js.native
  val sassTrue: typingsJapgolly.sass.typesValueBooleanMod.SassBoolean = js.native
  
  object types {
    
    @JSImport("sass", "types.Boolean")
    @js.native
    open class Boolean[T /* <: scala.Boolean */] ()
      extends typingsJapgolly.sass.typesLegacyFunctionMod.types.Boolean[T]
    /* static members */
    object Boolean {
      
      /** Sass's `false` value. */
      @JSImport("sass", "types.Boolean.FALSE")
      @js.native
      val FALSE: typingsJapgolly.sass.typesLegacyFunctionMod.types.Boolean[`false`] = js.native
      
      /** Sass's `true` value. */
      @JSImport("sass", "types.Boolean.TRUE")
      @js.native
      val TRUE: typingsJapgolly.sass.typesLegacyFunctionMod.types.Boolean[`true`] = js.native
    }
    
    @JSImport("sass", "types.Color")
    @js.native
    open class Color protected ()
      extends typingsJapgolly.sass.typesLegacyFunctionMod.types.Color {
      /**
        * Creates a new Sass color with alpha, red, green, and blue channels taken
        * from respective two-byte chunks of a hexidecimal number.
        *
        * @example
        *
        * ```js
        * new sass.types.Color(0xff6b717f); // #6b717f
        * new sass.types.Color(0x00000000); // rgba(0, 0, 0, 0)
        * ```
        */
      def this(argb: Double) = this()
      /**
        * Creates a new Sass color with the given red, green, blue, and alpha
        * channels. The red, green, and blue channels must be integers between 0
        * and 255 (inclusive), and alpha must be between 0 and 1 (inclusive).
        *
        * @example
        *
        * ```js
        * new sass.types.Color(107, 113, 127); // #6b717f
        * new sass.types.Color(0, 0, 0, 0); // rgba(0, 0, 0, 0)
        * ```
        */
      def this(r: Double, g: Double, b: Double) = this()
      def this(r: Double, g: Double, b: Double, a: Double) = this()
    }
    
    @JSImport("sass", "types.Error")
    @js.native
    open class Error protected ()
      extends typingsJapgolly.sass.typesLegacyFunctionMod.types.Error {
      def this(message: java.lang.String) = this()
    }
    
    @JSImport("sass", "types.List")
    @js.native
    open class List protected ()
      extends typingsJapgolly.sass.typesLegacyFunctionMod.types.List {
      /**
        * Creates a new Sass list.
        *
        * **Heads up!** The initial values of the list elements are undefined.
        * These elements must be set using [[setValue]] before accessing them or
        * passing the list back to Sass.
        *
        * @example
        *
        * ```js
        * const list = new sass.types.List(3);
        * list.setValue(0, new sass.types.Number(10, "px"));
        * list.setValue(1, new sass.types.Number(15, "px"));
        * list.setValue(2, new sass.types.Number(32, "px"));
        * list; // 10px, 15px, 32px
        * ```
        *
        * @param length - The number of (initially undefined) elements in the list.
        * @param commaSeparator - If `true`, the list is comma-separated; otherwise,
        * it's space-separated. Defaults to `true`.
        */
      def this(length: Double) = this()
      def this(length: Double, commaSeparator: scala.Boolean) = this()
    }
    
    @JSImport("sass", "types.Map")
    @js.native
    open class Map protected ()
      extends typingsJapgolly.sass.typesLegacyFunctionMod.types.Map {
      /**
        * Creates a new Sass map.
        *
        * **Heads up!** The initial keys and values of the map are undefined. They
        * must be set using [[setKey]] and [[setValue]] before accessing them or
        * passing the map back to Sass.
        *
        * @example
        *
        * ```js
        * const map = new sass.types.Map(2);
        * map.setKey(0, new sass.types.String("width"));
        * map.setValue(0, new sass.types.Number(300, "px"));
        * map.setKey(1, new sass.types.String("height"));
        * map.setValue(1, new sass.types.Number(100, "px"));
        * map; // (width: 300px, height: 100px)
        * ```
        *
        * @param length - The number of (initially undefined) key/value pairs in the map.
        */
      def this(length: Double) = this()
    }
    
    @JSImport("sass", "types.Null")
    @js.native
    open class Null ()
      extends typingsJapgolly.sass.typesLegacyFunctionMod.types.Null
    /* static members */
    object Null {
      
      /** Sass's singleton `null` value. */
      @JSImport("sass", "types.Null.NULL")
      @js.native
      val NULL: typingsJapgolly.sass.typesLegacyFunctionMod.types.Null = js.native
    }
    
    @JSImport("sass", "types.Number")
    @js.native
    open class Number protected ()
      extends typingsJapgolly.sass.typesLegacyFunctionMod.types.Number {
      /**
        * @param value - The numeric value of the number.
        *
        * @param unit - If passed, the number's unit.
        *
        * Complex units can be represented as
        * `<unit>*<unit>*.../<unit>*<unit>*...`, with numerator units on the
        * left-hand side of the `/` and denominator units on the right. A number
        * with only numerator units may omit the `/` and the units after it, and a
        * number with only denominator units may be represented
        * with no units before the `/`.
        *
        * @example
        *
        * ```scss
        * new sass.types.Number(0.5); // == 0.5
        * new sass.types.Number(10, "px"); // == 10px
        * new sass.types.Number(10, "px*px"); // == 10px * 1px
        * new sass.types.Number(10, "px/s"); // == math.div(10px, 1s)
        * new sass.types.Number(10, "px*px/s*s"); // == 10px * math.div(math.div(1px, 1s), 1s)
        * ```
        */
      def this(value: Double) = this()
      def this(value: Double, unit: java.lang.String) = this()
    }
    
    @JSImport("sass", "types.String")
    @js.native
    open class String protected ()
      extends typingsJapgolly.sass.typesLegacyFunctionMod.types.String {
      /**
        * Creates an unquoted string with the given contents.
        *
        * **Heads up!** This API currently provides no way of creating a
        * [quoted](https://sass-lang.com/documentation/values/strings#quoted)
        * string.
        */
      def this(value: java.lang.String) = this()
    }
  }
}
