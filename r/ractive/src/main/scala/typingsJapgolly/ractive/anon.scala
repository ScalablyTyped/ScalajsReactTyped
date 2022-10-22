package typingsJapgolly.ractive

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ractive.mod.Adaptor
import typingsJapgolly.ractive.mod.Component
import typingsJapgolly.ractive.mod.Constructor
import typingsJapgolly.ractive.mod.ContextHelper
import typingsJapgolly.ractive.mod.CssFn
import typingsJapgolly.ractive.mod.Decorator
import typingsJapgolly.ractive.mod.Easing
import typingsJapgolly.ractive.mod.EventPlugin
import typingsJapgolly.ractive.mod.ExtendOpts
import typingsJapgolly.ractive.mod.Helper
import typingsJapgolly.ractive.mod.InitOpts
import typingsJapgolly.ractive.mod.Interpolator
import typingsJapgolly.ractive.mod.Macro
import typingsJapgolly.ractive.mod.MacroFn
import typingsJapgolly.ractive.mod.MacroOpts
import typingsJapgolly.ractive.mod.Merge
import typingsJapgolly.ractive.mod.ParseOpts
import typingsJapgolly.ractive.mod.ParsedTemplate
import typingsJapgolly.ractive.mod.Partial
import typingsJapgolly.ractive.mod.Plugin
import typingsJapgolly.ractive.mod.Ractive
import typingsJapgolly.ractive.mod.Registries
import typingsJapgolly.ractive.mod.Registry
import typingsJapgolly.ractive.mod.Static
import typingsJapgolly.ractive.mod.Transition
import typingsJapgolly.ractive.mod.ValueMap
import typingsJapgolly.ractive.ractiveBooleans.`false`
import typingsJapgolly.ractive.ractiveStrings.fast
import typingsJapgolly.ractive.ractiveStrings.slow
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[T, U /* <: js.Array[Any] */, X] extends StObject {
    
    var `0`: T
    
    var `1`: /* import warning: importer.ImportType#apply Failed type conversion: (t : U): any extends (head : infer Head, tail : infer Tail): any ? ractive.ractive.Merge<std.Omit<T, keyof Head & keyof X> & Head, Tail, X> : never */ js.Any
  }
  object `0` {
    
    inline def apply[T, U /* <: js.Array[Any] */, X](
      `0`: T,
      `1`: /* import warning: importer.ImportType#apply Failed type conversion: (t : U): any extends (head : infer Head, tail : infer Tail): any ? ractive.ractive.Merge<std.Omit<T, keyof Head & keyof X> & Head, Tail, X> : never */ js.Any
    ): `0`[T, U, X] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[T, U, X]]
    }
    
    extension [Self <: `0`[?, ?, ?], T, U /* <: js.Array[Any] */, X](x: Self & (`0`[T, U, X])) {
      
      inline def set0(value: T): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (t : U): any extends (head : infer Head, tail : infer Tail): any ? ractive.ractive.Merge<std.Omit<T, keyof Head & keyof X> & Head, Tail, X> : never */ js.Any
      ): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[
          Ractive[Ractive[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]]
        ]
       with Instantiable1[
          /* opts */ InitOpts[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
          Ractive[Ractive[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]]
        ] {
    
    /** When true, causes Ractive to emit warnings. Defaults to true. */
    var DEBUG: Boolean = js.native
    
    var DEBUG_PROMISES: Boolean = js.native
    
    /** The parent constructor used to create this constructor. */
    var Parent: Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]] = js.native
    
    /** The build version of Ractive. */
    val VERSION: String = js.native
    
    /** Setting this to false will prevent Ractive from printing a welcome console message when the first instance is created. */
    var WELCOME_MESSAGE: js.UndefOr[`false`] = js.native
    
    var adaptors: Registry[Adaptor] = js.native
    
    /**
    	 * Add Ractive-managed CSS to the managed style tag. This effectively global CSS managed by the Ractive constructor,
    	 * as opposed scoped CSS installed on a component constructor.
    	 */
    def addCSS(id: String, css: String): Unit = js.native
    def addCSS(id: String, css: CssFn): Unit = js.native
    
    var components: Registry[Component] = js.native
    
    var decorators: Registry[Decorator[Ractive[/* ractive.ractive.Ractive<any> */ Any]]] = js.native
    
    /** The registries that are inherited by all instance. */
    var defaults: Registries[Ractive[/* ractive.ractive.Ractive<any> */ Any]] = js.native
    
    var easings: Registry[Easing] = js.native
    
    /** Escape the given key, so that it can be safely used in a keypath e.g. 'foo.bar' becomes 'foo\.bar' */
    def escapeKey(key: String): String = js.native
    
    var events: Registry[EventPlugin[Ractive[/* ractive.ractive.Ractive<any> */ Any]]] = js.native
    
    /** Create a new component with this constructor as a starting point. */
    def extend(): Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]] = js.native
    def extend[T /* <: ExtendOpts[Any] & ValueMap */, U /* <: ReadonlyArrayExtendOptsan */](
      opts: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param more because its type U is not an array type */ more: U
    ): Static[
        (Ractive[/* ractive.ractive.Ractive<any> */ Any]) & (Merge[T, U, ExtendOpts[Ractive[/* ractive.ractive.Ractive<any> */ Any]]])
      ] = js.native
    
    /** Create a new component with this constructor as a starting point using the given constructor. */
    def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V]): Static[Ractive[U] & U] = js.native
    def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V], opts: W): Static[Ractive[U] & U] = js.native
    
    /** Retrieve the CSS string for all loaded components. */
    def getCSS(): String = js.native
    
    def getContext(nodeOrQuery: String): ContextHelper = js.native
    /** Get a Context for the given node or selector. */
    def getContext(nodeOrQuery: HTMLElement): ContextHelper = js.native
    
    /** Check to see if CSS with the given id has already been added */
    def hasCSS(id: String): Boolean = js.native
    
    var helpers: Registry[Helper] = js.native
    
    var interpolators: Registry[Interpolator] = js.native
    
    /** @returns true if the given object is an instance of this constructor */
    def isInstance(obj: Any): Boolean = js.native
    
    /** Safely join the given keys into a keypath. */
    def joinKeys(keys: String*): String = js.native
    
    /**
    	 * Initialize a macro function.
    	 * @param macro
    	 * @param options
    	 */
    def `macro`(`macro`: MacroFn): Macro = js.native
    def `macro`(`macro`: MacroFn, options: MacroOpts): Macro = js.native
    
    /**
    	 * Parse the given template string into a template.j
    	 */
    def parse(template: String): ParsedTemplate = js.native
    def parse(template: String, opts: ParseOpts): ParsedTemplate = js.native
    
    var partials: Registry[Partial] = js.native
    
    /** Render component styles in their own style tags rather than in a single shared tag - defaults to false */
    var perComponentStyleElements: Boolean = js.native
    
    /** Get the value at the given keypath from the Ractive shared store. */
    def sharedGet[U](keypath: String): U = js.native
    
    /** Set the given map of values in the Ractive shared store. */
    def sharedSet(map: ValueMap): js.Promise[Unit] = js.native
    /** Set the given keypath in the Ractive shared store to the given value. */
    def sharedSet[U](keypath: String, value: U): js.Promise[U] = js.native
    
    /** Split the given keypath into its constituent keys. */
    def splitKeypath(keypath: String): js.Array[String] = js.native
    
    /** Get the css data for this constructor at the given keypath. */
    def styleGet[U](keypath: String): U = js.native
    
    /** Set the given map of values in the css data for this constructor. */
    def styleSet(map: ValueMap): js.Promise[Unit] = js.native
    /** Set the css data for this constructor at the given keypath to the given value. */
    def styleSet[U](keypath: String, value: U): js.Promise[U] = js.native
    
    /** true if Ractive detects that this environment supports svg. */
    val svg: Boolean = js.native
    
    /**
    	 * The current operation promise is available to things like observers and decorators using Ractive.tick,
    	 * which will return undefined if there is not currently an operation in progress.
    	 */
    val tick: js.UndefOr[js.Promise[Unit]] = js.native
    
    var transitions: Registry[Transition] = js.native
    
    /** Unescape the given key e.g. 'foo\.bar' becomes 'foo.bar'.k */
    def unescapeKey(key: String): String = js.native
    
    def use(args: Plugin*): Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]] = js.native
  }
  
  trait Optional extends StObject {
    
    var optional: js.UndefOr[js.Array[String]] = js.undefined
    
    var required: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Optional {
    
    inline def apply(): Optional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optional]
    }
    
    extension [Self <: Optional](x: Self) {
      
      inline def setOptional(value: js.Array[String]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setOptionalVarargs(value: String*): Self = StObject.set(x, "optional", js.Array(value*))
      
      inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
    }
  }
  
  /* Inlined std.Readonly<std.Array<ractive.ractive.ExtendOpts<any> & ractive.ractive.ValueMap>> */
  trait ReadonlyArrayExtendOptsan extends StObject {
    
    def at(index: Double): js.UndefOr[ExtendOpts[Any] & ValueMap]
    
    def concat(items: (js.Array[ExtendOpts[Any] & ValueMap])*): js.Array[ExtendOpts[Any] & ValueMap]
    
    def copyWithin(target: Double, start: Double): this.type
    
    def entries(): IterableIterator[js.Tuple2[Double, ExtendOpts[Any] & ValueMap]]
    
    def every[S /* <: ExtendOpts[Any] & ValueMap */](
      predicate: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean
    
    def fill(value: ExtendOpts[Any] & ValueMap): this.type
    
    def filter[S /* <: ExtendOpts[Any] & ValueMap */](
      predicate: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          /* is S */ Boolean
        ]
    ): js.Array[S]
    
    def find[S /* <: ExtendOpts[Any] & ValueMap */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* obj */ js.Array[ExtendOpts[Any] & ValueMap], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S]
    
    def findIndex(
      predicate: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* obj */ js.Array[ExtendOpts[Any] & ValueMap], 
          Any
        ]
    ): Double
    
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]]
    
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          U | js.Array[U]
        ]
    ): js.Array[U]
    
    def forEach(
      callbackfn: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          Unit
        ]
    ): Unit
    
    def includes(searchElement: ExtendOpts[Any] & ValueMap): Boolean
    
    def indexOf(searchElement: ExtendOpts[Any] & ValueMap): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(searchElement: ExtendOpts[Any] & ValueMap): Double
    
    val length: Double
    
    def map[U](
      callbackfn: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          U
        ]
    ): js.Array[U]
    
    def pop(): js.UndefOr[ExtendOpts[Any] & ValueMap]
    
    def push(items: (ExtendOpts[Any] & ValueMap)*): Double
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ ExtendOpts[Any] & ValueMap, 
          /* currentValue */ ExtendOpts[Any] & ValueMap, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          ExtendOpts[Any] & ValueMap
        ]
    ): ExtendOpts[Any] & ValueMap
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ ExtendOpts[Any] & ValueMap, 
          /* currentValue */ ExtendOpts[Any] & ValueMap, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          ExtendOpts[Any] & ValueMap
        ]
    ): ExtendOpts[Any] & ValueMap
    
    def reverse(): js.Array[ExtendOpts[Any] & ValueMap]
    
    def shift(): js.UndefOr[ExtendOpts[Any] & ValueMap]
    
    def slice(): js.Array[ExtendOpts[Any] & ValueMap]
    
    def some(
      predicate: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          Any
        ]
    ): Boolean
    
    def sort(): this.type
    
    def splice(start: Double): js.Array[ExtendOpts[Any] & ValueMap]
    
    def unshift(items: (ExtendOpts[Any] & ValueMap)*): Double
    
    def values(): IterableIterator[ExtendOpts[Any] & ValueMap]
  }
  object ReadonlyArrayExtendOptsan {
    
    inline def apply(
      at: Double => js.UndefOr[ExtendOpts[Any] & ValueMap],
      concat: /* repeated */ js.Array[ExtendOpts[Any] & ValueMap] => js.Array[ExtendOpts[Any] & ValueMap],
      copyWithin: (Double, Double) => ReadonlyArrayExtendOptsan,
      entries: CallbackTo[IterableIterator[js.Tuple2[Double, ExtendOpts[Any] & ValueMap]]],
      every: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          /* is S */ Boolean
        ] => /* is std.Array<S> */ Boolean,
      fill: ExtendOpts[Any] & ValueMap => ReadonlyArrayExtendOptsan,
      filter: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          /* is S */ Boolean
        ] => js.Array[Any],
      find: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* obj */ js.Array[ExtendOpts[Any] & ValueMap], 
          /* is S */ Boolean
        ] => js.UndefOr[Any],
      findIndex: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* obj */ js.Array[ExtendOpts[Any] & ValueMap], 
          Any
        ] => Double,
      flat: CallbackTo[js.Array[FlatArray[Any, Any]]],
      flatMap: js.ThisFunction3[
          Any, 
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          Any | js.Array[Any]
        ] => js.Array[Any],
      forEach: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          Unit
        ] => Callback,
      includes: ExtendOpts[Any] & ValueMap => Boolean,
      indexOf: ExtendOpts[Any] & ValueMap => Double,
      join: CallbackTo[String],
      keys: CallbackTo[IterableIterator[Double]],
      lastIndexOf: ExtendOpts[Any] & ValueMap => Double,
      length: Double,
      map: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          Any
        ] => js.Array[Any],
      pop: CallbackTo[js.UndefOr[ExtendOpts[Any] & ValueMap]],
      push: /* repeated */ ExtendOpts[Any] & ValueMap => Double,
      reduce: js.Function4[
          /* previousValue */ ExtendOpts[Any] & ValueMap, 
          /* currentValue */ ExtendOpts[Any] & ValueMap, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          ExtendOpts[Any] & ValueMap
        ] => ExtendOpts[Any] & ValueMap,
      reduceRight: js.Function4[
          /* previousValue */ ExtendOpts[Any] & ValueMap, 
          /* currentValue */ ExtendOpts[Any] & ValueMap, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          ExtendOpts[Any] & ValueMap
        ] => ExtendOpts[Any] & ValueMap,
      reverse: CallbackTo[js.Array[ExtendOpts[Any] & ValueMap]],
      shift: CallbackTo[js.UndefOr[ExtendOpts[Any] & ValueMap]],
      slice: CallbackTo[js.Array[ExtendOpts[Any] & ValueMap]],
      some: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          Any
        ] => Boolean,
      sort: CallbackTo[ReadonlyArrayExtendOptsan],
      splice: Double => js.Array[ExtendOpts[Any] & ValueMap],
      unshift: /* repeated */ ExtendOpts[Any] & ValueMap => Double,
      values: CallbackTo[IterableIterator[ExtendOpts[Any] & ValueMap]]
    ): ReadonlyArrayExtendOptsan = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = entries.toJsFn, every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.toJsFn, flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1((t0: js.Function3[
          /* value */ ExtendOpts[Any] & ValueMap, 
          /* index */ Double, 
          /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
          Unit
        ]) => forEach(t0).runNow()), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = join.toJsFn, keys = keys.toJsFn, lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = pop.toJsFn, push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = reverse.toJsFn, shift = shift.toJsFn, slice = slice.toJsFn, some = js.Any.fromFunction1(some), sort = sort.toJsFn, splice = js.Any.fromFunction1(splice), unshift = js.Any.fromFunction1(unshift), values = values.toJsFn)
      __obj.asInstanceOf[ReadonlyArrayExtendOptsan]
    }
    
    extension [Self <: ReadonlyArrayExtendOptsan](x: Self) {
      
      inline def setAt(value: Double => js.UndefOr[ExtendOpts[Any] & ValueMap]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setConcat(value: /* repeated */ js.Array[ExtendOpts[Any] & ValueMap] => js.Array[ExtendOpts[Any] & ValueMap]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setCopyWithin(value: (Double, Double) => ReadonlyArrayExtendOptsan): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Double, ExtendOpts[Any] & ValueMap]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setEvery(
        value: js.Function3[
              /* value */ ExtendOpts[Any] & ValueMap, 
              /* index */ Double, 
              /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
              /* is S */ Boolean
            ] => /* is std.Array<S> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFill(value: ExtendOpts[Any] & ValueMap => ReadonlyArrayExtendOptsan): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[
              /* value */ ExtendOpts[Any] & ValueMap, 
              /* index */ Double, 
              /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
              /* is S */ Boolean
            ] => js.Array[Any]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* value */ ExtendOpts[Any] & ValueMap, 
              /* index */ Double, 
              /* obj */ js.Array[ExtendOpts[Any] & ValueMap], 
              /* is S */ Boolean
            ] => js.UndefOr[Any]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: js.Function3[
              /* value */ ExtendOpts[Any] & ValueMap, 
              /* index */ Double, 
              /* obj */ js.Array[ExtendOpts[Any] & ValueMap], 
              Any
            ] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFlat(value: CallbackTo[js.Array[FlatArray[Any, Any]]]): Self = StObject.set(x, "flat", value.toJsFn)
      
      inline def setFlatMap(
        value: js.ThisFunction3[
              Any, 
              /* value */ ExtendOpts[Any] & ValueMap, 
              /* index */ Double, 
              /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
              Any | js.Array[Any]
            ] => js.Array[Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setForEach(
        value: js.Function3[
              /* value */ ExtendOpts[Any] & ValueMap, 
              /* index */ Double, 
              /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[
              /* value */ ExtendOpts[Any] & ValueMap, 
              /* index */ Double, 
              /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setIncludes(value: ExtendOpts[Any] & ValueMap => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: ExtendOpts[Any] & ValueMap => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: CallbackTo[String]): Self = StObject.set(x, "join", value.toJsFn)
      
      inline def setKeys(value: CallbackTo[IterableIterator[Double]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setLastIndexOf(value: ExtendOpts[Any] & ValueMap => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[
              /* value */ ExtendOpts[Any] & ValueMap, 
              /* index */ Double, 
              /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
              Any
            ] => js.Array[Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setPop(value: CallbackTo[js.UndefOr[ExtendOpts[Any] & ValueMap]]): Self = StObject.set(x, "pop", value.toJsFn)
      
      inline def setPush(value: /* repeated */ ExtendOpts[Any] & ValueMap => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ ExtendOpts[Any] & ValueMap, 
              /* currentValue */ ExtendOpts[Any] & ValueMap, 
              /* currentIndex */ Double, 
              /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
              ExtendOpts[Any] & ValueMap
            ] => ExtendOpts[Any] & ValueMap
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
              /* previousValue */ ExtendOpts[Any] & ValueMap, 
              /* currentValue */ ExtendOpts[Any] & ValueMap, 
              /* currentIndex */ Double, 
              /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
              ExtendOpts[Any] & ValueMap
            ] => ExtendOpts[Any] & ValueMap
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReverse(value: CallbackTo[js.Array[ExtendOpts[Any] & ValueMap]]): Self = StObject.set(x, "reverse", value.toJsFn)
      
      inline def setShift(value: CallbackTo[js.UndefOr[ExtendOpts[Any] & ValueMap]]): Self = StObject.set(x, "shift", value.toJsFn)
      
      inline def setSlice(value: CallbackTo[js.Array[ExtendOpts[Any] & ValueMap]]): Self = StObject.set(x, "slice", value.toJsFn)
      
      inline def setSome(
        value: js.Function3[
              /* value */ ExtendOpts[Any] & ValueMap, 
              /* index */ Double, 
              /* array */ js.Array[ExtendOpts[Any] & ValueMap], 
              Any
            ] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSort(value: CallbackTo[ReadonlyArrayExtendOptsan]): Self = StObject.set(x, "sort", value.toJsFn)
      
      inline def setSplice(value: Double => js.Array[ExtendOpts[Any] & ValueMap]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      inline def setUnshift(value: /* repeated */ ExtendOpts[Any] & ValueMap => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setValues(value: CallbackTo[IterableIterator[ExtendOpts[Any] & ValueMap]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
  
  trait Teardown extends StObject {
    
    def teardown(): Unit
  }
  object Teardown {
    
    inline def apply(teardown: Callback): Teardown = {
      val __obj = js.Dynamic.literal(teardown = teardown.toJsFn)
      __obj.asInstanceOf[Teardown]
    }
    
    extension [Self <: Teardown](x: Self) {
      
      inline def setTeardown(value: Callback): Self = StObject.set(x, "teardown", value.toJsFn)
    }
  }
  
  /* Inlined ractive.ractive.TransitionOpts & {} */
  trait TransitionOpts extends StObject {
    
    /** The delay in milliseconds to wait before triggering the transition. */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** The duration for the transition in milliseconds, slow for 600ms, fast for 200ms, and any other string for 400ms. */
    var duration: js.UndefOr[Double | slow | fast | String] = js.undefined
    
    /** The easing to use for the transition. */
    var easing: js.UndefOr[String] = js.undefined
  }
  object TransitionOpts {
    
    inline def apply(): TransitionOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionOpts]
    }
    
    extension [Self <: TransitionOpts](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double | slow | fast | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
}
